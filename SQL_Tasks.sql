-- Tibil Intern SQL Tasks
CREATE DATABASE IF NOT EXISTS sql_tasks; -- created a database to perform all the tasks

USE sql_tasks;	-- using that database.

-- 2)create the table with name employeeinfo with Emp id ,EmpFName,EmpLName,Dept ,Proj, Address ,DOB ,Gender
-- creating a EmployeeInfo table 
CREATE TABLE employee_info(
emp_id int,
emp_f_name varchar(20) NOT NULL, -- first name as not null 
emp_l_name varchar(20),
dept varchar(20) ,
proj varchar(20),
adress varchar(20),
dob date NOT NULL,	-- dob as not null
gender varchar(7) NOT NULL,	-- gender will be not null
PRIMARY KEY(emp_id)	-- setting emp_id as a primary key
);

-- fetch all the records from employee_info
SELECT * FROM employee_info;

-- insert data into the employee_info table
INSERT INTO employee_info VALUES
(1,"John","Smith","HR","Project-A","123 MainSt","1990-05-15", "Male"),
(2,"Jane","Doe","Engineering","Project-B","456 Elm St","1988-09-20","Female"),
(3,"Mike","Johnson","Sales","Project-C","789 Oak St","1995-02-10","Male"),
(4,"Emily","Brown","Operations","Project-D","101 Pine St","1993-11-30","Female"),
(5,"Alex","Wang","IT","Project-A","202 Cedar St","1987-07-25","Male"),
(6,"Sarah","Lee","Finance","Project-B","303 Maple St","1991-04-18","Female"),
(7,"David","Chen","Marketing","Project-C","404 Walnut St","1989-12-05","Male"),
(8,"Emma","Taylor","HR","Project-D","505 Birch St","1994-08-08","Female"),
(9,"Chris","Clark","Engineering","Project-A","606 Cherry St","1992-03-22","Male"),
(10,"Lisa","Adams","Sales","Project-B","707 Pineapple St","1985-06-12","Female"),
(11,"Michael","Martinez","IT","Project-C","808 Orange St","1986-09-03","Male"),
(12,"Amanda","White","Finance","Project-D","909 Lemon St","1990-12-25","Female"),
(13,"Jason","Rodriguez","Marketing","Project-A","1010 Grape St","1987-03-17","Male"),
(14,"Jennifer","Garcia","HR","Project-B","1111 Banana St","1993-07-08","Female"),
(15,"Daniel","Martinez","Engineering","Project-C","1212 Papaya St","1989-10-11","Male"),
(16,"Kimberly","Johnson","Sales","Project-D","1313 Kiwi St","1994-04-30","Female");

-- 3)create the table with name employeepostion with EmpID ,EmpPosition, DateOfJoining ,Salary
-- creating the table employee_position with EmpID, EmpPosition, DataOfJoining, Salary
CREATE TABLE employee_position(
emp_id INT,
emp_position VARCHAR(20),
date_of_joining DATE,
salary INT,
PRIMARY KEY(emp_id));


-- inserting data into the employee_position table
INSERT INTO employee_position VALUES
(1, 'Manager', '2022-01-10', 60000),
(2, 'Engineer', '2022-02-15', 55000),
(3, 'Sales Associate', '2022-03-20', 50000),
(4, 'HR Specialist', '2022-04-25', 52000),
(5, 'Analyst', '2022-05-30', 48000),
(6, 'Marketing Coordinator', '2022-06-05', 49000),
(7, 'Accountant', '2022-07-10', 53000),
(8, 'Software Developer', '2022-08-15', 58000),
(9, 'Project Manager', '2022-09-20', 62000),
(10, 'Customer Service Representative', '2022-10-25', 45000);

-- fetching the data from employee_position
SELECT * FROM employee_position;

-- altering the emp_position column
ALTER TABLE employee_position MODIFY COLUMN emp_position varchar(50);

-- 4) query to fetch the EmpFname from the EmployeeInfo table in the upper case and use the ALIAS name as EmpName.
SELECT upper(emp_f_name) AS EmpName from employee_info;

-- 5)query to get the current date.
SELECT current_date() AS "CURRENT-DATE";

-- 6)query to retrieve the first four characters of EmpLname from the EmployeeInfo table.
SELECT substr(emp_l_name,1,4) AS EmpLName from employee_info;

-- 7)query to create a new table that consists of data and structure copied from the other table.
CREATE TABLE employee_info_copy AS SELECT * FROM employee_info;

