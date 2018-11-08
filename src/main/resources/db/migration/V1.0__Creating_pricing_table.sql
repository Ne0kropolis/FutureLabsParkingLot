CREATE TABLE PRICING (
  Pricing_id INT NOT NULL,
  Duration INT NOT NULL,
  Granularity VARCHAR(1) DEFAULT 'L',
  PRIMARY KEY (Pricing_id, Duration)
);