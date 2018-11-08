package com.FutureGadgetParkingLot.data;

public class Pricing {
    private int pricingId;
    private  int duration;
    private String granularity;

    public Pricing () {}

    public Pricing (int pricingId, int duration, String granularity) {
        this.pricingId = pricingId;
        this.duration = duration;
        this.granularity = granularity;
    }
}
