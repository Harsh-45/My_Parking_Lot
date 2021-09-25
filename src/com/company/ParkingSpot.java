package com.company;

public class ParkingSpot {
    String number;
    boolean free;
    Vehicle vehicle;
    ParkingSpotType type;

    public ParkingSpot(ParkingSpotType type){
        this.type = type;
    }

    public void assignVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
        free = false;
    }
    public void removeVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
        free = true;
    }
}

class CompactSpot extends ParkingSpot {
    public CompactSpot() {
        super(ParkingSpotType.COMPACT);
    }
}

class LargeSpot extends ParkingSpot {
    public LargeSpot() {
        super(ParkingSpotType.LARGE);
    }
}

class MotorbikeSpot extends ParkingSpot {
    public MotorbikeSpot() {
        super(ParkingSpotType.MOTORCYCLE);
    }
}

class ElectricSpot extends ParkingSpot {
    public ElectricSpot() {
        super(ParkingSpotType.ELECTRIC);
    }
}