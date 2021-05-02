package com.dan.controller;

import com.dan.api.ApiResult;
import com.dan.mbg.model.NewsContent;
import com.dan.service.NewsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 新闻接口
 *
 * @author dan
 */
@RestController
@RequestMapping("/news")
@Api("NewsController")
public class NewsController {

    @Autowired
    private NewsService newsService;

    @GetMapping("/list")
    @ApiOperation("获取新闻全部信息")
    public ApiResult<List<NewsContent>> list() {
        List<NewsContent> newsList = newsService.list();
        return ApiResult.success(newsList);
    }
}
