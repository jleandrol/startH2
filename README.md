# startH2
Project start with H2 DB and Spring Boot

Small Spring Boot project - read to run - using 
- H2 as InMemory database.
- Spring Boot Rest API 

After started Spring Boot, goto to -> http://localhost:8080/v1

For H2 DB (see http://localhost:8080/h2-console) 

Fill form with :

- USER NAME = sa
- PASSWORD = abc
- JDBC URL = jdbc:h2:mem:mydb

To change from memory to store in local file just add in yml:
spring.datasource.url=jdbc:h2:file:/data/demo
