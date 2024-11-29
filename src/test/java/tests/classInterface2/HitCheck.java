package tests.classInterface2;

import classInterface2.Hit;
import classInterface2.Knife;
import classInterface2.Pistol;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class HitCheck {
    @Test
    @Tag("hit-check")
    @DisplayName("test hit multiply weapons")
    public void testHits(){
        String res = "";
        Pistol pistol = new Pistol();
        Knife knife = new Knife();
        ArrayList<Hit> hits = new ArrayList<Hit>();
        hits.add(pistol);
        hits.add(knife);
        for (Hit item:hits){
            res = res + item.hit();
        }
        Assertions.assertEquals(res, "Pistol Bang Bang!Knife Pr-Pr!");
    }
}
