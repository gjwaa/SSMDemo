package com.gjw.mapper;

import com.gjw.bean.ProductInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductMapper {
    int addProduce(ProductInfo productInfo);
}
