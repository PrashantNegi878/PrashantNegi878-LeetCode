# Write your MySQL query statement below

select d.name as Department, e.name as Employee, e.salary as Salary 
from Department d join Employee e on e.departmentId = d.id
and (SELECT COUNT(DISTINCT Salary) FROM Employee WHERE 
Salary > e.Salary AND DepartmentId = d.Id) < 3;
