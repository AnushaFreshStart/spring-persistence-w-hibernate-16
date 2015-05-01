package com.apress.springpersistence.audiomanager.test;

import com.apress.springpersistence.audiomanager.core.domain.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.apress.springpersistence.audiomanager.core.repository.PersonRepository;
import com.apress.springpersistence.audiomanager.AudioManagerApplication;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@SpringApplicationConfiguration(classes = AudioManagerApplication.class)
public class DependencyInjectionJUnitTest {

    @Autowired
    PersonRepository personRepository;

    @Test
    public void testPerson() {
       Person person = new Person();
    }

}
