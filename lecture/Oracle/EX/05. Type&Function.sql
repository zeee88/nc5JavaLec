--1. 단일 함수
--1-1. 문자 함수
--LOWER, UPPER, INITCAP
SELECT DNO
    , LOWER(DNAME)
    , UPPER(DNAME)
    ,INITCAP(DNAME)
    FROM DEPT;
    
SELECT * FROM DEPT;

--부서명이 ERP인 정보를 조회
--부서명의 대, 소문자를 모를 때
SELECT *
    FROM DEPT
    WHERE LOWER(DNAME) = 'erp';


--1-2. 문자연산 함수
--CONCAT
SELECT CONCAT(DNO, ' : ' || DNAME || ' : ' || LOC)
    FROM DEPT;

SELECT DNO, ' : ' || DNAME || ' : ' || LOC
    FROM DEPT;
    
--SUBSTR
--SUBSTR(N, CNT)은 N 번째 글자부터 CNT개를 가져온다.
SELECT  *
    FROM PROFESSOR
    WHERE SUBSTR(ORDERS, 1, 1)= '정';
    
SELECT ENAME
    , SUBSTR(ENAME, 2)   --두 번째 글자부터 모두
    , SUBSTR(ENAME, -2)   --뒤에서 두 번째 글자부터 모두
    , SUBSTR(ENAME, 1, 2)  --첫 번째 글자부터 두 글자
    , SUBSTR(ENAME, -2, 2)  --뒤에서 두 번째 글자부터 두 글자
    FROM EMP;
    
    
--LENGTH, LENGTHB
SELECT DNAME
    , LENGTH(DNAME)
    , LENGTHB(DNAME)
    FROM DEPT;
    
--현재 오라클이 사용중인 문자셋 AL32UTF8 => 한글 3BYTE
SELECT *
    FROM NLS_DATABASE_PARAMETERS
    WHERE PARAMETER = 'NLS_CHARACTERSET'
    OR PARAMETER = 'NLS_NCHAR_CHARACTERSET';
    
--INSTR
--DUAL 테이블 : 오라클에서 제공해주는 가상의 기본 테이블
--             간단하게 날짜나 연산 또는 결과값을 보기 위해 사용.
--             원래 DUAL테이블 소유자는 SYS로 되어 있는데 모든 USER에서 접근 가능
SELECT INSTR('DATABASE', 'A')   --첫 번째 A의 위치
    , INSTR('DATABASE', 'A', 3)   --세 번째 글자인 T 다음의 첫 번째 A의 위치
    , INSTR('DATABASE', 'A', 1, 3)   --첫 번째 글자 D 다음의 세 번째 A의 위치
    , SYSDATE
    , 1 + 2
    FROM DUAL;

--TRIM
SELECT TRIM('조' FROM '조병조')        
    , TRIM(LEADING '조' FROM '조병조')
    , TRIM(TRAILING '조' FROM '조병조')
    , TRIM('조 병 조')
    FROM DUAL;
    
    

--LPAD, RPAD: 한글을 3BYTE로 잡아도 컴퓨터에서는 2BYTE로 사용하기 때문에 한글연산 자체는 2BYTE로 진행된다.

SELECT LPAD(ENAME, 10, '*')      --사원명 앞에 *를 붙여서 총 길이를 10으로 만든다
     , RPAD(ENAME, 10, '*')      --사원명 뒤에 *를 붙여서 총 길이를 10으로 만든다
        FROM EMP;
    
--직원이름을 출력하는데 마지막 글자만 제거해서 출력 (SUBSTR, LENGTH)
SELECT SUBSTR(ENAME, 1, LENGTH(ENAME) -1)
        FROM EMP;

--1-3. 문자열 치환 함수
--TRANSLATE, REPLACE
SELECT TRANSLATE('World of Warcraft', 'Wo', '--')   --문자 단위로 동작하기 때문에 모든 W, O가 치환
        , REPLACE('World of Warcraft', 'Wo', '--')  --문자열 단위로 동작하기 때문에 WO가 치환
        FROM DUAL;

--1-4. 숫자 함수
--ROUND
SELECT ROUND(123.454678, 3)
    FROM DUAL;
    
