# 🚀 Spring Boot Mastery — Day 1

## 📌 Project Overview

This project is part of my **45-Day Spring Boot Mastery Plan**.
Day 1 focuses on setting up a Spring Boot application and understanding its basic structure and architecture.

---

## 🧠 What I Learned

* What is Spring Boot
* How Spring Boot simplifies backend development
* Project structure in Spring Boot
* Understanding `@SpringBootApplication`
* Running a Spring Boot application

---

## ⚙️ Tech Stack

* Java
* Spring Boot
* Maven
* Embedded Tomcat Server

---

## 📁 Project Structure

src/
└── main/
├── java/
│   └── com/manikanta/basics/
│       └── Day1Application.java
└── resources/
└── application.properties

---

## ▶️ How to Run the Project

1. Clone the repository
2. Open in IDE (IntelliJ / Eclipse)
3. Run `Day1Application.java`

---

## 🌐 Output

* Application runs on:
  http://localhost:8080

* Embedded Tomcat server starts successfully

---

## 🎯 Key Concept

Spring Boot allows developers to quickly build backend applications with minimal configuration using auto-configuration and embedded servers.

---

## 📅 Progress

✔ Day 1 Completed
⬜ Day 2 In Progress

---

## 🧑‍💻 Author

Manikanta
B.Tech CSE

---



# 🚀 Spring Boot Mastery — Day 2

## 📌 Objective

Understand Spring Boot internal working and build the first REST controller with basic endpoints.

---

## 🧠 Key Concepts Covered

* Spring Boot application lifecycle
* Component scanning
* Spring Beans
* REST API fundamentals
* HTTP request-response flow
* `@RestController` and `@GetMapping`

---

## ⚙️ Tech Stack

* Java
* Spring Boot
* Spring Web
* Embedded Tomcat

---

## 📁 Project Structure

src/
└── main/
├── java/
│   └── com/manikanta/basics/
│       ├── Day1Application.java
│       └── controller/
│           └── HelloController.java
└── resources/
└── application.properties

---

## 🔌 API Endpoints

### 1. Hello API

GET /hello

Response:
Hello Manikanta 🚀

---

### 2. Name API

GET /name

Response:
My name is Manikanta

---

### 3. Status API

GET /status

Response:
Server is running successfully

---

## ▶️ How to Run

1. Clone repository
2. Open in IDE
3. Run `Day1Application.java`
4. Access endpoints via browser or Postman

---

## 🎯 Learning Outcome

* Ability to create basic REST endpoints
* Understanding how Spring Boot handles HTTP requests
* Clear idea of controller layer responsibility

---

## 📅 Progress

✔ Day 1: Project setup
✔ Day 2: First REST APIs
⬜ Day 3: Request Parameters & Path Variables

---

## 🧑‍💻 Author

Manikanta
B.Tech CSE

---


# 🚀 Spring Boot Mastery — Day 3

## 📌 Objective

Build dynamic REST APIs using request parameters and path variables.

---

## 🧠 Key Concepts Covered

* Query parameters using `@RequestParam`
* Path variables using `@PathVariable`
* Dynamic API design
* URL-based data passing

---

## ⚙️ Tech Stack

* Java
* Spring Boot
* Spring Web

---

## 📁 Project Structure

src/
└── main/
├── java/
│   └── com/manikanta/basics/
│       ├── Day1Application.java
│       └── controller/
│           └── HelloController.java
└── resources/
└── application.properties

---

## 🔌 API Endpoints

### 1. Greet User (Request Param)

GET /greet?name=Manikanta

Response:
Hello Manikanta 🚀

---

### 2. Welcome User (Path Variable)

GET /welcome/{name}

Example:
GET /welcome/Manikanta

Response:
Welcome Manikanta 🎉

---

### 3. Age API

GET /age?age=21

Response:
Your age is 21

---

### 4. Square API

GET /square/{num}

Example:
GET /square/5

Response:
25

---

## ▶️ How to Run

1. Clone repository
2. Open in IDE
3. Run `Day1Application.java`
4. Test endpoints via browser/Postman

---

## 🎯 Learning Outcome

* Build dynamic APIs
* Understand URL parameter handling
* Learn difference between query params and path variables

---

## 📅 Progress

✔ Day 1: Setup
✔ Day 2: Basic APIs
✔ Day 3: Dynamic APIs
⬜ Day 4: Advanced request handling

---

## 🧑‍💻 Author

Manikanta
B.Tech CSE

---


# 🚀 Spring Boot Mastery — Day 4

## 📌 Objective

Learn advanced request handling techniques using multiple request parameters, default values, and optional parameters in Spring Boot REST APIs.

---

