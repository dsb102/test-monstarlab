package com.example.test2monstarlab.hdt.bai3;

import java.util.Scanner;

public class ApplicationBai3 {
    public static void main(String[] args) {
        String menu = "Chọn 1 chức năng \n" +
                "1. Add student \n" +
                "2. Edit Student by id \n" +
                "3. Delete Student by id \n" +
                "4. Sort Student by gpa \n" +
                "5. Sort Student by name \n" +
                "6. Show Student \n" +
                "0. Exit \n";

        Scanner in = new Scanner(System.in);
        TestStudent testStudent = new TestStudent();
        int choice = 0;
        do {
            System.out.println(menu);
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    testStudent.addStudent();
                    break;
                case 2:
                    testStudent.editStudent(in.nextInt());
                    break;
                case 3:
                    testStudent.editStudent(in.nextInt());
                    break;
                case 4:
                    testStudent.sortByGPA();
                    break;
                case 5:
                    testStudent.sortByName();
                    break;
                case 6:
                    testStudent.showStudent();
                    break;
            }
        } while (choice != 0);
    }
}
