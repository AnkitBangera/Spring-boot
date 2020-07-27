package com.SpringBoot.Topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	private List<Topic> topic = new ArrayList<Topic>(Arrays.asList(new Topic("spring", "Spring Topic", "Spring Description"),
			new Topic("java", "Core Java", "Java Description"),
			new Topic("spring", "Spring Boot", "Spring Boot Description")));
	public List<Topic> getTopics() {
		return topic;
	}
	
	public Topic getId(String id) {
		return topic.stream().filter(t-> t.getId().equals(id)).findFirst().get();
	}
	public void addTopic(Topic topic){
		this.topic.add(topic);
	}

	public void update(Topic topic2, String id) {
		for (int i=0;i<topic.size();i++) {
			if(topic.get(i).getId().equals(id)) {
				topic.set(i, topic2);
				return;
			}
		}
	}

	public void delete(String id) {
		topic.removeIf(t->t.getId().equals(id));
	}

}
