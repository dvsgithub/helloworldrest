package com.sx.dvs.helloworldrest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloworldrestApplicationTests {

    @Test
    public void contextLoads() {
        GreetingController greetingController = new GreetingController();
        assertThat(greetingController.greeting("Spring").getContent(), containsString("Hello, Spring!"));
    }

}
