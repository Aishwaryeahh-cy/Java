CREATE DATABASE college;
USE college;

CREATE TABLE student (
    id INT,
    name VARCHAR(50)
);

INSERT INTO student VALUES
(1, 'Aishwarya'),
(2, 'Rahul'),
(3, 'Priya');

SELECT * FROM student;