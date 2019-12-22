# user-manager
This service has created for online shoping details
Service(functionality)

-Register user
-Login User
-LogOut user
-Update Profile 


Datablse Design
CREATE TABLE registration
(
  ID           NUMBER(10)    NOT NULL,
  password varchar2(10) NOT NULL,
  email varchar2(50),
  first_name varchar2(10),
  last_name varchar2(50),
  mobile_nmber varchar2(10)
);

ALTER TABLE registration ADD (
  CONSTRAINT dept_pk PRIMARY KEY (ID));

CREATE SEQUENCE dept_seq START WITH 1;

insert into registration (id,password,email,first_name,last_name,mobile_nmber) values(dept_seq.nextval,'dilip','dilip@gmail.com','dilip','mehta','89898');


Oracle Driver 
> mvn install:install-file -Dfile=ATT\ojdbc8.jar -DgroupId=com.oracle -DartifactId=ojdbc8 -Dversion=19.3 -Dpackaging=jar
