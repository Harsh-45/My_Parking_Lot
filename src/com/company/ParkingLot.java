package com.company;

import java.util.Scanner;

public class ParkingLot extends DisplayCurrentStatus{

    static int total_charge(int time){
        int t_charge;

        if(time == 1){
            t_charge = 20;
        }
        else if(time == 2){
            t_charge = 20+10;
        }
        else {
            t_charge = 20+10+5*(time-2);
        }
        return t_charge;
    }

    public static void main(String[] args) {

        // Display part-------------------------------------------------------------------------------------------------
        // This are variable which will store the numbers of vehicles parked of each type of floor 1
        int OccupiedCarSpot1 = 0;
        int OccupiedVanSpot1 = 0;
        int OccupiedBusSpot1 = 0;
        int OccupiedTruckSpot1 = 0;
        int OccupiedScooterSpot1 = 0;
        int OccupiedMotorbikeSpot1 = 0;
        int OccupiedE_bikeSpot1 = 0;
        int OccupiedE_carSpot1 = 0;
        //--------------------------------------------------------------------------------------------------------------
        // This are variable which will store the numbers of vehicles parked of each type of floor 2
        int OccupiedCarSpot2 = 0;
        int OccupiedVanSpot2 = 0;
        int OccupiedBusSpot2 = 0;
        int OccupiedTruckSpot2 = 0;
        int OccupiedScooterSpot2 = 0;
        int OccupiedMotorbikeSpot2 = 0;
        int OccupiedE_bikeSpot2 = 0;
        int OccupiedE_carSpot2 = 0;
        //--------------------------------------------------------------------------------------------------------------
        // This are variable which will store the numbers of vehicles parked of each type of floor 3
        int OccupiedCarSpot3 = 0;
        int OccupiedVanSpot3 = 0;
        int OccupiedBusSpot3 = 0;
        int OccupiedTruckSpot3 = 0;
        int OccupiedScooterSpot3 = 0;
        int OccupiedMotorbikeSpot3 = 0;
        int OccupiedE_bikeSpot3 = 0;
        int OccupiedE_carSpot3 = 0;
        //--------------------------------------------------------------------------------------------------------------
        // Variables used in the main method----------------------------------------------------------------------------
        byte Service; //this variable will take care of service whether user want to park ,unpark or exit from the system
        byte V_type;  //this variable will take care of the vehicle type that user will choose
        byte paymentService; //this variable will take care of the payment service whether user want to pay to attendent or at the exit panel
        int Total_TicketCount = 1; //this variable will take care of the ticket number that we are going provide to user
        int user_ticketNo; //this variable will store ticket number while unparking his/her variable
        byte paymentType;  //this variable will take care of the payment type whether user want to pay by credit or by cash
        byte charge_status; //this variable will decide whether user want to charge his/her vehicle or not
        int Electric_charge = 0; //this variable store Charge for charging the vehicle
        int Total_amount; //this variable will store total charge that user need to pay
        int Total_time; //this variable will store total time of parking
        //--------------------------------------------------------------------------------------------------------------

        Scanner input = new Scanner(System.in);
        System.out.println("                          Welcome!");
        System.out.println("                     To the XYZ Parking");
        System.out.println();

        System.out.println();
        System.out.println("Select '1' for parking and Select '2' for unparking your vehicle and 3 for exit ");
        Service = input.nextByte();
        while(Service != 1 && Service != 2 && Service != 3){
            System.out.println("You have entered incorrect type, Please try again ");
            Service = input.nextByte();
        }
        System.out.println();

        Ticket[] t = new Ticket[900];
        int tn=0;

        while (Service != 3) {

            if(tn!=0) {
                System.out.println();
                System.out.println("Select '1' for parking and Select '2' for unparking your vehicle and 3 for exit ");
                Service = input.nextByte();
                while (Service != 1 && Service != 2 && Service != 3) {
                    System.out.println("You have entered incorrect type, Please try again ");
                    Service = input.nextByte();
                }
                System.out.println();
            }

            t[tn] = new Ticket();

            display(OccupiedCarSpot1,OccupiedVanSpot1, OccupiedBusSpot1, OccupiedTruckSpot1, OccupiedMotorbikeSpot1, OccupiedScooterSpot1, OccupiedE_bikeSpot1, OccupiedE_carSpot1,
                    OccupiedCarSpot2,OccupiedVanSpot2, OccupiedBusSpot2, OccupiedTruckSpot2, OccupiedMotorbikeSpot2, OccupiedScooterSpot2, OccupiedE_bikeSpot2, OccupiedE_carSpot2,
                    OccupiedCarSpot3,OccupiedVanSpot3, OccupiedBusSpot3, OccupiedTruckSpot3, OccupiedMotorbikeSpot3, OccupiedScooterSpot3, OccupiedE_bikeSpot3, OccupiedE_carSpot3);
            System.out.println();
            //display2(OccupiedCarSpot2,OccupiedVanSpot2, OccupiedBusSpot2, OccupiedTruckSpot2, OccupiedMotorbikeSpot2, OccupiedScooterSpot2, OccupiedE_bikeSpot2, OccupiedE_carSpot2);
            //System.out.println();
            //display3(OccupiedCarSpot3,OccupiedVanSpot3, OccupiedBusSpot3, OccupiedTruckSpot3, OccupiedMotorbikeSpot3, OccupiedScooterSpot3, OccupiedE_bikeSpot3, OccupiedE_carSpot3);
            //System.out.println();

            if (Service == 1) {

                System.out.println("Please, Select your vehicle type by pressing that number :");
                System.out.println("1:Car 2:MotorBike 3:Scooter 4:Van 5:Bus 6:Truck 7:E_Bike 8:E_Car");
                V_type = input.nextByte();
                while(V_type > 8 || V_type  <1){
                    System.out.println("You have entered incorrect type, Please try again ");
                    V_type = input.nextByte();
                }
                if (V_type == 1) {
                    t[tn].vehicle = VehicleType.CAR;
                    if(OccupiedCarSpot1 == maxCarSpot1){
                        if (OccupiedCarSpot2 == maxCarSpot2)
                        {
                            if(OccupiedCarSpot3 == maxCarSpot3){
                                System.out.println("Sorry! Space is not available for parking");
                                System.out.println();
                                continue;
                            }
                            else{
                                t[tn].Floor_No = 3;
                                OccupiedCarSpot3++;
                                t[tn].parkingSpot =ParkingSpotType.COMPACT ;
                            }
                        }
                        else{
                            t[tn].Floor_No = 2;
                            OccupiedCarSpot2++;
                            t[tn].parkingSpot = ParkingSpotType.COMPACT;
                        }
                    }
                    else{
                        t[tn].Floor_No = 1;
                        OccupiedCarSpot1++;
                        t[tn].parkingSpot = ParkingSpotType.COMPACT;
                    }
                }

                else if (V_type == 2) {
                    t[tn].vehicle = VehicleType.MOTORBIKE;
                    if(OccupiedMotorbikeSpot1 == maxMotorbikeSpot1){
                        if (OccupiedMotorbikeSpot2 == maxMotorbikeSpot2)
                        {
                            if(OccupiedMotorbikeSpot3 == maxMotorbikeSpot3){
                                System.out.println("Sorry! Space is not available for parking");
                                System.out.println();
                                continue;
                            }
                            else{
                                t[tn].Floor_No = 3;
                                OccupiedMotorbikeSpot3++;
                                t[tn].parkingSpot = ParkingSpotType.MOTORCYCLE;
                            }
                        }
                        else{
                            t[tn].Floor_No = 2;
                            OccupiedMotorbikeSpot2++;
                            t[tn].parkingSpot = ParkingSpotType.MOTORCYCLE;
                        }
                    }
                    else{
                        t[tn].Floor_No = 1;
                        OccupiedMotorbikeSpot1++;
                        t[tn].parkingSpot = ParkingSpotType.MOTORCYCLE;
                    }
                }

                else if (V_type == 3) {
                    t[tn].vehicle = VehicleType.SCOOTER;
                    if(OccupiedScooterSpot1 == maxScooterSpot1){
                        if (OccupiedScooterSpot2 == maxScooterSpot2)
                        {
                            if(OccupiedScooterSpot3 == maxScooterSpot3){
                                System.out.println("Sorry! Space is not available for parking");
                                System.out.println();
                                continue;
                            }
                            else{
                                t[tn].Floor_No = 3;
                                OccupiedScooterSpot3++;
                                t[tn].parkingSpot = ParkingSpotType.MOTORCYCLE;
                            }
                        }
                        else{
                            t[tn].Floor_No = 2;
                            OccupiedScooterSpot2++;
                            t[tn].parkingSpot = ParkingSpotType.MOTORCYCLE;
                        }
                    }
                    else{
                        t[tn].Floor_No = 1;
                        OccupiedScooterSpot1++;
                        t[tn].parkingSpot = ParkingSpotType.MOTORCYCLE;
                    }
                }

                else if (V_type == 4) {
                    t[tn].vehicle = VehicleType.VAN;
                    if(OccupiedVanSpot1 == maxVanSpot1){
                        if (OccupiedVanSpot2 == maxVanSpot2)
                        {
                            if(OccupiedVanSpot3 == maxVanSpot3){
                                System.out.println("Sorry! Space is not available for parking");
                                System.out.println();
                                continue;
                            }
                            else{
                                t[tn].Floor_No = 3;
                                OccupiedVanSpot3++;
                                t[tn].parkingSpot = ParkingSpotType.COMPACT;
                            }
                        }
                        else{
                            t[tn].Floor_No = 2;
                            OccupiedVanSpot2++;
                            t[tn].parkingSpot = ParkingSpotType.COMPACT;
                        }
                    }
                    else{
                        t[tn].Floor_No = 1;
                        OccupiedVanSpot1++;
                        t[tn].parkingSpot = ParkingSpotType.COMPACT;
                    }
                }

                else if (V_type == 5) {
                    t[tn].vehicle = VehicleType.BUS;
                    if(OccupiedBusSpot1 == maxBusSpot1){
                        if (OccupiedBusSpot2 == maxBusSpot2)
                        {
                            if(OccupiedBusSpot3 == maxBusSpot3){
                                System.out.println("Sorry! Space is not available for parking");
                                System.out.println();
                                continue;
                            }
                            else{
                                t[tn].Floor_No = 3;
                                OccupiedBusSpot3++;
                                t[tn].parkingSpot = ParkingSpotType.LARGE;
                            }
                        }
                        else{
                            t[tn].Floor_No = 2;
                            OccupiedBusSpot2++;
                            t[tn].parkingSpot = ParkingSpotType.LARGE;
                        }
                    }
                    else{
                        t[tn].Floor_No = 1;
                        OccupiedBusSpot1++;
                        t[tn].parkingSpot = ParkingSpotType.LARGE;
                    }
                }

                else if (V_type == 6) {
                    t[tn].vehicle = VehicleType.TRUCK;
                    if(OccupiedTruckSpot1 == maxTruckSpot1){
                        if (OccupiedTruckSpot2 == maxTruckSpot2)
                        {
                            if(OccupiedTruckSpot3 == maxTruckSpot3){
                                System.out.println("Sorry! Space is not available for parking");
                                System.out.println();
                                continue;
                            }
                            else{
                                t[tn].Floor_No = 3;
                                OccupiedTruckSpot3++;
                                t[tn].parkingSpot = ParkingSpotType.LARGE;
                            }
                        }
                        else{
                            t[tn].Floor_No = 2;
                            OccupiedTruckSpot2++;
                            t[tn].parkingSpot = ParkingSpotType.LARGE;
                        }
                    }
                    else{
                        t[tn].Floor_No = 1;
                        OccupiedTruckSpot1++;
                        t[tn].parkingSpot = ParkingSpotType.LARGE;
                    }
                }

                else if (V_type == 7) {
                    t[tn].vehicle = VehicleType.E_BIKE;
                    if(OccupiedE_bikeSpot1 == maxE_bike1){
                        if (OccupiedE_bikeSpot2 == maxE_bike2)
                        {
                            if(OccupiedE_bikeSpot3 == maxE_bike3){
                                System.out.println("Sorry! Space is not available for parking");
                                System.out.println();
                                continue;
                            }
                            else{
                                t[tn].Floor_No = 3;
                                OccupiedE_bikeSpot3++;
                                t[tn].parkingSpot = ParkingSpotType.ELECTRIC;
                                System.out.println("It will take Rs.50 to charge your Electric car");
                                System.out.println("If you want to charge your vehicle. Press '1' for yes or '2' for no");
                                charge_status = input.nextByte();
                                if(charge_status == 1){
                                    Electric_charge = 50;
                                }
                                else {
                                    Electric_charge = 0;
                                }
                            }
                        }
                        else{
                            t[tn].Floor_No = 2;
                            OccupiedE_bikeSpot2++;
                            t[tn].parkingSpot = ParkingSpotType.ELECTRIC;
                            System.out.println("It will take Rs.50 to charge your Electric car");
                            System.out.println("If you want to charge your vehicle. Press '1' for yes or '2' for no");
                            charge_status = input.nextByte();
                            if(charge_status == 1){
                                Electric_charge = 50;
                            }
                            else {
                                Electric_charge = 0;
                            }
                        }
                    }
                    else{
                        t[tn].Floor_No = 1;
                        OccupiedE_bikeSpot1++;
                        t[tn].parkingSpot = ParkingSpotType.ELECTRIC;
                        System.out.println("It will take Rs.50 to charge your Electric car");
                        System.out.println("If you want to charge your vehicle. Press '1' for yes or '2' for no");
                        charge_status = input.nextByte();
                        if(charge_status == 1){
                            Electric_charge = 50;
                        }
                        else {
                            Electric_charge = 0;
                        }
                    }
                }

                else{
                    t[tn].vehicle = VehicleType.E_CAR;
                    if(OccupiedE_carSpot1 == maxE_car1){
                        if (OccupiedE_carSpot2 == maxE_car2)
                        {
                            if(OccupiedE_carSpot3 == maxE_car3){
                                System.out.println("Sorry! Space is not available for parking");
                                System.out.println();
                                continue;
                            }
                            else{
                                t[tn].Floor_No = 3;
                                OccupiedE_carSpot3++;
                                t[tn].parkingSpot = ParkingSpotType.ELECTRIC;
                                System.out.println("It will take Rs.50 to charge your Electric car");
                                System.out.println("If you want to charge your vehicle. Press '1' for yes or '2' for no");
                                charge_status = input.nextByte();
                                if(charge_status == 1){
                                    Electric_charge = 100;
                                }
                                else {
                                    Electric_charge = 0;
                                }
                            }
                        }
                        else{
                            t[tn].Floor_No = 2;
                            OccupiedE_carSpot2++;
                            t[tn].parkingSpot = ParkingSpotType.ELECTRIC;
                            System.out.println("It will take Rs.100 to charge your Electric car");
                            System.out.println("If you want to charge your vehicle. Press '1' for yes or '2' for no");
                            charge_status = input.nextByte();
                            if(charge_status == 1){
                                Electric_charge = 100;
                            }
                            else {
                                Electric_charge = 0;
                            }
                        }
                    }
                    else{
                        t[tn].Floor_No = 1;
                        OccupiedE_carSpot1++;
                        t[tn].parkingSpot = ParkingSpotType.ELECTRIC;
                        System.out.println("It will take Rs.100 to charge your Electric car");
                        System.out.println("If you want to charge your vehicle. Press '1' for yes or '2' for no");
                        charge_status = input.nextByte();
                        if(charge_status == 1){
                            Electric_charge = 100;
                        }
                        else {
                            Electric_charge = 0;
                        }
                    }
                }

                // User will enter his/her Name-------------------------------------------------------------------------
                System.out.println();
                System.out.print("Enter your Name : ");
                t[tn].Name = input.next();

                // User will enter the Vehicle number-------------------------------------------------------------------
                System.out.print("Enter your Vehicle No : ");
                t[tn].Vehicle_No = input.next();

                // User will enter the License number-------------------------------------------------------------------
                System.out.print("Enter your Vehicle license No : ");
                t[tn].License_No = input.next();

                // Here, we will provide user a ticket through which he/she unpark his/her vehicle----------------------

                t[tn].Ticket_No = Total_TicketCount;
                Total_TicketCount++;

                System.out.println();
                System.out.println("Confirming your Detail :- ");
                System.out.println("Name : " + t[tn].Name);
                System.out.println("Vehicle type : " + t[tn].vehicle);
                System.out.println("ParkingSpot type : " + t[tn].parkingSpot);
                System.out.println("Vehicle No : " + t[tn].Vehicle_No);
                System.out.println("License No : " + t[tn].License_No);
                System.out.println("Floor No : " + t[tn].Floor_No);
                System.out.println("Your Ticket Number is " + t[tn].Ticket_No);

                System.out.println();
                System.out.println("Your Vehicle is successfully parked");

                tn++;
            }

            if (Service == 2) {

                if(tn == 0){
                    System.out.println("You have not parked any vehicle yet");
                    return;
                }
                System.out.println("Please, Enter your ticket number : ");
                user_ticketNo = input.nextInt();
                for (int i = 0; i < Total_TicketCount; i++) {

                    //Increasing occupied space after unparking the vehicle--------------------------------------------
                    if (t[i].Ticket_No == user_ticketNo) {
                        if(t[i].vehicle == VehicleType.CAR){
                            if(t[i].Floor_No == 1){
                                OccupiedCarSpot1--;
                            }
                            else if(t[i].Floor_No == 2){
                                OccupiedCarSpot2--;
                            }
                            else{
                                OccupiedCarSpot3--;
                            }
                        }
                        else if(t[i].vehicle == VehicleType.VAN)
                        {
                            if(t[i].Floor_No == 1){
                                OccupiedVanSpot1--;
                            }
                            else if(t[i].Floor_No == 2){
                                OccupiedVanSpot2--;
                            }
                            else{
                                OccupiedVanSpot3--;
                            }
                        }
                        else if(t[i].vehicle == VehicleType.TRUCK)
                        {
                            if(t[i].Floor_No == 1){
                                OccupiedTruckSpot1--;
                            }
                            else if(t[i].Floor_No == 2){
                                OccupiedTruckSpot2--;
                            }
                            else{
                                OccupiedTruckSpot3--;
                            }
                        }
                        else if(t[i].vehicle == VehicleType.BUS)
                        {
                            if(t[i].Floor_No == 1){
                                OccupiedBusSpot1--;
                            }
                            else if(t[i].Floor_No == 2){
                                OccupiedBusSpot2--;
                            }
                            else{
                                OccupiedBusSpot3--;
                            }
                        }
                        else if(t[i].vehicle == VehicleType.MOTORBIKE)
                        {
                            if(t[i].Floor_No == 1){
                                OccupiedMotorbikeSpot1--;
                            }
                            else if(t[i].Floor_No == 2){
                                OccupiedMotorbikeSpot2--;
                            }
                            else{
                                OccupiedMotorbikeSpot3--;
                            }
                        }
                        else if(t[i].vehicle == VehicleType.SCOOTER)
                        {
                            if(t[i].Floor_No == 1){
                                OccupiedScooterSpot1--;
                            }
                            else if(t[i].Floor_No == 2){
                                OccupiedScooterSpot2--;
                            }
                            else{
                                OccupiedScooterSpot3--;
                            }
                        }
                        else if(t[i].vehicle == VehicleType.E_BIKE)
                        {
                            if(t[i].Floor_No == 1){
                                OccupiedE_bikeSpot1--;
                            }
                            else if(t[i].Floor_No == 2){
                                OccupiedE_bikeSpot2--;
                            }
                            else{
                                OccupiedE_bikeSpot3--;
                            }
                        }
                        else if(t[i].vehicle == VehicleType.E_CAR)
                        {
                            if(t[i].Floor_No == 1){
                                OccupiedE_carSpot1--;
                            }
                            else if(t[i].Floor_No == 2){
                                OccupiedE_carSpot2--;
                            }
                            else{
                                OccupiedE_carSpot3--;
                            }
                        }
                        //----------------------------------------------------------------------------------------------
                        // ---------------------------------------------------------------------------------------------
                        System.out.println("Press '1' if u want to do payment to attendent and '2' if if u want to payment at exit panel");
                        paymentService = input.nextByte();
                        if (paymentService == 1) {
                            System.out.println("How will you pay ");
                            System.out.println("Press '1' for credit and '2' for cash");
                            paymentType = input.nextByte();
                            if (paymentType == 1) {
                                System.out.println("Enter the total hour for which you have parked your "+t[i].vehicle);
                                Total_time = input.nextInt();
                                Total_amount = total_charge(Total_time)+Electric_charge;
                                System.out.println("Your total charge is "+Total_amount);
                                System.out.println("Your payment has been done successfully");
                                System.out.println();
                                System.out.println("Your vehicle is unparked successfully");
                                System.out.println("                                      THANK YOU!");
                                System.out.println("                         Hope, you have liked our service");
                            }
                            else{
                                System.out.println("Your vehicle is unparked successfully");
                                System.out.println("Enter the total hour for which you have parked your "+t[i].vehicle);
                                Total_time = input.nextInt();
                                Total_amount = total_charge(Total_time)+Electric_charge;
                                System.out.println("Your total charge is "+Total_amount);
                                System.out.println("Your payment has been done successfully");
                                System.out.println();
                                System.out.println("                                      THANK YOU!");
                                System.out.println("                         Hope, you have liked our service");
                            }
                        }
                    }
                }
            }
        }
    }
}
