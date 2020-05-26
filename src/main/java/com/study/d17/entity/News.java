package com.study.d17.entity;
import java.util.List;

public class News {

    private List<Data> data;
    
    private String nextLink;
    
    public void setData(List<Data> data) {
         this.data = data;
     }
     public List<Data> getData() {
         return data;
     }

    public void setNextLink(String nextLink) {
         this.nextLink = nextLink;
     }
     public String getNextLink() {
         return nextLink;
     }

}