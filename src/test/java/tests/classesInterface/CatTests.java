package tests.classesInterface;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import tests.ClassInterface.Cat;

public class CatTests {
    @Test
    @Tag("test-interfaces")
    @Tag("test-cat")
    @Tag("test-cat-name")
    @DisplayName("Test Cat Name")
    public void CatNameTest(){
        Cat Cat1 = new Cat();
        Cat1.setName("Cat1Name");
        Assertions.assertEquals(Cat1.getName(),"Cat1Name");
    }

    @Test
    @Tag("test-interfaces")
    @Tag("test-cat")
    @Tag("test-cat-weight")
    @DisplayName("Test Cat weight")
    public void CatWeightTest(){
        Cat Cat1 = new Cat();
        Cat1.setWeight(10);
        Assertions.assertEquals(Cat1.getWeight(),10);
    }
}
