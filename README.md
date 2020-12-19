# Spring Boot JWT Authentication using Spring Security

<a href="https://javatodev.com/spring-boot-jwt-authentication/" target="blank">
    <img align="center" src="https://javatodev.com/wp-content/uploads/2020/11/Spring-Boot-JWT-Authentication-with-REST-API-Tutorial-800x450.png" alt="Spring Boot JWT Authentication with REST API Tutorial"/></a>

<p align="left">
In this article, I’ll explain how we can implement a JWT (JSON Web Token) based authentication layer on Spring Boot CRUD API using Spring Security. Basically this JWT authentication layer will secure the API to avoid unauthorized API access.

Technologies Going to Use,

- Java 1.8
- Spring Boot: 2.3.4.RELEASE
- Spring Security
- JPA
- MySQL
- Lombok
- Gradle
- Intellij Idea for IDE

Main topics I’m going to discuss here,

- What is JWT ?
- How Does JWT Based Authentication work with Spring Boot?
- Adding Required Dependencies
- Developing API
    - Defining API Endpoints
    - Spring Security Related Implementation
        - API User Specific API Development
        - Authentication Filter with UsernamePasswordAuthenticationFilter
            - What is the use of Authentication Filter ?
        - JWT Authorization Filter with BasicAuthenticationFilter
            - What is the use of JWT authorization Filter ?
        - Authentication User Detail Service to Read User From Database
        - Security Configuration With WebSecurityConfigurerAdapter
    - Testing API with JWT Authentication
    - More Configurations inside JWT based Authentication Layer
        - Send JWT Authentication Token in Response Body After Successful Login
        - Role Based Authentication with JWT
    - Conclusion

</p>

📄 Original Tutorial [Spring Boot JWT Authentication using Spring Security](https://javatodev.com/spring-boot-jwt-authentication/)

Related Articles 

 - [How to Create a Spring Boot Project](https://javatodev.com/how-to-create-a-spring-boot-project/)
 - [Spring Boot REST API CRUD With DynamoDB Tutorial](https://javatodev.com/spring-boot-dynamo-db-crud-tutorial/)
 - [Spring Boot REST API Using JPA, Hibernate, MySQL Tutorial](https://javatodev.com/spring-boot-mysql/)
 - [Database Migration Using Flyway in Spring Boot](https://javatodev.com/flyway-spring-boot/)
