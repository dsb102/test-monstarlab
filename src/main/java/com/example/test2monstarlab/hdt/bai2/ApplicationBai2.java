package com.example.test2monstarlab.hdt.bai2;

import java.text.ParseException;
import java.util.Scanner;

public class ApplicationBai2 {
    public static void main(String[] args) throws ParseException {
        TestCandidate testCandidate = new TestCandidate();
        Scanner in = new Scanner(System.in);
        testCandidate.insert();
        testCandidate.showInfoByScore(1);
    }
}
