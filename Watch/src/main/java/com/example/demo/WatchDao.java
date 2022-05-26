package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class WatchDao {

	@Autowired
	WatchRepo br;
	public String addInfo(WatchEntity be) {
		br.save(be);
		return "data added"; 
	}
	public String devilInfo(List <WatchEntity>be) {
		for(WatchEntity i:be) {
			br.save(i);
		}
		return "saved in bulk";
	}
	public List<WatchEntity>getbrand1(String brand) {
		List<WatchEntity>find=br.getbrand1(brand);
		return find;
	}
	public List<WatchEntity>getprice(int price1,int price2) {
		List<WatchEntity>price=br.getprice(price1,price2);
		return price;
	}
	public List<String> getbrand() {
		List <String>find=br.getbrand();
		return find;
		
	}

}
