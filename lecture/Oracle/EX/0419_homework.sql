--1) 어제 만든 SCORE_STGR 테이블의 SNO 컬럼에 INDEX를 추가하세요.
CREATE INDEX SCORE_SNO_IDX
    ON SCORE_STGR(SNO);


--2) 어제 만든 ST_COURSEPF 테이블의 SNO, CNO, PNO 다중 컬럼에 INDEX를 추가하세요.
CREATE INDEX ST_SNO_CNO_PNO_IDX
    ON ST_COURSEPF(SNO, CNO, PNO);
    

-----------------------------------------------------------------------------------------

--뷰 이름은 자유
--1) 학생의 학점 평점 4.5 만점으로 환산된 정보를 검색할 수 있는 뷰를 생성하세요.
CREATE OR REPLACE VIEW V_AVR_STUDENT(
     SNO
    ,SNAME
    ,NAVR
    ) AS (SELECT SNO
                , SNAME
                , ROUND(AVR * 4.5 /4.0, 2) AS NAVR
                FROM STUDENT
                );
                
SELECT *
    FROM V_AVR_STUDENT;
    

    
--2) 각 과목별 기말고사 평균 점수를 검색할 수 있는 뷰를 생성하세요.
CREATE OR REPLACE VIEW V_AVG_RESULT(
     CNO
    , CNAME
    , RESULT
    ) AS (SELECT CNO
                , CNAME
                , ROUND(AVG(RESULT), 2)
                FROM COURSE C
                NATURAL JOIN SCORE
                GROUP BY CNO, CNAME
                );

SELECT *
    FROM V_AVG_RESULT;

--3) 각 사원과 관리자의 이름(MGR)을 검색할 수 있는 뷰를 생성하세요.
CREATE OR REPLACE VIEW V_ENAME_EMP(
     ENO
    , ENAME
    , MGR
    ) AS(SELECT
                ENO
                , ENAME
                , MGR
                FROM EMP
                NATURAL JOIN DEPT
                );
            
SELECT *
    FROM V_ENAME_EMP;


--4) 각 과목별 기말고사 평가 등급(A~F)까지와 해당 학생 정보를 검색할 수 있는 뷰를 생성하세요.
CREATE OR REPLACE VIEW V_CNO_GRADE(
       CNO
     , CNAME
     , GRADE
     , SNO
     , SNAME
     , MAJOR
     , AVR
       ) AS(SELECT   C.CNO
                    , C.CNAME
                    , SG.GRADE
                    , ST.SNO
                    , ST.SNAME
                    , ST.MAJOR
                    , ST.AVR
                    FROM COURSE C
                    JOIN SCORE SC
                    ON C.CNO = SC.CNO
                    JOIN SCGRADE SG
                    ON SC.RESULT BETWEEN SG.LOSCORE AND SG.HISCORE
                    JOIN STUDENT ST
                    ON ST.SNO = SC.SNO
                    );
                  

SELECT *
    FROM V_CNO_GRADE;


--5) 물리학과 교수의 과목을 수강하는 학생의 명단을 검색할 뷰를 생성하세요.
CREATE OR REPLACE VIEW V_PRO_STU(
      SECTION
    , PNO
    , PNAME
    , SNO
    , SNAME
    , MAJOR
    ) AS (SELECT SECTION
                , PNO
                , PNAME
                , SNO
                , SNAME
                , MAJOR
                FROM PROFESSOR
                NATURAL JOIN COURSE
                NATURAL JOIN STUDENT
                NATURAL JOIN SCORE
                WHERE SECTION = '물리'
                );
           
SELECT *
    FROM V_PRO_STU;

--------------------------------------------------------------------------------------------

--1) 4.5 환산 평점이 가장 높은 3인의 학생을 검색하세요.
SELECT ROWNUM
    , A.SNO
    , A.SNAME
    , A.NAVR
    FROM (SELECT  SNO
                , SNAME
                , AVR *4.5 /4.0 AS NAVR
                FROM STUDENT
                ORDER BY NAVR DESC
                )A
            WHERE ROWNUM <= 3;

--2) 기말고사 과목별 평균이 높은 3과목을 검색하세요.
SELECT ROWNUM
     , A.CNO
     , A.CNAME
     , A.AVRES
     FROM (SELECT CNO
                , CNAME
                , ROUND(AVG(RESULT),2) AS AVRES
                FROM COURSE 
                NATURAL JOIN SCORE
                GROUP BY CNO, CNAME
                ORDER BY AVRES DESC
                )A
            WHERE ROWNUM <=3;

