package com.niit.music.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.music.model.Product;
import com.niit.music.service.ProductService;

@Controller
public class CategoryController {
	@Autowired
	private ProductService productservice;
	
	@RequestMapping(value={"/admin/Violins","/Violins"})
	public String viol(Map<String, Object> map)
	{
		Product productmodelResult=new Product();
		map.put("productModel",productmodelResult);
	    map.put("productmodelList", productservice.getAllViolins());
	  System.out.println(productmodelResult);
		return "Category";
	}
	@RequestMapping(value={"/admin/Drums","/Drums"})
	public String dru(Map<String, Object> map)
	{
		Product productmodelResult=new Product();
		map.put("productModel",productmodelResult);
	    map.put("productmodelList", productservice.getAllDrums());
	  System.out.println(productmodelResult);
		return "Category";
	}
	@RequestMapping(value={"/admin/Guitars","/Guitars"})
	public String guit(Map<String, Object> map)
	{
		Product productmodelResult=new Product();
		map.put("productModel",productmodelResult);
	    map.put("productmodelList", productservice.getAllGuitars());
	  System.out.println(productmodelResult);
		return "Category";
}
	@RequestMapping(value={"/WindInstruments","/admin/WindInstruments"})
	public String wind(Map<String, Object> map)
	{
		Product productmodelResult=new Product();
		map.put("productModel",productmodelResult);
	    map.put("productmodelList", productservice.getAllWindInstruments());
	  System.out.println(productmodelResult);
		return "Category";
}
	@RequestMapping(value={"/admin/Keyboards","/Keyboards"})
	public String key(Map<String, Object> map)
	{
		Product productmodelResult=new Product();
		map.put("productModel",productmodelResult);
	    map.put("productmodelList", productservice.getAllKeyboards());
	  System.out.println(productmodelResult);
		return "Category";
}
	@RequestMapping(value={"/admin/IndianInstruments","/IndianInstruments"})
	public String Indian(Map<String, Object> map)
	{
		Product productmodelResult=new Product();
		map.put("productModel",productmodelResult);
	    map.put("productmodelList", productservice.getAllIndianInstruments());
	  System.out.println(productmodelResult);
		return "Category";	
}

}