## 🧠 Key Concepts Covered

* Multiple `@RequestParam`
* Default values using `defaultValue`
* Optional parameters using `required = false`
* Dynamic API behavior

---

## ⚙️ Tech Stack

* Java
* Spring Boot
* Spring Web

---

## 📁 Project Structure

src/
└── main/
├── java/
│   └── com/manikanta/basics/
│       └── controller/
│           └── UserController.java
└── resources/
└── application.properties

---

## 🔌 API Endpoints

### Student API

GET /student?name=Manikanta&age=21

Response:
Student Name: Manikanta, Age: 21

---

### Country API

GET /country

Response:
Country: India

---

### Search API

GET /search?keyword=java

Response:
Searching for: java

---

### Add API

GET /add?a=10&b=20

Response:
30

---

## ▶️ How to Run

1. Clone repository
2. Open project in IDE
3. Run Spring Boot application
4. Test endpoints using browser or Postman

---

## 🎯 Learning Outcome

* Handle dynamic request parameters
* Build flexible APIs
* Design cleaner request handling

---

## 📅 Progress

✔ Day 1: Spring Boot setup
✔ Day 2: REST controllers
✔ Day 3: Dynamic APIs
✔ Day 4: Advanced request handling
⬜ Day 5: POST APIs and JSON data

---

## 🧑‍💻 Author

Manikanta
B.Tech CSE

---



# 🚀 Spring Boot Mastery — Day 5

## 📌 Objective

Learn how to build POST APIs using JSON data and `@RequestBody` in Spring Boot.

---

## 🧠 Key Concepts Covered

* HTTP POST requests
* JSON request body
* `@PostMapping`
* `@RequestBody`
* Java model classes
* JSON to Java object mapping

---

## ⚙️ Tech Stack

* Java
* Spring Boot
* Spring Web

---

## 📁 Project Structure

src/
└── main/
├── java/
│   └── com/manikanta/basics/
│       ├── controller/
│       │   └── UserController.java
│       └── model/
│           ├── User.java
│           └── Product.java
└── resources/
└── application.properties

---

## 🔌 API Endpoints

### Create User API

POST /users

Request JSON:
{
"name": "Manikanta",
"age": 21
}

Response:
User created: Manikanta, Age: 21

---

### Create Product API

POST /products

Request JSON:
{
"name": "Laptop",
"price": 55000
}

Response:
Product: Laptop, Price: 55000

---

## ▶️ How to Run

1. Clone repository
2. Open project in IDE
3. Run Spring Boot application
4. Test APIs using Postman

---

## 🎯 Learning Outcome

* Build POST APIs
* Handle JSON request bodies
* Convert JSON into Java objects
* Understand object mapping in Spring Boot

---

## 📅 Progress

✔ Day 1: Setup
✔ Day 2: REST controllers
✔ Day 3: Dynamic APIs
✔ Day 4: Request handling
✔ Day 5: POST APIs & JSON
⬜ Day 6: ResponseEntity & clean responses

---

## 🧑‍💻 Author

Manikanta
B.Tech CSE

---



# 🚀 Spring Boot Mastery — Day 6

## 📌 Objective

Learn how to return structured JSON responses using `ResponseEntity` and proper HTTP status codes in Spring Boot REST APIs.

---

## 🧠 Key Concepts Covered

* JSON response handling
* `ResponseEntity`
* HTTP status codes
* Structured API response design
* Response models

---

## ⚙️ Tech Stack

* Java
* Spring Boot
* Spring Web

---

## 📁 Project Structure

src/
└── main/
├── java/
│   └── com/manikanta/basics/
│       ├── controller/
│       │   └── UserController.java
│       └── model/
│           ├── User.java
│           ├── Product.java
│           └── ApiResponse.java
└── resources/
└── application.properties

---

## 🔌 API Endpoints

### Create User API

POST /users

Response:
{
"message": "User created successfully",
"status": 201
}

HTTP Status:
201 CREATED

---

### Create Product API

POST /products

Response:
{
"message": "Product added successfully",
"status": 201
}

---

### Health API

GET /health

Response:
{
"message": "Server is running",
"status": 200
}

---

## ▶️ How to Run

1. Clone repository
2. Open in IDE
3. Run Spring Boot application
4. Test APIs using Postman

---

## 🎯 Learning Outcome

* Return structured JSON responses
* Understand HTTP status codes
* Build professional REST APIs
* Use `ResponseEntity` effectively

---

## 📅 Progress

✔ Day 1: Setup
✔ Day 2: REST controllers
✔ Day 3: Dynamic APIs
✔ Day 4: Request handling
✔ Day 5: POST APIs & JSON
✔ Day 6: JSON responses & status codes
⬜ Day 7: Mini API project

