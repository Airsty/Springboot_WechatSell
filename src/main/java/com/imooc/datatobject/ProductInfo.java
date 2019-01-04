package com.imooc.datatobject;

import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;


@Entity
@Data
public class ProductInfo {
  @Id
  private String productId;

  private String productName;

  private BigDecimal productPrice;

  private Integer productStock;

  private String ProductDescription;

  private String productIcon;
  //0正常，1下架
  private Integer productStatus;

  private Integer categoryType;



}
