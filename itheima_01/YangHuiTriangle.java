/*
    二维数组打印杨辉三角
            1
           1 1
          1 2 1
         1 3 3 1
        1 4 6 4 1
    1. 第1行有1个元素,第n行有n个元素
    2. 每行的第一个元素和最后一个元素都为1
    3. 从第三行开始, arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j]
 */
package Array;

public class YangHuiTriangle {
    public static void main(String[] args) {
    //1. 定义一个二维数组
        int[][] yangHui = new int[10][];

        //2. 对数组初始化, 并赋值
        for (int i = 0; i < yangHui.length; i++){

            // 第i行有 i+1 个元素
            yangHui[i] = new int[i + 1];

            //每行第一个和最后一个元素为1
            yangHui[i][0] = yangHui[i][i] = 1;

            //对每行非首位元素赋值
            for (int j = 1; j < yangHui[i].length -1; j++) {
                yangHui[i][j] = yangHui[i - 1][j - 1] + yangHui[i - 1][j];
            }
        }
        //3. 遍历数组输出
        for (int i = 0; i < yangHui.length; i++) {
            for (int j = 0; j < yangHui[i].length; j++){
                System.out.print(yangHui[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
