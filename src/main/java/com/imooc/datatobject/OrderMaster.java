package com.imooc.datatobject;

import com.imooc.enums.OrderStatusEnum;
import com.imooc.enums.PayStatusEnum;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;


@Entity
@Data
@DynamicUpdate
public class OrderMaster {

  @Id
  private  String orderId;

  private String buyerName;

  private String buyerPhone;

  private String buyerAddress;

  private String buyerOpenid;

  private BigDecimal orderAmount;
  //订单装填，默认为新下单
  private Integer orderStatus = OrderStatusEnum.NEW.getCode();

  //支付装填
  private Integer payStatus = PayStatusEnum.WAIT.getCode();

  private Date createTime;

  private Date updateTime;
}
