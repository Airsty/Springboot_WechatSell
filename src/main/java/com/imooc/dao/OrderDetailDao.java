package com.imooc.dao;

import com.imooc.datatobject.OrderDetail;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailDao extends JpaRepository<OrderDetail, String> {

  List<OrderDetail> findByOrderId(String OrderId);
}
