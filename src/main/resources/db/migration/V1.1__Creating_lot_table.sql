CREATE TABLE Lot (
  lot_id INT NOT NULL,
  pricing_id INT,
  lot_name VARCHAR(255),
  lot_address VARCHAR(255),
  lot_capacity INT,

  PRIMARY KEY (lot_id),
  FOREIGN KEY (pricing_id) REFERENCES PRICING(pricing_id)
);