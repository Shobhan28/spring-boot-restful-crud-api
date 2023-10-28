# Spring Boot, MySQL, JPA, Hibernate Rest API Tutorial

### Project Title: ###

Spring Boot RESTful CRUD API for Notes Application.

### Description: ###

Build Restful CRUD API for a simple Note-Taking application using Spring Boot, Mysql, JPA and Hibernate.
It allows users to create, read, update, and delete notes, providing a flexible and efficient way to manage personal or shared notes.


### Key Features: ###

➤ **CRUD Operations:**
 Users can perform the following CRUD operations on notes:
- **Create:**    Add new notes with a title, content, and timestamp.
- **Read:**      Retrieve notes by ID or list all available notes.
- **Update:**    Modify existing notes, including title and content.
- **Delete:**    Remove unwanted notes.


➤ **Data Validation:** Implement data validation to ensure the integrity and consistency of notes.

➤ **Authentication:** Add user authentication for secure access to user-specific notes.

➤ **Pagination:** Implement pagination for managing a large number of notes efficiently.

➤ **User-Friendly API:** Design an easy-to-use API with clear and consistent endpoints.

### Data Model:
A note consists of the following fields:

- Title (String)
- Content (Text)
- Creation Date (Timestamp)

## Requirements

1. Java - 1.8.x
2. Maven - 3.x.x
3. Mysql - 5.x.x
4. Spring Boot

## Steps to Setup

**1. Clone the application**

```bash
git clone https://github.com/callicoder/spring-boot-mysql-rest-api-tutorial.git
```

**2. Create Mysql database**
```bash
create database notes_app
```

**3. Change mysql username and password as per your installation**

+ open `src/main/resources/application.properties`

+ change `spring.datasource.username` and `spring.datasource.password` as per your mysql installation

**4. Build and run the app using maven**

```bash
mvn package
java -jar target/easy-notes-1.0.0.jar
```

Alternatively, you can run the app without packaging it using -

```bash
mvn spring-boot:run
```

The app will start running at <http://localhost:8080>.

## Explore Rest APIs

The app defines following CRUD APIs.

    GET /api/getnotes
    
    POST /api/createnotes
    
    GET /api/getnotesby/{noteId}
    
    PUT /api/updatenotes/{noteId}
    
    DELETE /api/deletenotes/{noteId}

You can test them using postman or any other rest client.

