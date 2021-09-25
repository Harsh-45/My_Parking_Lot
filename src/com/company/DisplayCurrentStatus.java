package com.company;

public class DisplayCurrentStatus {

    static final int maxCarSpot1 = 50;
    static final int maxVanSpot1 = 50;
    static final int maxBusSpot1 = 25;
    static final int maxTruckSpot1 = 25;
    static final int maxMotorbikeSpot1 = 100;
    static final int maxScooterSpot1 = 100;
    static final int maxE_bike1 = 25;
    static final int maxE_car1 = 25;

    static final int maxCarSpot2 = 50;
    static final int maxVanSpot2 = 50;
    static final int maxBusSpot2 = 25;
    static final int maxTruckSpot2 = 25;
    static final int maxMotorbikeSpot2 = 100;
    static final int maxScooterSpot2 = 100;
    static final int maxE_bike2 = 25;
    static final int maxE_car2 = 25;

    static final int maxCarSpot3 = 50;
    static final int maxVanSpot3 = 50;
    static final int maxBusSpot3 = 25;
    static final int maxTruckSpot3 = 25;
    static final int maxMotorbikeSpot3 = 100;
    static final int maxScooterSpot3 = 100;
    static final int maxE_bike3 = 25;
    static final int maxE_car3 = 25;

    static void display1(int a,int b,int c,int d,int e,int f,int g,int h){
        System.out.println("Available Car spots at 1st Floor : "+(maxCarSpot1-a));
        System.out.println("Available Van spots at 1st Floor : "+(maxVanSpot1-b));
        System.out.println("Available Bus spots at 1st Floor : "+(maxBusSpot1-c));
        System.out.println("Available Truck spots at 1st Floor : "+(maxTruckSpot1-d));
        System.out.println("Available Motorbike spots at 1st Floor : "+(maxMotorbikeSpot1-e));
        System.out.println("Available Scooter spots at 1st Floor : "+(maxScooterSpot1-f));
        System.out.println("Available E_Bike spots at 1st Floor : "+(maxE_bike1-g));
        System.out.println("Available E_Car spots at 1st Floor : "+(maxE_car1-h));
    }

    static void display2(int a2,int b2,int c2,int d2,int e2,int f2,int g2,int h2){
        System.out.println("Available Car spots at 2nd Floor : "+(maxCarSpot2-a2));
        System.out.println("Available Van spots at 2nd Floor : "+(maxVanSpot2-b2));
        System.out.println("Available Bus spots at 2nd Floor : "+(maxBusSpot2-c2));
        System.out.println("Available Truck spots at 2nd Floor : "+(maxTruckSpot2-d2));
        System.out.println("Available Motorbike spots 2nd 1st Floor : "+(maxMotorbikeSpot2-e2));
        System.out.println("Available Scooter spots at 2nd Floor : "+(maxScooterSpot2-f2));
        System.out.println("Available E_Bike spots at 2nd Floor : "+(maxE_bike2-g2));
        System.out.println("Available E_Car spots at 2nd Floor : "+(maxE_car2-h2));
    }

    static void display3(int a3,int b3,int c3,int d3,int e3,int f3,int g3,int h3){
        System.out.println("Available Car spots at 3rd Floor : "+(maxCarSpot3-a3));
        System.out.println("Available Van spots at 3rd Floor : "+(maxVanSpot3-b3));
        System.out.println("Available Bus spots at 3rd Floor : "+(maxBusSpot3-c3));
        System.out.println("Available Truck spots at 3rd Floor : "+(maxTruckSpot3-d3));
        System.out.println("Available Motorbike spots at 3rd Floor : "+(maxMotorbikeSpot3-e3));
        System.out.println("Available Scooter spots at 3rd Floor : "+(maxScooterSpot3-f3));
        System.out.println("Available E_Bike spots at 3rd Floor : "+(maxE_bike3-g3));
        System.out.println("Available E_Car spots at 3rd Floor : "+(maxE_car3-h3));
    }
}
