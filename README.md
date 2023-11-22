# web-student-tracker


#Hello

web-student-tracker is the small 'Dynamic web project' where I created form.html(simple search form by id) where I can simply search by ID and get the record from DataBase which has table with a 1 million data.


to run code setup the tomcat server in eclipes and download the project and run the sql_setup.sql(provided in project) file on workbench then run the project on eclipes as a server.

I made this project with the help of Java,Tomcat Server, MySQL workbench and MySQL.

To make this project I followed some steps..............



Step-1: Keeping million data in DataBase(testing)

At first I created a simple Excel sheet with a three Columns(ID, Name, Age) then enhance the record with a help of draging and made million records and named it 'Book.csv' file.


then I copied the file to path like 'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/Book.csv'.





step2: tomcat server

I install tomcat 9.0 and setup on Eclipes IDE 





step3: DataBase config

I provide Sql file where I set user username and password then i create Database named 'web-student-tracker' then use it .

then created table 'Book' then convert(LOAD data) million data.


now I have completed database part.




step4: Connection pool

We need Connection to DataBase, at first we need mysql connector jar file. So i downloaded and pested to lib folder in WEB-INF

then we have to create context.xml file where I defined the username and password and dataBase name and other things and pested it in META-INF



step5: now I had to make Servlet simple java Class and using doGet method(more good of using doPost)

I made servlet name TestServlet.java 

I create dependencies of datasource and using @Resource(name="jdbc/databaseName")

then I created PrintWriter and the set Content type html.


then I set connection, statement and resultset and import 'sql.connection'.


then get Id from form.html and use it on sql query.


step6: form.html


I created html form in webapp folder where I created one form that take id and when I submit then action goes to 'TestServlet.java' and display the desired row.



step7: run from.html as a server.


