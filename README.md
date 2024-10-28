# confident-spring-02-IoC-basics
This repository is related to module 2 in Marco Behler's course "The confident Spring professional" https://www.marcobehler.com/ which I purchased in order to understand the fundamentals of Spring. The course starts with plain Java backend and introduces plain Spring features little by little, showcasing what Spring Boot hides under the hood. At the end of the course Spring Boot features are implemented.

Introducing Spring Core features, building on top of simple-webapp repository

## Learning goals
Adding plain Spring (not Boot) features to project.  
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


## Use
Endpoints for local use:
- GET "/" returns html greeting
- GET "/invoices" returns all posted invoices as JSON
- POST "/invoices?user_id=jeff&amount=40" creates an invoice and returns it as JSON
- POST "/*" returns 404
