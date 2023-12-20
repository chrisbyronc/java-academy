What did you learn yesterday?

1. DI Dependency Injections
2. IoC Inversion of Control 
   1. Principle
   2. Container
3. Spring Beans
   1. Set operation for instantiating objects, return objects, object
4. Annotations
   1. @Bean
      1. Instantiation
   2. @Autowired
      1. Designates, auto injects specified dependencies
   3. @Component
      1. For classes that are part of a Spring context (container)
5. Spring Framework
   1. Foundation, set of tools and features
   2. Uses spring.xml or config
6. Springboot
   1. Preconfigured/opinionated spring
   2. Template to start
   3. Annotation based configuration only
   4. Scans beans automatically 


Today's Objectives

1. Cont. Springboot
2. Beans Injections
3. Configuration
4. Custom Properties


Agenda Today

1. Intro and Recap
2. Springboot we build
3. You do exercise
4. Break
5. Beans Injection
6. You do beans injections
7. Lunch
8. Springboot configuration lesson
9. Break
10. Self learn custom properties
11. Exericse
12. Recap and Q&A


What did you learn today?

1. properties
   1. application.properties - file to be stored
   2. key=value syntax
   3. hide file in .gitignore
2. injecting beans
   1. uses context to inject beans
3. commandLineRunner
   1. Runs program outside of main
4. different profiles require different data configs
5. map beans to profiles with @Profile annotation
6. Can name beans
   1. @Bean("name")
   2. @Qualifier
7. Database config
8. @Configuration("dev")
