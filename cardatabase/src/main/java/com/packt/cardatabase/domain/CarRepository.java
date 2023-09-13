package com.packt.cardatabase.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<Car, Long> {

	//브랜드로 자동차를 검색
	List<Car> findByBrand(String brand);
	
	//색상으로 자동차를 검색
	List<Car> findByColor(String color);
	
	//연도로 자동차를 검색
	List<Car> findByYear(int year);
}
