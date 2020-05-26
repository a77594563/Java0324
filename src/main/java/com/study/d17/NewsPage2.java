package com.study.d17;

import com.study.d17.entity.Data;
import com.study.d17.exception.LoginFailException;
import com.study.d17.exception.NewsNotFoundException;
import com.study.d17.service.LoginService;
import com.study.d17.service.NewsService;

public class NewsPage2 {

    public static void main(String[] args) {
        String username = "john";
        String password = "1234";
        try {
            if (login(username, password)) {
                watchNews();
            }
        } catch (LoginFailException ex) {
            System.out.println(ex.getMessage());
        } catch (NewsNotFoundException ex) {
            System.out.println(ex.getMessage());
            ex.why();
        }
    }

    public static boolean login(String username, String password) throws LoginFailException {
        LoginService service = new LoginService();
        return service.login(username, password);
    }

    public static void watchNews() throws NewsNotFoundException {
        NewsService service = new NewsService();
        Data data = service.getNews("5/21");
        System.out.println(data.getTitle());
        data.getHeadlines()
                .stream()
                .forEach(list -> list.stream().forEach(System.out::println));

    }
}
