package com.thomas.springbootstarter.test;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import com.thomas.springbootstarter.topic.TopicController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class HttpRequestTest {
	private static final Logger logger = LoggerFactory
			.getLogger(HttpRequestTest.class);

    @LocalServerPort  
    private int port;
    

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void greetingShouldReturnDefaultMessage() throws Exception {
    	logger.debug("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% server+port = " + "http://localhost:" + port + "/"
    			+" Content= "+ this.restTemplate.getForObject("http://localhost:" + port + "/",
    	                String.class) );
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/",
                String.class)).contains("springAppData-api");
    }
}