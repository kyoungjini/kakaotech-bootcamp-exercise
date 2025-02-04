import animal.*;

public class Main {
    public static void main(String[] args) {

        Animal myAnimal = new Animal("Bear", "군밤색");
        myAnimal.bark();
        System.out.println("----------------");

        Dog myDog = new Dog("두부", "white");
        myDog.eat();
        System.out.println("----------------");

        Cat myCat = new Cat("냐옹이", "묘한 색");
        myCat.eat();
        myCat.bark();
        System.out.println("----------------");

        Human myHuman = new Human("경진이", "갈색머리");
        myHuman.bark();
    }
}