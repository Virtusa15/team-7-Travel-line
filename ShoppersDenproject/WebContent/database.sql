create table product (pid varchar2(50),ptype varchar2(20),cost number(10),img blob);
create table admin(ADID varchar2(20),APSW varchar2(20));
create table customer( NAME  VARCHAR2(30),EMAIL VARCHAR2(40), MOBILE NUMBER(12), ADDR  VARCHAR2(60), USERID VARCHAR2(20) primary key, PASSWORD VARCHAR2(30));