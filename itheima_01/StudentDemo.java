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
            arr[i].grade = (int) (Math.random() * 10) % 3 + 1; //随机生成年级, 范围在[1, 3]
            arr[i].score = (int) (Math.random() * 1000) % 100 + 1; //随机生成成绩, 在[1, 100]
        }
        //打印3年级的学生信息
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].grade == 3) {
                System.out.println("学号: " + arr[i].number + " " +
                        "年级: " + arr[i].grade + " " +
                        "成绩: " + arr[i].score);
            }
        }
        System.out.println();
        System.out.println("学生排序: ");
        //从高到低对所有学生成绩排序,并输出(使用冒泡排序)
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1].score > arr[j].score) {
                    int temp = arr[j - 1].score;
                    arr[j - 1].score = arr[j].score;
                    arr[j].score = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("学号: " + arr[i].number + " " +
                    "年级: " + arr[i].grade + " " +
                    "成绩: " + arr[i].score);
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
}



