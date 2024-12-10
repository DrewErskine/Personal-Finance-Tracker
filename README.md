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

```
personal-finance-tracker/
├── backend/                   # Spring Boot Backend
│   ├── src/main/java
│   │   └── com
│   │       └── peeppea
│   │           └── finance
│   │               └── peeppea_finance_tracker
│   │                   ├── controllers/     # REST Controllers
│   │                   ├── services/        # Business Logic
│   │                   ├── models/          # JPA Entities
│   │                   ├── repository/      # Database Repositories
│   │                   ├── config/          # Spring Configurations
│   │                   ├── dto/             # Data Transfer Objects
│   │                   ├── utils/           # Utility Classes
│   │                   ├── enums/           # Enumerations (e.g., TransactionType, CategoryType)
│   │                   ├── scheduler/       # Scheduled Tasks (e.g., Report Generation)
│   │                   ├── filters/         # Security Filters (e.g., JWT)
│   │                   └── PersonalFinanceTrackerByPeepPeaApplication.java  # Main Spring Boot App
│   └── src/main/resources
│       ├── application.properties          # Spring Config
│       └── db/migration/                   # Database Migrations (Flyway)
│
├── frontend/                  # JavaFX Frontend
│   ├── src/main/java
│   │   └── com
│   │       └── peeppea
│   │           └── finance
│   │               └── peeppea_finance_tracker
│   │                   ├── controllers/    # JavaFX Controllers
│   │                   ├── models/         # JavaFX Models
│   │                   ├── views/          # FXML Files
│   │                   ├── utils/          # Helper Classes
│   │                   └── Main.java       # Entry Point
│   └── src/main/resources
│       ├── css/              # Stylesheets
│       ├── fxml/             # FXML UI Files
│       └── images/           # Icons and Images
│
└── shared/                    # Shared Components (Future-Proofing for Sync Features)
    └── src/main/java
        └── com
            └── peeppea
                └── finance
                    └── shared
                        ├── api/           # API Clients (if sync is implemented)
                        └── utils/         # Shared Utilities

Additional Notes:
- **Database Migrations:** Use Flyway to version control the database schema.
- **Security Configuration:** Found in `backend/src/main/java/com/peeppea/finance/peeppea_finance_tracker/config/WebSecurityConfig.java`.
```

---

### **3. Development Workflow**

#### **Backend:**
1. Create new REST endpoints in the `controllers/` package.
2. Implement business logic in `services/`.
3. Define database entities in `models/` and repositories in `repository/`.
4. Test features using Spring Boot Test framework.

#### **Frontend:**
1. Design UI in FXML files under `frontend/src/main/resources/fxml/`.
2. Implement controllers in `frontend/src/main/java/.../controllers/`.
3. Add styling in `frontend/src/main/resources/css/`.
4. Use JavaFX charts and models to bind UI to data.

---

### **4. Roadmap**

- **Phase 1:** Core Features
  - Expense and income management.
  - Budgeting and goals.

- **Phase 2:** Advanced Features
  - Reports and charts.
  - User management.

- **Phase 3:** Synchronization (optional)
  - Backend and desktop app sync using REST APIs.
  - Implement JWT authentication for security.

