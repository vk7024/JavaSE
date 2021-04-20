/*
    原地消除数组重复的元素, 把不重复的元素, 并把不重复的元素放进新的数组
    1. 用两层for循环, 第一层for(i = 0; i < len; i++),
                    第二层for(j = i; j < len; j++)
       a. 第二层for循环遍历数组, 用来比较是否有和arr[i]一样的, 有一样的就把它置0
    2. 使用双指针, 把为0的元素移除
       a. 右指针right 指向当前将要处理的元素，左指针left 指向下一个将要赋值的位置
       b. 如果右指针指向的元素不等于0，它一定是输出数组的一个元素，我们就将右指针指向的元素复制到左指针位置，然后将左右指针同时右移
       c. 如果右指针指向的元素等于0，它不能在输出数组里，此时左指针不动，右指针右移一位。


 */

package com.itheima_01;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveSameElem {
    public static void main(String[] args) {

        //定义一个大小为10的数组
        int [] arr = new int[10];

        System.out.print("请输入10个非0整数: ");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        //调用方法, 将重复元素置0
        setZeroForDuplicates(arr);

        //调用方法, 将值为val的元素移除, 返回新数组的长度
        int length = removeElement(arr, 0);

        System.out.print("去重后的数是: ");
        for (int i = 0; i < length; i++)
        {

            System.out.print(arr[i] + " ");
        }

    }
    //将重复的元素置0
    public static void setZeroForDuplicates(int [] arr){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 0) continue; //跳过为0的项
            for (int j = i + 1; j < arr.length; j++){ //遍历i之后的元素, 把相同的置0
                if (arr[i] == arr[j]){
                    arr[j] = 0;
                }
            }
        }
//        System.out.println("置零之后: ");
//        System.out.println(Arrays.toString(arr));
    }

    //删除数组中的某一元素, 并返回新数组的长度
    public static int removeElement(int [] arr, int val){
        int i = 0; //相当于左指针
        for (int j = 0; j < arr.length; j++){
            if (arr[j] != val)
            {
                arr[i] = arr[j];
                i++;
            }
        }
        return i; //此时 i 即为新数组长度
    }
}

