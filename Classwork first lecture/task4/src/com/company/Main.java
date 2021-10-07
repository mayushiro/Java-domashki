package com.company;

import java.util.Scanner;

public class task4 {
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

        System.out.println("Провести проверку с другим числом?");
        Scanner answer = new Scanner(System.in);
        String ans = answer.next();
        if (ans.equals("Да") || ans.equals("да")) {
            continue;
        } else if (ans.equals("Нет") || ans.equals("нет")) {
            break;
        } else {
            System.out.println("Ты дурак или что? Пиши что сказано");
            break;
        }
    }
}
