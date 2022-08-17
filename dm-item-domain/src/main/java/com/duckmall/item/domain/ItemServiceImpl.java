package com.duckmall.item.domain;

import com.duckmall.item.domain.dao.ItemDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ：xiong
 * @date ：Created in 2022/8/17 23:23
 * @description ：商品领域服务
 */
@Service
public class ItemServiceImpl implements ItemService{
    @Autowired
    private ItemDao dao;
}
