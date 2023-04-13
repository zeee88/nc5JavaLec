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
    







    
    
    
    
    
    


