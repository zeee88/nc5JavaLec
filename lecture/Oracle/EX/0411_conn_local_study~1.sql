--1. ���̺� ���� Ȯ�� ���(DESC)
DESC STUDENT;

--2. �����͸� ��ȸ�ϴ� �⺻ Select����
SELECT SNO
    ,SNAME
    FROM STUDENT;
    
-- * ���̺��� ��� �÷��� ��ȸ
SELECT *
    FROM STUDENT;
    
--3. ��ȸ�ϴ� �÷��� ���̺� ��Ī ���̱�
--3-1. �÷��� ��Ī ���̱�(���� ����� ��Ī�� ���δ�.)
SELECT SNO AS �л���ȣ
        , SNAME AS �л��̸�
        FROM STUDENT;
        
--3-2. ���̺� ��Ī ���̱�
--���̺� ���� ��Ī�� �ش� ����(SQL)�ȿ��� ���̺��� ��Ī���� ����ϰڴٴ� ���̴�.
--�� �� �̻� ���̺��� ����ؼ� ��ȸ�� �� �ߺ��� �÷��� �����ϸ�
--� ���̺��� �÷��� ��ȸ�� �� �����ؾ� �ϴµ� �׷� �� �ַ� ���̺� ��Ī�� �ٿ���
--�ָ��� �÷��� ��ȸ�� ���̺��� ������ �� �ִ�.

SELECT ST.SNO
        , ST.SNAME
        , ST.SYEAR
    FROM STUDENT ST
    WHERE ST.SNAME LIKE '%��%';
    
--4. NULL�� ó�����ִ� NVL
--4-1. NVL�� ������� �ʾ��� ���
SELECT ENO
    , ENAME
    , SAL
    , COMM
    FROM EMP;
    
--4-2. NVL���
--�ڹٿ� �������� �� NULL���� �ڹٷ� �״�� �Ѿ��
--NullPointerException�� �߻��� Ȯ���� �������� ������
--NULL���� ���� Ȯ���� �ִ� �÷������� �׻� NVLó���� ���ش�.
SELECT ENO
    , ENAME
    , SAL
    , NVL(COMM, 0)
    FROM EMP;

--5. ���Ῥ����(||)
--5-1. ����̸� �޿� �����ؼ� ���(EMP)
SELECT ENO
    , ENAME || '-' || SAL
    FROM EMP;
--5-1. �л���ȣ�� - �⸻��� ����(SCORE)
SELECT SNO || '-' || RESULT
    FROM SCORE;

--5-2. �л���ȣ : �л��̸� �����ؼ� ���(STUDENT)
SELECT SNO || ' : ' || SNAME AS �й��̸�   --��Ī �����
    FROM STUDENT;

--6. �ߺ����ų� DISTINCT
SELECT JOB
    FROM EMP;

--6-1. �÷� �ϳ��� ���� �ߺ� ����
SELECT DISTINCT JOB
    FROM EMP;
    
--6-2. �÷� �� �� �̻� ���� �ߺ� ����
--���� �÷��� DISTINCT�� �ٿ��ִ� ���� �ƴϰ�
--�ΰ��� �÷��� �� ���� ������ ���� �Ǿ 
--�� ���� �÷��� �����Ͱ� ��� �ߺ����� ������ 
--�ߺ����� �ν����� �ʴ´�.
SELECT DISTINCT JOB
        , MGR
        FROM EMP;
        
--7. �����͸� �������ִ� ORDER BY
--7-1. �� ���� �÷��� ���� ����

--������������ ����. ASC���� ����. 
SELECT *
    FROM STUDENT
    ORDER BY SYEAR ASC;

--������������ ����. DESC.
SELECT *
    FROM STUDENT
    ORDER BY SYEAR DESC;
    
--7-2. �� ���� �÷��� �������� ����
--������������ ����
--�ĸ��� ����ؼ� ���� ���ĵ� ��� �÷��� ����
--���� ������ �÷����� ������ �����ϰ�
--���� ���� �÷��� ���� ������ �����Ѵ�.
SELECT *
    FROM STUDENT
    ORDER BY SYEAR, SNAME ASC;

--�� �÷����� ���� ����� ���� ������ �� �ִ�.
SELECT *
    FROM STUDENT
    ORDER BY SYEAR DESC, MAJOR, AVR ASC;    
    
--�μ���(DNO)�� �����ϴµ� �޿�(SAL)�� ���� ��� ���� ��������(EMP)
--ENO, ENAME, DNO, SAL
SELECT ENO
    , ENAME
    , DNO
    , SAL
    FROM EMP
    ORDER BY DNO, SAL DESC;
    
--��Ī�� ���� ��쿡�� ��Ī���� ���ĵ� ����
SELECT ENO
    , ENAME
    , DNO AS �μ���ȣ
    , SAL AS �޿�
    FROM EMP
    ORDER BY �μ���ȣ, �޿� DESC;
    
--8. ������ �ɾ��ִ� WHERE
--8-1. ���� ũ�� ��
--�޿��� 3000�̻��� ���� ��� ��ȸ
SELECT *
    FROM EMP
    WHERE SAL >= 3000;
    
--������ ȭ�а��� �л��� ���
SELECT *
    FROM STUDENT
    WHERE MAJOR = 'ȭ��';

--�������� ����� ���� �÷��� Ÿ������ ���� ���� �����Ѵ�.
--���� �÷��� Ÿ�԰� �ٸ� Ÿ������ ���� ���
--�÷��� ��� �����Ͱ� ���� Ÿ������ ����� ���� �񱳸� �ϰ� �ȴ�.
--�����Ͱ� ������ ��� ��� �����Ϳ��� �� �� �� ����ȯ�� �Ͼ�� ������
--���� �ӵ��� �ſ� ���ϵȴ�.
--���������� ���� �� �÷��� Ÿ���� ��ȯ�ϴ� ���� �־�� �ȵȴ�.
--���� ���� �÷��� Ÿ�԰� ����� �Ѵ�.

--DNO�� null�� ���� ��� ��ȸ
SELECT *
    FROM EMP
    WHERE COMM IS NULL;

--9. ���� ���� ����� AND, OR
--9-1. ��� ������ �����ϴ� �����͸� ��ȸ
--�г��� 1�г��̸鼭 �̸��� '��'�� ������ �л� ��� ��ȸ
SELECT *
    FROM STUDENT
    WHERE SYEAR = 1
      AND SNAME LIKE '%��';
      
--ȸ������� �ϸ鼭 �޿��� 3000�̻��̰� �̸��� ������ ���� ��� ��ȸ
SELECT *
    FROM EMP
    WHERE JOB = 'ȸ��'
     AND SAL >= 3000
     AND ENAME LIKE  '___';
     
     
--�⸻��� ������ 75�� �̻��̰ų� �����ȣ�� 1211�� �л� ��� ��ȸ
SELECT *
    FROM SCORE
    WHERE RESULT >= 75
       OR CNO = '1211';

--AND, OR ȥ�� ���
--DNO�� 10�̰ų� �޿��� 1600�̻��� ���� �� ���ʽ��� 600�̻��� ����
--()�� �̿��ؼ� �켱���� ����

SELECT * 
    FROM EMP
    WHERE (DNO = '30'
       OR SAL >= 2000)
      AND COMM >= 600;
      
--������ 2.0 �̻��̰ų� �̸��� 3���� �л� �� ���� ������ �л� ��� ���
SELECT *
    FROM STUDENT
    WHERE (AVR >= 2.0
       OR SNAME LIKE '___')
      AND MAJOR = '����';

    
    
    
    
    
    
    
    

    