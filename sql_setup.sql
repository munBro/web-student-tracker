CREATE USER 'webstudent'@'localhost' IDENTIFIED BY 'webstudent';

GRANT ALL PRIVILEGES ON * . * TO 'webstudent'@'localhost';

create Database `web_student_tracker`;
 
USE `web_student_tracker`;


SELECT * FROM web_student_tracker.Book;

create table Book(
    id INT PRIMARY KEY,
    name VARCHAR(255),
    age INT
);


LOAD DATA INFILE 'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/Book.csv'
INTO TABLE Book
FIELDS TERMINATED BY ','
ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 ROWS; -- Use this if your CSV file has a header row