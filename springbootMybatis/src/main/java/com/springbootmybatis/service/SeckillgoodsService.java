package com.springbootmybatis.service;

import com.springbootmybatis.entity.Seckillgoods;

public interface SeckillgoodsService {
    int insert(Seckillgoods seckillgoods);
    int update(Integer id);
    int delete(Integer id);

}
