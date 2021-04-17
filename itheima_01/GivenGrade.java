package com.itheima_01;

import java.util.Scanner;

/*
    1. 手动输入数组大小(学生总数)
        a. 创建对象
        b. 接受数据
        c. 把接收的数据作为数组大小
    2. 将成绩输入数组
        a. 创建对象
        b. 接受数据
        c. 遍历数组,把接收到的数据作为数组元素
    3. 找到数组最大值
    4. 用一个字符串数组存储成绩等级 A~F(这一步其实可以省略)
    5. 用if语句作出判断, 根据判断结构输出对应的数组元素
        a. 遍历数组
        b. 判断并输出(能否简洁?)
 */
public class GivenGrade {
    public static void main(String[] args) {

//        1. 手动输入数组大小(学生总数)
        System.out.print("输入学生总数: ");
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int [] arr = new int[len];
        System.out.println();

//        2.1 将成绩输入数组
        System.out.print("输入" + len + "个学生的成绩: ");
        Scanner sc1 = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc1.nextInt();
        }
        System.out.println();
        System.out.print(len + "个学生的成绩为: ");
        for (int e: arr) {
            System.out.print(e + " ");
        }
        System.out.println();

//        2.2 随机生成学生成绩
//        System.out.print(len + "个学生的成绩为: ");
//        for (int i = 0; i < arr.length; i++){5
//            arr[i] = (int)(Math.random() * 100) + 1;
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();

//        3. 找到数组最大值
        int maxIndex = 0;
        int temp = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (temp < arr[i]){
                temp = arr[i];
                maxIndex = i;
            }
        }
        int best = temp;
        System.out.println("Best 0f scores = " + best);

//        4. 用一个字符串数组存储成绩等级 A~F
        String [] line = {"A", "B", "C", "D", "E"};

//     5. 用if语句作出判断, 根据判断结构输出对应的数组元素
        for (int i = 0; i < arr.length; i++){
            if (arr[i] >= best - 10){
                System.out.println("学生" + i + "的分数为: " + arr[i] + ", " +
                                    "等级为: " + line[0]);
            }
            if (arr[i] < best - 10 && arr[i] >= best - 20){
                System.out.println("学生" + i + "的分数为: " + arr[i] + ", " +
                        "等级为: " + line[1]);
            }
            if (arr[i] < best - 20 && arr[i] >= best - 30){
                System.out.println("学生" + i + "的分数为: " + arr[i] + ", " +
                        "等级为: " + line[2]);
            }
            if (arr[i] < best - 30 && arr[i] >= best - 40){
                System.out.println("学生" + i + "的分数为: " + arr[i] + ", " +
                        "等级为: " + line[3]);
            }
            if (arr[i] < best - 40){
                System.out.println("学生" + i + "的分数为: " + arr[i] + ", " +
                        "等级为: " + line[4]);
            }
        }


    }
}
