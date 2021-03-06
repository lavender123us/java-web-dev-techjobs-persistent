## Part 1: Test it with SQL
SELECT *
FROM job;

## Part 2: Test it with SQL
SELECT name
FROM employer
WHERE location =  "St. Louis";

## Part 3: Test it with SQL
DROP TABLE job;

## Part 4: Test it with SQL
SELECT name, description
FROM skill
WHERE name IS NOT NULL AND description IS NOT NULL;
ORDER BY ASC;