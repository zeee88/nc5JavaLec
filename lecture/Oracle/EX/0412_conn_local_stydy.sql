--1. OUTER JOIN 연습
CREATE TABLE BOARD(
    BOARD_NO NUMBER, 
    BOARD_TITLE VARCHAR(50)
);
    
CREATE TABLE BOARD_FILE(
        BOARD_NO NUMBER, 
        FILE_NM VARCHAR(50)
);
        
 INSERT INTO BOARD_FILE VALUES(14, 'a');
 
 SELECT * FROM BOARD_FILE;
 
 SELECT A.BOARD_TITLE
       ,B.BOARD_NO
       ,NVL(B.FILE_NM, 'no file exist')
    FROM  BOARD A
    left outer JOIN BOARD_FILE B
    ON A.BOARD_NO = B.BOARD_NO;
    
--2. INNER JOIN
--SCORE테이블의 모든 데이터와 STUDENT테이블의 학생이름 조회
SELECT SC.*
      , ST.SNAME
      FROM SCORE SC
      INNER JOIN STUDENT ST
      ON SC.SNO = ST.SNO;

--모든 사원정보와 부서명 동시에 조회
-ANSI 표준
SELECT E.*
     , DE.DNAME
        FROM EMP E
        INNER JOIN dept DE
        ON E.DNO = DE.DNO;

--다른 형태의 INNER JOIN
SELECT E.*
    , DE.DNAME
        FROM EMP E
          , DEPT DE
       WHERE E.DNO = DE.DNO;
       
--비등가 조인
SELECT SC.*
    , GR.GRADE
    FROM SCORE SC
    INNER JOIN SCGRADE GR
    ON SC.RESULT BETWEEN GR.LOSCORE AND GR.HISCORE;
    
--사원의 모든 정보와 해당 사원에 대한 급여등급 정보 조회
SELECT EM.*
    , GR.GRADE
    FROM EMP EM
    INNER JOIN SALGRADE GR
    ON EM.SAL BETWEEN GR.LOSAL AND HISAL;
    
--CrossJoin
--조인조건을 명시하지 않으면 의미없는 데이터가 조회된다.
SELECT A.ENO
     , A.ENAME
     , A.DNO
     , B.DNAME
    FROM EMP A
    , DEPT B;

--셀프조인
--FROM절의 테이블과 조인되는 테이블이 같을 때
--사원의 사수의 이름 조회
SELECT A.ENO
    , A.ENAME
    , A.MGR
    , B.ENO
    , B.ENAME
    FROM EMP A
    JOIN EMP B
    ON A.MGR = B.ENO;
    
--3. OUTER JOIN
--사원의 사수의 이름 조회. 사수의 정보가 존재하지 않는 사원들도 모두 조회
--ANSI
SELECT A.*
    FROM EMP A
    LEFT OUTER JOIN EMP B
    ON A.MGR = B.ENO;

--ORACLE
SELECT A.*
      FROM EMP A, EMP B
      WHERE A.MGR = B.ENO(+);


--과목들의 정보를 조회, 교수의 이름과 같이 조회, 담당교수가 배정되지 않은 과목도 함께 조회되도록
--ANSI
SELECT A.*
     , B.PNAME
    FROM COURSE A
    LEFT OUTER JOIN PROFESSOR B
    ON A.PNO = B.PNO;
    
--ORACLE
SELECT A.*
     , B.PNAME
    FROM COURSE A, PROFESSOR B
    WHERE A.PNO = B.PNO(+);
    
--4. 다중 조인
--사원의 모든정보 조회, 급여등급, 사수의 이름, 부서명이 같이 조회되도록
SELECT E.ENO
    , E.ENAME
    , E.MGR
    , M.ENAME
    , E.SAL
    , S.GRADE
    , E.DNO
    , D.DNAME
    FROM EMP E
    JOIN SALGRADE S
    ON E.SAL BETWEEN S.LOSAL AND S.HISAL
    JOIN DEPT D
    ON E.DNO = D.DNO
    LEFT OUTER JOIN EMP M
    ON E.MGR = M.ENO;
    
--기말고사의 성적을 조회. 과목이름, 담당교수이름 함께 조회
SELECT S.SNO
     , S.SNAME
     , S.AVR
     , C.CNAME
     , P.PNAME
     , SC.RESULT
     . SG.GRADE
     FROM SCORE SC
     JOIN COURSE C
     ON SC.CNO = C.CNO
     JOIN PROFESSOR P
     ON C.PNO = P.PNO
     JOIN SCGRADE SG
     ON SC.RESULT BETWEEN SG.LOSCORE AND SG.HISCORE
     JOIN STUDENT S
     ON S.SNO = SC.SNO;


    
    
    
    
    
    
    
    
    
    
    
    
