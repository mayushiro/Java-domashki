package com.company;

import java.util.Scanner;

    public class task3 {
        public static void main(String[] args) {
            double a = 0.0;
            double b = 100.0;
            Scanner sc = new Scanner(System.in);
            System.out.println("Введи число для проверки");
            double t = sc.nextDouble();
            if (a <= t && t <= b) {
                System.out.println("Входит");
            } else {
                System.out.println("Не входит");
            }
        }
    }
