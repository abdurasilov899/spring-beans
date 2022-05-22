package peaksoft.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class AnimalsCage {

    @Autowired
    private Animal animal;

    @Autowired
    private Timer timer;

    @Autowired
    public AnimalsCage getAnimal(@Qualifier("dog") Animal animal) {
        this.animal = animal;
        return null;
    }

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(new Timer().getTime());
        System.out.println("________________________");
    }


}
