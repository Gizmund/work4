package org.kratenok.task;


import java.util.Scanner;

public class Work2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите дату:");
        int a = scan.nextInt();
        switch (a) {
            case 31: {
                System.out.println("январь,март, май июль август октябрь декабрь");
            }
            case 30: {
                System.out.println("апрель, июнь, сентябрь, ноябрь");
                break;
            }
            default: {
                System.out.println("Дата есть во всех месяцах");
            }
        }


    }
}
