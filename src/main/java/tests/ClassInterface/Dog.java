package tests.ClassInterface;

public class Dog extends Animal implements Pets{
    public String bark(){
        System.out.println("Dog bark");
        return "Dog bark";
    }

    public String bark(int count){
        String result="";
        while(count>0){
            System.out.print("Bark");
            result=result+"Bark!";
            count=count-1;
        }
        return result;
    }

    public String play(){
        return "Play";
    }
}