---

## 🧑‍💻 Author

Manikanta
B.Tech CSE

---



# 🚀 Spring Boot Mastery — Day 7

## 📌 Objective

Build a mini Student Management REST API project using Spring Boot fundamentals learned in the first week.

---

## 🧠 Key Concepts Covered

* REST API design
* GET and POST APIs
* Path variables
* JSON request handling
* `ResponseEntity`
* In-memory data storage
* Controller-level request mapping

---

## ⚙️ Tech Stack

* Java
* Spring Boot
* Spring Web

---

## 📁 Project Structure

src/
└── main/
├── java/
│   └── com/manikanta/basics/
│       ├── controller/
│       │   └── StudentController.java
│       └── model/
│           ├── Student.java
│           └── ApiResponse.java
└── resources/
└── application.properties

---

## 🔌 API Endpoints

### Create Student

POST /students

Request JSON:
{
"id": 1,
"name": "Manikanta",
"age": 21
}

Response:
{
"message": "Student added successfully",
"status": 201
}

---

### Get All Students

GET /students

---

### Get Student By ID

GET /students/{id}

Example:
GET /students/1

---

### Health API

GET /students/health

Response:
{
"message": "Student API is running",
"status": 200
}

---

## ▶️ How to Run

1. Clone repository
2. Open project in IDE
3. Run Spring Boot application
4. Test APIs using Postman

---

## 🎯 Learning Outcome

* Build a mini REST API project
* Combine GET and POST APIs
* Handle JSON requests and responses
* Organize backend project structure

---

## 📅 Progress

✔ Phase 1 Completed
✔ Spring Boot fundamentals completed
⬜ Phase 2: Clean Architecture begins

---

## 🧑‍💻 Author

Manikanta
B.Tech CSE

---



# 🚀 Spring Boot Mastery — Day 8

## 📌 Objective

Understand clean architecture principles by separating controller logic and business logic using the service layer in Spring Boot.

---

## 🧠 Key Concepts Covered

* Layered architecture
* Controller layer
* Service layer
* Business logic separation
* Dependency Injection
* Constructor Injection
* `@Service`

---

## ⚙️ Tech Stack

* Java
* Spring Boot
* Spring Web

---

## 📁 Project Structure

src/
└── main/
├── java/
│   └── com/manikanta/basics/
│       ├── controller/
│       │   └── StudentController.java
│       ├── service/
│       │   └── StudentService.java
│       └── model/
│           └── Student.java
└── resources/
└── application.properties

---

## 🔌 API Endpoints

### Create Student

POST /students

---

### Get All Students

GET /students

---

### Get Student By ID

GET /students/{id}

---

## ▶️ How to Run

1. Clone repository
2. Open in IDE
3. Run Spring Boot application
4. Test APIs using Postman

---

## 🎯 Learning Outcome

* Understand clean backend architecture
* Separate controller and business logic
* Use service layer effectively
* Learn dependency injection basics

---

## 📅 Progress

✔ Phase 1 Completed
✔ Day 8: Service layer architecture
⬜ Day 9: Advanced service layer concepts

---

## 🧑‍💻 Author

Manikanta
B.Tech CSE

---


# 🚀 Spring Boot Mastery — Day 9

## 📌 Objective

Learn interface-based service architecture and implement loose coupling using service abstraction in Spring Boot.

---

## 🧠 Key Concepts Covered

* Service interfaces
* Service implementation classes
* Loose coupling
* Abstraction
* Dependency Injection with interfaces
* Clean architecture principles

---

## ⚙️ Tech Stack

* Java
* Spring Boot
* Spring Web

---

## 📁 Project Structure

src/
└── main/
├── java/
│   └── com/manikanta/springboot_backend/basics/
│       ├── controller/
│       │   └── StudentController.java
│       ├── service/
│       │   ├── StudentService.java
│       │   └── impl/
│       │       └── StudentServiceImpl.java
│       └── model/
│           └── Student.java
└── resources/
└── application.properties

---

## 🔌 API Endpoints

### Create Student

POST /students

---

### Get All Students

GET /students

---

### Get Student By ID

GET /students/{id}

---

### Update Student

PUT /students/{id}

---

### Delete Student

DELETE /students/{id}

---

## ▶️ How to Run

1. Clone repository
2. Open project in IDE
3. Run Spring Boot application
4. Test APIs using Postman

---

## 🎯 Learning Outcome

* Understand interface-based architecture
* Achieve loose coupling
* Implement service abstraction
* Build scalable backend structure

---

## 📅 Progress

✔ Day 8: Service layer
✔ Day 9: Interface-based architecture
⬜ Day 10: Advanced Dependency Injection

