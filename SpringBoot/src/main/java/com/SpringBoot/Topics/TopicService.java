package com.SpringBoot.Topics;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	private List<Topic> topic = Arrays.asList(new Topic("spring", "Spring Topic", "Spring Description"),
			new Topic("java", "Core Java", "Java Description"),
			new Topic("spring", "Spring Boot", "Spring Boot Description"));
	public List<Topic> getTopics() {
		return topic;
	}
	
	public Topic getId(String id) {
		return topic.stream().filter(t-> t.getId().equals(id)).findFirst().get();
	}

}
