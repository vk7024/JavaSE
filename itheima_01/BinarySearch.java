/*

    二分查找
        1. 定义一个数组并初始化
        2. 对数组进行排序(选择排序)
           a. 令当前循环的第一个数是最小值currentMin
           b. 每轮循环找出最小值和最小值的下标
           c. 判断找到的最小值和第一个数是否相等, 不相等就交换两数的位置
        3. int left = 0; int right = len - 1;
        4. key = 13;
        5. mid = (right + left) / 2;
        6. 判断 arr[mid] < key?
           是 left = mid + 1;
           否 right = mid - 1;
        7. left <= right 时执行循环

 */
package Array;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {

        //定义一个大小为10的数组
        int[] arr = {15, 8, 17, 14, 17, 20, 19, 1, 9, 13};
        System.out.println("初始数组为: ");
        System.out.println(Arrays.toString(arr));

        //调用SelectSort方法来排序
        SelectSort(arr);
        System.out.println("升序排列后的数组为: ");
        System.out.println(Arrays.toString(arr));

        //调用BinarySearch方法来查找某一元素
        int key = 10;
        int ret = BinarySearch(arr, key);
        if (ret != 0){
            System.out.println(key + "找到了");
        }else{
            System.out.println(key + "没找到");
        }


    }

    //选择排序, 最后一个不用排序
    public static  void SelectSort(int [] arr) {
        for (int j = 0; j < arr.length - 1; j++) {
            //找出每轮循环的最小值
            int min = arr[j];
            int min_index = j;

            for (int i = j + 1; i < arr.length; i++) {
                if (min > arr[i]) {
                    min = arr[i];
                    min_index = i;
                }
            }
            //如果每轮循环的第一位不是最小值, 就把它和最小值位置互换
            if (arr[j] != min) {
                arr[min_index] = arr[j];
                arr[j] = min;
            }
        }
    }

    //二分查找
    public static int BinarySearch(int[] arr, int key){
        int left, right;
        left = 0;
        right = arr.length - 1;
        while(left <= right){
            int mid = (right + left) / 2;
            if(arr[mid] < key)
            {
                left = mid + 1;
            }else if(arr[mid] > key){
                right = mid - 1;
            }else{
                //找到之后, 结束循环
               return key;
            }
        }
        //没找到返回0
        return 0;
    }
}

