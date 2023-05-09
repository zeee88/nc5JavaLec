--1. STORED PROCEDURE
--1-1. 파라미터가 없는 프로시저
--프로시저 선언
CREATE OR REPLACE PROCEDURE PRO_NOPARAM
--변수 선언부
IS
    ENO VARCHAR2(8);
    ENAME VARCHAR2(20);
BEGIN
    ENO := '9999';
    ENAME := '장길산';
    
    INSERT INTO EMP(ENO, ENAME)
    VALUES(ENO, ENAME);
END;
/

--프로시저 실행
EXEC PRO_NOPARAM;

SELECT *
    FROM EMP
    WHERE ENO = '9999';
    
    
--일반화학의 학생별 기말고사 성적을 저장하는 테이블 생성
CREATE TABLE T_NCHE_SC1
AS SELECT SC.*, ST.SNAME 
    FROM SCORE SC 
    JOIN COURSE C
    ON SC.CNO = C.CNO
    RIGHT JOIN STUDENT ST
    ON SC.SNO = ST.SNO
    WHERE C.CNAME = '일반화학1';
    
DROP TABLE T_NCHE_SC1;
SELECT *
    FROM T_NCHE_SC1;

--GRADE까지 가지는 일반화학 학생별 기말고사 성적 테이블
CREATE TABLE T_NCHE_SCGR(
    SNO NUMBER PRIMARY KEY,
    SNAME VARCHAR2(20),
    RESULT NUMBER(5, 2),
    GRADE CHAR(1)
    );
    
--T_NCHE_SC1을 참조해서 T_NCHE_SCGR에 데이터를 저장하는 프로시저 선언
CREATE OR REPLACE PROCEDURE P_NCHE_SCGR
IS
    --레코드
    SNO VARCHAR2(8);
    CNO VARCHAR2(8);
    RESULT NUMBER(5,2);
    SNAME VARCHAR2(20);
    
    --레코드변수 선언
    SCGRREC P_NCHE_SCGR%ROWTYPE;
    
    --커서
    
BEGIN
    --커서 오픈
    
    --루프
        --패치
        
        --점수별 등급 조건문(IF THEN ~ ELSIF THEN ~ ELSE)
        
        --인서트문
    
    --루프끝
    
END;
/
    
    
    
    