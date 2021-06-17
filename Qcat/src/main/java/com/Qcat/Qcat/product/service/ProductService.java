package com.Qcat.Qcat.product.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.Qcat.Qcat.product.dto.ProductDTO;

public interface ProductService {

	List<HashMap<String, Object>> productDetail(ProductDTO productDTO); 


}
