package tests.constructors;

import java.awt.*;

public class Mini extends Car{
    public Color color;

    public Mini(Color c){
        System.out.println("Mini creation with color"+c.toString());
        color=c;
    }

    public Mini(){
        this(Color.BLACK);
        System.out.println("Mini creation with this");
    }

    public Mini(int siz){
        super(siz);
        color=Color.cyan;
        System.out.println("Mini creation with super");
    }
}
