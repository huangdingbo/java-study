package java20190611;

public class Client {
    public static void main(String[] args) {
        People p = new People();

        System.out.println(p.getAge(18));

        System.out.println(p.sex);

        System.out.println(p.work());
    }
}
