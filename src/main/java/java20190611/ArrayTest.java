package java20190611;

public class ArrayTest {
    public static void main(String[] args){
        //创建数组和数组初始化
        byte[] byteArr = new byte[3];
        int[] intArr = {1,2,3,4,5};
        double[] doubleArr = new double[2];

        //也可以这样初始化
        doubleArr[0] = 1.1;
        doubleArr[1] = 2.1;

        int length = intArr.length;

        for (int i = 0 ; i < length ; i++){
            System.out.println(intArr[i]);
        }
    }
}
