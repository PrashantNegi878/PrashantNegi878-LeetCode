# select d.name as Department, e1.name as Employee, e1.salary as Salary 
# from Employee e1 join (select departmentId, max(salary) as Salary from employee group by DepartmentId) e2 join Department d
# where e1.departmentId=e2.departmentId and e1.salary=e2.salary and d.id = e1.departmentId

select d.name as Department, e.name as Employee, e.salary as Salary 
from Employee e join Department d 
on e.departmentId=d.id
where (departmentId,salary) in (select departmentId, max(salary) from Employee group by departmentId)

