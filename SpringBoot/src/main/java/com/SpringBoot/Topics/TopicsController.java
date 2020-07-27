package com.SpringBoot.Topics;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicsController {
	@Autowired
	private TopicService topicService;

	@RequestMapping("/topics")
	public List<Topic> getTopics() {
		return topicService.getTopics();
	}

	@RequestMapping("topic/{id}")
	public Topic getTopicBasedOnId(@PathVariable String id) {
		return topicService.getId(id);
	}

	@RequestMapping(value = "/addTopic", method = RequestMethod.POST, headers = "Accept=application/json")
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
	}

	@RequestMapping(value = "/updateTopic/{id}", method = RequestMethod.PUT, headers = "Accept=application/json")
	public void updateTopic(@RequestBody Topic topic, @PathVariable String id) {
		topicService.update(topic, id);
	}

	@RequestMapping(value = "/delete", method = RequestMethod.DELETE)
	public void deleteTopic(String id) {
		topicService.delete(id);
	}
}
