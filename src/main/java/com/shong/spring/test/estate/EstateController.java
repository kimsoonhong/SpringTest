package com.shong.spring.test.estate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shong.spring.test.estate.domain.RealEstate;
import com.shong.spring.test.estate.service.RealEstateService;

@Controller
public class EstateController {

	@Autowired
	private RealEstateService realEstateService;

	@RequestMapping("/estate/select")
	@ResponseBody
	public List<RealEstate> getRealEstate(@RequestParam("id") int id) {

		List<RealEstate> realEstate = realEstateService.getRealEstate(id);

		return realEstate;
	}

	@RequestMapping("/estate/select_rent")
	@ResponseBody
	public List<RealEstate> getRealEstate_rent(@RequestParam("rent") int rent) {

		List<RealEstate> realEstate = realEstateService.getRealEstate_rent(rent);

		return realEstate;
	}

	@RequestMapping("/estate/select_area")
	@ResponseBody
	public List<RealEstate> getRealEstateByAreaAndPrice(@RequestParam("area") int area, @RequestParam("price") int price) {

		List<RealEstate> realEstate = realEstateService.getRealEstate_area(area, price);

		return realEstate;
	}

}
