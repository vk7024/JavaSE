package com.itheima_01;

public class IsPrime {
    public static void main(String[] args) {

        System.out.print(2 + " ");    //2是素数, 直接输出
        int cnt = 1;  //计数器

        //判断是不是素数
        for (int i = 1; cnt < 100; i = i + 2) {
            int isPrime = 1; //素数标志
            if (i == 1) continue; //1不是素数, 跳过
            for (int j = 2; j < i; j++) {
                if (i == 2) continue;
                if (i % j == 0) {
                    isPrime = 0;
                    break;
                }
            }
//            if (isPrime == 1){
//                //测试是不是素数
//                cnt ++;
//                System.out.print( i + " ");
//                if (cnt % 10 == 0)
//                    System.out.println();
//            }


            //判断是不是回文素数
            if (isPrime == 1) {
                int tempPrime = i;
                int temp = 0;
                while (tempPrime > 0) {
                    temp = temp * 10 + tempPrime % 10;
                    tempPrime = tempPrime / 10;
                }
                if (temp == i) {
                    cnt++;
                    System.out.print(i + " ");
                    if (cnt % 10 == 0)
                        System.out.println();
                }
            }

        }
    }
}


