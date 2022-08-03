package com.example.test2monstarlab.coban;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
//        Bai1();
        Bai2();
//        Bai3();
//        Bai4();
//        Bai5();
    }

    public static void Bai1() {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        System.out.println(number > 0 ? "Đây là số nguyên dương" : "Đây là số nguyên âm");
    }

    static HashMap<String, String> map = new LinkedHashMap<>();
    static HashMap<Integer, String> map1 = new LinkedHashMap<>();

    public static void Bai2() {
        /*
        * Ý tưởng: đọc 3 số một. Cộng vào đầu chuỗi cho đủ độ dài bội 3. Ví dụ 13124623 -> 013124623
        * thì đọc 623 trước rồi đọc 124 + nghìn
        * đọc 013 + triệu
        * loại bỏ cách đọc 0.
        * */
        Scanner in = new Scanner(System.in);
//        long number = in.nextLong();
//        StringBuilder numString = new StringBuilder(String.format("%d", number));
//        String numString = String.format("%d", number);
        String numString = in.nextLine();


        map.put("0", "không");
        map.put("1", "một");
        map.put("2", "hai");
        map.put("3", "ba");
        map.put("4", "bốn");
        map.put("5", "năm");
        map.put("6", "sáu");
        map.put("7", "bảy");
        map.put("8", "tám");
        map.put("9", "chín");

        map1.put(9, "tỷ"); map1.put(6, "triệu"); map1.put(3, "nghìn"); map1.put(0, "");

        while (numString.length() % 3 != 0) {
            numString = "0" + numString;
        }
        int lenNum = numString.length();


        String res = "";
        Integer dem = 0;
        while (numString.length() >= 3) {
            int len = numString.length();
            String tmp = numString.substring(len-3, len);
            numString = numString.substring(0, len-3);

            res = docBaSo(tmp) + map1.get(dem) + " " + res;
            dem += 3;
            if (dem == 12) dem = 3;
        }

        if (res.startsWith("không trăm linh")) {
            res = res.substring(16);
        }

        if (res.startsWith("không trăm")) {
            res = res.substring(11);
        }

        if (res.endsWith("không trăm  ")) {
            int tmp = res.lastIndexOf("không trăm  ");
            res = res.substring(0, tmp);
        }

        if (res.contains("không trăm nghìn")) {
            res = res.replaceAll("không trăm nghìn", "");
        }

        if (res.contains("không trăm triệu")) {
            res = res.replaceAll("không trăm triệu", "");
        }

        System.out.println(res.equals(" ") ? "không" : res);

    }
    public static String docBaSo(String numString) {
        StringBuilder res = new StringBuilder();

        res.append(docTram(numString.charAt(0) + "")).append(" ");

        if (numString.charAt(1) == '1' && numString.charAt(2) != '0') {
            res.append("mười ").append(map.get(numString.charAt(2) + "")).append(" ");
        } else if (numString.charAt(1) == '1' && numString.charAt(2) == '0') {
            res.append("mười ");
        } else if (numString.charAt(1) == '0' && numString.charAt(2) == '1') {
            res.append(docChuc(numString.charAt(1) + "")).append(" một ");
        }else if (numString.charAt(1) == '0' && numString.charAt(2) == '0') {

        }else if (numString.charAt(1) != '0' && numString.charAt(2) == '0') {
            res.append(docChuc(numString.charAt(1)+""));
        } else {
            res.append(docChuc(numString.charAt(1) + "")).append(" ");
            res.append(docDonVi(numString.charAt(2) + "")).append(" ");
        }
        return res.toString();
    }


    public static String docTram(String c) {
        return map.get(c) + " trăm";
    }

    public static String docChuc(String c) {
        if (c.equals("0")) return "linh";
        else {
            return map.get(c) + " mươi";
        }
    }

    public static String docDonVi(String c) {
        if (c.equals("1")) return "mốt";
        else {
            return map.get(c);
        }
    }

    public static void Bai3() {
        Scanner in = new Scanner(System.in);
        double a, b, c;
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        System.out.println((a + b > c && b + c > a && c + a > b) ? "Có là 3 cạnh của tam giác" : "Không là ba cạnh của tam giác");
    }

    public static void Bai4() {
        Scanner in = new Scanner(System.in);
        double a, b, c;
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        System.out.println( (checkRightTriangle(a, b, c)
                || checkRightTriangle(a, c, b)
                || checkRightTriangle(b, c, a)) ? "Là một tam giác vuông" : "Không là tam giác vuông");

    }

    public static boolean checkRightTriangle(double a, double b, double c) {
        return (a * a + b * b) == (c * c);
    }

    public static void Bai5() {
        Scanner in = new Scanner(System.in);
        String studentCode = in.nextLine();
//        String studentCode = "B1234567";
        String regex = "^B[0-9]{7}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(studentCode);
        if (matcher.find()) {
            System.out.println("Là mã sinh viên");
        } else {
            System.out.println("Không đúng định dạng");
        }
    }

    public static void thayDoiTestGit() {
        
    }
}
