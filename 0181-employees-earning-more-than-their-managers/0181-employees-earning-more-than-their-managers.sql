# Write your MySQL query statement below

# creating a new column named Employee for ouput
# need to specifiy 
SELECT e2.name as Employee

# add tables that are going to be used
FROM Employee e1

# INNER JOIN - need to compare internal values within table, thus need to create dupe table
# also thus need to differentiate tables as e1 & e2

# inner join compares the employe ids in e1 with the manager ids in e2
# this leads to e1 only containing managers & e2 only containing employees
INNER JOIN Employee e2 ON e1.id = e2.managerId

# compare the salaries of the managers in e1 to the salaries of the employees in e2
# if the manager's salary is less than the employee's salary ->  select that employee's name
WHERE e1.salary < e2.salary;