package com.shong.spring.test.lifecycle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/lifecycle/test02")
public class Test02Controller {

	@RequestMapping("/1")
	public List<Map<String, Object>> ListMap() {

		List<Map<String, Object>> MovieList = new ArrayList<Map<String, Object>>();

		Map<String, Object> MovieItem = new HashMap<String, Object>();

		MovieItem.put("rate", 16);
		MovieItem.put("director", "봉준호");
		MovieItem.put("tiem", 131);
		MovieItem.put("title", "기생충");
		MovieList.add(MovieItem);

		return MovieList;

	}

	@RequestMapping("/2")
	public List<Post> listObjectResponse() {

		List<Post> postList = new ArrayList<>();
		Post post = new Post("안녕하신가", "김김김", "내용");

		postList.add(post);
		postList.add(new Post("안녕하세요", "순순순", "내용"));
		postList.add(new Post("안녕할래?", "홍홍홍", "내용"));

		return postList;
	}

	@RequestMapping("/3")
	public ResponseEntity<Post> entityResponse() {
		Post post = new Post("안녕하신가", "김김김", "내용");

		ResponseEntity<Post> entity = new ResponseEntity<Post>(post, HttpStatus.INTERNAL_SERVER_ERROR);
		return entity;
	}

}
