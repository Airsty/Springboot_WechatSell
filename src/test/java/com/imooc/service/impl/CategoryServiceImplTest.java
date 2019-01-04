package com.imooc.service.impl;

import static org.junit.Assert.*;


import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.imooc.dataobject.ProductCategory;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryServiceImplTest {

  @Autowired
  private CategoryServiceImpl categoryService;

  @Test
  @Transactional
  public void findOne(){
    ProductCategory productCategory = categoryService.findOne(3);
    Assert.assertEquals(new Integer(3),productCategory.getCategoryId());
  }

  @Test
  public void findAll() {
    List<ProductCategory> productCategoryList = categoryService.findAll();
    Assert.assertNotEquals(0,productCategoryList.size());
  }

  @Test
  public void findByCategoryTypeIn() {
    List<ProductCategory> productCategoryList = categoryService.findByCategoryTypeIn(Arrays.asList(2,3,4));
    Assert.assertNotEquals(0,productCategoryList.size());
  }

  @Test
  public void save() {
    ProductCategory productCategory = new ProductCategory("男生专享",10);
    ProductCategory result = categoryService.save(productCategory);
    Assert.assertNotNull(result);
  }
}