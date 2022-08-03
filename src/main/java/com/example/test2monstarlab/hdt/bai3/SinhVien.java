package com.example.test2monstarlab.hdt.bai3;


import java.util.Scanner;

public class SinhVien {
    private int id;
    private String name;
    private int age;
    private String address;
    private double gpa;

    public SinhVien() {
    }

    public SinhVien(int id, String name, int age, String address, double gpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public boolean checkStudentByID(int id) {
        return this.id == id;
    }

    public void editInfo() {
        Scanner in = new Scanner(System.in);
        setName(in.nextLine());
        setAddress(in.nextLine());
        setGpa(in.nextDouble());
        setAge(in.nextInt());

    }



    @Override
    public String toString() {
        return "SinhVien{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                ", gpa=" + gpa +
                '}';
    }


}