select * from employee_info_copy; -- fetching the data from employee_info_copy

-- 8)query to find all the employees whose salary is between 50000 to 100000.
SELECT emp_position AS 'Employee',salary AS 'EmpSalary' from employee_position WHERE salary between 50000 AND 100000;


-- 9)query to find the names of employees that begin with ‘S’
SELECT concat(emp_f_name, " ", emp_l_name) AS 'EmployeeName' FROM employee_info WHERE emp_f_name like 'S%';

-- 10)query to fetch top N records.
SELECT * FROM employee_info limit 5; -- it fetches top n=5 records

-- 11)query to retrieve the EmpFname and EmpLname in a single column as “FullName”. The first
SELECT concat(emp_f_name, " ", emp_l_name) AS 'FullName' FROM employee_info;

-- 14)Create two tables 
-- 1) Student  
-- 2) Subject
-- The student table consists of Student_ID, Stu_Name, Stu_Subject_ID, Stu_Marks, and Stu_Age columns
--  Subject table consists of Subject_ID and Subject_Name columns.

-- 22)query to create the table in Structured Query Language.
CREATE TABLE student(
student_id int PRIMARY KEY,
 stu_name varchar(20) NOT NULL,
 stu_subject_id int NOT NULL,
 stu_marks int NOT NULL,
 stu_age int NOT NULL);
 
 CREATE TABLE subject(
 subject_id int PRIMARY KEY,
 subject_name varchar(20) NOT NULL);



SELECT * FROM student;
SELECT * FROM subject;

 -- 23)Write a query to insert the data into the table.
INSERT INTO student values
(1, 'Alice', 101, 85, 20),
(2, 'Bob', 102, 78, 22),
(3, 'Charlie', 101, 90, 21),
(4, 'David', 103, 92, 19),
(5, 'Eve', 102, 80, 20),
(6, 'Fiona', 103, 88, 20),
(7, 'George', 101, 79, 21),
(8, 'Hannah', 102, 95, 23),
(9, 'Isaac', 103, 82, 19),
(10, 'Jesmine', 101, 87, 22);


INSERT INTO subject VALUES
(101, 'Mathematics'),
(102, 'Science'),
(103, 'History');

-- 24)query to view the specific record of the table by using the WHERE clause.
SELECT * FROM student WHERE stu_subject_id = 101;

-- 25)query in SQL to find the minimum and maximum number from the integer column:
SELECT MAX(stu_marks) AS MAXIMUM_Marks, MIN(stu_marks) AS MINIMUM_Marks FROM student;

-- 26)query to access the first record from the SQL table?
SELECT * FROM student limit 1;

-- 27)query to access the first N th rows from the table?
select * from(SELECT *,row_number() over(order by student_id) as rn from student)as subquery where rn=1;
select * from student order by student_id asc limit 1;

-- 28)query to access the last N th rows from the SQL table?
select * from student  order by student_id desc limit 1;

-- 29)query in SQL to retrieve only even rows from the table?
select * from(SELECT *,row_number() over(order by student_id) as rn from student)as subquery where rn%2=0;

-- 30)query in SQL to retrieve only an odd number of rows from the table?
select * from(SELECT *,row_number() over(order by student_id) as rn from student)as subquery where !(rn%2=0);

 -- 31)Query to find the Nth highest value of an integer column from the table.
select max(stu_marks) as Maximum_Marks from student;

-- 32)query in SQL to find the second-highest value of an integer column from the table?
select max(stu_marks) from student where stu_marks<(select max(stu_marks) from student);
select * from(select distinct *,row_number() over(order by stu_marks desc) as rn from student)as subquery where rn=2;

-- 33)query in SQL to show the record of the three highest values of an integer column from the table.
select distinct * from student order by stu_marks desc limit 3;

-- 34)query to fetch the Stu_Name and Stu_Marks of those students whose age is 20.
select stu_name as Student_Name, stu_marks as Student_Marks from student where stu_age=20;

-- 35)query to show the maximum marks of each subject.
select max(stu_marks) as MaximumMarks,stu_subject_id as SubjectID from student group by stu_subject_id;

-- 36)query to show all the record of those students whose Marks is greater than 82 and age is 22.
select * from student where ((stu_marks>82) AND (stu_age=22));