---

## 🧑‍💻 Author

Manikanta
B.Tech CSE

---


# 🚀 Spring Boot Mastery — Day 10

## 📌 Objective

Understand advanced dependency injection concepts, bean lifecycle, multiple bean management, and the use of `@Autowired`, `@Primary`, and `@Qualifier` in Spring Boot.

---

## 🧠 Key Concepts Covered

* Spring Beans
* Bean lifecycle
* Dependency Injection
* `@Autowired`
* Constructor Injection
* Multiple bean problem
* `@Primary`
* `@Qualifier`

---

## ⚙️ Tech Stack

* Java
* Spring Boot
* Spring Web

---

## 📁 Project Structure

src/
└── main/
├── java/
│   └── com/manikanta/springboot_backend/basics/
│       ├── controller/
│       │   └── StudentController.java
│       ├── service/
│       │   ├── StudentService.java
│       │   └── impl/
│       │       ├── StudentServiceImpl.java
│       │       └── StudentServiceMongoImpl.java
│       └── model/
│           └── Student.java
└── resources/
└── application.properties

---

## 🎯 Learning Outcome

* Understand Spring Bean lifecycle
* Learn dependency injection deeply
* Handle multiple service implementations
* Use `@Primary` and `@Qualifier`
* Understand constructor injection benefits

---

## 📅 Progress

✔ Day 9: Interface-based architecture
✔ Day 10: Advanced dependency injection
⬜ Day 11: `@Autowired` vs Constructor Injection in depth

---

## 🧑‍💻 Author

Manikanta
B.Tech CSE

---


# 🚀 Spring Boot Mastery — Day 11

## 📌 Objective

Understand different dependency injection types and bean scopes in Spring Boot.

---

## 🧠 Key Concepts Covered

* Constructor Injection
* Setter Injection
* Field Injection
* Bean Scope
* Singleton Scope
* Prototype Scope
* Dependency management

---

## ⚙️ Tech Stack

* Java
* Spring Boot
* Spring Web

---

## 📁 Project Structure

src/
└── main/
├── java/
│   └── com/manikanta/springboot_backend/basics/
│       ├── controller/
│       │   └── StudentController.java
│       ├── service/
│       │   ├── StudentService.java
│       │   └── impl/
│       │       └── StudentServiceImpl.java
│       └── model/
│           └── Student.java
└── resources/
└── application.properties

---

## 🎯 Learning Outcome

* Understand all dependency injection types
* Learn why constructor injection is preferred
* Understand bean scopes in Spring
* Compare singleton and prototype beans

---

## 📅 Progress

✔ Day 10: Advanced dependency injection
✔ Day 11: Injection types & bean scopes
⬜ Day 12: DTO and Entity concepts

---

## 🧑‍💻 Author

Manikanta
B.Tech CSE

---

# 🚀 Spring Boot Mastery — Day 12

## 📌 Objective

Understand DTO (Data Transfer Object) concepts and implement clean API response design in Spring Boot.

---

## 🧠 Key Concepts Covered

* DTO vs Entity
* API response design
* Data hiding
* Entity-to-DTO conversion
* Clean architecture practices

---

## ⚙️ Tech Stack

* Java
* Spring Boot
* Spring Web

---

## 📁 Project Structure

src/
└── main/
├── java/
│   └── com/manikanta/springboot_backend/basics/
│       ├── controller/
│       │   └── StudentController.java
│       ├── dto/
│       │   └── StudentDTO.java
│       ├── model/
│       │   └── Student.java
│       ├── service/
│       │   └── StudentService.java
│       └── service/impl/
│           └── StudentServiceImpl.java
└── resources/
└── application.properties

---

## 🔌 API Endpoints

### Get Student DTO

GET /students/dto/{id}

Response:
{
"id": 1,
"name": "Manikanta"
}

---

## 🎯 Learning Outcome

* Understand DTO usage
* Prevent exposing sensitive data
* Build cleaner APIs
* Separate internal model from API response

---

## 📅 Progress

✔ Day 11: Bean scopes & injection types
✔ Day 12: DTO and Entity separation
⬜ Day 13: Advanced DTO mapping

---

## 🧑‍💻 Author

Manikanta
B.Tech CSE

---

# 🚀 Spring Boot Mastery — Day 13

## 📌 Objective

Improve DTO architecture by introducing mapper classes and separating object conversion logic from the service layer.

---

## 🧠 Key Concepts Covered

* DTO mapping
* Mapper classes
* Static utility methods
* Separation of concerns
* Cleaner architecture design

---

## ⚙️ Tech Stack

* Java
* Spring Boot
* Spring Web

---

## 📁 Project Structure

