package com.foodexpress.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.foodexpress.model.Restaurants;

@Repository
public interface RestaurantDao extends JpaRepository<Restaurants, Integer> {
	
	@Query("select r from Restaurants r where r.restaurantName=?1")
	public Restaurants getResByName(String restaurantName);
	
	public Restaurants findByContactNumber(String contactNumber);
}
 