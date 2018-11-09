package com.FutureGadgetParkingLot.data;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Ticket {
    private int ticketId;
    private int lotId;
    private LocalDateTime date;
    private String timeIn;
    private String timeOut;
    private double price;

    Ticket(int pricing_id, int lot_id, Date ticket_date, Time ticket_time_in, Time ticket_time_out, double price) {}

    public Ticket(int ticketId, int lotId, LocalDateTime date, String timeIn, String timeOut, double price) {
        this.ticketId = ticketId;
        this.lotId = lotId;
        this.date = date;
        this.timeIn = timeIn;
        this.timeOut = timeOut;
        this.price = price;
    }

    public Ticket(int ticketId, int lotId, LocalDateTime date, String timeIn, String timeOut) {
        this.ticketId = ticketId;
        this.lotId = lotId;
        this.date = date;
        this.timeIn = timeIn;
        this.timeOut = timeOut;
        this.price = 0;
    }

    public void calculatePrice(int duration, ArrayList<Object> pricingScheme) {
        
    }
}