src/
└── main/
├── java/
│   └── com/manikanta/springboot_backend/basics/
│       ├── controller/
│       │   └── StudentController.java
│       ├── dto/
│       │   └── StudentDTO.java
│       ├── mapper/
│       │   └── StudentMapper.java
│       ├── model/
│       │   └── Student.java
│       ├── service/
│       │   └── StudentService.java
│       └── service/impl/
│           └── StudentServiceImpl.java
└── resources/
└── application.properties

---

## 🎯 Learning Outcome

* Separate mapping logic from service layer
* Build reusable mapper utilities
* Improve DTO architecture
* Understand cleaner backend design

---

## 📅 Progress

✔ Day 12: DTO and Entity separation
✔ Day 13: Mapper-based DTO conversion
⬜ Day 14: Mini project refactoring

---

## 🧑‍💻 Author

Manikanta
B.Tech CSE

---

# 🚀 Spring Boot Mastery — Day 14

## 📌 Objective

Refactor the mini Spring Boot project using cleaner package organization, better naming conventions, and separation of responsibilities.

---

## 🧠 Key Concepts Covered

* Refactoring
* Clean package structure
* Naming conventions
* Separation of concerns
* Maintainable code design
* Single Responsibility Principle

---

## ⚙️ Tech Stack

* Java
* Spring Boot
* Spring Web

---

## 📁 Improved Project Structure

src/
└── main/
├── java/
│   └── com/manikanta/springboot_backend/basics/
│       ├── controller/
│       │   └── StudentController.java
│       ├── dto/
│       │   └── StudentDTO.java
│       ├── mapper/
│       │   └── StudentMapper.java
│       ├── model/
│       │   └── Student.java
│       ├── service/
│       │   ├── StudentService.java
│       │   └── impl/
│       │       ├── StudentServiceImpl.java
│       │       └── StudentServiceMongoImpl.java
│       └── exception/
└── resources/
└── application.properties

---

## 🎯 Learning Outcome

* Refactor backend project structure
* Apply professional naming conventions
* Improve readability and maintainability
* Organize layered architecture cleanly

---

## 📅 Progress

✔ Day 13: DTO mapper architecture
✔ Day 14: Project refactoring & clean structure
⬜ Day 15: Mini project completion

---

## 🧑‍💻 Author

Manikanta
B.Tech CSE

---
# 🚀 Spring Boot Mastery — Day 15

## 📌 Objective

Complete the clean architecture phase by implementing consistent API response structures and applying backend best practices.

---

## 🧠 Key Concepts Covered

* Generic API responses
* Consistent response structure
* Backend best practices
* API readability
* Clean architecture review

---

## ⚙️ Tech Stack

* Java
* Spring Boot
* Spring Web

---

## 📁 Improved Project Structure

src/
└── main/
├── java/
│   └── com/manikanta/springboot_backend/basics/
│       ├── controller/
│       ├── dto/
│       ├── mapper/
│       ├── model/
│       ├── service/
│       └── service/impl/
└── resources/
└── application.properties

---

## 🔌 API Response Structure

Example Response:
{
"message": "student fetched successfully",
"status": 200,
"data": {
"id": 1,
"name": "Manikanta"
}
}

---

## 🎯 Learning Outcome

* Build consistent REST API responses
* Use generic DTO response wrappers
* Improve API readability
* Apply clean backend practices

---

## 📅 Progress

✔ Phase 2 Completed
✔ Day 15: Final architecture cleanup & response design
⬜ Phase 3: Database integration begins

---

## 🧑‍💻 Author

Manikanta
B.Tech CSE

---


# 🚀 Spring Boot Mastery — Day 16

## 📌 Objective

Set up MySQL database integration and connect Spring Boot application using application.properties configuration.

---

## 🧠 Key Concepts Covered

* MySQL basics
* Database persistence
* JDBC connection
* Spring Boot datasource configuration
* application.properties setup

---

## ⚙️ Tech Stack

* Java
* Spring Boot
* MySQL
* MySQL Connector/J

---

## 📁 Database Configuration

application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/springboot_db

spring.datasource.username=root

spring.datasource.password=your_password

spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

---

## 🗄️ Database Setup

SQL Command:
CREATE DATABASE springboot_db;

---

## 🎯 Learning Outcome

* Understand database persistence
* Connect Spring Boot with MySQL
* Configure datasource properties
* Prepare backend for real database operations

---

## 📅 Progress

✔ Phase 2 Completed
✔ Day 16: MySQL connection setup
⬜ Day 17: JPA and Entity mapping

---

## 🧑‍💻 Author

Manikanta
B.Tech CSE

---
# 🚀 Spring Boot Mastery — Day 17

