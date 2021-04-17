package com.itheima_01;

import java.util.Scanner;

public class IsValidCard {
    public static void main(String[] args) {
        System.out.println("请输入银行卡号: ");
        Scanner input = new Scanner(System.in);
        long cardNumber = input.nextLong();

        //定义一个变量, 用来判断卡号是否合法, 初始认为不合法
        int flag = 0;

        //调用sumOfEven方法, 计算从右往左偶数位的和
        int sumOfEven = sumOfEven(cardNumber);

        //调用sumOfOdd方法, 计算从右往左奇数位的和
        int sumOfOdd = sumOfOdd(cardNumber);

        if ((sumOfEven + sumOfOdd) % 10 == 0) {

            //调用getSize方法, 判断卡号位数是否合法
            flag = getSize(cardNumber);

            if (flag == 1) {

                //调用getPrefix方法, 判断卡号前缀是否合法
                flag = getPrefix(cardNumber);

                if (flag == 1) {
                    System.out.println(cardNumber + "是合法卡号");
                } else {
                    System.out.println(cardNumber + "不是合法卡号");
                }
            } else {
                System.out.println(cardNumber + "不是合法卡号");
            }

        } else {
            System.out.println(cardNumber + "不是合法卡号");
        }

    }


    //计算偶数位的和
    public static int sumOfEven(long number) {
        int sum = 0;
        while (number > 0) {
            long temp = number;
            long even = temp / 10 % 10;

            if (even * 2 >= 10) {
                sum += (int) even * 2 / 10 + (int) even * 2 % 10;
            } else {
                sum += even * 2;
            }
            number /= 100;
        }
        return sum;
    }

    //计算奇数位的和
    public static int sumOfOdd(long number) {
        int sum = 0;
        while (number > 0) {
            long temp = number;
            long odd = temp % 10;
            sum += (int) odd;

            number /= 100;

        }
        return sum;
    }

    //计算卡号长度
    public static int getSize(long number) {

        //将数字转化为字符串
        String number_S = String.valueOf(number);

        //判断卡号长度是否合法
        int size = number_S.length();
        if (size >= 13 && size <= 16) {
            return 1;
        } else {
            return 0;
        }
    }

    //判断卡号前缀是否合法
    public static int getPrefix(long number) {

        //将数字转化为字符串
        String number_S = String.valueOf(number);

        if (number_S.startsWith("37") || number_S.startsWith("4") || number_S.startsWith("5") || number_S.startsWith("6")) {
            return 1;
        } else {
            return 0;
        }

    }

}






