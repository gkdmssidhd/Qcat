package com.Qcat.Qcat.product.dto;


import java.sql.Timestamp;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class ProductDTO {

	private int product_id;
    private int store_id;
    private String category;
    private String product_name;
    private String content;
    private int price;
    private String img;
    private Timestamp projuct_regdate;
    

	@Builder
	public ProductDTO(int product_id, int store_id, String category, String product_name, String content, int price, String img, Timestamp projuct_regdate) {
	    this.product_id = product_id;
	    this.store_id = store_id;
	    this.category = category;
	    this.product_name = product_name;
	    this.content = content;
	    this.price = price;
	    this.img = img;
	    this.projuct_regdate = projuct_regdate;
	
	}
}

