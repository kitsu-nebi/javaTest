package tests.book;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class junTest {
    @Test
    @Tag("jun-test-name")
    @DisplayName("Test Jun Name")
    public void nameCheck(){
       jun test = new jun();
       System.out.println("Jun name is"+ test.name);
    }
}
