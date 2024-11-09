package tests.classesInterface;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import tests.ClassInterface.Cat;
import tests.ClassInterface.Dog;
import tests.ClassInterface.Pets;

import java.util.ArrayList;

public class PetsTests {
    public String returnBark(Pets pet){
        return pet.bark();
    }
    @Test
    @Tag("test-interfaces")
    @Tag("test-pets")
    @Tag("test-pets-barks")
    @DisplayName("Test pets Barks")
    public void petsBarkTest(){
        Cat cat1 = new Cat();
        Dog dog1 = new Dog();
        assertEquals(returnBark(cat1),"Cat bark");
        assertEquals(returnBark(dog1),"Dog bark");
        assertEquals(cat1.bark(),"Cat bark");
        assertEquals(dog1.bark(),"Dog bark");
    }


    @Test
    @Tag("test-interfaces")
    @Tag("test-pets")
    @Tag("test-pets-barks")
    @DisplayName("Test pets Play")
    public void petsPlayTest(){
        Cat cat1 = new Cat();
        Dog dog1 = new Dog();
        ArrayList<Pets> pets = new ArrayList<Pets>();
        pets.add(dog1);
        pets.add(cat1);
        for (Pets item:pets) {
            System.out.println(item.play());
            assertEquals(item.play(),"Play");
        }
    }
}