-- 37)query to show all Subject_ID along with the number of students in there.
select stu_subject_id as Student_ID,count(stu_subject_id) as Total_Students from student group by stu_subject_id;

-- 38)query in structured query language to view all student details from the Student table order by Stu_Name Descending.
select * from student order by stu_name desc;

-- Joins
-- create a 4 tables with the name of author ,book,adapation and book_review
--
-- author table consist of id,name ,birth_year and death_year
-- book table consisit of id,author_id,title,publish_year and publishing_house, rating
-- adapation table consist of book_id,type,title, release_year,rating
-- book_review table consist of book_id,review,author

create table if not exists author(
id int primary key,
name varchar(50) not null,
birth_year date not null,
death_year date);

create table if not exists book(
id int primary key,
author_id int not null,
title varchar(50) not null,
publish_year date not null,
publishing_house varchar(50),
rating int check(rating>=1 and rating<=5) not null default 1,
foreign key(author_id) references author(id));

create table if not exists adaption(
book_id int primary key,
type varchar(50),
title varchar(50) not null,
release_year date not null,
rating int check(rating>=1 and rating<=5) not null default 1);

create table if not exists book_review(
book_id int primary key,
review varchar(100),
author varchar(50) not null);


-- Sample data for the author table
INSERT INTO author (id, name, birth_year, death_year) VALUES
(1, 'Jane Austen', '1775-12-16', '1817-07-18'),
(2, 'Charles Dickens', '1812-02-07', '1870-06-09'),
(3, 'Agatha Christie', '1890-09-15', '1976-01-12'),
(4, 'George Orwell', '1903-06-25', '1950-01-21'),
(5, 'J.K. Rowling', '1965-07-31', NULL);

-- Sample data for the book table with random author IDs
INSERT INTO book (id, author_id, title, publish_year, publishing_house, rating) VALUES
(1, 3, 'Pride and Prejudice', '1813-01-28', 'T. Egerton, Whitehall', 4),
(2, 2, 'Great Expectations', '1861-12-19', 'Chapman & Hall', 3),
(3, 4, 'Murder on the Orient Express', '1934-01-01', 'Collins Crime Club', 5),
(4, 5, '1984', '1949-06-08', 'Secker & Warburg', 5),
(5, 1, 'Harry Potter and the Philosopher''s Stone', '1997-06-26', 'Bloomsbury', 5),
(6, 3, 'War and Peace', '1869-01-01', 'The Russian Messenger', 4),
(7, 2, 'Adventures of Huckleberry Finn', '1884-12-10', 'Chatto & Windus', 3),
(8, 1, 'Sense and Sensibility', '1811-10-30', 'Thomas Egerton', 3),
(9, 4, 'A Tale of Two Cities', '1859-11-26', 'Chapman & Hall', 5),
(10, 5, 'The Murder of Roger Ackroyd', '1926-06-19', 'Collins Crime Club', 3);

-- Sample data for the book_review table
INSERT INTO book_review (book_id, review, author) VALUES
(1, 'An enduring classic.', 'John Smith'),
(2, 'A masterpiece of character development.', 'Emily Johnson'),
(3, 'A gripping mystery with a surprising twist.', 'Michael Brown'),
(4, 'A chilling portrayal of a dystopian society.', 'Alice Green'),
(5, 'Captivating from start to finish.', 'David Wilson'),
(6, 'An epic tale of love and war.', 'Sarah Taylor');

-- Sample data for the adaption table with random types
INSERT INTO adaption (book_id, type, title, release_year, rating) VALUES
(1, 'Film', 'Pride and Prejudice (2005)', '2005-11-11', 4),
(2, 'TV Series', 'Great Expectations (2012)', '2012-10-11', 3),
(3, 'Film', 'Murder on the Orient Express (2017)', '2017-11-03', 4),
(4, 'Film', '1984 (1984)', '1984-12-14', 4),
(5, 'TV Series', 'Harry Potter and the Philosopher''s Stone (2001)', '2001-11-16', 5);

-- Sample data for the adaption table with random types
INSERT INTO adaption (book_id, type, title, release_year, rating) VALUES
(6, 'Film', 'War and Peace (1956)', '1956-08-21', 3),
(7, 'Film', 'The Adventures of Huck Finn (1993)', '1993-04-02', 3),
(8, 'TV Series', 'Sense and Sensibility (1981)', '1981-01-01', 4),
(9, 'Film', 'A Tale of Two Cities (1935)', '1935-12-25', 4),
(10, 'TV Series', 'The Murder of Roger Ackroyd (2000)', '2000-06-18', 3);


