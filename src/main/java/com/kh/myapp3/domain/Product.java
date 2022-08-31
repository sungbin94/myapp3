package com.kh.myapp3.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //getter,setter,toString,EqualsAndHashCode,RequiredArgsConstructor(멤버필드중 final키워드가
@NoArgsConstructor //디폴트생성자 만듦
@AllArgsConstructor //모든 멤버필드를 매개변수로 갖는 생성자
public class Product {
  private Long productId;    //상품번호   PRODUCT_ID	NUMBER(10,0)	No		1
  private String  pname;        //상품명     PNAME	VARCHAR2(30 BYTE)	Yes		2
  private Integer quantity;     //상품수량   QUANTITY	NUMBER(10,0)	Yes		3
  private Integer price;        //상품가격   PRICE	NUMBER(10,0)	Yes		4
}