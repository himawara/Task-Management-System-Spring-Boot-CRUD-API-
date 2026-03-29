# 📝 Task Management System (Spring Boot CRUD API)

A robust backend API for managing daily tasks, built with **Spring Boot**, **JPA/Hibernate**, and **H2 Database**.

## 🚀 Features
- **Full CRUD:** Create, Read, Update, and Delete tasks.
- **Validation:** Server-side validation for task titles and descriptions.
- **Error Handling:** Global Exception Handler for professional error responses (400 Bad Request instead of 500).
- **H2 Console:** In-memory database for real-time data tracking.

## 🛠️ Tech Stack
- Java 21 / Spring Boot 3.x
- Spring Data JPA
- H2 Database
- Jakarta Validation

## 🔌 API Endpoints
- `GET /api/tasks` - Fetch all tasks
- `POST /api/tasks` - Add a new task
- `PUT /api/tasks/{id}` - Update a task
- `DELETE /api/tasks/{id}` - Delete a task
