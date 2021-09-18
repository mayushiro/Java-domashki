package com.company;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Выбери, какой объем фигуры тебе посчитать" +
                "\n1)Параллелепипеда 2)Шара 3)Цилиндра");
        double x = in.nextDouble();
        if(x == 1) {
            Scanner scan1 = new Scanner(System.in);
            System.out.println("Введите длину");
            double a = scan1.nextDouble();
            System.out.println("Введите ширину");
            double b = scan1.nextDouble();
            System.out.println("Введите высоту");
            double c = scan1.nextDouble();
            scan1.close();
            System.out.println("Объём параллелипипеда равен:"+a*b*c);
        }
        else if(x == 2){
            Scanner scan2 = new Scanner(System.in);
            System.out.println("Введите радиус");
            double r = scan2.nextDouble();
            System.out.println("Объём шара равен:"+4*Math.PI*Math.pow(r,3)/3);
        }
        else if(x == 3){
            Scanner scan3 = new Scanner(System.in);
            System.out.println("Введите радиус");
            double r = scan3.nextDouble();
            System.out.println("Введите высоту");
            double h = scan3.nextDouble();
            System.out.println("Объем цилиндра равен"+2*Math.PI*Math.pow(r,2)*h);
        }
    }
}
