package com.thomas.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class TopicController {
	
	@Autowired  // create an instance of TopicService without 'new' keyword  
	private TopicService topicSErvice;
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics(){
/*		if(topicSErvice == null ){
			System.out.println("############# topicSErvice is null ###################");
			System.out.println(topicSErvice);
		}else{
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@ topicSErvice is not null @@@@@@@@@@@@@@@@@@@@@@@@@");
		}*/
		
		return topicSErvice.getAllTopics();
	}
	
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id){
		return topicSErvice.getTopic(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/topics")
	public void addTopic(@RequestBody Topic topic){
		topicSErvice.addTopic(topic);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{id}")
	public void updateTopic(@RequestBody Topic topic, @PathVariable String id){
		topicSErvice.updateTopic(id, topic);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}")
	public void deleteTopic(@PathVariable String id){
		topicSErvice.deleteTopic(id);
	}
	
	

}
