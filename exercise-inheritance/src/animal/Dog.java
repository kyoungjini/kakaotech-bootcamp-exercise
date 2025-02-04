package animal;

public class Dog extends Animal{
    /* 생성자 */
    public Dog(String name, String color) {
        /* super - 부모 클래스의 생성자 호출 */
        super(name, color);
    }

    /* 메소드 오버라이딩 */
    public void eat() {
        System.out.println("yummy water!");
    }
}
