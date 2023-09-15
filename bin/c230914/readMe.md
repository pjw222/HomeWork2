## 오늘수업 쿼리문


```sql

--alter table student drop constraint fk_hobby_to_student;
drop table student2_hobby2;
drop table hobby2;
drop table student2;



create table student2(
id number (10, 0) generated as identity CONSTRAINT pk_student2_id PRIMARY KEY,
name varchar2(10) NOT NULL UNIQUE,
student_id varchar2(10) NOT NULL,
student_pw varchar2(20) NOT NULL,
age number (10, 0) DEFAULT 0,
git_address varchar2(200)
--hobby2_id number(10, 0) 
);
insert into student2 (name, student_id, student_pw, age, git_address) values('김동선','KDS','qwer',29,'https://github.com/KDS01');
insert into student2 (name, student_id, student_pw, age, git_address) values('이민규','qq752','1234',23,'https://github.com/LEEMINGYU28/Java4.git');
insert into student2 (name, student_id, student_pw, age, git_address) values('권원준', 'oooonx', 'may', 22,'https://github.com/KWWWJ/just1.git');
insert into student2 (name, student_id, student_pw, age, git_address) values('박정완', 'pjw', 'qwer', 27, 'https://github.com/pjw222');
insert into student2 (name, student_id, student_pw, age, git_address) values('한상윤','hsy','qwer1234',37,'https://github.com/Natseol');
insert into student2 (name, student_id, student_pw, age, git_address) values('임현규','TLM','486',27,'https://github.com/mabiTLM/Java4');
insert into student2 (name, student_id, student_pw, age, git_address) values('김남균','knk','1234',27,'https://github.com/LiamKim-0218/HomeWork2');
insert into student2 (name, student_id, student_pw, age, git_address) values('임주한','LJH','3232',32,'https://github.com/Juhan008/java-D');

create table hobby2(
id number(10, 0) generated as identity CONSTRAINT pk_hobby2_id PRIMARY KEY,
name varchar2(16),
explain varchar2(200),
create_at timestamp default sysdate,
average_time number(20, 0),
place varchar2(100),
student2_id number(10, 0),
constraint fk_student2_to_hobby2 foreign key (student2_id) references student2 (id)
); 

insert into hobby2 (name, explain, average_time, place, student2_id) values('헬스','유산소 운동',7200000,'천호',3);
insert into hobby2 (name, explain, average_time, place, student2_id) values('독서','책읽기',3600000,'실내',6);
insert into hobby2 (name, explain, average_time, place, student2_id) values('달리기','운동',3600000,'야외',1);
insert into hobby2 (name, explain, average_time, place, student2_id) values('영화보기','ott는사랑',7200000,'아무데나',2);
insert into hobby2 (name, explain, average_time, place, student2_id) values('숨쉬기','생산적인활동',3600000,'아무데나',5);

--alter table student2 add constraint fk_hobby2_to_student2 foreign key (hobby2_id) references hobby2 (id);   
create table student2_hobby2(
    student2_id number(10, 0),
    hobby2_id number(10, 0),
    constraint fk_student2_id foreign key (student2_id) references student2 (id),
    constraint fk_hobby2_id foreign key (hobby2_id) references hobby2 (id)
);

insert into student2_hobby2 values(1, 2);
insert into student2_hobby2 values(1, 1);
insert into student2_hobby2 values(1, 5);
insert into student2_hobby2 values(2, 1);
insert into student2_hobby2 values(3, 2);
insert into student2_hobby2 values(4, 4);



--select student2.name AS "학생", student2.age AS "나이" , hobby2.name AS "취미"
--from student2 cross join hobby2 -- on student2.id = hobby2.student2_id;

select student2.name as "학생",hobby2.name as "취미" from student2_hobby2
join student2 on student2.id = student2_hobby2.student2_id
join hobby2 on hobby2.id = student2_hobby2.hobby2_id;

-- 패키지.클래스 (객체.키) 
-- DB(User).테이블.컬럼

select *from student2 where  id <= 3 and name like '김%';
select count(*) from student2 where name like '김%';
```

## tib md파일만 잘다뤄도 블로그대신 gitHub가 블로그의 역활을 한다
