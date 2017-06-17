package com.coder.spring.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coder.spring.boot.bean.Topic;
import com.coder.spring.boot.service.TopicServices;

@RestController
public class TopicController {

	@Autowired
	private TopicServices topicServices;

	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return topicServices.getAllTopics();
	}

	@RequestMapping("/topics/{id}")
	public Topic getTopicById(@PathVariable String id) {
		return topicServices.getTopicById(id);
	}

	@RequestMapping("")
	public String getAllTopic() {
		return "Welcome Pages";
	}
}
