package queue;

import java.util.Scanner;

public class testclassdemo {

    public static void checkColor2(int x, int y) {
        if (x >= 40 && x < 60) {
            if (y >= 70 && y <= 90) {
                System.out.println("blue");
            } else if (y > 90 && y <= 120) {
                System.out.println("green");
            } else if (y > 120 && y <= 140) {
                System.out.println("yellow");
            } else {
                System.out.println("red");
            }
        } else if (x >= 60 && x < 80) {

            if (y > 70 && y <= 120) {
                System.out.println("green");
            } else if (y > 120 && y <= 140) {
                System.out.println("yellow");
            } else {
                System.out.println("red");
            }
        } else if (x >= 80 && x < 90) {
            if (y > 70 && y <= 140) {
                System.out.println("yellow");
            } else {
                System.out.println("red");
            }
        } else if (x >= 90 && x < 100) {
            if (y > 70 && y <= 190) {
                System.out.println("red");
            }
        } else {
            System.out.println("Out");
        }

    }

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter Value of x: ");
//        int x = scanner.nextInt();
//        System.out.println("Enter Value of y: ");
//        int y = scanner.nextInt();
//        checkColor(x,y);
        int x, y;
        checkColor2(222,185);
        checkColor2(85,80);
        checkColor2(50,130);

        checkColor2(95,110);
        checkColor2(75, 75);
        checkColor2(85,145);
        checkColor2(0,120);


    }
}
