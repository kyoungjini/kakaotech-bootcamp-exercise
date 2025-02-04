package animal;

public class Human extends Animal{
    /* 생성자 */
    public Human(String name, String color) {
        super(name, color);
    }

    /* 메소드 오버라이딩 */
    public void bark() {
        System.out.println(this.color + " " + this.name + " says 야 이 짜식아!!!");
    }
}
