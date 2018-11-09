CREATE TABLE TICKET (
  Ticket_id INT NOT NULL,
  Lot_id INT NOT NULL,
  Ticket_date DATE NOT NULL,
  Ticket_time_in TIME,
  Ticket_time_out TIME,
  Price DOUBLE,

  CONSTRAINT PK_Ticket PRIMARY KEY (ticket_id, lot_id, ticket_date),
  FOREIGN KEY (lot_id) REFERENCES LOT(lot_id)

);