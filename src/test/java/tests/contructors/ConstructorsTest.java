package tests.contructors;

import io.restassured.internal.common.assertion.Assertion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import tests.constructors.Mini;

import java.awt.*;

public class ConstructorsTest {
    @Test
    @Tag("constructor")
    @Tag("constructor-empty")
    @DisplayName("test empty constructor")
    public void testEmptyConstructor(){
        Mini test1 = new Mini();
        Assertions.assertEquals(test1.color, Color.BLACK);
    }

    @Test
    @Tag("constructor")
    @Tag("constructor-color")
    @DisplayName("test color constructor")
    public void testColorConstructor(){
        Mini test1 = new Mini(Color.RED);
        Assertions.assertEquals(test1.color, Color.RED);
    }

    @Test
    @Tag("constructor")
    @Tag("constructor-size")
    @DisplayName("test size constructor")
    public void testSizeConstructor(){
        Mini test1 = new Mini(27);
        Assertions.assertEquals(test1.color, Color.cyan);
        Assertions.assertEquals(test1.size, 27);
    }
}