## 📌 Objective

Learn JPA entity mapping and connect Java objects with MySQL database tables using Hibernate ORM.

---

## 🧠 Key Concepts Covered

* JPA
* ORM (Object Relational Mapping)
* `@Entity`
* `@Table`
* `@Id`
* `@GeneratedValue`
* Primary keys
* Database table mapping

---

## ⚙️ Tech Stack

* Java
* Spring Boot
* MySQL
* Spring Data JPA
* Hibernate

---

## 📁 Entity Mapping Example

```java
@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private int age;
}
```

---

## 🗄️ Database Table

Table Name:
students

Generated Automatically Using:
spring.jpa.hibernate.ddl-auto=update

---

## 🎯 Learning Outcome

* Understand JPA and ORM concepts
* Map Java classes to database tables
* Configure entity classes
* Create database tables automatically using Hibernate

---

## 📅 Progress

✔ Day 16: MySQL setup
✔ Day 17: Entity mapping with JPA
⬜ Day 18: Repository layer and database CRUD

---

## 🧑‍💻 Author

Manikanta
B.Tech CSE

---

# 🚀 Spring Boot Mastery — Day 18

## 📌 Objective

Implement repository layer using Spring Data JPA and perform real database CRUD operations with MySQL.

---

## 🧠 Key Concepts Covered

* Repository layer
* JpaRepository
* save()
* findAll()
* findById()
* deleteById()
* Optional
* Real database CRUD

---

## ⚙️ Tech Stack

* Java
* Spring Boot
* Spring Data JPA
* Hibernate
* MySQL

---

## 📁 Repository Example

```java id="7y21d0"
public interface StudentRepository
        extends JpaRepository<Student, Integer> {

}
```

---

## 🎯 Learning Outcome

* Perform database CRUD operations
* Use Spring Data JPA repositories
* Replace temporary List storage with MySQL
* Understand real backend persistence

---

## 📅 Progress

✔ Day 17: Entity mapping
✔ Day 18: Repository layer & database CRUD
⬜ Day 19: Custom query methods

---

## 🧑‍💻 Author

Manikanta
B.Tech CSE

---


# 🚀 Spring Boot Mastery — Day 19

## 📌 Objective

Implement custom derived query methods using Spring Data JPA naming conventions.

---

## 🧠 Key Concepts Covered

* Derived query methods
* Query generation
* findByName()
* findByAge()
* Multiple condition queries
* Convention over configuration

---

## ⚙️ Tech Stack

* Java
* Spring Boot
* Spring Data JPA
* Hibernate
* MySQL

---

## 📁 Repository Example

```java id="j1d9x"
public interface StudentRepository
        extends JpaRepository<Student, Integer> {

    List<Student> findByName(String name);

    List<Student> findByAge(int age);

    List<Student> findByNameAndAge(
            String name,
            int age);
}
```

---

## 🎯 Learning Outcome

* Generate SQL automatically using method names
* Build custom repository queries
* Understand Spring Data JPA conventions
* Perform advanced database searches

---

## 📅 Progress

✔ Day 18: Repository CRUD operations
✔ Day 19: Derived query methods
⬜ Day 20: Advanced query methods and sorting

---

## 🧑‍💻 Author

Manikanta
B.Tech CSE

---



# 🚀 Spring Boot Mastery — Day 20

## 📌 Objective

Implement advanced query methods, filtering, sorting concepts, and pagination using Spring Data JPA.

---

## 🧠 Key Concepts Covered

* findByNameContaining()
* findByAgeGreaterThan()
* Pagination
* Pageable
* Page<T>
* Filtering
* Advanced derived queries

---

## ⚙️ Tech Stack

* Java
* Spring Boot
* Spring Data JPA
* Hibernate
* MySQL

---

## 📁 Repository Example

```java id="t20x"
List<Student> findByNameContaining(String keyword);

List<Student> findByAgeGreaterThan(int age);

Page<Student> findAll(Pageable pageable);
```

---

## 🎯 Learning Outcome

* Implement advanced filtering APIs
* Build paginated APIs
* Understand scalable backend querying
* Use Spring Data JPA advanced features

---

## 📅 Progress

✔ Day 19: Derived query methods
✔ Day 20: Pagination and filtering
⬜ Day 21: Full CRUD API refactoring

---

## 🧑‍💻 Author

Manikanta
B.Tech CSE

---


# 🚀 Spring Boot Mastery — Day 21

## 📌 Objective

Refactor CRUD APIs with cleaner update/delete logic and improve backend reliability using existence validation.

---

## 🧠 Key Concepts Covered

* existsById()
* Safer delete operations
* Cleaner update logic
* Reliable CRUD APIs
* Business validation
* Professional service design

