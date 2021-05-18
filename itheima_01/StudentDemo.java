package com.practice_01;

import java.util.Random;
//学生测试类
public class StudentDemo {
    public static void main(String[] args) {
        //创建对象数组
        Student[] arr = new Student[20]; //创建20个学生对象
        for (int i = 0; i < arr.length; i++) {
            //为数组的每个元素创建对象
            arr[i] = new Student();
            arr[i].number = i + 1;
            arr[i].grade = (int) (Math.random() * 10) % 6 + 1; //随机生成年级, 范围在[1, 6]
            arr[i].score = (int) (Math.random() * 1000) % 100 + 1; //随机生成成绩, 在[1, 100]
        }

//        遍历学生数组
        travelArray(arr);
        System.out.println();

        //打印3年级的学生信息
        searchStudent(arr, 3);
        System.out.println();

        //从高到低对所有学生成绩排序,并输出(使用冒泡排序)
        bubbleSort(arr);
        travelArray(arr);




    }
    //遍历数组
    public static void travelArray(Student[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].show());
        }
    }

    //查找指定年级的学生信息并打印
    public static void searchStudent(Student[] arr, int grade){
        System.out.println(grade + "年级的学生有: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].grade == 3) {
                System.out.println(arr[i].show());
            }
        }
    }

    //根据成绩对Student数组排序 低 --> 高
    public static void bubbleSort(Student[] arr){
        System.out.println("将学生按成绩升序输出: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1].score > arr[j].score) {
                    int temp = arr[j - 1].score;
                    arr[j - 1].score = arr[j].score;
                    arr[j].score = temp;
                }
            }
        }
    }
}

class Student {
    //成员变量
    int number;
    int grade;
    int score;

    //构造方法
    public Student() {

    }

    //成员方法
    public String show(){
        return "学号: " + number + " " + "年级: " + grade + " " + "成绩: " +  score;
    }

}



