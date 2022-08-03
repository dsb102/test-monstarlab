package com.example.test2monstarlab.hdt.bai2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Candidate {
    private static int count_ma = 1;
    private int ma;
    private String ten;
    private Date ngaySinh;
    private double toan;
    private double van;
    private double anh;

    public Candidate() {
    }

    public Candidate(String ten, String ngaySinh, double toan, double van, double anh) throws ParseException {
        this.ma = count_ma++;
        this.ten = ten;
        this.ngaySinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaySinh);
        this.toan = toan;
        this.van = van;
        this.anh = anh;
    }


    public double getTotalScore() {
        return toan + van + anh;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "ma=" + ma +
                ", ten='" + ten + '\'' +
                ", ngaySinh=" + ngaySinh +
                ", toan=" + toan +
                ", van=" + van +
                ", anh=" + anh +
                '}';
    }
}
