package com.imooc.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import lombok.Data;

/**
 * 商品详情
 */
@Data
public class ProductInfoVO {

  @JsonProperty("id")
  private Integer productId;

  @JsonProperty("name")
  private String pruductName;

  @JsonProperty("price")
  private BigDecimal productPrice;

  @JsonProperty("description")
  private String productDescription;

  @JsonProperty("icon")
  private String productIcon;
}
