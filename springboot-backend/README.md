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
