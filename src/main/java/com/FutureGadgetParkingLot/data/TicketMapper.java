package com.FutureGadgetParkingLot.data;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class TicketMapper implements RowMapper<Ticket> {
    public Ticket mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Ticket(
                rs.getInt("Pricing_id"),
                rs.getInt("Lot_id"),
                rs.getDate("Ticket_date"),
                rs.getTime("Ticket_time_in"),
                rs.getTime("Ticket_time_out"),
                rs.getDouble("Price"));
    }
}