---

## ⚙️ Tech Stack

* Java
* Spring Boot
* Spring Data JPA
* Hibernate
* MySQL

---

## 📁 Improved CRUD Features

### Delete Validation

```java id="e21x"
if(!studentRepository.existsById(id))
{
    return "student not found";
}
```

### Update Validation

```java id="v21x"
findById(id).orElse(null)
```

---

## 🎯 Learning Outcome

* Build safer CRUD APIs
* Validate record existence properly
* Improve backend reliability
* Write cleaner service-layer logic

---

## 📅 Progress

✔ Day 20: Pagination and filtering
✔ Day 21: CRUD refactoring and validation
⬜ Day 22: Exception handling

---

## 🧑‍💻 Author

Manikanta
B.Tech CSE

---



# 🚀 Spring Boot Mastery — Day 22

## 📌 Objective

Implement global exception handling using `@ControllerAdvice` and create professional API error responses.

---

## 🧠 Key Concepts Covered

* Exception handling
* try-catch
* RuntimeException
* Custom exceptions
* `@ControllerAdvice`
* `@ExceptionHandler`
* Global API error handling

---

## ⚙️ Tech Stack

* Java
* Spring Boot
* Spring Data JPA
* Hibernate
* MySQL

---

## 📁 Exception Classes

### Custom Exception

```java id="d22x"
public class StudentNotFoundException
        extends RuntimeException
```

### Global Exception Handler

```java id="d22y"
@ControllerAdvice
public class GlobalExceptionHandler
```

---

## 🎯 Learning Outcome

* Handle exceptions globally
* Build cleaner API error responses
* Create custom exceptions
* Improve backend reliability

---

## 📅 Progress

✔ Day 21: CRUD refactoring
✔ Day 22: Global exception handling
⬜ Day 23: Validation APIs

---

## 🧑‍💻 Author

Manikanta
B.Tech CSE

---



# 🚀 Spring Boot Mastery — Day 23

## 📌 Objective

Implement request validation using Bean Validation annotations and handle validation errors globally.

---

## 🧠 Key Concepts Covered

* Validation
* `@Valid`
* `@NotBlank`
* `@Min`
* `@Max`
* `@Size`
* Validation exception handling

---

## ⚙️ Tech Stack

* Java
* Spring Boot
* Spring Validation
* Spring Data JPA
* Hibernate
* MySQL

---

## 📁 Validation Example

```java id="v23x"
@NotBlank(message = "name cannot be empty")
private String name;

@Min(value = 18)
private int age;
```

---

## 🎯 Learning Outcome

* Validate API request bodies
* Prevent invalid database data
* Handle validation errors professionally
* Build safer backend APIs

---

## 📅 Progress

✔ Day 22: Exception handling
✔ Day 23: Request validation
⬜ Day 24: Final CRUD API improvements

---

## 🧑‍💻 Author

Manikanta
B.Tech CSE

---


# 🚀 Spring Boot Mastery — Day 24

## 📌 Objective

Enhance CRUD APIs using ResponseEntity and improve RESTful API response design with proper HTTP status handling.

---

## 🧠 Key Concepts Covered

* ResponseEntity
* HTTP status codes
* RESTful API design
* Cleaner controller responses
* Professional API structure

---

## ⚙️ Tech Stack

* Java
* Spring Boot
* Spring Data JPA
* Hibernate
* MySQL

---

## 📁 ResponseEntity Example

```java id="r24x"
return ResponseEntity
        .status(201)
        .body(apiResponse);
```

---

## 🎯 Learning Outcome

* Build RESTful APIs professionally
* Return proper HTTP status codes
* Improve API consistency
* Design cleaner controller responses

---

## 📅 Progress

✔ Day 23: Validation
✔ Day 24: RESTful response improvements
⬜ Day 25: Full CRUD project completion

---

## 🧑‍💻 Author

Manikanta
B.Tech CSE

---


# 🚀 Spring Boot Mastery — Day 24

## 📌 Objective

Enhance CRUD APIs using ResponseEntity and improve RESTful API response design with proper HTTP status handling.

---

## 🧠 Key Concepts Covered

* ResponseEntity
* HTTP status codes
* RESTful API design
* Cleaner controller responses
* Professional API structure

---

## ⚙️ Tech Stack

* Java
* Spring Boot
* Spring Data JPA
* Hibernate
* MySQL

---

## 📁 ResponseEntity Example

```java id="r24x"
return ResponseEntity
        .status(201)
        .body(apiResponse);
```

---

## 🎯 Learning Outcome

* Build RESTful APIs professionally
* Return proper HTTP status codes
* Improve API consistency
* Design cleaner controller responses

