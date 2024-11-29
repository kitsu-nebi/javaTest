package tests.constructors;

public class Car {
    public int size;

    public Car(){
        System.out.println("Car created");
    }

    public Car(int siz){
        size=siz;
        System.out.println("Car created with size="+siz);
    }
}
