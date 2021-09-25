package com.company;

enum VehicleType {
    CAR, TRUCK, VAN, MOTORBIKE, BUS, E_BIKE, E_CAR, SCOOTER
}

enum ParkingSpotType {
    COMPACT, LARGE, MOTORCYCLE, ELECTRIC
}

public class Ticket {

    String Name;
    String Vehicle_No;
    String License_No;
    VehicleType vehicle;
    int Ticket_No;
    boolean ParkingTicketStatus;
    boolean PaymentStatus;
    ParkingSpotType parkingSpot;
    byte Floor_No;

    /*public Ticket(String Name,String Vehicle_No,String License_No,int Ticket_No,boolean ParkingTicketStatus){
        this.Name = Name;
        this.Vehicle_No = Vehicle_No;
        this.License_No = License_No;
        this.Ticket_No = Ticket_No;
        this.ParkingTicketStatus = ParkingTicketStatus;*/
    }


