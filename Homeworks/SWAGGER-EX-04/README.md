# Hello There! 👋

For today task: Create a layered Spring Boot RESTful application that provides basic CRUD operations for managing Customer data. The application should include OpenAPI-compliant API documentation using the springdoc-openapi-starter-webmvc-ui dependency. This dependency also enables Swagger UI, so no additional configuration is required.

You may choose to simulate database operations using in-memory data structures such as Map or List. Using a real database is not mandatory.

The application should expose endpoints for the following operations:
•	Create a new customer

•	Retrieve a customer by ID

•	Retrieve all customers

•	Update an existing customer

•	Delete a customer

After completing the implementation, open the Swagger UI in your browser and share screenshots of the generated API documentation and the available endpoints. A sample CustomerDTO (DTO refers to Data Transfer Object) is shared in the next page.


## Steps:

### 1- Create DTO, serviceses, repositiories and controller (REST API) file for customer.

### 2- Create a main file for run the app (CustomerManagementApiApplication).

### 3- Add these dependencies for Swagger UI and lombok for auto generate repetitive codes.

```
<dependency>
			<groupId>org.projectlombok</groupId>
			<artifactId>lombok</artifactId>
			<version>1.18.38</version>
			<optional>true</optional>
			<scope>provided</scope>
</dependency>
 ```
 ```
<dependency>
			<groupId>org.springdoc</groupId>
			<artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
			<version>2.5.0</version>
 </dependency>
```


### 4- Change your port to your local host and run to access Swagger UI

![Screenshot_26](https://github.com/user-attachments/assets/237e9fed-1786-4267-a96a-94ba3486a600)
