package com.dragon.blog.service;

import com.dragon.base.BaseServiceMock;
import com.dragon.blog.mapper.BlogMenuMapper;
import com.dragon.blog.model.BlogMenu;
import com.dragon.blog.model.BlogMenuExample;

/**
* 降级实现BlogMenuService接口
* Created by Dragon.Wen on 2019/4/11.
*/
public class BlogMenuServiceMock extends BaseServiceMock<BlogMenuMapper, BlogMenu, BlogMenuExample> implements BlogMenuService {

}
