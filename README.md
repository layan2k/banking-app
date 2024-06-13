## Project Name
Banking App

## Description
This is a simple (mini) banking application api developed using Java and Spring Boot.

## Technologies Used
- Java 17
- Spring Boot 3.3.0
- MySQL
- Maven
- Lombok

## Features
- Transfer money between accounts
- Check account balance
- Get all accounts
- Delete an account

## Setup
To run this project, you need to have Java and Maven installed on your machine.

1. Clone the repository:

```bash
git clone https://github.com/layan2k/banking-app.git
```

2. Navigate to the project directory:

```bash
cd banking-app
```

3. Add application.properties file in the src/main/resources directory and add the following properties:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/banking_app?createDatabaseIfNotExist=true
spring.datasource.username=root
spring.datasource.password=root
spring.jpa.hibernate.ddl-auto=update
```


4. Build the project:

```bash
mvn clean install
```
5. Run the application:

```bash
mvn spring-boot:run
```

## API Endpoints
- Transfer money: `POST /api/v1/accounts/transfer`
- Check balance: `GET /api/v1/accounts/{id}/balance`
- Get all accounts: `GET /api/v1/accounts/all`
- Delete an account: `DELETE /api/v1/accounts/{id}`

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

## License
[MIT](https://github.com/layan2k/banking-app/blob/master/LICENSE)

