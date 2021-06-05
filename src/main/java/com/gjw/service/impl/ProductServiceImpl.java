package com.gjw.service.impl;

import com.gjw.bean.ProductInfo;
import com.gjw.mapper.ProductMapper;
import com.gjw.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;


    @Override
    public int addProduce(ProductInfo productInfo) {
        int i = productMapper.addProduce(productInfo);
        return i;
    }
}
