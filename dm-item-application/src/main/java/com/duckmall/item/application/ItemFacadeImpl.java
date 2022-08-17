package com.duckmall.item.application;

import com.duckmall.item.domain.ItemService;
import com.duckmall.item.facade.ItemFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ：xiong
 * @date ：Created in 2022/8/17 23:19
 * @description ：商品服务
 */
@Service
public class ItemFacadeImpl implements ItemFacade {

    @Autowired
    private ItemService itemService;
}
