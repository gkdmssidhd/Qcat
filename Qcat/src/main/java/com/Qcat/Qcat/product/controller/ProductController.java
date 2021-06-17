package com.Qcat.Qcat.product.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Qcat.Qcat.product.dto.ProductDTO;
import com.Qcat.Qcat.product.service.ProductService;

@Controller
@RequestMapping("/product")

public class ProductController {

	private static final Logger logger = LoggerFactory.getLogger(ProductController.class);
	
	private final ProductService productService;

	@Autowired
	public ProductController(ProductService productService) {
		this.productService = productService;
	}

	
	@GetMapping("productDetail/{store_id}")
	public String productDetail(@PathVariable("store_id") int store_id, Model model) {
//		System.out.println(store_id);
		
		ProductDTO productDTO = new ProductDTO();
		productDTO.setStore_id(store_id);
		
		List<HashMap<String,Object>> productInfo = productService.productDetail(productDTO);
		 
		model.addAttribute("productInfo", productInfo);
		
//		System.out.println(productInfo);
		
		return "/product/productDetail";
	}

}
