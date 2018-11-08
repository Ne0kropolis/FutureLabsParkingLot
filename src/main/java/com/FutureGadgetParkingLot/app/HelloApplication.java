package com.FutureGadgetParkingLot.app;

import com.FutureGadgetParkingLot.rest.HelloRestService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

public class HelloApplication extends Application {
    private Set<Object> singletons = new HashSet<>();
    public HelloApplication() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        singletons.add(ctx.getBean("restService", HelloRestService.class));
    }

    @Override
    public Set<Object> getSingletons() {
        return singletons;
    }
}
