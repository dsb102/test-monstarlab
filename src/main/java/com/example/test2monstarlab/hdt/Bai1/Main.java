package com.example.test2monstarlab.hdt.Bai1;

import com.example.test2monstarlab.hdt.Bai1.PhanSo;

public class Main {
    public static void main(String[] args) {
        testPhanSo();
    }

    public static void testPhanSo() {
        PhanSo a = PhanSo.input();
        PhanSo b = PhanSo.input();
        PhanSo c = a.cong(b);
        System.out.println(c.toString());
    }

}
