package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WatchController {

	@Autowired
	WatchService bs;
	@PostMapping(value="/add")
	public String addInfo(@RequestBody WatchEntity be) {
		return bs.addInfo(be);
	}
	@PostMapping(value="/devil")
	public String devilInfo(@RequestBody List<WatchEntity>be) {
		return bs.devilInfo(be);
	}
	@GetMapping(value="/getbrand1/{brand}")
	public List<WatchEntity>getbrand1(@PathVariable String brand) {
		return bs.getbrand1(brand);
	}
	@GetMapping(value="/getprice/{price1}/{price2}")
	public List<WatchEntity>getprice(@PathVariable int price1,@PathVariable int price2) {
		return bs.getprice(price1,price2);
}
	@GetMapping(value="/getbrand")
	public List<String> getbrand(){
		return bs.getbrand();
}
}