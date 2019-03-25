package com.dragon.blog.rpc.api;

import com.dragon.blog.base.BaseServiceMock;
import com.dragon.blog.dao.mapper.BlogMenuMapper;
import com.dragon.blog.dao.model.BlogMenu;
import com.dragon.blog.dao.model.BlogMenuExample;

/**
* 降级实现BlogMenuService接口
* Created by Dragon.Wen on 2019/3/25.
*/
public class BlogMenuServiceMock extends BaseServiceMock<BlogMenuMapper, BlogMenu, BlogMenuExample> implements BlogMenuService {

}
