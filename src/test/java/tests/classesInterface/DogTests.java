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
}
