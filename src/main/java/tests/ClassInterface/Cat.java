package tests.ClassInterface;

public class Cat extends Animal implements Pets{
    public String bark(){
        System.out.println("Cat bark");
        return "Cat bark";
    }

    public String play(){
        return "Play";
    }
}
