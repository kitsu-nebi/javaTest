package tests.classesInterface;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import tests.ClassInterface.Dog;

public class DogTests {
    @Test
    @Tag("test-interfaces")
    @Tag("test-dog")
    @Tag("test-dog-name")
    @DisplayName("Test Dog Name")
    public void dogNameTest(){
        Dog dog1 = new Dog();
        dog1.setName("Dog1Name");
        Assertions.assertEquals(dog1.getName(),"Dog1Name");
    }

    @Test
    @Tag("test-interfaces")
    @Tag("test-dog")
    @Tag("test-dog-weight")
    @DisplayName("Test Dog weight")
    public void dogWeightTest(){
        Dog dog1 = new Dog();
        dog1.setWeight(10);
        Assertions.assertEquals(dog1.getWeight(),10);
    }

    @Test
    @Tag("test-dog")
    @Tag("test-array-dog")
    @DisplayName("Test Dog name in list")
    public void dogsArrayTest(){
        Dog[] dogs = new Dog[3];
        dogs[0]=new Dog();
        dogs[1]=new Dog();
        dogs[0].setName("First");
        dogs[1].setName("Second");
        dogs[2]=dogs[1];
        Assertions.assertEquals(dogs[2].getName(),"Second");
    }

    @Test
    @Tag("test-dog")
    @Tag("test-dog-bark-3")
    @DisplayName("Test Dog bark 3 times")
    public void dogBarkCountTest(){
        Dog dog1 = new Dog();
        Assertions.assertEquals(dog1.bark(3),"Bark!Bark!Bark!");
    }
}
