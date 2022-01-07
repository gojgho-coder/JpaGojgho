package gojghoStudy.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Item {

  @Id @GeneratedValue
  @Column (name = "ITEM_ID")
  private Long id;

  private String name ; //이름
  private int price; //가격
  private int stockQuantity; //재고수량

}
