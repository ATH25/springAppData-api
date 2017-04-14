package com.thomas.springbootstarter.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // Spring services are singletons. 
public class CourseService {
	
	@Autowired //spring will inject and instance of TopicRepository into this class. 
	private CourseRepository courseRepository;
	
//	private List<Topic> topics = new ArrayList<> (Arrays.asList(
//			new Topic("Spring", "Spring Framework", "This is Spring description"),
//			new Topic("Java", "Core Java", "This is java description"),
//			new Topic("AngularJS", "AngularJS2", "This is AngularJS description")
//			));
	
	public List<Course> getAllCourses(String topicId){
		//return topics; 
		List<Course> course = new ArrayList<>();
		
		courseRepository.findByTopicId(topicId).forEach(course::add); //for each elements in topcs, adding to the list. 
		return course;
	}
	
	
	
	public Course getCourse(String id){
//		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return courseRepository.findOne(id);
	}

	public void addCourse(Course course) {
//		getAllTopics().add(topic);
//		topics.add(topic);
		courseRepository.save(course);
	}

	public void updateCourse(Course course) {
		courseRepository.save(course);
	}

	public void deleteCourse(String id) { 
		courseRepository.delete(id); 
	}

 

}
