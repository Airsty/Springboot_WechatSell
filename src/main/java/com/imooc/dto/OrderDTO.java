package com.imooc.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion;
import com.imooc.datatobject.OrderDetail;
import com.imooc.utils.serializer.Date2LongSerializer;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import lombok.Data;

@Data
//@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
//@JsonInclude(Include.NON_NULL)
public class OrderDTO {

  private  String orderId;

  private String buyerName;

  private String buyerPhone;

  private String buyerAddress;

  private String buyerOpenid;

  private BigDecimal orderAmount;
  //订单装填，默认为新下单
  private Integer orderStatus;

  //支付装填
  private Integer payStatus;

  @JsonSerialize(using = Date2LongSerializer.class)
  private Date createTime;

  @JsonSerialize(using = Date2LongSerializer.class)
  private Date updateTime;

  private List<OrderDetail> orderDetailList;

}
