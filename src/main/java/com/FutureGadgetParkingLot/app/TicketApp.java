package com.FutureGadgetParkingLot.app;

import com.FutureGadgetParkingLot.data.Ticket;
import com.FutureGadgetParkingLot.rest.TicketRestService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.FutureGadgetParkingLot.data.TicketJDBCDAO;

import javax.ws.rs.core.Application;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class TicketApp extends Application {
    private Set<Object> singletons = new HashSet<>();
    public TicketApp(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        singletons.add(ctx.getBean("ticketRestService", TicketRestService.class));
        TicketJDBCDAO ticketJDBCDAO = (TicketJDBCDAO) ctx.getBean("ticketJDBCTemplate");

        String query = "SELECT * FROM TICKET";
        ArrayList<Ticket> tickets = ticketJDBCDAO.get(query);
        singletons.add(tickets);
    }

    @Override
    public Set<Object> getSingletons() {
        return singletons;
    }

}
