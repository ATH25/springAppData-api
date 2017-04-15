package com.thomas.springbootstarter.topic;

import org.springframework.data.repository.CrudRepository;

/*Spring framework provide implementations for CRUD operations. All you have to do is to provide an interface for that
 * The interface needs to extend CrudRepository. See the ecample below. */
public interface TopicRepository extends CrudRepository<Topic, String>{ // wehere Topic is the class and String is the datatype of the key
	
	//getAllTopics()
	//getTopic(String id)
	//updateTopic(Topic t)
	//deleteTopic(String id)
	
	
}
