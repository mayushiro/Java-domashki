package com.company;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    static String[] Name = {"Лера", "Лиза", "Дима", "Егор", "Настя"};

    public static void main(String[] args) {

        System.out.println("Введите имя:");
        String s = sc.nextLine();

        int control = 0;

        for (int i = 0; i < Name.length; i++) {
            if (Name[i].equals(s)) {
                System.out.println("Имя есть в массиве.");
                control++;
                break;
            }
        }
        if (control == 0)
            System.out.println("Имени нет в массиве.");
    }
}