--TRUNC
SELECT TRUNC(123.454678, 3)
    FROM DUAL;
    
--MOD(나머지 값)
SELECT MOD(10, 4)
    FROM DUAL;
    
--POWER(몇 제곱값)
SELECT POWER(10, 3)
    FROM DUAL;
    
--CEIL, FLOOR(제일 가까운 정수 값)
SELECT CEIL(2.59)
     , FLOOR(2.59)
    FROM DUAL;

--ABS(절대값)
SELECT ABS(10)
     , ABS(-10)
    FROM DUAL;
    
--SQRT(제곱근 값)
SELECT SQRT(9)
     , SQRT(25)
     , SQRT(100)
    FROM DUAL;
    
--SIGN(부호판단)
SELECT SIGN(-123)
     , SIGN(52)
     , SIGN(0)
    FROM DUAL;
    
--1-4. 날짜 연산
SELECT SYSDATE
     , SYSDATE + 100
     , SYSDATE - 100
     , SYSDATE + 3 / 24
     , SYSDATE - 5 / 24
     , SYSDATE - TO_DATE('20220413', 'YYYYMMDD')  --두날짜간의 차이 일수(시간, 분, 초 때문에 정확하게 나오지 않음)
     , TRUNC(SYSDATE) - TO_DATE('20220413', 'YYYYMMDD')
    FROM DUAL;
    
--1-5. 날짜 함수
--ROUND
SELECT ROUND(SYSDATE, 'MM')
    FROM DUAL;
    
SELECT ROUND(SYSDATE, 'DD')
 FROM DUAL;
    
--TRUNC
SELECT TRUNC(SYSDATE)
    FROM DUAL;
    
SELECT TRUNC(SYSDATE, 'YYYY')
    FROM DUAL;
    
--MONTH_BETWEEN
SELECT MONTHS_BETWEEN(SYSDATE, TO_DATE('20230213', 'YYYYMMDD'))
    FROM DUAL;
    
--ADD_MONTHS
SELECT ADD_MONTHS(SYSDATE, 3)
    FROM DUAL;
    
--NEXT_DAY
SELECT NEXT_DAY(SYSDATE, '수요일')
    FROM DUAL;
    
--LAST_DAY
SELECT LAST_DAY(TO_DATE('20210618', 'YYYYMMDD'))
    FROM DUAL;

--사원들의 입사일과 입사 100일 후의 날짜와 10년 뒤 날짜 조회

SELECT HDATE 
    , HDATE + 100
    , ADD_MONTHS(HDATE, 120)
    FROM EMP;
    
UPDATE STUDENT
    SET SNAME = REPLACE (SNAME, ' ', '');
    
COMMIT;

--1-6. 변환함수
--숫자를 문자로 변환 TO_CHAR
SELECT TO_CHAR(100000000, '999,999,999')   --9자리 숫자를 표기하되 3자리마다 ,를 표출
    FROM DUAL;
    
SELECT TO_CHAR(10000000, '099,999,9999')   --9자리 숫자를 표기하되 3자리마다 , 를 표출하고 앞자리에 0을 붙여서 출력.
    FROM DUAL;

SELECT TO_CHAR(10000000, '999,999,999,999,999')
    FROM DUAL;     

--문자를 숫자로 변환 TO_NUMBER
--형식지정자의 자리수만 잘 지정해서 사용하거나 형식지정자를 지정하지 않고 사용한다.
SELECT TO_NUMBER('-123.456', '999.999') --문자열 자리수보다 형식지정자는 자리수를 같거나 더 많게 지정해줘야 한다.
    FROM DUAL;
    
SELECT TO_NUMBER('123', '999.99')
    FROM DUAL;
    
SELECT TO_NUMBER('1234')
    FROM DUAL;

--날짜를 문자로 변환하는 TO_CHAR
--TO_CHAR의 날짜 형식 지정
SELECT TO_CHAR(SYSDATE, 'YYYY/MM/DD')
     , TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS')
     , TO_CHAR(SYSDATE, 'YYYY/MM/DD AM HH:MI:SS')
     , TO_CHAR(SYSDATE, 'YYYYMMDD DAY')
     , TO_CHAR(SYSDATE, '"오늘은 "YYYY"년 "MM"월 "DD"일 "DAY"입니다."') --형식지정자 안에서 문자열을 추가할 때 ""사용
     , TO_CHAR(SYSDATE, 'YYYY"년" MONTH DD"일"')
     FROM DUAL;
     
