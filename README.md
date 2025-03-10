# Traini8 Backend Project

## Project Overview

The Traini8 Backend project is a Spring Boot application designed to manage training centers. The system allows users to create new training centers, store them in a database, and retrieve a list of all training centers with optional filtering. It features robust input validation and error handling, ensuring smooth data management.

This project meets the following key requirements:

- **Training Center Creation**: Allows creation of new centers with fields like `CenterCode`, `CenterName`, `Address`, `CoursesOffered`, etc.
- **Validation**: Proper validation for required fields using annotations.
- **Duplicate Handling**: Handles duplicate `CenterCode` entries with database constraints.
- **RESTful APIs**: Follows best practices and clean architecture.

## Features

- **Create Training Centers**: A POST API to create new training centers with fields like center name, center code, address, and contact details.
- **View Training Centers**: A GET API to retrieve a list of stored training centers, with optional filters for city and state.
- **Data Validation**: Uses annotations for validation, such as ensuring `CenterCode` is exactly 12 alphanumeric characters.
- **Exception Handling**: A global exception handler is implemented to handle validation errors and database constraint violations.
- **Database Integration**: MySQL database for persistence with ORM using Spring Data JPA.

## Technologies Used

- **Java**: Core programming language for business logic.
- **Spring Boot**: Framework for building the backend REST APIs.
- **Spring Data JPA**: ORM for database operations.
- **Hibernate**: For object-relational mapping.
- **MySQL**: Relational database for data storage.
- **Maven**: Project dependency management.
- **HikariCP**: Connection pooling for efficient database access.

## Evaluation Criteria

- **API Functionality**:
  - Both POST and GET APIs function properly.
  - Training centers are successfully saved to the database.
  - Validation rules are applied for required fields and data formats.
  
- **Validation and Exception Handling**:
  - All validations are annotation-based (e.g., `@NotNull`, `@Pattern`).
  - A global exception handler manages validation errors and duplicates.
  
- **Performance**:
  - APIs are designed with performance considerations, ensuring efficient database access.
  
- **Filter Implementation**:
  - The GET API supports optional filtering by city and state.
  
- **Project Structure and Architecture**:
  - Clean architecture and consistent naming conventions are followed.
  
- **Coding Practices**:
  - Code adheres to best practices with meaningful comments and proper formatting.

## API Endpoints

### 1. Create a Training Center (POST `/api/training-center`)

**Description**: Creates a new training center with required fields.

**Request Body (JSON format)**:

```json
{
  "id": 1,
  "centerCode": "WTC123456789",
  "centerName": "AI Training Center",
  "address": {
    "detailedAddress": "123 Main road",
    "city": "Chandigarh",
    "state": "Punjab",
    "pincode": "10001"
  },
  "studentCapacity": 100,
  "coursesOffered": ["AI", "ML"],
  "createdOn": 1625412345000,
  "contactEmail": "PNB@aitraining.com",
  "contactPhone": "1234567890"
}

```


### 2. Get All Training Centers (GET /api/training-center)
Description: Retrieves a list of all stored training centers. Optionally, it can filter by city or state.

Query Parameters:

city (Optional): Filter training centers by city.

state (Optional): Filter training centers by state.

Success Response (200 OK):    Convert this into markdown file

```json
[
  {
    "id": 1,
    "centerCode": "WTC123456789",
    "centerName": "AI Training Center",
    "address": {
      "detailedAddress": "123 Main road",
      "city": "Chandigarh",
      "state": "Punjab",
      "pincode": "10001"
    },
    "studentCapacity": 100,
    "coursesOffered": ["AI", "ML"],
    "createdOn": 1625412345000,
    "contactEmail": "PNB@aitraining.com",
    "contactPhone": "1234567890"
  }
]

```


Setup Instructions
Prerequisites
Java 17+: Make sure Java is installed on your machine.
MySQL: You need a MySQL database running locally or remotely.
Maven: Ensure Maven is installed for dependency management and project build.

## Steps

1.Clone the Repository:

git clone https://github.com/anshul302/Backend_Traini8_AnshulChouhan.git
cd Backend_Traini8_AnshulChouhan


2.Configure the Database: Edit the application.properties file with your MySQL credentials:

```json
spring.datasource.url=jdbc:mysql://localhost:3306/traini8db
spring.datasource.username=root
spring.datasource.password=yourpassword
```

3.Build the Project: Run the following commands to build the project and install dependencies:
```json
mvn clean install
```

4.Run the Application: Start the Spring Boot application:
```json
mvn spring-boot:run
```
5.Test the APIs: Use Postman or curl to test the POST and GET APIs.

Contact
For further information or any queries, please feel free to reach out:

Author: Anshul Chouhan
Email: anshulchouhn302@gmail.com




