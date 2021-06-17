package com.Qcat.Qcat.product.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Qcat.Qcat.product.dto.ProductDTO;
import com.Qcat.Qcat.product.repository.ProductRepository;
import com.Qcat.Qcat.product.service.ProductService;
@SuppressWarnings("unchecked")
@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public List<HashMap<String,Object>> productDetail(ProductDTO productDTO) {
		return productRepository.selectProduct(productDTO);
		
	}
}
