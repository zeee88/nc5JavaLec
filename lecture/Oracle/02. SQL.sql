
--1. 사용자 권한 삭제
REVOKE DBA FROM C##STUDY;

GRANT DBA TO C##STUDY;

--2. 사용자 및 권한 확인
SELECT * FROM DBA_ROLE_PRIVS
WHERE GRANTEE = 'study';

--3. 사용자 생성
CREATE USER c##zeehae IDENTIFIED BY "0808"
DEFAULT TABLESPACE users;

--4. create session : db접속 시 해당 사용자가 db에 대한 접속세션을 만들 수 있는 권한
--CONNECT권한을 줘서 DB 접속 세션을 만들 수 있도록
GRANT CONNECT TO C##ZEEHAE;


--5. 사용자 권한 확인
SELECT * FROM dba_role_privs
WHERE GRANTEE = 'C##ZEEHAE';

--6. CONNECT가 어떠한 권한을 가지고 있는지 확인
SELECT * FROM ROLE_SYS_PRIVS
WHERE ROLE = 'DBA';

--7. 사용자 삭제 명령어
DROP USER C##ZEEHAE;

