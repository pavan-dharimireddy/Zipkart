# 🛒 Zipkart - Full Stack E-Commerce Platform

Zipkart is a modern, responsive full-stack e-commerce application designed to provide a seamless shopping experience. It features a robust **Spring Boot** backend for handling API requests and an intuitive **React.js** frontend for user interactions. The application implements complete CRUD (Create, Read, Update, Delete) operations for inventory management, utilizing an **H2 Database** for quick and lightweight data persistence.

> **Note:** There are separate README files available in the `frontend` and `backend` directories containing specific documentation and instructions for each stack.

## ✨ Features

- **Product Management:** Full CRUD capabilities to add, edit, view, and delete products.
- **Dynamic Search & Filtering:** Live search functionality to find products by keyword or ID, alongside category-based filtering.
- **Responsive UI:** A clean, mobile-friendly interface built with modern web standards and Bootstrap.
- **Theme Toggling:** Built-in Light and Dark mode preferences that persist locally.
- **RESTful Architecture:** Clean separation of concerns with a standalone backend API and an independent frontend client.

## 🛠️ Tech Stack

### Frontend
- **React.js:** UI rendering and state management.
- **Axios:** Promise-based HTTP client for API requests.
- **Bootstrap:** For styling and responsive layout.

### Backend
- **Java 17+** 
- **Spring Boot:** Core framework for application business logic and RESTful API generation.
- **Spring Data JPA:** For seamless database interactions and ORM.
- **H2 Database:** In-memory relational database for rapid development and testing.

## 🚀 Getting Started

To get a local copy up and running, follow these simple steps.

### Prerequisites
- Node.js and npm installed on your machine.
- Java Development Kit (JDK) 17 or higher.
- Maven (or Gradle, depending on your Spring setup).

### 1. Backend Setup (Spring Boot)
1. Navigate to the backend directory:
   ```bash
   cd backend
