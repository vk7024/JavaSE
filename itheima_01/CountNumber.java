package com.itheima_01;

import java.util.Scanner;

public class CountNumber {
    public static void main(String[] args) {
        System.out.println("请输入整数, 不指定数量");
        System.out.println("如果输入0则代表输入结束");
        System.out.println("0后面的数字不会进行统计");
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
//        System.out.println(s);


        //用运循环取出每一位字符
        int i = 0;
        int digit = 0;
        int negative = 0; //负数个数
        int positive = 0; //正数个数
        int sum = 0;
        float ave = 0;
        while(i < s.length()){

            //如果遇到0, 直接结束统计
            if (s.charAt(i) == '0'){
                System.out.println("统计结束");
                break;
            }

            //如果遇到空格, 结束本轮循环, 统计下一个字符
            if(s.charAt(i) == ' ') {
                i++;
                continue;
            }

            //如果遇到负号, 将负号的下一个字符作为负数统计
            if (s.charAt(i) == '-'){
                i++;
                digit = -(s.charAt(i) - '0');
                negative++;
                System.out.println(digit + " ");


            }else{
                digit = s.charAt(i) - '0';
                positive++;
                System.out.println(digit + " ");
            }
            sum += digit;
            i++;
        }
        ave =+ sum / (float)(negative + positive);
        System.out.println("正数有: " + positive + "个");
        System.out.println("负数有: " + negative + "个");
        System.out.println("总和 = " + sum);
        System.out.println("均值 = " + ave);
    }

}
