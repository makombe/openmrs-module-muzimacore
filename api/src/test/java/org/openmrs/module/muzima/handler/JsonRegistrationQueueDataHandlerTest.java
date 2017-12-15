package org.openmrs.module.muzima.handler;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.openmrs.Patient;
import org.openmrs.module.muzima.model.QueueData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ResourceLoader;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.context.support.XmlWebApplicationContext;

@ContextConfiguration(locations = "/TestingApplicationContext.xml")
public class JsonRegistrationQueueDataHandlerTest {


    private JsonRegistrationQueueDataHandler jsonRegistrationQueueDataHandler;
    @Autowired
    private QueueData queueData;

    @Before
    public void setUp() {
        ApplicationContext testApplicationContext = new ClassPathXmlApplicationContext("handlerTestingApplicationContect.xml");
        jsonRegistrationQueueDataHandler = new JsonRegistrationQueueDataHandler();

    }

    @Test
    public void getDiscriminatorValueTest() {
        Assertions.assertThat(jsonRegistrationQueueDataHandler.getDiscriminator()).isNotNull();
        Assertions.assertThat(jsonRegistrationQueueDataHandler.getDiscriminator()).isNotEmpty();
        Assertions.assertThat(jsonRegistrationQueueDataHandler.getDiscriminator()).isEqualTo("json-registration");
    }



}