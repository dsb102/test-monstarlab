package com.example.test1monstarlab.bai2;


import java.util.Scanner;

public class CostElectric {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfElectric = in.nextInt();
        System.out.println(getCost(numberOfElectric));

    }

    public static long getCost(int numOfElec) {
        long cost = 0;

        if (numOfElec >= 25) {
            cost = 25 * 1000;
            numOfElec -= 25;
        } else {
            cost += (numOfElec * 1000);
            numOfElec = 0;
        }

        if (numOfElec >= 50) {
            cost += 50 * 1250;
            numOfElec -= 50;
        } else {
            cost += numOfElec * 1250;
            numOfElec = 0;
        }

        if (numOfElec >= 75) {
            cost += 75 * 1800;
            numOfElec -= 75;
        } else {
            cost += numOfElec * 1800;
            numOfElec = 0;
        }

        cost += numOfElec * 2500;

        return cost;
    }
}
