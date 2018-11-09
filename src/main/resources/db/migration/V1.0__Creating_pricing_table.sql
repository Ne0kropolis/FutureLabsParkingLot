CREATE TABLE PRICING (
  Pricing_id INT NOT NULL,
  Duration INT NOT NULL,
  Granularity VARCHAR(1),
  Price DOUBLE,
  CONSTRAINT Pk_Pricing PRIMARY KEY (Pricing_id, Duration)
);