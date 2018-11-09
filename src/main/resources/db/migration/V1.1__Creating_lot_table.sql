CREATE TABLE Lot (
  Lot_id INT NOT NULL,
  Pricing_id INT,
  Lot_name VARCHAR(255),
  Lot_address VARCHAR(255),
  Lot_capacity INT,

  PRIMARY KEY (Lot_id)
);