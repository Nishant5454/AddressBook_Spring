# Address Book Spring Boot API

## Overview
The Address Book API is a Spring Boot application that provides RESTful endpoints to manage contacts. It allows users to add, retrieve, update, and delete addresses via API calls.

## Features
- Create a new address
- Retrieve all addresses
- Retrieve a specific address by ID
- Update an existing address
- Delete an address

## Technologies Used
- Java 17
- Spring Boot
- Spring Data JPA
- MySQL
- Maven

## Installation

### Prerequisites
- Java 17+
- Maven
- MySQL (if using a persistent database)

### Steps to Run
1. Clone the repository:
   ```sh
   git clone https://github.com/Nishant5454/address-book-api.git
   cd address-book-api
   ```
2. Configure the database in `src/main/resources/application.properties`:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/addressbook
   spring.datasource.username=root
   spring.datasource.password=yourpassword
   spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
   spring.jpa.hibernate.ddl-auto=update
   ```
3. Build and run the application:
   ```sh
   mvn spring-boot:run
   ```

## API Endpoints

### Create Address
```http
POST /address/api
```
**Request Body:**
```json
{
  "name": "joha cena",
  "email": "johncena@example.com",
  "phone": "1234567890",
  "address": "123 Main St"
}
```

### Get All Addresses
```http
GET /address/api/get
```

### Get Address by ID
```http
GET /address/api/get/{id}
```

### Update Address
```http
PUT /address/api/put/{id}
```
**Request Body:**
```json
{
  "name": "John Doe Updated",
  "address": "456 New St"
}
```

### Delete Address
```http
DELETE /address/api/delete/{id}
```

## Testing with cURL
```sh
curl -X GET http://localhost:8080/address/api/get
```

## Branching Strategy
Each feature is developed in its own branch and merged into the `main` branch after review.

## Contributing
1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Commit your changes (`git commit -m 'Add feature'`).
4. Push to the branch (`git push origin feature-branch`).
5. Create a Pull Request.

## License
This project is licensed under the MIT License.
