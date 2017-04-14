package com.thomas.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // Spring services are singletons. 
public class TopicService {
	
	@Autowired //spring will inject and instance of TopicRepository into this class. 
	private TopicRepository topicRepository;
	
//	private List<Topic> topics = new ArrayList<> (Arrays.asList(
//			new Topic("Spring", "Spring Framework", "This is Spring description"),
//			new Topic("Java", "Core Java", "This is java description"),
//			new Topic("AngularJS", "AngularJS2", "This is AngularJS description")
//			));
	
	public List<Topic> getAllTopics(){
		//return topics;
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll().forEach(topics::add); //for each elements in topcs, adding to the list. 
		return topics;
	}
	
	
	
	public Topic getTopic(String id){
//		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return topicRepository.findOne(id);
	}

	public void addTopic(Topic topic) {
//		getAllTopics().add(topic);
//		topics.add(topic);
		topicRepository.save(topic);
	}

	public void updateTopic(String id, Topic topic) {
//		for(int i=0; i < topics.size(); i++){
//			Topic t = topics.get(i);
//			if (t.getId().equals(id) ){
//				topics.set(i, topic);
//				return;
//			}
//		}
		
		topicRepository.save(topic);
	}

	public void deleteTopic(String id) { 
//		topics.removeIf(t -> t.getId().equals(id)); //lambda 
		topicRepository.delete(id); 
	}

 

}
