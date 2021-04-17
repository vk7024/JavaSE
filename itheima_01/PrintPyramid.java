package com.itheima_01;

public class PrintPyramid {
    public static void main(String[] args) {
        int n = 9;
        int i = 0;
        for (i = 1; i <= n; i++) {

            //打印空格
            int cnt1 = n - i;
            while (cnt1 > 0) {
                System.out.printf("\t");
                cnt1--;
            }
            int cnt2 = 0;

            //打印左边数字
            for (cnt2 = 0; cnt2 < i; cnt2++) {
                System.out.printf("%4d", (int) Math.pow(2, cnt2));
            }
            //打印右边的数字
            cnt2--;
            if (i >= 2){
                while (cnt2 > 0){
                    System.out.printf("%4d", (int) Math.pow(2, cnt2 - 1));
                    cnt2 --;
                }
            }

            //换行
            System.out.println();


        }

    }
}


