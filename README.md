# Personal Finance Tracker - Learning JavaFX and Spring Boot

## **Project Overview**
This project combines **JavaFX** (for desktop UI) and **Spring Boot** (for backend logic and persistence) to create a personal finance tracker. Users can manage income, expenses, budgets, and savings goals, with interactive charts and reports.

---

## **Features**
1. **Expense and Income Management**
   - Add, edit, and delete records for income and expenses.
   - Categorize transactions (e.g., food, rent, entertainment).

2. **Budgeting and Goals**
   - Set monthly budgets for spending categories.
   - Visualize progress toward savings goals.

3. **Reports and Charts**
   - Generate monthly or category-based reports.
   - Use JavaFX charts for visualizing data (e.g., pie, bar, and line charts).

4. **Data Persistence**
   - Store user data in a database (H2, PostgreSQL, or MySQL).
   - Use JPA/Hibernate for database operations.

5. **Optional Features**
   - **User Management:** Support multiple user accounts with authentication.
   - **Synchronization:** Sync data between the desktop app and a backend server using REST APIs.

---

## **Tech Stack**
- **Frontend:**
  - JavaFX (UI components and charts)
  - CSS for styling
- **Backend:**
  - Spring Boot (REST APIs, business logic)
  - Spring Data JPA (database interaction)
- **Database:**
  - H2 (for learning) or PostgreSQL/MySQL (for production)
- **Build Tools:**
  - Maven or Gradle
- **Extras:**
  - Spring Security (optional user authentication)
  - Flyway or Liquibase (database migrations)

---

## **Project Setup**

### **1. Prerequisites**
- Java Development Kit (JDK) 17 or later.
- IDE (IntelliJ IDEA, Eclipse, or VS Code).
- Maven or Gradle installed.
- Database: H2 (embedded), PostgreSQL, or MySQL.
- Basic understanding of JavaFX and Spring Boot.

---

### **2. Project Structure**
```plaintext
personal-finance-tracker/
├── backend/                   # Spring Boot Backend
│   ├── src/main/java
│   │   ├── com.example.finance
│   │       ├── controller/    # REST Controllers
│   │       ├── service/       # Business Logic
│   │       ├── model/         # JPA Entities
│   │       ├── repository/    # Database Repositories
│   │       └── config/        # Spring Configurations
│   └── src/main/resources
│       ├── application.yml    # Spring Config
│       └── db/migration/      # Database Migrations (Flyway)
├── frontend/                  # JavaFX Frontend
│   ├── src/main/java
│   │   ├── com.example.ui
│   │       ├── controllers/   # JavaFX Controllers
│   │       ├── models/        # JavaFX Models
│   │       ├── views/         # FXML Files
│   │       ├── utils/         # Helper Classes
│   │       └── Main.java      # Entry Point
│   └── src/main/resources
│       ├── css/               # Stylesheets
│       ├── fxml/              # FXML UI Files
│       └── images/            # Icons and Images
