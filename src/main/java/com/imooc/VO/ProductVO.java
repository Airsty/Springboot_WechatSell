package com.imooc.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.util.List;
import lombok.Data;
/**
 * 商品（包含类目）
 */
@Data
public class ProductVO {

  @JsonProperty("name")
  private String categoryName;

  @JsonProperty("type")
  private Integer categoryType;

  @JsonProperty("foods")
  private List<ProductInfoVO> productInfoVOList;
}
