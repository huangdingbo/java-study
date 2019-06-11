package java20190611;

import java.util.Scanner;

/**
 *学生成绩管理案例
 */
public class ScoreManager {
    public static void main(String[] args) {
        int student;
        int sum = 0;
        double avg = 0.0;
        double[] arr = new double[10];

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入前十名的学生成绩");

        for (student = 0 ; student < arr.length ; student++){
            arr[student] = sc.nextDouble();

            sum += arr[student];
        }

        avg = sum/arr.length;

        System.out.println("平均成绩是："+avg);

        for (student = 0 ; student < arr.length ; student++){
            if (arr[student] < 60){
                System.out.println("第"+(student+1)+"个学生成绩不合格");
            }else {
                System.out.println("第"+(student+1)+"个学生成绩合格");
            }
        }
    }
}
