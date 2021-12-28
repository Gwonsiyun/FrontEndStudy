SELECT * FROM test;

--회원번호가 3번인 사람의 이름을 출력하라.
SELECT name FROM test WHERE midx = 3;

--지역이 전주인 사람의 회원번호를 출력하시오
SELECT * FROM test WHERE addr = '전주';
SELECT * FROM test WHERE addr = '서울';
SELECT * FROM test WHERE age = 21;
SELECT * FROM test WHERE gender = 'M';

--and 조건을 사용해서 데이터를 출력
--서울에 살고 남성인 사람의 이름을 출력하시오
SELECT NAME FROM test WHERE addr = '서울' AND GENDER ='M';

INSERT INTO TEST(midx,name,age,addr,gender,writeday) VALUES(4,'홍길남',25,'광주','M','2021-12-27');

--SELECT * FROM test;

--회원번호가 1번 3번인 사람의 사는 지역을 출력하시오
--or사용
select midx,addr from test where midx=1 or midx=3;

INSERT INTO TEST(midx,name,age,addr,gender,writeday) VALUES(5,'홍연화',22,'광주','F','2021-12-27');
INSERT INTO TEST(midx,name,age,addr,gender,writeday) VALUES(6,'홍이서',24,'서울','F','2021-12-27');
INSERT INTO TEST(midx,name,age,addr,gender,writeday) VALUES(7,'홍한서',25,'전주','M','2021-12-27');
INSERT INTO TEST(midx,name,age,addr,gender,writeday) VALUES(8,'강이자',28,'대전','M','2021-12-27');
INSERT INTO TEST(midx,name,age,addr,gender,writeday) VALUES(9,'권이서',25,'서울','F','2021-12-27');
INSERT INTO TEST(midx,name,age,addr,gender,writeday) VALUES(10,'한이',30,'서울','M','2021-12-27');

rollback;

commit;

select * from test;

--회원정보중 나이가 20대인 사람들의 명단을 출력하시오
select * from test where age=20 or age=21 or age=22 or age=23 or age=24 or age=25 or age=26 or age=27 or age=28 or age=29;
select * from test where age in(20,21,22,23,24,25,26,27,28,29);
select * from test where substr(age,1,1)='2';
select * from test where substr(age,-1,1)='2';

--회원정보를 나이순으로 정렬하여 출력하시오
select * from test order by age asc;
--회원정보를 나이순을 내림차순으로 정렬하여 출력하시오
select * from test order by age desc;

--회원정보를 이름순 그리고 나이순대로 정렬하시오
select * from test order by name asc, age;

--회원정보에서 남성이면서 서울에 거주하고있는 사람들을 나이순으로 정렬하시오
select * from test where addr='서울' order by age;

--범위조건 <, >
--회원정보에서 나이가 23살부터 35까지의 사람들의 이름을 출력하시오
select name,age from test where age >= 20 and age < 35;
select * from test where age between 23 and 35 order by name asc;


--회원들의 나이의 합을 구해서 출력하시오
--집계함수
--합을구한다
select SUM(age) as 나이합 from test;
--평균을구한다
select AVG(age) from test;
--최대값을구한다
select MAX(age) from test;
--최소값을구한다
select MIN(age) from test;
-- 행의수를 구한다.
select COUNT(age) as 수량 from test;


delete from test;

 select * from test;

rollback;
commit;


INSERT INTO TEST(midx,name,age,addr,gender,writeday) VALUES(1,'권도화',24,'광주','F','2021-12-27');
INSERT INTO TEST(midx,name,age,addr,gender,writeday) VALUES(2,'한이지',25,'서울','F','2021-12-27');
INSERT INTO TEST(midx,name,age,addr,gender,writeday) VALUES(3,'장이서',27,'전주','M','2021-12-27');
INSERT INTO TEST(midx,name,age,addr,gender,writeday) VALUES(4,'제이콥',29,'대전','M','2021-12-27');
INSERT INTO TEST(midx,name,age,addr,gender,writeday) VALUES(5,'홍연화',22,'광주','F','2021-12-27');
INSERT INTO TEST(midx,name,age,addr,gender,writeday) VALUES(6,'홍이서',24,'서울','F','2021-12-27');
INSERT INTO TEST(midx,name,age,addr,gender,writeday) VALUES(7,'홍한서',32,'전주','M','2021-12-27');
INSERT INTO TEST(midx,name,age,addr,gender,writeday) VALUES(8,'강이자',28,'대전','M','2021-12-27');
INSERT INTO TEST(midx,name,age,addr,gender,writeday) VALUES(9,'권이서',25,'서울','F','2021-12-27');
INSERT INTO TEST(midx,name,age,addr,gender,writeday) VALUES(10,'한이',30,'북한','M','2021-12-27');

select * from test;

commit;

--group by
select * from test;

--회원정보중 지역별로 사는지역을 나열하시오
select addr,name from test group by addr,name order by addr;
select addr,count(name) as 인원 from test group by addr order by addr;

--회원정보중 지역별로 사는 사람들의 나이의 합을 구하시오
select addr,sum(age) as 나이합 from test group by addr;
