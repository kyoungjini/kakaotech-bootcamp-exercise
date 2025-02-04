package animal;

public class Cat extends Animal{
    /* 생성자 */
    public Cat(String name, String color) {
        super(name, color);
    }

    /* 메소드 오버라이딩 */
    public void eat() {
        System.out.println("yummy fish!");
    }

    public void bark() {
        System.out.println(this.color + " " + this.name + " says meow!!");
    }
}
