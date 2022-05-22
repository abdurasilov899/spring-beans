package peaksoft.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import peaksoft.model.Animal;
import peaksoft.model.Dog;
import peaksoft.model.Timer;

@Configuration
@ComponentScan(basePackages = "peaksoft")
public class AppConfig {
    @Bean
    public Animal animal() {
        Dog dog = new Dog("Rex",4);
        return dog;
    }

    @Bean
    public Timer time() {
        return new Timer();
    }
}
