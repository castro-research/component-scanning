Baseado no [Inside the Spring Container > Initialization Phase (Part 2)](https://spring.academy/courses/spring-framework-essentials/lessons/spring-essentials-spring-container-initialization-2)

![lifecycle](./.assets/lifecycle.png)

A idéia é explorar os limites e entender o ciclo de vida.

Ponto 0: 

Com o AppConfig, UserService, e Main, o App compila sem problemas.

Não estamos usando nada do spring, muito menos os beans. Então as classes só estão no mesmo package.

Ponto 1:

```java
UserService service = context.getBean(UserService.class);
```

Para o Spring registrar o UserService automaticamente, pode fazer de duas formas:

1 - Via Config

No AppConfig.java eu tenho a instancia via @bean

```java
@Bean
public UserService userService() {
    return new UserService();
}
```

Spring -> Encontra AppCofig -> executa o @Bean -> Cria o UserService

-------

2 - Via `@Component`