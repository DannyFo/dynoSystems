# Dino Systems

## Test Task QA inter (PLA) 
  
 *First task:*
 
 Let imagine that we have system that holds and manages contact directory of many companies. 
 There is one of HTTP endpoints that responsible for retrieving user data by name: 
 GET http://some_domain.com:8080/company/%companyId%/users?name=%someName% 
 Please write test scenarios for this endpoint, as many as you can. 
 
  Example:  Request some_domain.com/company/777/users?name=Izergil where 777 is ID of 
  company that does not exist, check that error is returned and HTTP status code is 404
  
  **My   scenarios:**
  - Request some_domain.com/company/777/users?name=Izergil where Izergil 
  is name of employee that does not exist, check that error is returned and 
  HTTP status code is 404
  -  Request some_domain.com/company/777/users?name=Izergil where Izergil is 
  name of employee that was deleted from db, check that error is returned and 
  HTTP status code is 410
  - Request some_domain.com/company/777/users?name=Izergil where Izergil is name 
  of existing employee and 777 is ID of exists company, check that returned HTTP 
  status code 200
  - Request some_domain.com/company/777/users?name=Izergil where Izergil is name 
  of existing employee (but there is no content) and 777 is ID of exists company, 
  check that returned HTTP status code 204
  - Request some_domain.com/company/777/users?name=Izergil where Izergil is name 
  of existing employee (but moved into another company f. ex. 888) and 777 is ID 
  of exists company, check that returned HTTP status code 301
  
  *Second task:*
  
  Implement following scenario for this endpoint using Java language and one of 
  the test frameworks, for example TestNG, Junit, etc...: Verify that user can 
  search only member of his own company.

I my opinion the better way to implement following scenario is:
- [create simple model of employee](https://github.com/DannyFo/dynoSystems/blob/master/src/Employee.java)
- [create simple model of data base](https://github.com/DannyFo/dynoSystems/blob/master/src/Database.java)
- [and then create test, with initialization of employee and data base.](https://github.com/DannyFo/dynoSystems/blob/master/src/DatabaseTest.java)

