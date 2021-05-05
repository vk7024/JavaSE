/*
    数组里除了一个元素, 其他都成对出现, 找出单独出现的元素

    解法: 使用异或运算
    异或运算特点:
    1. 0 异或 任何数 = 任何数
    2. 两个相同的数相异或 = 0
    3. 异或满足交换律和结合律
        a ⊕ b ⊕ a
      = b ⊕ a ⊕ a   交换律
      = b ⊕ (a ⊕ a) 结合律
      = b ⊕ 0
      = b

 */

package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int result = nums[0]; //从第一个数开始
        for (int i = 1; i < nums.length; i++)
        {
            result ^= nums[i]; //遍历数组和所有的数进行异或, 最后结果就是单独的数

        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,1, 2, 2, 3, 4,4};
        int num = singleNumber(arr);
        System.out.println(num);
    }
}