-- 46)List All Books and Their Authors
select book.title as Books,author.name as Authors from book left join author on book.author_id=author.id;

-- 47)List Authors and Books Published After 2005
select author.name as Author, book.title as Title
from author
inner join book on author.id = book.author_id
where book.publish_year > '1900-01-01';

-- 48)Show Books Adapted Within 4 Years and Rated Lower Than the Adaptation
select book.title as Books
from book
inner join adaption
on book.id = adaption.book_id
where subdate(book.publish_year, interval 4 year ) and book.publish_year
AND  book.rating < adaption.rating;

-- 49)Show All Books and Their Adaptations (If Any)
select book.title as Books, adaption.type as Adaptions
from book inner join adaption
on book.id=adaption.book_id;

-- 50)Show All Books and Their Movie Adaptations
select book.title as Books, adaption.title Title
from book inner join adaption
on book.id = adaption.book_id where adaption.type='Film';

-- 51)Show All Books with Their Reviews (If Any)
select b.title as Books, br.review as Reviews
from book b inner join book_review br
on b.id = br.book_id;

-- 52)List All the Books and All the Authors
select book.title as Books,author.name
from book left join author 
on book.author_id =  author.id
union 
select book.title as Books,author.name
from book right join author 
on book.author_id =  author.id;

INSERT INTO author (id, name, birth_year, death_year) VALUES
(6, 'Mark kevin', '1998-09-01', '2024-01-11'),
(7, 'James henry', '1990-02-07', '2022-05-01');


-- create a tables with the name of department ,product , nutrition_data, producer, sales_history
--
-- department table consist of id and name .
-- product table consist of id,name, department_id ,shelf_id,producer_id,price
-- nutrition_data consist of product_id,calories,fat, carbohydrate, protein
-- producer consist of id and name
-- sales_history consist of date, product_id , amount

create table if not exists department(
id int primary key,
name varchar(50) not null);

create table if not exists product(
id int ,
name varchar(30),
department_id int,
shelf_id int,
producer_id int ,
price int,
foreign key(department_id) references department(id),
foreign key(producer_id) references producer(id));

create table if not exists nutrition_data(
product_id int primary key,
calories int,
fat int, 
carbohydrate int, 
protein int);

create table if not exists producer(
id int,
name varchar(30));

create table if not exists sales_history(
date DATE,
product_id int ,
amount int);

-- Inserting departments
INSERT INTO department (id, name) VALUES
(1, 'Food'),
(2, 'Electronics'),
(3, 'Clothing');

-- Inserting producers
INSERT INTO producer (id, name) VALUES
(1, 'Good Eats Inc.'),
(2, 'Techtronics Ltd.'),
(3, 'Fashionista Co.');

-- Inserting products
INSERT INTO product (id, name, department_id, shelf_id, producer_id, price) VALUES
(101, 'Bread', 1, 101, 1, 2),
(102, 'TV', 2, 201, 2, 500),
(103, 'Jeans', 3, 301, 3, 40);

-- Inserting nutrition data
INSERT INTO nutrition_data (product_id, calories, fat, carbohydrate, protein) VALUES
(101, 120, 2, 20, 5),
(101, 130, 3,25,5);


-- Inserting sales history
INSERT INTO sales_history (date, product_id, amount) VALUES
('2024-04-01', 101, 50),
('2024-04-01', 102, 10),
('2024-04-02', 101, 60),
('2024-04-02', 103, 20);

-- 60) Show Products Under 150 Calories and Their Department
select  department.name,product.name
from product inner join department inner join nutrition_data
on product.department_id = department.id 
and product.id = nutrition_data.product_id where nutrition_data.calories<150;

-- 61)List All Products with Their Producers, Departments, and Carbs
select
    p.name as Product,
    pr.name as Producer,
    d.name as Department,
    nd.carbohydrate
from
    product p
left join
    producer pr on p.producer_id = pr.id
left join 
    department d on p.department_id = d.id
left join 
    nutrition_data nd on p.id = nd.product_id;


-- 62)Show All the Products, Prices, Producers, and Departments
select p.name as Product,
p.price as Price,
pr.name as Producer,
d.name as Department
from product p
left join producer pr on p.producer_id = pr.id
left join 
department d on p.department_id = d.id;

-- 63)List All Workers and Their Direct Supervisors