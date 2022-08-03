package com.example.test2monstarlab.hdt.bai2;


import com.example.test2monstarlab.hdt.bai2.Candidate;

import java.text.ParseException;
import java.util.List;
import java.util.Scanner;

public class TestCandidate {
    private List<Candidate> candidateList;

    public List<Candidate> getCandidateList() {
        return candidateList;
    }

    public void setCandidateList(List<Candidate> candidateList) {
        this.candidateList = candidateList;
    }

    public void insert() throws ParseException {
        /*
        n là số sinh viên muốn nhập
        * */
        Scanner in = new Scanner(System.in);
        int numOfCan = in.nextInt();
        in.nextLine();
        for (int i = 0; i < numOfCan; i++) {
            candidateList.add(new Candidate(in.nextLine(), in.nextLine(),
                    in.nextDouble(), in.nextDouble(), in.nextDouble()));
            in.nextLine();
        }

    }

    public void insert(Candidate candidate) {
        candidateList.add(candidate);
    }

    public void showInfo() {
        for (Candidate candidate : candidateList) {
            System.out.println(candidate);
        }
    }

    public void showInfoByScore(int score) {
        this.candidateList.forEach(x -> {
            if (x.getTotalScore() > 1)
                System.out.println(x);
        });
    }
}
