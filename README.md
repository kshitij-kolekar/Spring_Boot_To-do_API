# 📝 Spring Boot To-do API

A simple, modular, and clean RESTful API built with **Spring Boot** and **PostgreSQL**, designed to manage your to-do tasks efficiently. This project was created to understand backend architecture, explore Spring ecosystem components, and experiment with API testing tools like Postman and Boomerang.

---

## 🚀 Features

- ✅ Full CRUD operations (Create, Read, Update, Delete)
- 🧱 Clean layered architecture (Controller → Service → Repository → DB)
- 🔌 PostgreSQL integration with Spring Data JPA
- 🛠️ Hibernate auto-generates tables on startup
- 📬 Easily testable with Boomerang, Postman, or curl
- ♻️ Modular and extensible design for future feature expansion

---

## 🛠️ Tech Stack

- Java 17+
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Maven
- Boomerang (for API testing)

---

## ⚙️ Setup Instructions

### 1. Clone the repository

```bash
git clone https://github.com/your-username/springboot-todo-api.git
cd springboot-todo-api
```

---

### 2. Set up PostgreSQL

Make sure PostgreSQL is installed on your system.

You can download it from:
👉 [https://www.postgresql.org/download/](https://www.postgresql.org/download/)

Once installed:

1. Open **pgAdmin** or use **psql** CLI.

2. Log in using the default user:

   * **Username:** `postgres`
   * **Password:** (whatever you set during installation)

3. Create a new database:

#### Using pgAdmin:

* Open pgAdmin
* Right-click **Databases** → **Create** → **Database**
* Name it `tododb` (or anything you prefer)

#### Using psql CLI:

Open a terminal and type:

```bash
psql -U postgres
```

Then run:

```sql
CREATE DATABASE tododb;
```

That’s it! Your database is ready for Spring Boot to hook into.

---

### 3. Configure `application.properties`

Go to `src/main/resources/application.properties` and configure it like this:

```properties
# PostgreSQL Database Configuration
spring.datasource.url=jdbc:postgresql://localhost:5432/tododb
spring.datasource.username=postgres
spring.datasource.password=your_password

# Hibernate Properties
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
```

Make sure:

* The database name matches what you created (`tododb`)
* You update `your_password` with your real Postgres password

---

### 4. Build and Run the Project

Use Maven Wrapper (included in the project) or your IDE:

```bash
./mvnw spring-boot:run
```

Or if you have Maven installed globally:

```bash
mvn spring-boot:run
```

This will start your API on:
📍 `http://localhost:8080`

---

## 🔗 API Endpoints

| Method | Endpoint          | Description              |
| ------ | ----------------- | ------------------------ |
| GET    | `/api/todos`      | Get all to-dos           |
| GET    | `/api/todos/{id}` | Get a single to-do by ID |
| POST   | `/api/todos`      | Create a new to-do       |
| PUT    | `/api/todos/{id}` | Update an existing to-do |
| DELETE | `/api/todos/{id}` | Delete a to-do           |

---

## 🧪 Sample JSON (for POST/PUT)

```json
{
  "title": "Learn Spring Boot",
  "completed": false
}
```

---

## 📬 Testing with Boomerang

Use [Boomerang Request Maker](https://chrome.google.com/webstore/detail/boomerang-request-maker/) (or Postman):

1. Set the HTTP method (GET, POST, PUT, DELETE)
2. Use this as your base URL:
   `http://localhost:8080/api/todos`
3. For POST and PUT, set headers:

   * `Content-Type: application/json`
4. Paste the sample JSON into the body

---

## 🧠 Why This Project?

This project helped me:

* Understand how REST APIs are structured in Spring Boot
* Work with real databases using PostgreSQL
* Learn how Spring Data JPA abstracts away boilerplate SQL
* Experiment with Postman/Boomerang for backend testing

---

## 📌 TODO (What’s Next)

* ✅ Basic CRUD functionality
* 🔐 Add JWT-based authentication
* 📅 Include due dates, priorities, and categories
* 🔍 Filtering and search capabilities
* 📜 Swagger API documentation
* 🧪 Unit + Integration testing with JUnit and Mockito

---

## 👤 Author

**Kshitij**
Backend developer in training. Loves clean code, caffeine, and clever architecture.
Looking to contribute or collaborate? Let’s connect!

---

## 📃 License

This project is not currently licensed.  
Feel free to explore the code, but please don’t reuse or distribute it without permission.

```
