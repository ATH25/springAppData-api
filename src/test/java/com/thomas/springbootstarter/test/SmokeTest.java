package com.thomas.springbootstarter.test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.thomas.springbootstarter.home.HomeController;

@SpringBootTest
@RunWith(SpringRunner.class)
public class SmokeTest {
	
	@Autowired
	HomeController homeController;
	
	@Test
	public void test() {
		assertThat(homeController).isNotNull(); 
		//fail("Not yet implemented");
	}

}
