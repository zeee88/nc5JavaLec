--1) 과목번호, 과목이름, 교수번호, 교수이름을 담을 수 있는 변수들을 선언하고 
--   유기화확 과목의 과목번호, 과목이름, 교수번호, 교수이름을 출력하세요.
DECLARE
    CNO NUMBER;
    CNAME VARCHAR2(20);
    PNO NUMBER;
    PNAME VARCHAR2(20);
  
      BEGIN
        SELECT CNO
            , CNAME
            , PNO
            , PNAME
            INTO
              CNO
            , CNAME
            , PNO
            , PNAME
            FROM COURSE
            NATURAL JOIN PROFESSOR
            WHERE CNAME = '유기화학';
        
         DBMS_OUTPUT.PUT_LINE(CNO);
         DBMS_OUTPUT.PUT_LINE(CNAME);
         DBMS_OUTPUT.PUT_LINE(PNO);
         DBMS_OUTPUT.PUT_LINE(PNAME);
         
          END;
           /

--2) 위 데이터들을 레코드로 선언하고 출력하세요.

DECLARE
    TYPE COU_PRO IS RECORD(
        CNO COURSE.CNO%TYPE,
        CNAME COURSE.CNAME%TYPE,
        PNO PROFESSOR.PNO%TYPE,
        PNAME PROFESSOR.PNAME%TYPE
        );

    COUPROREC COU_PRO;
    
    BEGIN
        SELECT CNO
            , CNAME
            , PNO
            , PNAME
            INTO
            COUPROREC.CNO
            , COUPROREC.CNAME
            , COUPROREC.PNO
            , COUPROREC.PNAME
            FROM COURSE
            NATURAL JOIN PROFESSOR
            WHERE CNAME = '유기화학';
            
             
             DBMS_OUTPUT.PUT_LINE(COUPROREC.CNO);
             DBMS_OUTPUT.PUT_LINE(COUPROREC.CNAME);
             DBMS_OUTPUT.PUT_LINE(COUPROREC.PNO);
             DBMS_OUTPUT.PUT_LINE(COUPROREC.PNAME);
             
              END;
               /
               
               
--3) 과목번호, 과목이름, 과목별 평균 기말고사 성적을 갖는 레코드의 배열을 만들고
--   기본 LOOP문을 이용해서 모든 과목의 과목번호, 과목이름, 과목별 평균 기말고사 성적을 출력하세요.

DECLARE
    TYPE COU_REC IS RECORD(
        CNO VARCHAR2(8),
        CNAME VARCHAR(20),
        RESULT NUMBER
        );
 
     TYPE COURSE_ARRAY IS TABLE OF COU_REC
        INDEX BY PLS_INTEGER;
        
        COUARR COURSE_ARRAY;
        IDX NUMBER := 1;
        LEN NUMBER := 1;
    
BEGIN
SELECT C.CNO AS MI,
       C.CNAME AS MII,
       ROUND(AVG(RESULT),2) AS MIII
--       INTO  COUARR(IDX).MI
--                , COUARR(IDX).MII
--                , COURARR(IDX).MIII
   BULK COLLECT INTO COUARR
    FROM COURSE C
    LEFT JOIN SCORE SC
    ON C.CNO = SC.CNO
    GROUP BY C.CNO, C.CNAME;


        LEN := COUARR.COUNT;
        
       LOOP
      
        DBMS_OUTPUT.PUT_LINE(COUARR(IDX).CNO);
        DBMS_OUTPUT.PUT_LINE(COUARR(IDX).CNAME);
        DBMS_OUTPUT.PUT_LINE(COUARR(IDX).RESULT);
       
           IDX := IDX + 1;
           EXIT WHEN LEN = IDX;
         END LOOP;
END;
 /
 
 
--4) 학생번호, 학생이름과 학생별 평균 기말고사 성적을 갖는 테이블 T_STAVGSC를 만들고
--   커서를 이용하여 학생번호, 학생이름, 학생별 평균 기말고사 성적을 조회하고 
--   조회된 데이터를 생성한 테이블인 T_STAVGSC에 저장하세요.


--테이블 생성
CREATE TABLE T_STAVGSC(
      SNO VARCHAR(8),
      SNAME VARCHAR(20),
      RESULT NUMBER
    );
    
    
--커서 이용해서 조회
DECLARE CURSOR CURST IS 
        SELECT SNO
            , SNAME
            , ROUND(AVG(RESULT),2) AS NRES
            FROM STUDENT
            NATURAL JOIN SCORE
            GROUP BY SNO, SNAME;
            
      STAVGSC_REC CURST%ROWTYPE;        --
      
--조회된 데이터 저장.
BEGIN 
    OPEN CURST;
    LOOP
        FETCH CURST INTO STAVGSC_REC;
        EXIT WHEN CURST%NOTFOUND;
    
    INSERT INTO T_STAVGSC VALUES(STAVGSC_REC.SNO, STAVGSC_REC.SNAME, STAVGSC_REC.NRES);
      DBMS_OUTPUT.PUT_LINE(STAVGSC_REC.SNO);
      DBMS_OUTPUT.PUT_LINE(STAVGSC_REC.SNAME);
      DBMS_OUTPUT.PUT_LINE(STAVGSC_REC.NRES);
    END LOOP;
    CLOSE CURST;
    
    END;
    /
