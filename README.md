# confident-spring-02-IoC-basics
This repository is related to module 2 in Marco Behler's course "The confident Spring professional" https://www.marcobehler.com/ which I purchased in order to understand the fundamentals of Spring. The course starts with plain Java backend and introduces plain Spring features little by little, showcasing what Spring Boot hides under the hood. At the end of the course Spring Boot features are implemented.

## Learning goals
Introducing Spring Core features.    
- How to configure and start Spring framework.
- Replacing "Poor man's dependency injection" with Spring's dpependency injection framework.
- Basics of Spring Core features:    
@Configuration, @Beans, @Scopes, @Component, @ComponentScan  
@Autowired(constructor&field&setter injections), @Bean lifecycles  
Resources, Properties and Profiles.  

## Key takeaways
- ApplicationContext is central interface for Spring IoC
- ApplicationContext is constructed from @Configuration class
- Beans are accessed through applicationContext
- @Bean's scope is singleton by default (remember thread safety)
- Instead of configuring beans in config, use @Component (or Service/Repository/Controller/RestController which are also Components) and set @ComponentScan in @Configuration class
- Use constructor injection for mandatory and setter injection for optional dependencies.
- @Autowired not required after Spring 4.3, but can be used for clarity.
- Use @Bean with 3rd party libraries that don't have explicit Spring support.
- Lifecycle callbacks: @PostConstruct and @PreDestroy (remember .registerShutDownHook() )
- @PropertySource needs to be set in config file (remember, order matters if several), properties accessed through @Value
- @Profile("env"): Class will run only in specified profile (remember to set VM options)
- @PropertySource can be choosen to be used only when run in certain profile

## Getting Started

To run the application, you have two choices:
1. Run locally
2. Run in Docker

### Locally

1. Ensure all the dependencies are installed
2. Clone the repository  
3. Build the project using Maven: 
    ```sh
    mvn clean install
    ```
4. Run the application with: 
    ```sh
    java -jar target/pdfinvoices-1.0-SNAPSHOT.jar
    ```

### Run in Docker
1. Build the image:
    ```shell
    docker build . -t confident-02:latest     
    ```
2. Run the image:
    ```shell
    docker run -it -p 8080:8080 confident-02:latest 
    ```
3. Open the api in http://localhost:8080


## Documentation
Endpoints for local use:
- GET "/" returns html greeting
- GET "/invoices" returns all posted invoices as JSON
- POST "/invoices?user_id=jeff&amount=40" creates an invoice and returns it as JSON
- POST "/*" returns 404
