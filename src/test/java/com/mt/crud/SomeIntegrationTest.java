package com.mt.crud;

import com.mt.crud.entities.User;
import com.mt.crud.repositories.UserRepository;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {Application.class, TestRepoConfig.class })
public class SomeIntegrationTest {
    @Autowired
    private UserRepository userRepository;

    @Before
    public void setup() {
         User user = new User("Manoj Nair", "manoj.nair@mindtree.com");
        userRepository.save(user);
    }

    @Test
    public void whenInserting_andCount_thenWeDontGetZero() {
        long count = userRepository.count();

        assertNotEquals(0, count);
    }

    @After
    public void clean() {
    	userRepository.deleteAll();
    }
}
