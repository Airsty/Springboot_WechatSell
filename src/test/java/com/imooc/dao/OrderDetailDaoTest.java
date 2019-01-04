package com.imooc.dao;

import static org.junit.Assert.*;

import com.imooc.datatobject.OrderDetail;
import com.imooc.datatobject.OrderMaster;
import java.math.BigDecimal;
import java.util.List;
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
public class OrderDetailDaoTest {

  @Autowired
  private OrderDetailDao dao;

  @Test
  public void saveTest(){
    OrderDetail orderDetail = new OrderDetail();
    orderDetail.setDetailId("123454678");
    orderDetail.setOrderId("1231244");
    orderDetail.setProductIcon("http://xxx/jpg");
    orderDetail.setProductId("312414");
    orderDetail.setProductName("皮蛋粥");
    orderDetail.setProductPrice(new BigDecimal(1.5));
    orderDetail.setProductQuantity(2);

    OrderDetail result = dao.save(orderDetail);
    Assert.assertNotNull(result);
  }

  @Test
  public void findByOrderId() {

    List<OrderDetail> orderDetailList = dao.findByOrderId("12314");
    Assert.assertNotNull(orderDetailList);
  }
}