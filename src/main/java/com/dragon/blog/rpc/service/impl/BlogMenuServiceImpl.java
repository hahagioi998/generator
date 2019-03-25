package com.dragon.blog.rpc.service.impl;

import com.dragon.blog.annotation.BaseService;
import com.dragon.blog.base.BaseServiceImpl;
import com.dragon.blog.dao.mapper.BlogMenuMapper;
import com.dragon.blog.dao.model.BlogMenu;
import com.dragon.blog.dao.model.BlogMenuExample;
import com.dragon.blog.rpc.api.BlogMenuService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* BlogMenuService实现
* Created by Dragon.Wen on 2019/3/25.
*/
@Service
@Transactional
@BaseService
public class BlogMenuServiceImpl extends BaseServiceImpl<BlogMenuMapper, BlogMenu, BlogMenuExample> implements BlogMenuService {

    private static final Logger LOGGER = LoggerFactory.getLogger(BlogMenuServiceImpl.class);

    @Autowired
    BlogMenuMapper blogMenuMapper;

}