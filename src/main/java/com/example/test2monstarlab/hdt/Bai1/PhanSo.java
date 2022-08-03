package com.example.test2monstarlab.hdt.Bai1;

import java.util.Scanner;

public class PhanSo {
    private long tuSo;
    private long mauSo;

    public PhanSo() {
    }

    public PhanSo(long tuSo, long mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public long getTuSo() {
        return tuSo;
    }

    public void setTuSo(long tuSo) {
        this.tuSo = tuSo;
    }

    public long getMauSo() {
        return mauSo;
    }

    public void setMauSo(long mauSo) {
        this.mauSo = mauSo;
    }

    private long timUCLN(long a, long b) {
        if (b == 0) return a;
        return timUCLN(b, a % b);
    }

    private void rutGon() {
        long ucln = timUCLN(tuSo, mauSo);
        this.tuSo = this.tuSo / ucln;
        this.mauSo = this.mauSo / ucln;
        if (mauSo < 0) tuSo = tuSo * -1;
    }

    public PhanSo cong(PhanSo b) {
        PhanSo res = new PhanSo();
        res.tuSo = this.tuSo * b.mauSo + this.mauSo * b.tuSo;
        res.mauSo = this.mauSo * b.mauSo;
        res.rutGon();
        return res;
    }

    public PhanSo tru(PhanSo b) {
        PhanSo res = new PhanSo();
        res.tuSo = this.tuSo * b.mauSo - this.mauSo * b.tuSo;
        res.mauSo = this.mauSo * b.mauSo;
        res.rutGon();
        return res;
    }

    public PhanSo nhan(PhanSo b) {
        PhanSo res = new PhanSo();
        res.tuSo = this.tuSo * b.tuSo;
        res.mauSo = this.mauSo * b.mauSo;
        res.rutGon();
        return res;
    }

    public PhanSo chia(PhanSo b) {
        PhanSo res = new PhanSo();
        res.tuSo = this.tuSo * b.mauSo;
        res.mauSo = this.mauSo * b.tuSo;
        res.rutGon();
        return res;
    }

    public static PhanSo input() {
        Scanner in = new Scanner(System.in);
        PhanSo a = new PhanSo(in.nextLong(), in.nextLong());
        return a;
    }

    @Override
    public String toString() {
        return (this.tuSo % this.mauSo != 0 ? String.format("%d/%d", this.tuSo, this.mauSo) : this.tuSo / this.mauSo + "");
    }
}
