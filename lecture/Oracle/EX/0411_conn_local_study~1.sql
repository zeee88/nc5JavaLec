--1. 테이블 구조 확인 명령(DESC)
DESC STUDENT;

--2. 데이터를 조회하는 기본 Select구문
SELECT SNO
    ,SNAME
    FROM STUDENT;
    
-- * 테이블의 모든 컬럼을 조회
SELECT *
    FROM STUDENT;
    
--3. 조회하는 컬럼과 테이블에 별칭 붙이기
--3-1. 컬럼에 별칭 붙이기(거의 영어로 별칭을 붙인다.)
SELECT SNO AS 학생번호
        , SNAME AS 학생이름
        FROM STUDENT;
        
--3-2. 테이블에 별칭 붙이기
--테이블에 대한 별칭은 해당 쿼리(SQL)안에서 테이블을 별칭으로 사용하겠다는 뜻이다.
--두 개 이상 테이블을 사용해서 조회할 때 중복된 컬럼이 존재하면
--어떤 테이블에서 컬럼을 조회할 지 결정해야 하는데 그럴 때 주로 테이블에 별칭을 붙여서
--애매한 컬럼을 조회할 테이블을 지정할 수 있다.

SELECT ST.SNO
        , ST.SNAME
        , ST.SYEAR
    FROM STUDENT ST
    WHERE ST.SNAME LIKE '%우%';
    
--4. NULL을 처리해주는 NVL
--4-1. NVL을 사용하지 않았을 경우
SELECT ENO
    , ENAME
    , SAL
    , COMM
    FROM EMP;
    
--4-2. NVL사용
--자바와 연동했을 때 NULL값이 자바로 그대로 넘어가면
--NullPointerException이 발생할 확률이 높아지기 때문에
--NULL값이 나올 확률이 있는 컬럼에서는 항상 NVL처리를 해준다.
SELECT ENO
    , ENAME
    , SAL
    , NVL(COMM, 0)
    FROM EMP;

--5. 연결연산자(||)
--5-1. 사원이름 급여 연결해서 출력(EMP)
SELECT ENO
    , ENAME || '-' || SAL
    FROM EMP;
--5-1. 학생번호랑 - 기말고사 성적(SCORE)
SELECT SNO || '-' || RESULT
    FROM SCORE;

--5-2. 학생번호 : 학생이름 연결해서 출력(STUDENT)
SELECT SNO || ' : ' || SNAME AS 학번이름   --별칭 만들기
    FROM STUDENT;

--6. 중복제거나 DISTINCT
SELECT JOB
    FROM EMP;

--6-1. 컬럼 하나에 대한 중복 제거
SELECT DISTINCT JOB
    FROM EMP;
    
--6-2. 컬럼 두 개 이상에 대한 중복 제거
--각각 컬럼에 DISTINCT를 붙여주는 것이 아니고
--두개의 컬럼이 한 쌍의 데이터 셋이 되어서 
--두 개의 컬럼의 데이터가 모두 중복되지 않으면 
--중복으로 인식하지 않는다.
SELECT DISTINCT JOB
        , MGR
        FROM EMP;
        
--7. 데이터를 정렬해주는 ORDER BY
--7-1. 한 개의 컬럼에 대한 정렬

--오름차순으로 정렬. ASC생략 가능. 
SELECT *
    FROM STUDENT
    ORDER BY SYEAR ASC;

--내림차순으로 정렬. DESC.
SELECT *
    FROM STUDENT
    ORDER BY SYEAR DESC;
    
--7-2. 두 개의 컬럼을 기준으로 정렬
--오름차순으로 정렬
--컴마를 사용해서 다음 정렬될 대상 컬럼을 지정
--먼저 지정된 컬럼부터 정렬을 진행하고
--다음 오는 컬럼에 대한 정렬을 진행한다.
SELECT *
    FROM STUDENT
    ORDER BY SYEAR, SNAME ASC;

--각 컬럼마다 정렬 방식을 따로 설정할 수 있다.
SELECT *
    FROM STUDENT
    ORDER BY SYEAR DESC, MAJOR, AVR ASC;    
    
--부서별(DNO)로 정렬하는데 급여(SAL)가 높은 사람 먼저 나오도록(EMP)
--ENO, ENAME, DNO, SAL
SELECT ENO
    , ENAME
    , DNO
    , SAL
    FROM EMP
    ORDER BY DNO, SAL DESC;
    
