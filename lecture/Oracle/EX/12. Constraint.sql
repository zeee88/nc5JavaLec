--1. CONSTRAINT
--1-1. PRIMARY KEY
--단일 컬럼 PK 테이블 생성
CREATE TABLE EMP_PK1(
--CONSTRAINT 제약조건명을 생략하면 제약조건명을 SYSTEM에서 자동으로 생성해준다.
    ENO NUMBER PRIMARY KEY,
    ENAME VARCHAR2(20),
    JOB VARCHAR2(10),
    MGR NUMBER,
    HDATE DATE,
    DNO NUMBER
    );
    
CREATE TABLE DEPT_PK1(
    DNO NUMBER,
    DNAME VARCHAR2(10),
    LOC VARCHAR2(10),
    DIRECTOR NUMBER,
    CONSTRAINT PK_DEPT_DNO PRIMARY KEY(DNO)
    );
    
--중복허용 확인
INSERT INTO DEPT_PK1
VALUES (2, '개발2', '부산', 2);

--PK에 NULL저장
INSERT INTO EMP_PK1
VALUES(2, NULL, NULL, NULL, NULL, NULL);

SELECT *
    FROM DEPT_PK1;
    
SELECT *
    FROM EMP_PK1;
    
--다중 컬럼 PK 지정
--다중 컬럼 PK 지정시 아래 방법은 허용안됨
CREATE TABLE SCORE_PK1(
    CNO NUMBER PRIMARY KEY,
    SNO NUMBER PRIMARY KEY,
    RESULT NUMBER
    );
    
--다중 컬럼 PK지정 방식
CREATE TABLE SCORE_PK1(
    CNO NUMBER,
    SNO NUMBER,
    RESULT NUMBER,
    CONSTRAINT PK_SCORE_CNO_SNO PRIMARY KEY(CNO, SNO)
    );

--다중 컬럼 PK는 다중 컬럼이 PK쌍이 된다.
--PK로 지정된 모든 컬럼의 값이 중복돼야 중복으로 인식
INSERT INTO SCORE_PK1
VALUES(1, 1, 100);
INSERT INTO SCORE_PK1
VALUES(1, 2, 99);
INSERT INTO SCORE_PK1
VALUES(1, 3, 98);
INSERT INTO SCORE_PK1
VALUES(1, 1, 97);

SELECT *
    FROM SCORE_PK1;
    
--PK 추가
ALTER TABLE DEPT
    ADD CONSTRAINT PK_DEP_DNO PRIMARY KEY(DNO);
    
    
--SCORE 테이블에 CNO, SNO PK 추가
ALTER TABLE SCORE
    ADD CONSTRAINT PK_SC_CNO_SNO PRIMARY KEY(CNO, SNO);
    
--PK 삭제
ALTER TABLE DEPT
    DROP CONSTRAINT PK_DEP_DNO;





    

