create table administrator(admin_id number(10) PRIMARY KEY ,admin_name varchar2(20) not null,admin_password varchar2(20) not null)

CREATE SEQUENCE admin_id
  START WITH 1
  INCREMENT BY 1
  CACHE 10;


insert into administrator values(admin_id.nextval,'prasanna','prasanna');


create table feedback(feedback_id number(10) primary key,
coustomer_name varchar2(20) not null,main_id varchar2(30) not null,comments varchar2(100) not null);

CREATE SEQUENCE feedback_id
  START WITH 1
  INCREMENT BY 1
  CACHE 10;


create table service(service_id number primary key  ,sr_from varchar(50) not null,sr_to varchar(50) not null,
bustype varchar(30) not null,fare number not null,distance number not null,
capacity number(2) not null,departure_time varchar(10) not null,
journey_time varchar(30) not null,service_no varchar(30) not null UNIQUE);


CREATE SEQUENCE service_id
  START WITH 100
  INCREMENT BY 1
  CACHE 10;
