CREATE TABLE PRICING (
  Pricing_id INT UNIQUE NOT NULL,
  Duration INT NOT NULL,
  Granularity VARCHAR(1),
  PRIMARY KEY (Pricing_id, Duration)
);