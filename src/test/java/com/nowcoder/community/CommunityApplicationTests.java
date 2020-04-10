package com.nowcoder.community;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
class CommunityApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void testMath() {
		double i = 3 / 2.0;
		System.out.println(i);
		System.out.println(Math.ceil(i));
		System.out.println(Math.floor(i));
	}

}
