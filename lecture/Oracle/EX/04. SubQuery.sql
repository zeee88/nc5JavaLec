--1. 서브쿼리
--단일 행 쿼리
SELECT *
    FROM PROFESSOR
    WHERE PNAME = '송강';
    
--1-1. 단일 행 서브 쿼리
--송강보다 부임일시가 빠른 교수들의 목록 조회
SELECT P.*
    FROM PROFESSOR P
    WHERE P.HIREDATE < (
                        SELECT HIREDATE
                            FROM PROFESSOR
                            WHERE PNAME = '송강'
                            );
--손하늘 사원보다 급여가 높은 사원목록 조회
SELECT E.*
    FROM EMP E
    WHERE E.SAL > (
                    SELECT SAL
                        FROM EMP
                        WHERE ENAME = '손하늘'
                        );
                        
--테이블화해서 JOIN으로 조회하기         
SELECT E.*
    FROM EMP E
    JOIN (
                    SELECT *
                        FROM EMP
                        WHERE ENAME = '손하늘'
                        )B
    ON E.SAL> B.SAL;
                        
--1-2. 다중 행 서브쿼리
--노육학생의 정보
SELECT *   
    FROM STUDENT
    WHERE SNAME = '노육';
    
--노육이라는 학생들과 학점이 같은 학생 목록 조회
SELECT ST.*
    FROM STUDENT ST
    WHERE AVR IN(
                    SELECT AVR
                        FROM STUDENT
                        WHERE SNAME = '노육'
                        );

SELECT ST.*
    FROM STUDENT ST
    JOIN (
                    SELECT AVR
                        FROM STUDENT
                        WHERE SNAME = '노육'
                        )B
    ON ST.AVR = B.AVR; 
    
--기말고사 성적이 95점 이상인 학번, 과목번호, 과목명, 성적 => 서브쿼리
--학생테이블이랑 조인해서 학번, 학생이름, 과목번호, 과목명, 성적, 전공
SELECT ST.SNO
     , ST.SNAME
     , B.CNO
     , B.CNAME
     , B.RESULT
     , ST.MAJOR
    FROM STUDENT ST
    JOIN(
                    SELECT SC.SNO
                         , SC.CNO
                         , C.CNAME
                         , SC.RESULT
                        FROM SCORE SC
                        JOIN COURSE C
                        ON SC.CNO = C.CNO
                        AND RESULT >= 95
                        )B
    ON B.SNO = ST.SNO;
    
    
--SCORE, SCGRADE, STUDENT => 하나의 서브쿼리
--COURSE, PROFESSOR -> 하나의 서브쿼리로(담당교수가 없는 과목도 조회)

--위 서브쿼리 테이블 2개를 다시 조인해서 결과
--기말고사의 성적을 조회. 담당교수가 없는 과목도 나오도록
--과목이름, 담당교수이름, 학생이름, 점수등급 함께 조회 과목번호 순서로 정렬
SELECT A.SNO
        ,A.SNAME
        ,B.CNO
        ,B.CNAME
        ,B.PNO
        ,B.PNAME
        ,A.RESULT
        ,A.GRADE
FROM(
        SELECT ST.SNAME
             , ST.SNO
             , SC.RESULT
             , SG.GRADE
             , SC.CNO
            FROM SCORE SC
            JOIN STUDENT ST
            ON ST.SNO = SC.SNO
            JOIN SCGRADE SG
            ON SC.RESULT BETWEEN SG.LOSCORE AND SG.HISCORE
        )A
  RIGHT JOIN(  
                SELECT C.CNAME
                     , P.PNAME
                     , C.CNO
                     , C.PNO
                     FROM COURSE C
                     LEFT JOIN PROFESSOR P
                     ON C.PNO = P.PNO
                )B
    ON A.CNO = B.CNO
    ORDER BY B.CNO;
         

    
--2. 집합연산자
--2-1. 합집합 연산자
--2000년 이후에 임용된 교수와 2000년 이후에 입사한 직원의 목록 조회
SELECT PNO AS 직원번호
    , PNAME AS 직원이름
    , HIREDATE AS 입사일시
    FROM PROFESSOR
    WHERE HIREDATE > TO_DATE('19991231 23:59:59','yyyyMMdd HH24:mi:ss')
UNION
SELECT ENO
    , ENAME
    , HDATE
    FROM EMP
    WHERE HDATE > TO_DATE('19991231 23:59:59','yyyyMMdd HH24:mi:ss');

  
--2-2. 차집합 연산자
--성이 제갈이면서 지원업무를 하지 않는 사원의 사원번호, 사원이름, 업무 조회
SELECT ENO
    , ENAME
    , JOB
    FROM EMP
    WHERE ENAME LIKE '제갈%'
MINUS
SELECT ENO
    , ENAME
    , JOB
    FROM EMP
    WHERE JOB = '지원';

--과목중에서 담당교수가 배정이 안됐거나 담당교수의 정보가 존재하지 않는 과목번호, 과목명 조회

SELECT C.CNO
    , C.CNAME
    FROM COURSE C
    LEFT JOIN PROFESSOR P
    ON C.PNO = P.PNO
MINUS
SELECT C.CNO
    , C.CNAME
    FROM COURSE C
    JOIN PROFESSOR P
    ON C.PNO = P.PNO;
                        
--화학과 교수중에 일반화학 수업을 하지 않는 교수들만 조회
SELECT P.*
    , C.CNAME
    FROM PROFESSOR P
    JOIN COURSE C
    ON P.PNO = C.PNO
    AND SECTION = '화학'
MINUS
SELECT P.*
    , C.CNAME
    FROM PROFESSOR P
    JOIN COURSE C
    ON P.PNO = C.PNO
    WHERE C.CNAME = '일반화학';

--2-3. 교집합 연산자
--물리, 화학과 학생 중 학점이 3.0 이상인 학생의 학번, 학생이름, 학과, 평점 조회
SELECT SNO
    , SNAME
    , MAJOR
    , AVR
    FROM STUDENT
    WHERE MAJOR IN('물리', '화학')
INTERSECT
SELECT SNO
    , SNAME
    , MAJOR
    , AVR
    FROM STUDENT
    WHERE AVR >= 3.0;

SELECT SYSDATE
    FROM DUAL;
    






