package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface WatchRepo extends JpaRepository<WatchEntity,Integer> {
	
	@Query(value="select * from promo where brand like :brand ",nativeQuery = true)
	public List<WatchEntity>getbrand1(String brand);



    @Query(value="select * from promo where price1<? and price2>?",nativeQuery = true)
    public List<WatchEntity>getprice(int price1,int price2);
    
    
     @Query(value="select brand from promo",nativeQuery = true)
     public List<String>getbrand();

}
