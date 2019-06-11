package java20190611;

public class ConstroctMenthod {
    String name;
    String sex;
    int age;

    //无参数的构造方法
//    ConstroctMenthod(){
//        name = "";
//        sex = "";
//        age = 0;
//    }
    //有参数的构造方法
    ConstroctMenthod(String name,String sex,int age){
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public static void main(String[] args) {
        ConstroctMenthod c = new ConstroctMenthod("aaa","nan",18);

        System.out.println(c.name);
        System.out.println(c.sex);
        System.out.println(c.age);
    }
}