--별칭을 붙인 경우에는 별칭으로 정렬도 가능
SELECT ENO
    , ENAME
    , DNO AS 부서번호
    , SAL AS 급여
    FROM EMP
    ORDER BY 부서번호, 급여 DESC;
    
--8. 조건을 걸어주는 WHERE
--8-1. 값의 크기 비교
--급여가 3000이상인 직원 목록 조회
SELECT *
    FROM EMP
    WHERE SAL >= 3000;
    
--전공이 화학과인 학생들 목록
SELECT *
    FROM STUDENT
    WHERE MAJOR = '화학';

--조건절을 사용할 때는 컬럼의 타입으로 비교할 값을 지정한다.
--값을 컬럼의 타입과 다른 타입으로 잡을 경우
--컬럼의 모든 데이터가 값의 타입으로 변경된 다음 비교를 하게 된다.
--데이터가 많아질 경우 모든 데이터에서 한 번 씩 형변환이 일어나기 때문에
--쿼리 속도가 매우 저하된다.
--조건절에서 비교할 때 컬럼의 타입을 변환하는 일이 있어서는 안된다.
--비교할 값을 컬럼의 타입과 맞춰야 한다.

--DNO이 null인 직원 목록 조회
SELECT *
    FROM EMP
    WHERE COMM IS NULL;

--9. 다중 조건 만들기 AND, OR
--9-1. 모든 조건을 충족하는 데이터를 조회
--학년이 1학년이면서 이름에 '우'로 끝나는 학생 목록 조회
SELECT *
    FROM STUDENT
    WHERE SYEAR = 1
      AND SNAME LIKE '%우';
      
--회계업무를 하면서 급여가 3000이상이고 이름이 세자인 직원 목록 조회
SELECT *
    FROM EMP
    WHERE JOB = '회계'
     AND SAL >= 3000
     AND ENAME LIKE  '___';
     
     
--기말고사 성적이 75점 이상이거나 과목번호가 1211인 학생 목록 조회
SELECT *
    FROM SCORE
    WHERE RESULT >= 75
       OR CNO = '1211';

--AND, OR 혼합 사용
--DNO가 10이거나 급여가 1600이상인 직원 중 보너스가 600이상인 직원
--()를 이용해서 우선순위 지정

SELECT * 
    FROM EMP
    WHERE (DNO = '30'
       OR SAL >= 2000)
      AND COMM >= 600;
      
--평점이 2.0 이상이거나 이름이 3자인 학생 중 물리 전공인 학생 목록 출력
SELECT *
    FROM STUDENT
    WHERE (AVR >= 2.0
       OR SNAME LIKE '___')
      AND MAJOR = '물리';
      
--10. 사이값을 찾아주는 BETWEEN AND절
--급여가 3500에서 5000사이에 있는 직원목록 조회
SELECT *
    FROM EMP
    WHERE SAL BETWEEN 3500 AND 5000;
    
--급여가 3500에서 5000 사이에 있고 부서번호가 01~ 10인 직원 목록 조회
SELECT * 
    FROM EMP
    WHERE SAL BETWEEN 3500 AND 5000
      AND DNO BETWEEN '01' AND '10';
      
--TO_DATE 사용해서 임용일자가 1994년 1월 1일 이후 1998년 2월 3일 이전인 교수목록 조회
SELECT *
    FROM PROFESSOR
    WHERE HIREDATE BETWEEN TO_DATE('19940101')
      AND TO_DATE('19980202')
      ORDER BY HIREDATE;
    
--DNO = 10 OR 20 OR 30 직원목록 조회 (IN절로 변환)
SELECT *
    FROM EMP
    WHERE DNO IN ('10', '20', '30');
       
--DATE 표시 형식 지정
ALTER SESSION SET NLS_DATE_FORMAT = 'YYYY/MM/DD HH24:MI:SS';
    
--11. 여러개의 데이터를 비교해주는 IN절
--화학과나 물리학과 학생이면서 1, 2, 3학년인 학생만 조회
SELECT *
    FROM STUDENT
    WHERE MAJOR IN('화학', '물리')
      AND SYEAR IN(1, 2, 3)
      ORDER BY MAJOR, SYEAR;
    

--업무가 개발, 경영이면서 보너스가 700이상인 직원 목록 조회
SELECT *
    FROM EMP
    WHERE JOB IN('개발', '경영')
      AND COMM >= 700;
    
--과목의 PNO을 사용해서 PROFESSOR의 PNAME을 조회
SELECT A.*
    ,B.
    FROM COURSE A
    LEFT OUTER JOIN PROFESSOR B
    ON A.PNO = B.PNO
    
    

    