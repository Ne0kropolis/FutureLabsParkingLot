package com.FutureGadgetParkingLot.data;

public class Lot {
    private int lotId;
    private int pricingId;
    private String lotName;
    private String lotLocation;
    private int lotCapacity;

    public Lot() {}

    public Lot(int lotId, String lotName, String lotLocation, int pricingId, int lotCapacity) {
        this.lotId = lotId;
        this.lotName = lotName;
        this.lotLocation = lotLocation;
        this.pricingId = pricingId;
        this.lotCapacity = lotCapacity;
    }
}

