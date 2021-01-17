# contact api (spring)
## This is the repository for the Java API exercise.

# Summary
This is a simple RESTful API project that implements the following endpoints:

|Http Method        | Route          | Description |
|------------------ |----------------|-------------|
|GET  |	 /contacts	|  List all contacts
|POST |	 /contacts	|  Create a new contact
|PUT	|  /contacts/{id}  |	Update a contact
|GET	|  /contacts/{id}	 | Get a specific contact
|DELETE| /contacts/{id}	 | Delete a contact
|GET	 | /contacts/call-list |	Get a call list (this has a different structure than normal contacts)

## Building and Running
The project is implemented as a simple Gradle project that makes use of Spring Boot.  The dependencies for the application are simple and only consist of:
* Spring Starter Web
* Spring Data JPA
* H2

The project can be built using either Eclipse or IntelliJ (or any other IDE capable of importing a Gradle project).  Running from within each of the IDEs requires a minimal amount of setup.

From the command-line the following command will launch the application:
```
gradle bootRun
```
As the project is built using Spring Boot, a special class ```LoadInitialData``` is present that is marked with the ```@Configuration``` on the class and ```@Bean``` on a method that returns an instance of ```CommandLineRunner```.  This method is ran before the ```main``` method of the Spring Boot application is used to generate a small sample dataset. 

### Port Setting
Instead of running on port 8080 (the default tomcat port) I have used the ```application.properties``` file to set the server to listen on port 8083.  So when running locally the URL will be: ```localhost:8083/contacts```

### Implementation Notes
* Because of how the sample data was created and some inconsistances around that, the ```CascadeType.ALL``` setting was not used on the ```@OneToMany``` relationship of ```Contact```s to ```Phone``` objects.  The addition/removal of this collection's objects was handled manually.

* The application uses the H2 in-memory database; each run will start with the sample data mentioned above and will be removed once the application is shut down.

* Simple repositories were used as the specification was only data in/data out, and the overall exercise was loosely time-boxed.  A more thorough way that would include or provide for business logic is to use Service classes (implemented as interfaces/concrete objects) and have the controller interact with the service interface, which uses a repository interface.  The use of interfaces in this manner would allow for unit testing of the business logic with a mocking framework.  Later expansions to this project may include these features.
