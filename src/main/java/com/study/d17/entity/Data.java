package com.study.d17.entity;
import java.util.List;

public class Data {

    private String link;
    private String title;
    private int time;
    private List<List<String>> headlines;
    public void setLink(String link) {
         this.link = link;
     }
     public String getLink() {
         return link;
     }

    public void setTitle(String title) {
         this.title = title;
     }
     public String getTitle() {
         return title;
     }

    public void setTime(int time) {
         this.time = time;
     }
     public int getTime() {
         return time;
     }

    public void setHeadlines(List<List<String>> headlines) {
         this.headlines = headlines;
     }
     public List<List<String>> getHeadlines() {
         return headlines;
     }

}