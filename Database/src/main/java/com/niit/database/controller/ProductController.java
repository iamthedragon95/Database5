package com.niit.database.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.niit.database.model.Product;
import com.niit.database.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	ProductService productService;
	@RequestMapping("/")
	public String gohome(){
		return "index";
	}
	@RequestMapping("/product view")
	public String setup(Map<String, Object> map){
		Product product = new Product();
		map.put("product", product);
		map.put("ProductList", productService.getAllProduct());
		return "product view";
	}
	
	@RequestMapping("/prodata")
	public String setupForm(Map<String, Object> map){
		Product product = new Product();
		map.put("product", product);
		map.put("ProductList", productService.getAllProduct());
		return "products";
	}
	@RequestMapping(value={"/products.do","edit/products.do"}, method=RequestMethod.POST)
	public String doActions(@ModelAttribute Product product, BindingResult result, @RequestParam String action, Map<String, Object> map){
		Product productResult = new Product();
		switch(action.toLowerCase()){	//only in Java7 you can put String in switch
		case "save":
			
			MultipartFile file=product.getImage();
			productService.save(product);
			if (!file.isEmpty()) {
				try {
					byte[] bytes = file.getBytes();

					// Creating the directory to store file
					String rootPath ="G:/final DevOps pro/Database/src/main/webapp/resources/images";
					File dir = new File(rootPath + File.separator + "images");
					if (!dir.exists())
						dir.mkdirs();

					// Create the file on server
					File serverFile = new File(dir.getAbsolutePath() + File.separator + product.getImage()+".jpg");
					System.out.println(serverFile);
			        file.transferTo(serverFile);

					
					

					 return "uploaded successfully=" ;
				} catch (Exception e) {
					return "upload failed "  + e.getMessage();
				}
			} 
		

			productResult = product;
			break;
		case "update":
			productService.update(product);
			productResult = product;
			break;
		case "delete":
			productService.delete(product.getProductId());
			productResult = new Product();
			break;
		case "search":
			Product searchedProduct = productService.getProduct(product.getProductId());
			productResult = searchedProduct!=null ? searchedProduct : new Product();
			break;
		}
		map.put("product", productResult);
		map.put("ProductList", productService.getAllProduct());
		return "products";
		
		
	}

	@RequestMapping(value="edit/{productId}")
	public String edit(@PathVariable("productId")String productId,@ModelAttribute Product product,BindingResult result,Map<String, Object>map)
	{
		product= productService.getProduct(productId);
		map.put("product", product);
		map.put("ProductList", productService.getAllProduct());
		
		//System.out.println(foodproductsservice.getAllFoodproducts());
		return "products";
	}
	
	@RequestMapping(value="delete/{productId}")
	public String delete(@PathVariable("productId")String productId,@ModelAttribute Product product,BindingResult result,Map<String, Object>map)
	{
		productService.getProduct(productId);
		return "products";
	}
	

}
