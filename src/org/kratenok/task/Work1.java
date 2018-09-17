package org.kratenok.task;

import java.util.Scanner;

public class Work1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("введите месяц:");
        String qwe = scan.next();
        switch (qwe) {
            case "март": {
            }
            case "май": {
            }
            case "июль": {
            }
            case "август": {
            }
            case "октябрь": {
            }
            case "декабрь": {
                System.out.println("количество дней 31");
                break;
            }
            case "апрель": {
            }
            case "июнь": {
            }
            case "сентябрь": {
            }
            case "ноябрь": {
                System.out.println("количество дней 30");
                break;
            }
            case "февраль": {
                System.out.println("количество дней 28");
                break;
            }


        }
    }
}

