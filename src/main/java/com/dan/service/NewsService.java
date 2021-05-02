package com.dan.service;

import com.dan.mbg.model.NewsContent;

import java.util.List;

/**
 * 新闻服务接口
 *
 * @author dan
 */
public interface NewsService {

    List<NewsContent> list();

}
