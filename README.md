# startH2
Project start with H2 DB

Small Spring Boot project- read to run and use H2 as InMemory database.

After started Spring Boot, goto to -> http://localhost:8080/h2-console

Fill form with :

USER NAME = sa
PASSWORD = abc
JDBC URL = jdbc:h2:mem:mydb

To change from memory to store in local file just add this ...
spring.datasource.url=jdbc:h2:file:/data/demo
