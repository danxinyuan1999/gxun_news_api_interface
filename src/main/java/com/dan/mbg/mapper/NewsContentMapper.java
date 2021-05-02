package com.dan.mbg.mapper;

import com.dan.mbg.model.NewsContent;
import com.dan.mbg.model.NewsContentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NewsContentMapper {
    long countByExample(NewsContentExample example);

    int deleteByExample(NewsContentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NewsContent record);

    int insertSelective(NewsContent record);

    List<NewsContent> selectByExample(NewsContentExample example);

    NewsContent selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NewsContent record, @Param("example") NewsContentExample example);

    int updateByExample(@Param("record") NewsContent record, @Param("example") NewsContentExample example);

    int updateByPrimaryKeySelective(NewsContent record);

    int updateByPrimaryKey(NewsContent record);
}