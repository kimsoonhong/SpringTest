package com.shong.spring.test.estate.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.shong.spring.test.estate.domain.RealEstate;

@Mapper
public interface RealEstateRepository {

	public List<RealEstate> selectRealEstateList(@Param("id") int id);

	public List<RealEstate> selectRealEstateList_rent(@Param("rent") int rent);

	public List<RealEstate> selectRealEstateList_area(@Param("area") int area, @Param("price") int price);

};
