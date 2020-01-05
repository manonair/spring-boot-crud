package com.mt.crud;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import com.mt.crud.entities.User;

public class UserUnitTest {
    
    @Test
    public void whenCalledGetName_thenCorrect() {
        User user = new User("Manoj", "mnair@affinionds.com");
        
        assertThat(user.getName()).isEqualTo("Manoj");
    }
    
    @Test
    public void whenCalledGetEmail_thenCorrect() {
        User user = new User("Manoj", "mnair@affinionds.com");
        
        assertThat(user.getEmail()).isEqualTo("mnair@affinionds.com");
    }
    
    @Test
    public void whenCalledSetName_thenCorrect() {
        User user = new User("Manoj", "mnair@affinionds.com");
        
        user.setName("Sree");
        
        assertThat(user.getName()).isEqualTo("Sree");
    }
    
    @Test
    public void whenCalledSetEmail_thenCorrect() {
        User user = new User("Manoj", "mnair@affinionds.com");
        
        user.setEmail("Sree@domain.com");
        
        assertThat(user.getEmail()).isEqualTo("Sree@domain.com");
    }
    
    @Test
    public void whenCalledtoString_thenCorrect() {
        User user = new User("Manoj", "mnair@affinionds.com");
        assertThat(user.toString()).isEqualTo("User{id=0, name=Manoj, email=mnair@affinionds.com}");
    }
}
