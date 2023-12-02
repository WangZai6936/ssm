package com.hxh.service.impl;

import com.hxh.bean.Furn;
import com.hxh.mapper.FurnMapper;
import com.hxh.service.FurnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @ClassName FurnServiceImpl
 * @Description
 * @Author huxuanhao
 * @Date 2023/12/2 16:33
 */
@Service
public class FurnServiceImpl implements FurnService {
    @Autowired
    private FurnMapper furnMapper;
    @Override
    public void save(Furn furn) {
        Furn furns = new Furn(null, "北欧风格沙发~", "顺平家居~", new BigDecimal(180), 666, 7, "assets/images/product-image/1.jpg");
        furnMapper.insertSelective(furns);
    }
}