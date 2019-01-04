package com.imooc.service;

import java.util.List;
import javax.persistence.criteria.CriteriaBuilder.In;
import com.imooc.dataobject.ProductCategory;


public interface CategoryService {

  ProductCategory findOne(Integer categoryId);

  List<ProductCategory> findAll();

  List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

  ProductCategory save(ProductCategory productCategory);



}
