package com.itheima_01;

import java.util.Random;

public class RandomNumberDemo {
    public static void main(String[] args) {

        //定义两个随机数,并求和
        Random r = new Random();
        int a = r.nextInt(6) + 1;
        int b = r.nextInt(6) + 1;
//        int a = 4;
//        int b = 4;
        int sum = a + b;

        switch (sum){
            case 2:
            case 3:
            case 12:
                System.out.println("You rolled " + " " + a + " + " + b + " = " + sum);
                System.out.println("You lose");
                break;

            case 7:
            case 11:
                System.out.println("You rolled " + " " + a + " + " + b + " = " + sum);
                System.out.println("You win");
                break;

            case 4:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
                System.out.println("You rolled " + " " + a + " + " + b + " = " + sum);
                System.out.println("point is" + " " + sum);
                int point = sum;
//                Random r = new Random();


                //确定点数后一直循环, 直到满足条件
                while(true)
                {
                    a = r.nextInt(6) + 1;
                    b = r.nextInt(6) + 1;
                    sum =  a + b;
//                    System.out.println("sum = " + sum);

                    //判断新点数是否和原来点数一样, 是就赢了
                    if(sum == point)
                    {
                        System.out.println("You rolled " + " " + a + " + " + b + " = " + sum);
                        System.out.println("You win");
                        break;

                        //判断新点数是否 = 7,是就输了
                    }else if(sum == 7){
                        System.out.println("You rolled " + " " + a + " + " + b + " = " + sum);
                        System.out.println("You lose");
                        break;
                    }
                }
        }

    }

}

