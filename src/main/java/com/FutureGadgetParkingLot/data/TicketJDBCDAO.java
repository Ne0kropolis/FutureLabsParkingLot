package com.FutureGadgetParkingLot.data;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.ArrayList;

public class TicketJDBCDAO implements DAO{
    private DataSource dataSource;
    private JdbcTemplate jdbct;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbct = new JdbcTemplate(dataSource);
    }

    public void create(String query) {
        jdbct.update(query);
    }

    public ArrayList<Ticket> get(String query) {
        return (ArrayList<Ticket>) jdbct.query(query, new TicketMapper());
    }
}
