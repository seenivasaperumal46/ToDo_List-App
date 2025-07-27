# ToDo_List-App📝 

# 📝 Simple To-Do List Web Application✅ 

This is a responsive and elegant **To-Do List Web App** built using **Java Spring Boot**, **Thymeleaf**, **MySQL**, and **Bootstrap**. It allows users to add, mark as completed, and delete tasks. The UI is clean and mobile-friendly.

---

## 🚀 Features

- ✍️ Add new tasks
- ✅ Mark tasks as completed/uncompleted
- 🗑️ Delete tasks
- 📦 Stores data in MySQL
- 🌐 Responsive user interface with Bootstrap & custom CSS
- 🎨 Stylish and clean UI design using Google Fonts and Icons

---

## 🛠️ Tech Stack

| Layer         | Technology               |
|---------------|---------------------------|
| Backend       | Java, Spring Boot         |
| Frontend      | Thymeleaf, HTML, CSS, Bootstrap Icons |
| Database      | MySQL                     |
| Build Tool    | Maven                     |

---

## 📂 Project Structure
```
├── src
│ ├── main
│ │ ├── java
│ │ │ └── com.example.todo
│ │ │ ├── controller
│ │ │ │ └── TodoController.java
│ │ │ ├── model
│ │ │ │ └── TodoModel.java
│ │ │ ├── repository
│ │ │ │ └── TodoRepo.java
│ │ │ └── SimpleToDoListApplication.java
│ │ └── resources
│ │ ├── static
│ │ │ └── style.css
│ │ ├── templates
│ │ │ └── index.html
│ │ └── application.properties
```

---

## ⚙️ Configuration

### 🔐 `application.properties`

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/todoappdb
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD(replace your MySQL password)

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```
---

## 💻 Setup Instructions
### 1. Clone the repository
```
git clone https://github.com/your-username/todo-app.git
cd todo-app
```

## 2. Configure MySQL
### Create a database named todoappdb.
```
CREATE DATABASE todoappdb;
```

## 3. Run the Application
### Use IntelliJ, Eclipse, or run from terminal:
```
./mvnw spring-boot:run
```

## 4.Visit:
```
http://localhost:8080
```

---

## 🧑‍🎨 Screenshots(Final Output Web Page)
<p align="center"> <img src="https://github.com/seenivasaperumal46/ToDo_List-App/blob/25fa490cc53ab49b35834ec3cdcbb336ffa75103/simple%20to_do%20list.png" alt="To-Do App UI"/> </p>

