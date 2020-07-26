package com.SpringBoot.TopicsController;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Spring.pojo.Topic;

@RestController
public class TopicsController {
	@RequestMapping("/topics")
	public List<Topic> getTopics(){
		return Arrays.asList( 
				new Topic("spring", "Spring Topic", "Spring Description"),
				new Topic("java", "Core Java", "Java Description"),
				new Topic("spring", "Spring Boot", "Spring Boot Description")
				);
	}
}