--3) 학과별, 학년별, 기말고사 평균이 순위 3까지를 검색하세요.(학과, 학년, 평균점수 검색)
SELECT ROWNUM
    , A.MAJOR
    , A.SYEAR
    , A.AVRES
    FROM (SELECT MAJOR
                , SYEAR
                , ROUND(AVG(RESULT),2) AS AVRES
                FROM STUDENT
                NATURAL JOIN SCORE
                GROUP BY MAJOR, SYEAR
                ORDER BY AVRES DESC
                )A
            WHERE ROWNUM <=3;

--4) 기말고사 성적이 높은 과목을 담당하는 교수 3인을 검색하세요.(교수이름, 과목명, 평균점수 검색)
SELECT ROWNUM
     , PNAME
     , CNAME
     , AVRES
    FROM (SELECT PNAME
                , CNAME
                , ROUND(AVG(RESULT),2) AS AVRES
                FROM PROFESSOR
                NATURAL JOIN COURSE
                NATURAL JOIN SCORE
                GROUP BY CNAME, PNAME
                ORDER BY AVRES DESC
                )A
            WHERE ROWNUM <= 3;

--5) 교수별로 현재 수강중인 학생의 수를 검색하세요.
SELECT PNO
    , PNAME
    , COUNT(*)
    FROM PROFESSOR
    NATURAL JOIN COURSE
    NATURAL JOIN STUDENT
    GROUP BY PNO, PNAME;
        
---------------------------------------------------------------------------------------------

--1) CNO이 PK인 COURSE_PK 테이블을 생성하세요.(1번 방식으로)
CREATE TABLE COURSE_PK(
      CNO VARCHAR2(8) PRIMARY KEY,
      CNAME VARCHAR(20),
      ST_NUM NUMBER,
      PNO VARCHAR(8)
    );



--2) PNO이 PK인 PROFESSOR_PK 테이블을 생성하세요.(2번 방식으로)
CREATE TABLE PROFESSOR_PK(
    PNO VARCHAR2(8),
    PNAME VARCHAR2(20),
    SECTION VARCHAR2(20),
    ORDERS VARCHAR2(10),
    HIREDATE DATE,
    CONSTRAINT PK_PROFESSOR_PNO PRIMARY KEY(PNO)
    );

--3) PF_TEMP 테이블에 PNO을 PK로 추가하세요.
ALTER TABLE PF_TEMP
    ADD CONSTRAINT PK_PF_PNO PRIMARY KEY(PNO);

--4) COURSE_PROFESSOR 테이블에 CNO, PNO을 PK로 추가하세요.

ALTER TABLE COURSE_PROFESSOR
    ADD CONSTRAINT PK_COURSE_CNO_PNO PRIMARY KEY(CNO, PNO);

--5) BOARD_NO(NUMBER)를 PK로 갖으면서 BOARD_TITLE(VARCHAR2(200)), BOARD_CONTENT(VARCHAR2(2000)), 
--   BOARD_WRITER(VARCHAR2(20)), BOARD_FRGT_DATE(DATE), BOARD_LMDF_DATE(DATE) 컬럼을 갖는 T_BOARD 테이블을 생성하세요.

CREATE TABLE T_BOARD(
    BOARD_NO NUMBER,
    BOARD_TITLE VARCHAR2(200),
    BOARD_CONTENT VARCHAR2(2000),
    BOARD_WRITER VARCHAR2(20),
    BOARD_FRGT_DATE DATE,
    BOARD_LMDF_DATE DATE,
    CONSTRAINT PK_NO PRIMARY KEY(BOARD_NO)
    );


--6) BOARD_NO(NUMBER), BOARD_FILE_NO(NUMBER)를 PK로 갖으면서 BOARD_FILE_NM(VARCHAR2(200)), BOARD_FILE_PATH(VARCHAR2(2000)),
--   ORIGIN_FILE_NM(VARCHAR2(200)) 컬럼을 갖는 T_BOARD_FILE 테이블을 생성하세요.

CREATE TABLE T_BOARD_FILE(
    BOARD_NO NUMBER,
    BOARD_FILE_NO NUMBER,
    BOARD_FILE_NM VARCHAR2(200),
    BOARD_FILE_PATH VARCHAR2(2000),
    ORIGIN_FILE_NM VARCHAR2(200),
    CONSTRAINT PK_BOARD PRIMARY KEY(BOARD_NO, BOARD_FILE_NO)
    );
    

