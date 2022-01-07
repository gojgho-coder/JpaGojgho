package gojghoStudy.model.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Order {

  @Id @GeneratedValue
  @Column(name="ORDER_ID")
  private Long id;

  @Column(name = "MEMBER_ID")
  private Long memberId;

  @Temporal(TemporalType.TIMESTAMP)
  private Date orderDate; //주문날짜

  @Enumerated(EnumType.STRING)
  private OrderStatus status; //주문 상태

}
