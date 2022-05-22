package peaksoft.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class Dog extends Animal {
    private String name;
    private int age;
    private AnimalsCage animalsCage;

    public Dog() {
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog(AnimalsCage animalsCage) {
        this.animalsCage = animalsCage;
    }
}
