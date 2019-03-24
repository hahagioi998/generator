package com.dragon.blog.dao.mapper;

import com.dragon.blog.dao.model.BlogMenu;
import com.dragon.blog.dao.model.BlogMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogMenuMapper {
    long countByExample(BlogMenuExample example);

    int deleteByExample(BlogMenuExample example);

    int deleteByPrimaryKey(Integer menuId);

    int insert(BlogMenu record);

    int insertSelective(BlogMenu record);

    List<BlogMenu> selectByExample(BlogMenuExample example);

    BlogMenu selectByPrimaryKey(Integer menuId);

    int updateByExampleSelective(@Param("record") BlogMenu record, @Param("example") BlogMenuExample example);

    int updateByExample(@Param("record") BlogMenu record, @Param("example") BlogMenuExample example);

    int updateByPrimaryKeySelective(BlogMenu record);

    int updateByPrimaryKey(BlogMenu record);
}