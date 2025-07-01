# Employee Management System (Backend)

A lightweight Spring Boot backend application for core employee record management with full CRUD functionality.

## Technology Stack

| Category        | Technology       |
|-----------------|------------------|
| Core Framework  | Spring Boot 3.5.3 |
| Language        | Java 21          |
| Build Tool      | Maven            |
| Data Access     | Spring Data JPA  |
| Database        | MySQL            |
| Utilities       | Lombok           |
| API Standards   | RESTful          |

## Key Features

### Employee Management
- **Create**: Add new employee records
- **Read**: Retrieve individual or list of employees
- **Update**: Modify existing employee data
- **Delete**: Remove employee records

## System Requirements

- JDK 21+
- Maven 3.6+
- MySQL 8.0+

## Installation & Setup

### 1. Clone the Repository
```bash
git clone https://github.com/tebajanga/ems-backend.git
cd ems-backend
```

### 2. Database Configuration
Create a MySQL database and configure `application.properties`:

```bash
spring.datasource.url=jdbc:mysql://localhost:3306/employee_db
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```

### 3.  Build and Run
```bash
mvn clean install
mvn spring-boot:run
```

Access the API at `http://localhost:8080`

## API Documentation
Base URL: /api/v1/employees

|Endpoint	| Method	|Description|
------------|-----------|-----------|
|`/`|	POST|	Create new employee|
|`/`|	GET	|List all employees|
|`/{id}`|	GET	|Get employee by ID|
|`/{id}`|	PUT|	Update employee|
|`/{id}`|	DELETE|	Delete employee|

### Example Employee Object:
```commandline
{
  "id": 1,
  "firstName": "John",
  "lastName": "Doe",
  "email": "johndoe@email.com",
}
```

## Database Schema
The system uses a single table structure:
```commandline
CREATE TABLE employees (
  id BIGINT PRIMARY KEY AUTO_INCREMENT,
  first_name VARCHAR(50) NOT NULL,
  last_name VARCHAR(50) NOT NULL,
  email VARCHAR(100) UNIQUE NOT NULL,
);
```

## Development

### Building the Application
```commandline
mvn clean package -DskipTests
```