package com.imooc.service.impl;

import com.imooc.dao.ProductCategoryDao;
import com.imooc.dataobject.ProductCategory;
import com.imooc.service.CategoryService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {

  @Autowired
  private ProductCategoryDao dao;

  @Override
  public ProductCategory findOne(Integer categoryId) {
    return dao.findOne(categoryId);
  }

  @Override
  public List<ProductCategory> findAll() {
    return dao.findAll();
  }

  @Override
  public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
    return dao.findByCategoryTypeIn(categoryTypeList);
  }

  @Override
  public ProductCategory save(ProductCategory productCategory) {
    return dao.save(productCategory);
  }
}
