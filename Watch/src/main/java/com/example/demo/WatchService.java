package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class WatchService {
 
	@Autowired
	WatchDao bd;
	public String addInfo(WatchEntity be) {
		return bd.addInfo(be);
	}
	public String devilInfo(@RequestBody List<WatchEntity>be) {
		return bd.devilInfo(be);
	}
	public List<WatchEntity>getbrand1(String brand) {
		return bd.getbrand1(brand);
	}
	public List<WatchEntity>getprice(int price1,int price2) {
		return bd.getprice(price1,price2);
	}
	public List<String>getbrand() {
		return bd.getbrand();
	}
}
 