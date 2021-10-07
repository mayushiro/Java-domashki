package com.company;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int work = 1; work <= 1000; ) {
            System.out.println("Введи первое число");
            double a = sc.nextDouble();
            System.out.println("Доступные операции:");
            System.out.println("+) Сложение");
            System.out.println("-) Вычитание");
            System.out.println("/) Деление");
            System.out.println("*) Умножение");
            String ans = sc.next();
            if (ans.equals("+")) {
                System.out.println("Введи второе число");
                double b = sc.nextDouble();
                System.out.print("Ответ: ");
                System.out.println(a + b);
            } else if (ans.equals("-")) {
                System.out.println("Введи второе число");
                double b = sc.nextDouble();
                System.out.print("Ответ: ");
                System.out.println(a - b);
            } else if (ans.equals("/")) {
                System.out.println("Введи второе число");
                double b = sc.nextDouble();
                System.out.print("Ответ: ");
                System.out.println(a / b);
            } else if (ans.equals("*")) {
                System.out.println("Введи второе число");
                double b = sc.nextDouble();
                System.out.print("Ответ: ");
                System.out.println(a * b);
            } else {
                System.out.println("Операция не поддерживается");
            }

            System.out.println("Продолжить вычисления Да/Нет?)");
            Scanner answer = new Scanner(System.in);
            String answw = answer.next();
            if (answw.equals("Да") || answw.equals("да")) {
                continue;
            } else if (answw.equals("Нет") || answw.equals("нет")) {
                break;
            } else {
                System.out.println("Начинай сначала, абоба");
                break;
            }
        }
    }
}
