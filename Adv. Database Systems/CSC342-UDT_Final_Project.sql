/* work for CSC 342 Final Project will be stored here, currently, none has been done, 
will update with time stamps and proper documentation for ease of understanding, 
once each part has been done, I will label each as 'Part 1' 'Part 2' and 'Final' */ 

-- part one work 

CREATE OR REPLACE TYPE POINTS AS OBJECT 
(LABEL  VARCHAR2(1),
X       NUMBER(2),
Y       NUMBER(2));


-- DESCRIBE POINTS;

CREATE TABLE POINTS_TABLE
(LABEL  POINTS,
X       POINTS,
Y       POINTS);

-- DESCRIBE POINTS_TABLE;
