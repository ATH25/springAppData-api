package com.thomas.springbootstarter.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

/*Spring framework provide implementations for CRUD operations. All you have to do is to provide an interface for that
 * The interface needs to extend CrudRepository. See the ecample below. */
public interface CourseRepository extends CrudRepository<Course, String>{ // wehere Topic is the class and String is the datatype of the key
	
	//getAllTopics()
	//getTopic(String id)
	//updateTopic(Topic t)
	//deleteTopic(String id)
	
	public List<Course> findByName(String name); /*
		notice the name of this method. It has to start with find. Look at the Course object. 
		it has a "String name" class variable. What we are doing here is we are finding the Courses by its name*/
	
	public List<Course> findByDescription(String description); 
	
	public List<Course> findByTopicId(String topicId); /*Notice the name here first you are finding by Topic and then by its Id. 
	Because Topic is an object. Id is a field in that object. */
	
	
	
	
}
