package com.imooc.dao;

import com.imooc.datatobject.ProductInfo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductInfoDao extends JpaRepository<ProductInfo, String> {

  List<ProductInfo> findByProductStatus(Integer productStatus);


}
