--32
--1) SCORE 테이블과 동일한 구조를 갖는 SCORE_CHK를 생성하고 RESULT 60이상 90이하만 입력 가능하도록 하세요.
CREATE TABLE SCORE_CHK(
    SNO	VARCHAR2(8),
    CNO	VARCHAR2(8),
    RESULT NUMBER(3,0) CONSTRAINT CHK_SC CHECK(RESULT BETWEEN 60 AND 90)
    );


--2) STUDENT 테이블과 동일한 구조를 갖는 STUDENT_COPY 테이블을 생성하면서 SNO은 PK로 SNAME은 NOT NULL로 SYEAR의 DEFAULT는 1로 
--   설정하세요.
CREATE TABLE STUDENT_COPY(
    SNO	VARCHAR2(8),
    SNAME VARCHAR2(20)NOT NULL,
    SEX	VARCHAR2(3),
    SYEAR NUMBER(1,0) DEFAULT 1,
    MAJOR VARCHAR2(20),
    AVR	NUMBER(4,2),
    CONSTRAINT PK_ST PRIMARY KEY(SNO)
    );
    


--3) COURSE 테이블과 동일한 구조를 갖는 COURSE_CONTSRAINT 테이블을 생성하면서 CNO, CNAME을 PK로 PNO은 PROFESSOR_PK의 PNO을 참조하여
--   FK로 설정하고 ST_NUM은 DEFAULT 2로 설정하세요.
CREATE TABLE COURSE_CONSTRAINT(
    CNO	VARCHAR2(8),
    CNAME VARCHAR2(20),
    ST_NUM NUMBER(1,0) DEFAULT 2,
    PNO	VARCHAR2(8),
    CONSTRAINT PK_C PRIMARY KEY(CNO, CNAME),
    CONSTRAINT FK_C FOREIGN KEY(PNO)
    REFERENCES PROFESSOR_PK(PNO)
    );


--4) 다음 구조를 갖는 테이블을 생성하세요.
--   T_SNS                              T_SNS_DETAIL                        T_SNS_UPLOADED
--   SNS_NO(PK)    SNS_NM               SNS_NO(PK, FK)   SNS_BEN            SNS_NO(PK, FK)    SNS_UPL_NO(PK)
--     1            페북                   1               4000                   1                  1
--     2           인스타                  2               10000                  1                  2
--     3           트위터                  3               30000                  2                  1
--                                                                               2                  2

CREATE TABLE T_SNS(
    SNS_NO NUMBER,
    SNS_NM VARCHAR2(8),
    CONSTRAINT PK_SNS PRIMARY KEY(SNS_NO)
    );
    
CREATE TABLE T_SNS_DETAIL(
    SNS_NO NUMBER,
    SNS_BEN NUMBER,
    CONSTRAINT PK_SNSD PRIMARY KEY(SNS_NO),
    CONSTRAINT FK_SNSD FOREIGN KEY(SNS_NO)
    REFERENCES T_SNS(SNS_NO)
    );
    
CREATE TABLE T_SNS_UPLOADED(
    SNS_NO NUMBER,
    SNS_UPL_NO NUMBER,
    CONSTRAINT PK_SNSUP PRIMARY KEY(SNS_NO, SNS_UPL_NO),
    CONSTRAINT FK_SNSUP FOREIGN KEY(SNS_NO)
    REFERENCES T_SNS_DETAIL(SNS_NO)
    );

INSERT INTO T_SNS
VALUES(1, '페북');

INSERT INTO T_SNS_DETAIL
VALUES(1, 3000);

INSERT INTO T_SNS_UPLOADED
VALUES(1, 7);

SELECT * 
FROM T_SNS;

SELECT * 
FROM T_SNS_DETAIL;

SELECT * 
FROM T_SNS_UPLOADED;

--33----------------------------------------------------------------------------------------------------------------
--1) 다음 구조를 갖는 테이블을 생성하세요.
--PRODUCT 테이블 - PNO NUMBER PK              : 제품번호
--                PNMAE VARCHAR2(50)          : 제품이름
--                PRI NUMBER                  : 제품단가
--PAYMENT 테이블 - MNO NUMBER PK              : 전표번호
--               PDATE DATE NOT NULL         : 판매일자
--                CNAME VARCHAR2(50) NOT NULL : 고객명
--                TOTAL NUMBER TOTAL > 0      : 총액
--PAYMENT_DETAIL - MNO NUMBER PK FK           : 전표번호
--                PNO NUMBER PK FK            : 제품번호
--                AMOUNT NUMBER NOT NULL      : 수량
--                PRICE NUMBER NOT NULL       : 단가
--                TOTAL_PRICE NUMBER NOT NULL TOTAL_PRICE > 0 : 금액


CREATE TABLE PRODUCT(
    PNO NUMBER,
    PNAME VARCHAR2(50),
    PRI NUMBER,
    CONSTRAINT PK_PRO PRIMARY KEY(PNO)
    );
    
CREATE TABLE PAYMENT(
    MNO NUMBER,
    PDATE DATE NOT NULL,
    CNAME VARCHAR2(50) NOT NULL,
    TOTAL NUMBER CONSTRAINT CHE_PAY CHECK (TOTAL > 0),
    CONSTRAINT PK_PAY PRIMARY KEY(MNO)
    );
    
    
CREATE TABLE PAYMENT_DETAIL(
    MNO NUMBER,
    PNO NUMBER,
    AMOUNT NUMBER NOT NULL,
    PRICE NUMBER NOT NULL,
    TOTAL_PRICE NUMBER NOT NULL CONSTRAINT CHE_PAYD CHECK(TOTAL_PRICE > 0),
    CONSTRAINT PK_PAYD PRIMARY KEY(MNO, PNO),
    CONSTRAINT FK_PAYD FOREIGN KEY(MNO) REFERENCES PAYMENT(MNO),
    CONSTRAINT FK_PAYD2 FOREIGN KEY(PNO) REFERENCES PRODUCT(PNO)
    );
    

