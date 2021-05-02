package com.dan.service.impl;

import com.dan.mbg.mapper.NewsContentMapper;
import com.dan.mbg.model.NewsContent;
import com.dan.mbg.model.NewsContentExample;
import com.dan.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * NewsService实现类
 *
 * @author dan
 */
@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsContentMapper newsContentMapper;

    @Override
    public List<NewsContent> list() {
        return newsContentMapper.selectByExample(new NewsContentExample());
    }
}
