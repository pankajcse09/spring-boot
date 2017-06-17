package com.coder.spring.boot.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.coder.spring.boot.bean.Topic;

@Service
public class TopicServices {

	List<Topic> topics = Arrays.asList(new Topic("Java", "Core Java"), new Topic("Spring", "Spring Boot"));

	public List<Topic> getAllTopics() {
		return topics;
	}

	public Topic getTopicById(String id) {
		return topics.stream().filter(t -> t.getId().equalsIgnoreCase(id)).findFirst().get();
	}

}
