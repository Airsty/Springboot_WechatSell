package com.imooc.service;

import com.imooc.datatobject.ProductInfo;
import com.imooc.dto.CartDTO;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductService {

  ProductInfo findOne(String productId);

  //查询所有的在架商品
  List<ProductInfo> findUpAll();

  Page<ProductInfo> findAll(Pageable pageable);

  ProductInfo save(ProductInfo productInfo);

  //加库存
  void increaseStock(List<CartDTO> cartDTOList);

  //减库存
  void decreaseStock(List<CartDTO> cartDTOList);
}
