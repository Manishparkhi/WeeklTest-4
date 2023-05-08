# WeeklyTest- 5

### Framework Used
+ Springboot

### Language Used
+  JAVA

### Data Flow

+ Controller - The controller layer handles the HTTP requests, translates the JSON parameter to object, and authenticates the request and transfer it to the business (service) layer. In short, it consists of views i.e., frontend part.

+ Repository - Here database is stored, for which I have used arrayList. In the database layer, CRUD (create, read, update, delete) operations are performed.

+ Service -The business layer handles all the business logic. It consists of service classes and uses services provided by data access layers.

+ DataBase Class - Here the class user is defined and the whatever a user class will load. e.g -userId, userName, address, phone number etc.

### Data Structure used in my project

In our project SQL Database and the methods involved with SQL Database, like add method for posting new Employee And Employee Address, remove method for deleting a Employee And Employee Address, combination of add and remove method for update Employee And Employee Address and linear search function for searching a user in Java by specific EmployeeId  And EmployeeAddress.
### Project Summary

Our project basically maintains the upcoming user information which includes -


### Employee:
+ id (Long)
+ first name (String)
+ lastName (String)
+ address (Address)
### Address:
+ id (Long)
+ street (String)
+ City (String)
+ state (String)
+ Zipcode (String)

You can create a Employee And Employee Address information, read a Employee And Employee Address information, read by specific EmployeeId, update Employee And Employee Address of specific Id, delete a Employee And Employee Address by their EmplyeeId by api calls
and also using SQL database.
 
