# 📝 Spring Boot Todo List API

A simple **RESTful Todo List backend** built with **Spring Boot**.
It includes **user authentication, password hashing, and CRUD operations for todos**.

The project also includes **Docker + Docker Compose**, so anyone can run the entire backend with a single command.

---

# 🚀 Features

* User Registration
* User Login
* Password Hashing using **BCrypt**
* Create Todo
* View Todos
* Delete Todo
* RESTful API architecture
* PostgreSQL database
* Dockerized setup for easy deployment

---

# 🛠 Tech Stack

* **Java**
* **Spring Boot**
* **Spring Security**
* **Spring Data JPA**
* **PostgreSQL**
* **Docker**
* **Docker Compose**
* **Maven**

---

# 📂 Project Structure

```
todolist/
│
├── src/main/java/com/techgamenium/todolist
│
│   ├── Config
│   │   └── SecurityConfig.java
│   │
│   ├── Controller
│   │   ├── AuthController.java
│   │   └── TodoListController.java
│   │
│   ├── Model
│   │   ├── User.java
│   │   └── Todo.java
│   │
│   ├── Repository
│   │   ├── UserRepository.java
│   │   └── TodoRepository.java
│   │
│   ├── Service
│   │   └── TodoService.java
│   │
│   └── TodolistApplication.java
│
├── docker-compose.yml
├── Dockerfile
├── pom.xml
└── README.md
```

---

# 🔐 Authentication APIs

## Register User

```
POST /auth/register
```

### Request

```json
{
  "username": "nav",
  "password": "1234"
}
```

Passwords are stored securely using **BCrypt hashing**.

---

## Login User

```
POST /auth/login
```

### Request

```json
{
  "username": "nav",
  "password": "1234"
}
```

### Response

```
Login successful
```

---

# 📌 Todo APIs

## Create Todo

```
POST /todos
```

### Request

```json
{
  "title": "Finish Spring Boot project"
}
```

---

## Get All Todos

```
GET /todos
```

### Response

```json
[
  {
    "id": 1,
    "title": "Finish Spring Boot project"
  }
]
```

---

## Delete Todo

```
DELETE /todos/{id}
```

Example

```
DELETE /todos/1
```

---

# 🗄 Database

The project uses **PostgreSQL** as the database.

Tables are automatically created using **Spring Data JPA**.

Example configuration:

```
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

# 🐳 Running with Docker (Recommended)

The easiest way to run the project is using **Docker Compose**.

This will automatically start:

* PostgreSQL database
* Spring Boot application

---

## Step 1 — Clone the Repository

```
git clone https://github.com/yourusername/todolist-springboot.git
cd todolist-springboot
```

---

## Step 2 — Build the Application

```
mvn clean package
```

---

## Step 3 — Start Everything

```
docker-compose up --build
```

The application will start at:

```
http://localhost:8080
```

---

## Stop Containers

```
docker-compose down
```

---

# 🐘 Docker Services

The Docker setup runs two containers:

### PostgreSQL

```
postgres:15
```

Database:

```
tododb
```

### Spring Boot App

Runs the compiled **JAR file** and connects to the PostgreSQL container.

---

# 🔒 Security

Authentication is implemented using **Spring Security**.

Features included:

* BCrypt password hashing
* Public access for authentication routes

```
/auth/**
```

Future versions may include:

* JWT Authentication
* User-based authorization

---

# 📚 What This Project Demonstrates

* REST API design
* Spring Boot backend architecture
* Authentication with Spring Security
* Password hashing with BCrypt
* CRUD operations using JPA
* Dockerized backend deployment

---

# 🔮 Future Improvements

Possible improvements:

* JWT authentication
* Link Todos to specific Users
* Update Todo endpoint
* Input validation
* Global exception handling
* Pagination support

---

# ⭐ Contributing

Feel free to fork the project and improve it.

If you found this project helpful, consider giving it a ⭐.
