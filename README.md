# 🎬 MovieProject

A Spring Boot REST API for managing movie data — ideal for learning and testing API requests using Postman. This project uses **MySQL** for data storage.

## 🚀 Features

- Add a new movie
- Get all movies
- Get a movie by ID
- Delete a movie by ID
- MySQL database integration

## 🛠 Tech Stack

- Java 17+
- Spring Boot
- Spring Data JPA
- MySQL
- Postman

## 🔌 MySQL Configuration

Update your `application.properties` as per your local MySQL setup:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/your_db_name
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
```
## 🧪 API Endpoints
### Method&nbsp;&nbsp;	 Endpoint&nbsp;&nbsp;	       Description  
GET	&nbsp; &nbsp; &nbsp;&nbsp; &nbsp; /movie/details&nbsp;&nbsp;	&nbsp;&nbsp;&nbsp; Fetch all movies  
GET	 &nbsp;&nbsp;  &nbsp;&nbsp;&nbsp; /movie/get/{id} &nbsp;&nbsp;&nbsp;&nbsp;	&nbsp;Get movie by ID  
POST  &nbsp;&nbsp; &nbsp;&nbsp;&nbsp;	/movie/add	  &nbsp;&nbsp;  &nbsp;&nbsp; &nbsp; Add a new movie  
DELETE&nbsp;&nbsp;&nbsp;&nbsp;	&nbsp;/movie/delete/{id}&nbsp;&nbsp;	&nbsp;&nbsp;&nbsp;Delete movie by ID  

## 🔁 Sample JSON for POST /movie/add
{
  "title": "Inception",
  "releaseDate": "2010-07-16"
}

Make sure releaseDate is mapped correctly to the database (preferably as java.time.LocalDate).

## 🚀 Run the Project
### 🧰 Prerequisites
Java 17+  
MySQL running locally  
Maven or compatible IDE 

## ▶️ Start the App
git clone https://github.com/Gunjan22Sri/MovieProject.git  
cd MovieProject  
mvn spring-boot:run  
Then test endpoints via Postman or any REST client.

## 🛠 Troubleshooting
If you get identifier must be manually assigned, make sure your @Id field is set properly (use @GeneratedValue if needed).

Confirm that the MySQL database and credentials match your config.  

MySQL must be running on the port you specified (default: 3306).  

## 📬 Contact
For queries or collaborations, feel free to connect with me on LinkedIn.

🧠 This project is made for learning and experimentation. Feel free to fork and extend!
