package gojghoStudy.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Member {

  @Id @GeneratedValue
  @Column(name = "MEMBER_ID")
  private  Long id;

  private String name;

  private String city;

  private String street;

  private String zipcode;

}
