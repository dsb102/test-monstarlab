package com.example.test1monstarlab.bai4;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        String menu = "Chọn 1 thao tác\n" +
                "1. Insert news\n" +
                "2. View list news\n" +
                "3. Average rate\n" +
                "4. Exit\n";

        Scanner in = new Scanner(System.in);
        List<News> listNews = new ArrayList<>();
        int choice = 0;
        do {
            System.out.println(menu);
            choice = in.nextInt();
            in.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Input info news");
                    News news = new News(
                        in.nextLine(),
                        in.nextLine(),
                        in.nextLine(),
                        in.nextLine()
                    );
                    System.out.println("Input three voting");
                    int rateList[] = new int[3];
                    for (int i = 0; i < 3; i++) {
                        rateList[i] = in.nextInt();
                    }
                    news.setRateList(rateList);
                    news.caclate();

                    listNews.add(news);
                    break;
                case 2:
                    System.out.println("Info news:");
                    listNews.forEach(x -> x.display());
                    break;
                case 3:
                    System.out.println("Average rate");
                    listNews.forEach(x-> {
                        x.caclate();
                        x.display();
                    });
                    break;
            }

        } while (choice != 4);
    }
}
