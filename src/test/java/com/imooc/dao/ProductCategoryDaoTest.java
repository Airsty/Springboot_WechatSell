package com.imooc.dao;

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
public class ProductCategoryDaoTest {

  @Autowired
  private ProductCategoryDao dao;

  @Test
  @Transactional
  public void findOneTest(){
    ProductCategory productCategory = dao.findOne(1);
    System.out.println(productCategory);

  }

//  @Test
//  public void saveTest(){
//    ProductCategory productCategory = new ProductCategory();
//    productCategory.setCategoryName("女生最爱");
//    productCategory.setCategoryType(3);
//    dao.save(productCategory);
//  }

//  @Test
//  public void updateTest(){
//    ProductCategory productCategory = new ProductCategory();
//    productCategory.setCategoryId(1);
//    productCategory.setCategoryName("最爱");
//    productCategory.setCategoryType(2);
//    ProductCategory result = dao.save(productCategory);
//    Assert.assertTrue(result.getCategoryName().equals("最爱"));
//  }

  @Test
  public void findByCategoryTypeIn(){
    List<Integer> list = Arrays.asList(2);
    List<ProductCategory> result = dao.findByCategoryTypeIn(list);
    Assert.assertNotEquals(0,result.size());
  }
}