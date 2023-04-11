--1)student ���̺� ������ �˻��ض�
DESC STUDENT

--2)course ���̺� ������ �˻��ض�
DESC COURSE

--3)professor ���̺� ������ �˻��ض�
DESC PROFESSOR

--4)score ���̺� ������ �˻��ض�
DESC SCORE

--5) ��� �л��� ������ �˻��ض�
SELECT *
    FROM STUDENT;

--7) ��� ������ ������ �˻��ض�
SELECT *
    FROM course;

--8) �⸻��� ���������� �˻��ض�
SELECT RESULT
    FROM SCORE;

--9) �л����� �а��� �г��� �˻��ض�
SELECT MAJOR, SYEAR
    FROM STUDENT;

--10) �� ������ �̸��� ������ �˻��ض�
SELECT CNAME, ST_NUM
    FROM COURSE;

--11) ��� ������ ������ �˻��ض�
SELECT ORDERS
    FROM PROFESSOR;
    
---------------------------------------------------    

    
 --1) �� �л��� ������ �˻��϶�(��Ī�� ���)
SELECT SNO  
    ,AVR AS ����
    FROM STUDENT;

--2) �� ������ �������� �˻��϶�(��Ī�� ���)
SELECT ST_NUM AS ����
    FROM COURSE;

--3) �� ������ ������ �˻��϶�(��Ī�� ���)
SELECT ORDERS AS ����
    FROM PROFESSOR;

--4) �޿��� 10%�λ����� �� ���� ���޵Ǵ� �޿��� �˻��϶�(��Ī�� ���)
SELECT SAL*1.1 AS �λ�ȱ޿�
    FROM EMP;
    
--5) ���� �л��� ��� ������ 4.0�����̴�. �̸� 4.5�������� ȯ���ؼ� �˻��϶�(��Ī�� ���)
SELECT AVR*(4.0/4.5) AS ȯ������
    FROM STUDENT;
   
  -------------------------------------------------------
  
--1) '__�а��� __�л��� ���� ������ __�Դϴ�' ���·� �л��� ������ ����϶�

SELECT MAJOR
      , SNAME
      , AVR
    FROM STUDENT;

--2) '__������ __���� �����Դϴ�.' ���·� ������ ������ ����϶�
SELECT CNAME
    , ST_NUM
    FROM COURSE;

--3) '__������ __�а� �Ҽ��Դϴ�.' ���·� ������ ������ ����϶�
SELECT PNAME
    , SECTION
    FROM PROFESSOR;

--4) �б����� � �а��� �ִ��� �˻��Ѵ�(�л� ���̺� ������� �˻��Ѵ�)
SELECT DISTINCT MAJOR
    FROM STUDENT;

--5) �б����� � �а��� �ִ��� �˻��Ѵ�(���� ���̺� ������� �˻��Ѵ�)
SELECT DISTINCT SECTION
    FROM PROFESSOR;

--6) ������ ������ � �͵��� �ִ��� �˻��Ѵ�
SELECT DISTINCT ORDERS
    FROM PROFESSOR;

------------------------------------------------

--1) ���������� �л��� �̸��� �˻��϶�
SELECT SNAME
    FROM STUDENT
    ORDER BY AVR DESC;

--2) �а��� ���������� �л��� ������ �˻��϶�
SELECT *
    FROM STUDENT
    ORDER BY AVR DESC;

--3) �г⺰ ���������� �л��� ������ �˻��϶�
SELECT *
    FROM STUDENT
    ORDER BY SYEAR, AVR;

--4) �а��� �г⺰�� �л��� ������ ������(������ ���� ��)���� �˻��϶�
SELECT *
    FROM STUDENT
    ORDER BY MAJOR, SYEAR, AVR DESC;

--5) ���������� ���� �̸��� �˻��϶�
SELECT CNAME
    ,ST_NUM
    FROM COURSE
    ORDER BY ST_NUM;

--6) �� �а����� ������ ������ �˻��϶�
SELECT *
    FROM PROFESSOR
    ORDER BY SECTION;

--7) �������� ������ ������ �˻��϶�
SELECT *
    FROM PROFESSOR
    ORDER BY ORDERS;
--8) �� �а����� ������ ������ ��������(������ ��) ������ �˻��϶�
SELECT *
    FROM PROFESSOR
    ORDER BY SECTION, HIREDATE; 
-----------------------------------------------------------

--1) ȭ�а� �л��� �˻��϶�
SELECT*
    FROM STUDENT
    WHERE MAJOR = 'ȭ��';

--2) ������ 2.0 �̸��� �л��� �˻��϶�
SELECT *
    FROM STUDENT
    WHERE AVR < 2.0;

--3) ���� �л��� ������ �˻��϶�
SELECT SNAME
    , AVR
    FROM STUDENT
    WHERE SNAME LIKE '%����%';

--4) ������ ����� �˻��϶�
SELECT PNAME
    FROM PROFESSOR
    WHERE ORDERS = '������';

--5) ȭ�а� �Ҽ� ������ ����� �˻��϶�
SELECT PNAME
    FROM PROFESSOR
    WHERE SECTION = 'ȭ��';

--6) �۰� ������ ������ �˻��϶�
SELECT *
    FROM PROFESSOR
    WHERE PNAME LIKE '%�۰�%';

--7) �г⺰�� ȭ�а� �л��� ������ �˻��϶�
SELECT SNAME
    ,SYEAR
    ,MAJOR
    ,AVR
    FROM STUDENT
    WHERE MAJOR = 'ȭ��'
    ORDER BY SYEAR;

--8) 2000�� ������ ������ ������ ������ �����ϼ����� �˻��϶�




--9) ��� ������ ���� ������ ������ �˻��϶�
SELECT *
    FROM COURSE
    WHERE PNO IS NULL;
    


---------------------------------------------------------------

--1) �������� ������, �Ŀ��� �л��� �˻��϶�
SELECT *
    FROM STUDENT
    WHERE MAJOR = '����'
     OR MAJOR = '����'
     OR MAJOR = '�Ŀ�';
       
--2) ȭ�а��� �ƴ� �л��߿� 1�г� �л��� �˻��϶�
SELECT *
    FROM STUDENT
    WHERE MAJOR != 'ȭ��'
        AND SYEAR = 1;

--3) �����а� 3�г� �л��� �˻��϶�
SELECT *
    FROM STUDENT
    WHERE MAJOR = '����'
        AND SYEAR = 3;

--4) ������ 2.0���� 3.0������ �л��� �˻��϶�
SELECT *
    FROM STUDENT
    WHERE AVR >= 2.0
        AND AVR <= 3.0;

--5) ������ �������� ���� �����߿� ������ 3������ ������ �˻��϶�
SELECT *
    FROM COURSE
    WHERE PNO IS NULL
        AND ST_NUM = 3;

--6) ȭ�а� ���õ� ������ ������ 2���� ������ ������ �˻��϶�
SELECT *
    FROM COURSE
    WHERE CNAME LIKE '%ȭ��%'
        AND ST_NUM <= 2;

--7) ȭ�а� �������� �˻��϶�

SELECT *
    FROM PROFESSOR
    WHERE ORDERS = '������'
        AND SECTION = 'ȭ��';

--8) �����а� �л��߿� ���� �縶���� �л��� �˻��϶�
SELECT *
    FROM STUDENT
    WHERE MAJOR = '����'
        AND SNAME LIKE '�縶%';

--9) ���� �̸��� ���� 1������ ������ �˻��϶�
SELECT *
    FROM PROFESSOR
    WHERE PNAME LIKE '__';





  
   
    