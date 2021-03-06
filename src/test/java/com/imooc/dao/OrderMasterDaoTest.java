package com.imooc.dao;

import static org.junit.Assert.*;

import com.imooc.datatobject.OrderMaster;
import java.math.BigDecimal;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMasterDaoTest {

  @Autowired
  private OrderMasterDao dao;

  private final String OPENID = "110110";

  @Test
  public void saveTest(){
    OrderMaster orderMaster = new OrderMaster();
    orderMaster.setOrderId("1234567");
    orderMaster.setBuyerName("师兄");
    orderMaster.setBuyerPhone("123456789123");
    orderMaster.setBuyerAddress("慕课网");
    orderMaster.setBuyerOpenid("110110");
    orderMaster.setOrderAmount(new BigDecimal(2.5));

    OrderMaster result = dao.save(orderMaster);
    Assert.assertNotNull(result);
  }

  @Test
  public void findByBuyerOpenid() {

    PageRequest request = new PageRequest(0,1);
    Page<OrderMaster> result = dao.findByBuyerOpenid(OPENID, request);
    Assert.assertNotEquals(0,result.getTotalElements());

  }
}