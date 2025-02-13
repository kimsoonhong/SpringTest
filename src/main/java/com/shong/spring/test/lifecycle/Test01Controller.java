package com.shong.spring.test.lifecycle;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Test01Controller {

	@ResponseBody
	@RequestMapping("/lifecycle/test01/1")
	public String HelloWorld() {

		return "<h2>테스트 프로잭트 완성</h2>" + "<h3>프로잭트를 통해 진행!</h3>";

	}

	@ResponseBody
	@RequestMapping("/lifecycle/test01/2")
	public Map<String, Integer> mapResponse() {

		Map<String, Integer> scoreMap = new HashMap<>();

		scoreMap.put("국어", 80);
		scoreMap.put("수학", 30);
		scoreMap.put("영어", 80);

		return scoreMap;
	}

}
