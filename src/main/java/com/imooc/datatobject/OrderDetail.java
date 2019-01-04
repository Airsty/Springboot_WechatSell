package com.imooc.datatobject;

import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class OrderDetail {

  @Id
  private String detailId;

  private String orderId;

  private String productId;

  private String ProductName;

  private BigDecimal productPrice;
  //商品数量
  private Integer productQuantity;

  private String productIcon;

  public OrderDetail() {

  }
}
