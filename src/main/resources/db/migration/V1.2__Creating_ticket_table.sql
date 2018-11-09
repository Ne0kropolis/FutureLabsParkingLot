CREATE TABLE TICKET (
  ticket_id INT UNIQUE NOT NULL,
  lot_id INT NOT NULL,
  ticket_date DATE NOT NULL,
  ticket_time_in TIME,
  ticket_time_out TIME,
  price DOUBLE,

  PRIMARY KEY (ticket_id, lot_id, ticket_date),
  FOREIGN KEY (lot_id) REFERENCES LOT(lot_id)

);