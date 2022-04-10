-- problem 1

SELECT CDEPT, CNO, CNAME, CLABFEE, AVG(CLABFEE)
FROM COURSE 
GROUP BY CDEPT, CNO, CNAME, CLABFEE
ORDER BY CDEPT;

-- problem 2 

SELECT CDEPT, CNO, CNAME, CLABFEE,
        AVG(CLABFEE) OVER
        (PARTITION BY CDEPT
        ORDER BY CDEPT) AS "AVG_LABFEE"
FROM COURSE
ORDER BY CDEPT;

-- problem 3

SELECT FNAME, FDEPT, FSALARY,
    SUM(FSALARY) OVER 
    (PARTITION BY FDEPT
    ORDER BY FSALARY DESC) AS "DEPT_TOTAL"
FROM FACULTY
ORDER BY FDEPT;

/* work in progress */