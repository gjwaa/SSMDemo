package com.gjw.bean;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProductInfo {
    private String productName;
    private int productTypeID;
    private String productImg;
    private String introduce;
    private int stateID;
    private String startPrice;
    private String strikePrice;
    private String newPrice;


}
