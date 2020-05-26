package com.study.d17;

import com.study.d17.entity.Data;
import com.study.d17.exception.NewsNotFoundException;
import com.study.d17.service.NewsService;

public class NewsPage {
    public static void main(String[] args) {
        NewsService service = new NewsService();
        try {
            Data data = service.getNews("5/21");
            System.out.println(data.getTitle());
            data.getHeadlines()
                    .stream()
                    .forEach(list -> list.stream().forEach(System.out::println));
        } catch (NewsNotFoundException ex) {
            System.out.println(ex);
            ex.why();
        }
    }
}
