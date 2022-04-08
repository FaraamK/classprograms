-- problem 1

SELECT CDEPT, CNO, CNAME, CLABFEE, AVG(CLABFEE) 
FROM COURSE 
GROUP BY CDEPT, CNO, CNAME, CLABFEE
ORDER BY CDEPT;

/* code for problem one does present an output in the correct format, but the lab fee average does not print in the wanted way, 
all CLABFEE should be totaled and averaged and should read 110 all the way down, work in progress */

-- problem 2 

SELECT CDEPT, CNO, CNAME, CLABFEE,
        AVG(CLABFEE) OVER
        (PARTITION BY CDEPT
        ORDER BY CDEPT) AS "AVG_LABFEE"
FROM COURSE
ORDER BY CDEPT;
