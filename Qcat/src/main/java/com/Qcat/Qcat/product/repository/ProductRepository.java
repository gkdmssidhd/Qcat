package com.Qcat.Qcat.product.repository;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

import com.Qcat.Qcat.product.dto.ProductDTO;

@Mapper
public interface ProductRepository {

	List<HashMap<String,Object>> selectProduct(ProductDTO productDTO);

}
