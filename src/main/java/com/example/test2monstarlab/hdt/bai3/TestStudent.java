package com.example.test2monstarlab.hdt.bai3;

import com.example.test2monstarlab.hdt.bai3.SinhVien;

import java.util.*;

public class TestStudent {
    private List<SinhVien> listSinhVien = new ArrayList<>();

    public TestStudent(List<SinhVien> list) {
        this.listSinhVien = list;
    }

    public TestStudent() {
    }

    public void addStudent() {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhập thông tin sinh viên");
        listSinhVien.add(new SinhVien(Integer.parseInt(in.nextLine()),
                in.nextLine(),
                Integer.parseInt(in.nextLine()),
                in.nextLine(),
                Double.parseDouble(in.nextLine())
                ));
    }
    public void editStudent(int id) {
        findSinhVienByID(id).editInfo();
    }

    public void deleteStudent(int id) {
        for (SinhVien sinhVien : listSinhVien) {
            if (sinhVien.checkStudentByID(id))
                listSinhVien.remove(sinhVien);
        }
    }

    private SinhVien findSinhVienByID(int id) {
        for (SinhVien sinhVien : listSinhVien) {
            if (sinhVien.checkStudentByID(id))
                return sinhVien;
        }
        return null;
    }

    public void sortByGPA() {
        Collections.sort(listSinhVien, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return Double.compare(o1.getGpa(), o2.getGpa());
            }
        });
    }

    public void sortByName() {
        Collections.sort(listSinhVien, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }

    public void showStudent() {
        listSinhVien.forEach(x -> {
            System.out.println(x);
        });
    }

}
