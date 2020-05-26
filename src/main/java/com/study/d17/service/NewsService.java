package com.study.d17.service;

import com.study.d17.dao.NewsDAO;
import com.study.d17.entity.Data;
import com.study.d17.exception.NewsNotFoundException;

public class NewsService {
    private NewsDAO dao = new NewsDAO();
    
    public Data getNews(String date) throws NewsNotFoundException {
        return dao.getDataByDate(date);
    }
}
