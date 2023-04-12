--1) 평점이 3.0에서 4.0사이의 학생을 검색하라(between and)
SELECT *
    FROM STUDENT
    WHERE AVR BETWEEN 3.0 AND 4.0;

--2) 1994년에서 1995년까지 부임한 교수의 명단을 검색하라(between and)
SELECT *
    FROM PROFESSOR
    WHERE HIREDATE BETWEEN TO_DATE('1994', 'YYYY') AND TO_DATE('1995', 'YYYY');

--3) 화학과와 물리학과, 생물학과 학생을 검색하라(in)
SELECT *
    FROM STUDENT
    WHERE MAJOR IN('화학', '생물');

--4) 정교수와 조교수를 검색하라(in)
SELECT *
    FROM PROFESSOR
    WHERE ORDERS IN('정교수', '조교수');
    
--5) 학점수가 1학점, 2학점인 과목을 검색하라(in)
SELECT *
    FROM COURSE
    WHERE ST_NUM IN(1, 2);

--6) 1, 2학년 학생 중에 평점이 2.0에서 3.0사이인 학생을 검색하라(between and)
SELECT *
    FROM STUDENT
    WHERE SYEAR IN(1, 2)
       AND AVR BETWEEN 2.0 AND 3.0; 
--********************************************

--7) 화학, 물리학과 학생 중 1, 2 학년 학생을 성적순으로 검색하라(in)
SELECT *
    FROM STUDENT
    WHERE MAJOR IN('화학', '물리')
    AND SYEAR IN(1, 2)
    ORDER BY AVR DESC;

--8) 부임일이 1995년 이전인 정교수를 검색하라(to_date)
SELECT *
    FROM PROFESSOR
    WHERE HIREDATE <= TO_DATE('1995', 'YYYY')
      AND ORDERS = '정교수';

---------------------------------------------------------------

--1) 송강 교수가 강의하는 과목을 검색한다
SELECT P.PNAME
     , C.*
    FROM PROFESSOR P
    JOIN COURSE C
    ON P.PNAME = '송강'
    AND P.PNO = C.PNO;

--2) 화학 관련 과목을 강의하는 교수의 명단을 검색한다
SELECT P.*
    , C.CNAME
    FROM PROFESSOR P
    JOIN COURSE C
    ON C.CNAME LIKE '%화학%'
    AND P.PNO = C.PNO;

--3) 학점이 2학점인 과목과 이를 강의하는 교수를 검색한다
SELECT P.PNAME
     ,C.*
    FROM PROFESSOR P
    JOIN COURSE C
    ON C.ST_NUM = 2
    AND P.PNO = C.PNO;

--4) 화학과 교수가 강의하는 과목을 검색한다
SELECT C.*
    , P.SECTION
    FROM COURSE C
    JOIN PROFESSOR P
    ON P.SECTION = '화학'
    AND P.PNO = C.PNO;

--5) 화학과 1학년 학생의 기말고사 성적을 검색한다
SELECT SC.RESULT
    , S.MAJOR
    , S.SYEAR
    FROM SCORE SC
    JOIN STUDENT S
    ON S.MAJOR = '화학'
    AND S.SYEAR = 1
    AND S.SNO = SC.SNO;

--6) 일반화학 과목의 기말고사 점수를 검색한다
SELECT C.*
    , SC.*
    FROM COURSE C
    JOIN SCORE SC
    ON C.CNAME = '일반화학'
    AND C.CNO = SC.CNO;
    
--7) 화학과 1학년 학생의 일반화학 기말고사 점수를 검색한다
SELECT S.*
    , C.CNAME
    , SC.*
    FROM STUDENT S
    JOIN SCORE SC
    ON S.MAJOR = '화학'
    AND S.SYEAR = 1
    AND S.SNO = SC.SNO
    JOIN COURSE C
    ON C.CNAME = '일반화학'
    AND C.CNO = SC.CNO;
    
--8) 화학과 1학년 학생이 수강하는 과목을 검색한다
SELECT S.*
    , C.*
    FROM STUDENT S
    JOIN PROFESSOR P
    ON S.MAJOR = '화학'
    AND S.SYEAR = 1
    AND S.MAJOR = P.SECTION
    JOIN COURSE C
    ON C.PNO = P.PNO;
    
--9) 유기화학 과목의 평가점수가 F인 학생의 명단을 검색한다
SELECT S.*
    ,C.CNAME
    , SG.GRADE
    FROM COURSE C
    JOIN SCORE SC
    ON C.CNAME = '유기화학'
    AND C.CNO = SC.CNO
    JOIN SCGRADE SG
    ON SG.GRADE = 'F'
    JOIN STUDENT S
    ON S.SNO = SC.SNO;

------------------------------------------------------------

--1) 학생중에 동명이인을 검색한다
SELECT DISTINCT A.*
    FROM STUDENT A
    INNER JOIN STUDENT B
    ON A.SNAME = B.SNAME AND A.SNO<>B.SNO
    ORDER BY A.SNAME;
    --*********************************
  
--2) 전체 교수 명단과 교수가 담당하는 과목의 이름을 학과 순으로 검색한다
SELECT P.*
    , C.CNAME
    FROM PROFESSOR P
    LEFT OUTER JOIN COURSE C
    ON C.PNO = P.PNO
    ORDER BY P.SECTION;

--3) 이번 학기 등록된 모든 과목과 담당 교수를 학점 순으로 검색한다
SELECT C.*
    , P.PNAME
    FROM COURSE C
    LEFT OUTER JOIN PROFESSOR P
    ON C.PNO = P.PNO
    ORDER BY ST_NUM;

-------------------------------------------------------------

--1) 각 과목의 과목명과 담당 교수의 교수명을 검색하라
SELECT C.CNAME
        , P.PNAME
        FROM COURSE C
        JOIN PROFESSOR P
        ON C.PNO = P.PNO; 

--2) 화학과 학생의 기말고사 성적을 모두 검색하라
SELECT S.MAJOR
      ,SC.RESULT
      FROM STUDENT S
      JOIN SCORE SC
      ON S.MAJOR = '화학'
      AND S.SNO = SC.SNO;

--3) 유기화학과목 수강생의 기말고사 시험점수를 검색하라
SELECT C.*
     , SC.RESULT
    FROM COURSE C
    JOIN SCORE SC
    ON C.CNAME = '유기화학'
    AND C.CNO = SC.CNO;

--4) 화학과 학생이 수강하는 과목을 담당하는 교수의 명단을 검색하라
SELECT  S.MAJOR
      , P.*
    FROM PROFESSOR P
    JOIN COURSE C
    ON C.PNO = P.PNO
    JOIN STUDENT S
    ON S.MAJOR = '화학';

--5) 모든 교수의 명단과 담당 과목을 검색한다
SELECT P.*
    , C.CNAME
    FROM PROFESSOR P
    LEFT OUTER JOIN COURSE C
    ON P.PNO= C.PNO;

--6) 모든 교수의 명단과 담당 과목을 검색한다(단 모든 과목도 같이 검색한다)
SELECT P.*
    ,C.CNAME
    FROM PROFESSOR P
    RIGHT OUTER JOIN COURSE C
    ON C.PNO = P.PNO;