--문자를 날짜로 반환하는 TO_DATE
--날짜 출력 형식인 NLS_DATE_FORMAT 기준으로 출력
SELECT TO_DATE('20211201135123', 'YYYY/MM/DD HH24:MI:SS')
     , TO_DATE('202304141059', 'YYYYMMDD HH24-MI')
     , TO_DATE('20230411', 'YYYY-MM-DD')
     FROM DUAL;
     
--TO_DATE 함수로 입사일이 19920201보다 빠른 사원목록 조회
SELECT *
    FROM EMP
    WHERE TO_DATE('19920201', 'YYYYMMDD') > HDATE;


--TO_CHAR 함수로 송강 교수의 임용일자는 XXXX년 XX월 XX일 XX요일입니다.
     
SELECT PNAME 
    , TO_CHAR(HIREDATE, '"임용일자는 "YYYY"년 "MM"월 "DD"일 "DAY"입니다."')
    FROM PROFESSOR
    WHERE PNAME = '송강';

    
--1-7. NULL값 처리를 해주는 NVL
SELECT ENO
    , ENAME
    , NVL(COMM, 0)AS COMM
    FROM EMP;
    
SELECT CNO
    , CNAME
    , NVL(PNO, 0)
    FROM COURSE;
    
--위 쿼리에서 PROFESSOR와 아우터 조인해서 PNAME이  NULL인 값들은 '교수 배정안됨'

SELECT C.CNO
     , C.CNAME
     , NVL(C.PNO, 0)
     , NVL(P.PNAME, '교수 배정안됨')
    FROM COURSE C
    LEFT JOIN PROFESSOR P
    ON C.PNO = P.PNO;
    
--1-8. 조건 처리해주는 DECODE
SELECT ENO
    , ENAME
    , JOB
    , SAL
    , DECODE(JOB, 
                '개발', SAL * 1.5,
                '경영', SAL * 1.3,
                '지원', SAL * 1.1,
                '분석', SAL, 
                       SAL * 0.95
                ) AS CHANGE_SAL
            FROM EMP;
            
--1-9. 조건 처리해주는 CASE ~ WHEN
SELECT ENO
    , ENAME
    , JOB
    , SAL
    , CASE JOB 
              WHEN '개발' THEN SAL * 1.5
              WHEN '경영' THEN SAL * 1.3
              WHEN '지원' THEN SAL * 1.1
              WHEN '분석' THEN SAL 
              ELSE  SAL * 0.95
                END AS CHANGE_SAL
            FROM EMP;

--COMM이 NULL인 사람은 해당사항 없음. COMM이 0인 사람은 '보너스 없음', 나머지 사람들은 '보너스 : ' || COMM
--COMM _TXT, ENO, ENAME, COMM

SELECT ENO
     , ENAME
     , COMM
     , CASE 
                WHEN NVL(COMM, -1) || COMM = -1 THEN '해당사항 없음'
                WHEN COMM = 0 THEN '보너스 없음'
                ELSE '보너스 : ' || COMM
                 END AS COMM_TXT
                FROM EMP;
            
SELECT ENO
     , ENAME
     , COMM
     , CASE 
                WHEN COMM IS NULL THEN '해당사항 없음'
                WHEN COMM = 0 THEN '보너스 없음'
                ELSE '보너스 : ' || COMM
                 END AS COMM_TXT
                FROM EMP;
                
SELECT ENO
     , ENAME
     , COMM
     , DECODE(NVL(COMM, -1),
                  '-1', '해당사항 없음',
                  '0', '보너스 없음',
                       '보너스 : ' || COMM
                ) AS COMM_TXT
                FROM EMP;

SELECT ENO
     , ENAME
     , COMM
     , DECODE(COMM,
                  NULL , '해당사항 없음',
                  '0', '보너스 없음',
                       '보너스 : ' || COMM
                ) AS COMM_TXT
                FROM EMP;
                
    


    
    
    
    
    
    


