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
