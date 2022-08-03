package com.example.test1monstarlab.bai4;


public class News implements INews {
    private final int MAX_RATE = 3;
    private static int count = 1;
    private int id;
    private String title;
    private String publishDate;
    private String author;
    private String content;
    private float averageRate;

    public News() {
    }

    public News(String title, String publishDate, String author, String content) {
        this.id = count++;
        this.title = title;
        this.publishDate = publishDate;
        this.author = author;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    public float getAverageRate() {
        return averageRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public void display() {
        System.out.println("News{" +
                "Title='" + title + '\'' +
                ", publishDate='" + publishDate + '\'' +
                ", author='" + author + '\'' +
                ", content='" + content + '\'' +
                ", averageRate=" + averageRate +
                '}');
    }

    private int[] rateList = new int[MAX_RATE];

    public void setRateList(int[] rateList) {
        this.rateList = rateList;
    }

    public void caclate() {
        this.averageRate = getAverage(this.rateList);
    }

    private float getAverage(int[] rateList) {
        int totalVote = 0;
        for (int i = 0; i < 3; i++) {
            totalVote += rateList[i];
        }
        return (float) totalVote * 1.0f / rateList.length;
    }
}
