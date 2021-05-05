/*
    删除有序数组中重复的元素, 返回新数组的长度, 并打印出来
    解法: 采用双指针
    1. 使用左右两个指针arr[left]和arr[right], 右指针始终往右移
    2. 开始两指针都指向第一个元素, 记录新数组初始长度cnt = 1;
    3. 如果左指针 = 右指针, 左指针不动
       如果左指针 != 右指针, 左指针往右移一位, 并把右指针当前指向的值赋给左指针
       左指针每移动一次, cnt++;
    4. 遍历数组输出, i < cnt;
 */
package Array;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static int  removeDuplicates(int[] nums){
        if (nums == null)
        {
            return 0;
        }
        int cnt = 1; //记录新数组长度
        for (int left = 0, right = 0; right < nums.length; right++){
            if (nums[left] != nums[right])
            {
                left++;
                nums[left] = nums[right];
                cnt++;
            }
        }
        for (int i = 0; i < cnt; i++){
            System.out.print(nums[i] + " ");
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,5};
        int n = removeDuplicates(arr);
        System.out.println(n);


    }
}
