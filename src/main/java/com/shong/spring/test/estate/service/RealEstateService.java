package com.shong.spring.test.estate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shong.spring.test.estate.domain.RealEstate;
import com.shong.spring.test.estate.repository.RealEstateRepository;

@Service
public class RealEstateService {

	@Autowired
	private RealEstateRepository realEstateRepository;

	
	

	public List<RealEstate> getRealEstate(int id) {

		List<RealEstate> realEstateList = realEstateRepository.selectRealEstateList(id);

		return realEstateList;
	}

	public List<RealEstate> getRealEstate_rent(int rent) {

		List<RealEstate> realEstateList = realEstateRepository.selectRealEstateList_rent(rent);

		return realEstateList;
	}

	public List<RealEstate> getRealEstate_area(int area, int price) {

		List<RealEstate> realEstateList = realEstateRepository.selectRealEstateList_area(area, price);

		return realEstateList;
	}
}