---

## 📅 Progress

✔ Day 23: Validation
✔ Day 24: RESTful response improvements
⬜ Day 25: Full CRUD project completion

---

## 🧑‍💻 Author

Manikanta
B.Tech CSE

---

# 🚀 Spring Boot Mastery — Day 25

## 📌 Objective

Complete the full CRUD backend project with clean architecture, validation, exception handling, pagination, and MySQL integration.

---

## 🧠 Key Concepts Covered

* Full CRUD operations
* Layered architecture
* DTO and Mapper pattern
* Validation
* Exception handling
* Pagination
* Professional API responses
* MySQL integration

---

## ⚙️ Tech Stack

* Java
* Spring Boot
* Spring Data JPA
* Hibernate
* MySQL
* Postman

---

## 📁 Final Project Structure

com.manikanta.springboot_backend.basics
│
├── controller
├── dto
├── exception
├── mapper
├── model
├── repository
├── service
│    └── impl
└── resources

---

## 🎯 Features Implemented

* Create Student API
* Get All Students API
* Get Student By ID API
* Update Student API
* Delete Student API
* Pagination APIs
* Validation
* Global Exception Handling
* DTO Mapping
* MySQL Persistence

---

## 🎯 Learning Outcome

* Build complete backend CRUD systems
* Apply layered architecture
* Create scalable REST APIs
* Integrate Spring Boot with MySQL professionally

---

## 📅 Progress

✔ Phase 3 Completed
✔ Day 25: Full CRUD project completion
⬜ Day 26: Advanced exception handling & production concepts

---

## 🧑‍💻 Author

Manikanta
B.Tech CSE

---


# 🚀 Spring Boot Mastery — Day 26

## 📌 Objective

Implement advanced exception handling using standardized production-ready error response structures.

---

## 🧠 Key Concepts Covered

* Structured error responses
* ErrorResponse DTO
* Advanced exception handling
* Global API error standardization
* Production-ready API design

---

## ⚙️ Tech Stack

* Java
* Spring Boot
* Spring Data JPA
* Hibernate
* MySQL

---

## 📁 Error Response Example

```json id="r26x"
{
  "timestamp": "2026-05-28T10:30:00",
  "status": 404,
  "error": "NOT_FOUND",
  "message": "student not found",
  "path": "/students/999"
}
```

---

## 🎯 Learning Outcome

* Build production-style error responses
* Standardize backend error handling
* Improve debugging and maintainability
* Design professional API failure responses

---

## 📅 Progress

✔ Day 25: Full CRUD project completion
✔ Day 26: Advanced exception handling
⬜ Day 27: Logging and debugging

---

## 🧑‍💻 Author

Manikanta
B.Tech CSE

---


# 🚀 Spring Boot Mastery — Day 27

## 📌 Objective
Learn professional logging and debugging practices in Spring Boot using SLF4J and Logback to improve application monitoring and troubleshooting.

---

## 🧠 Key Concepts Covered

- Logging Fundamentals
- SLF4J Logger
- LoggerFactory
- Log Levels
  - TRACE
  - DEBUG
  - INFO
  - WARN
  - ERROR
- Structured Logging
- Application Monitoring
- Debugging Best Practices

---

## ⚙️ Tech Stack

- Java
- Spring Boot
- SLF4J
- Logback
- Spring Data JPA
- MySQL

---

## 📁 Logger Configuration Example

```java
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

private static final Logger log =
        LoggerFactory.getLogger(
                StudentServiceImpl.class);


```


# 🚀 Spring Boot Mastery — Day 28

## 📌 Objective

Implement DTO-based validation and separate API validation responsibilities from database entities.

---

## 🧠 Key Concepts Covered

- Request DTO
- DTO Validation
- @Valid
- Clean Architecture
- Separation of Concerns
- Entity vs DTO Responsibilities

---

## ⚙️ Tech Stack

- Java
- Spring Boot
- Spring Validation
- Spring Data JPA
- Hibernate
- MySQL

---

## 📁 New DTO

StudentRequestDTO

Contains:

- name validation
- age validation
- password validation

---

## 📁 Updated Architecture

Client
↓
StudentRequestDTO
↓
Validation
↓
Controller
↓
Service
↓
Entity
↓
Database

---

## 🎯 Learning Outcome

- Implement DTO-based validation
- Improve architecture separation
- Keep entities clean
- Build production-style APIs

---

## 📅 Progress

✔ Day 27: Logging & Debugging

✔ Day 28: DTO-Based Validation

⬜ Day 29: Advanced DTO Mapping

---

## 🧑‍💻 Author

Manikanta

B.Tech CSE

