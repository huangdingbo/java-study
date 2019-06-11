package java20190611;

public class TwoArr {
    public static void main(String[] args) {
        //声明多维数组(第一种方式)
        int[][] arr1 = new int[5][5];
        //第二种方式
        int[][] arr2 = {
                {1,3,6},
                {2,5,8,9},
                {5,7,1,4,5,7,9}
        };
        //遍历二维数组
        for (int i = 0 ; i < arr2.length ; i++){
            for (int j = 0 ; j < arr2[i].length ; j++){
                System.out.println(i+"-"+j+"值为："+arr2[i][j]);
            }
        }
    }
}
