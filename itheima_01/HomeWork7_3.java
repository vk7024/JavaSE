package com.itheima_01;

import java.util.Scanner;

/*
    1. 初始化一个数组, 元素都为0, 数组下标为0~100;
    2. 依次读入n个数
    3. 把与数组下标对应的元素加一, 比如输入的是2, 就把arr[2] + 1;
    4. 输入结束时, 依次输出某个数出现了多少次
        这个数就是数组下标, 出现次数就是下标中的值
     */
public class HomeWork7_3 {
    public static void main(String[] args){
        int [] arr = new int[101];
        int t = -1;
        int cnt = 0;
        Scanner sc = new Scanner(System.in);
//        for (int e: arr) {
//            cnt ++;
//            System.out.print(e + " ");
//            if (cnt % 10 == 0){
//                System.out.println();
//            }
//        }

        //输入数据到数组
        while( t != 0){
            t = sc.nextInt();
            arr[t]++;
        }
        for (int i = 1; i < arr.length; i++){
            if (arr[i] != 0){
                System.out.println(i + "出现了" + arr[i] + "次");
            }
        }

    }

}