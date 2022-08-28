package com.company;

import java.util.Scanner;

import static com.company.Area.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Area = scanner.nextLine();
        Area area = com.company.Area.valueOf(Area);


        switch (area){
            case Osh:
                System.out.println("Сулайман Тоо");
                break;
            case Batken:
                System.out.println("Айгул гулу");
                break;
            case Naryn:
                System.out.println("Нарын дарыясы");
                break;
            case Talac:
                System.out.println("Манас");
                break;
            case IssykKol:
                System.out.println("Ыссык-кол");
                break;
            case JalalAbad:
                System.out.println("fmc");
            case Chuy:
                System.out.println("Бишкек");
            default:
                System.out.println("Мындай область жок!");


        }

    }
}