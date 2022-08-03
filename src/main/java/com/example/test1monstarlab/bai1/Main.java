package com.example.test1monstarlab.bai1;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            double a = in.nextDouble();
            double b = in.nextDouble();
            double c = in.nextDouble();


            System.out.println(calcDelta(a, b, c));
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println("Nhập sai định dạng");
        }
        in.close();
    }

    public static double calcDelta(double a, double b, double c) {
        return b * b * 1.0 - 4 * a * c;
    }
}
