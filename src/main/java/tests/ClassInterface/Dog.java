package tests.ClassInterface;

public class Dog extends Animal implements Pets{
    public String bark(){
        System.out.println("Dog bark");
        return "Dog bark";
    }

    public String play(){
        return "Play";
    }
}
