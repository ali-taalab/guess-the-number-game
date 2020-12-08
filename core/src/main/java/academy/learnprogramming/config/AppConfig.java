package academy.learnprogramming.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(GameConfig.class)
@ComponentScan(basePackages = "academy.learnprogramming") // if you don't specify package it will scan the package that has the class in it
public class AppConfig {
    // NO NEED FOR THIS CLASS
    // Bean Methods
    /* We no longer need it as we will use @Component with NumberGeneratorImpl, GameImpl and MessageGeneratorImpl

    @Bean
    public NumberGenerator numberGenerator() {
        return new NumberGeneratorImpl();
    }

    @Bean
    public Game game() {
        return new GameImpl();
    }

    @Bean
    public MessageGenerator messageGenerator() {
        return new MessageGeneratorImpl();
    }*/

}
