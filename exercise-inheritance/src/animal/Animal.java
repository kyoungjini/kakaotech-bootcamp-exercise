package animal;

public class Animal {
    /* 클래스의 속성 정의 */
    String name;
    String color;
    int age;

    /* 생성자 */
    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    /* 메소드 */
    public void eat() {
        System.out.println("yummy food!");
    }

    public void bark() {
        System.out.println(this.color + this.name + " says woof!");
    }
}
