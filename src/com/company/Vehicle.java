package com.company;

import java.util.*;

public class Vehicle {

    VehicleType type;

    public Vehicle(VehicleType type){
        this.type = type;
    }
}

class Car extends Vehicle{
    public Car(){
        super(VehicleType.CAR);
    }
}
class Van extends Vehicle{
    public Van(){
        super(VehicleType.VAN);
    }
}
class Bus extends Vehicle{
    public Bus(){
        super(VehicleType.BUS);
    }
}
class Truck extends Vehicle{
    public Truck(){
        super(VehicleType.TRUCK);
    }
}
class MotorBike extends Vehicle{
    public MotorBike(){
        super(VehicleType.MOTORBIKE);
    }
}
class Scooter extends Vehicle{
    public Scooter(){
        super(VehicleType.SCOOTER);
    }
}
class E_bike extends Vehicle{
    public E_bike(){
        super(VehicleType.E_BIKE);
    }
}
class E_car extends Vehicle{
    public E_car(){
        super(VehicleType.E_CAR);
    }
}