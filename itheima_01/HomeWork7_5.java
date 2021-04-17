package com.itheima_01;
/*
    1. 创建一个下标为0~100的数组(101个空房间), 初始化为0
    2. 依次读入10个数
    3. 把与下标值相等数组元素加一, 如输入的2, arr[2]++
    4. 遍历数组, 找出不为0的元素的个数
    5. 遍历数组, 找出不为0的数, 其值为数组下标
 */

import java.util.Scanner;

public class HomeWork7_5 {
    public static void main(String[] args) {

//  1. 创建一个下标为0~100的数组(101个空房间), 初始化为0
        int [] arr = new int[101];

//  2. 依次读入10个数
        System.out.print("Enter 10 numbers: ");
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int t = 0;
        while(cnt < 10){
            t = sc.nextInt();
            arr[t]++;   //把与下标值相等数组元素加一, 如输入的2, arr[2]++
            cnt++;
        }

//  4. 遍历数组, 找出不为0的元素的个数
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] != 0)
            {
                count ++;
            }
        }
        System.out.println("The number of distinct numbers is " + count);
//  5. 遍历数组, 找出不为0的数, 其值为数组下标
        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < arr.length; i++){
            if (arr[i] != 0)
            {
                System.out.print(i + " ");
            }
        }

    }
}
