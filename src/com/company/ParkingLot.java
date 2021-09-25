package com.company;

import java.util.Scanner;

public class ParkingLot extends DisplayCurrentStatus{

    public static void main(String[] args) {

        // Display part-----------------------------------------------------------------------------------
        int OccupiedCarSpot1 = 0;
        int OccupiedVanSpot1 = 0;
        int OccupiedBusSpot1 = 0;
        int OccupiedTruckSpot1 = 0;
        int OccupiedScooterSpot1 = 0;
        int OccupiedMotorbikeSpot1 = 0;
        int OccupiedE_bikeSpot1 = 0;
        int OccupiedE_carSpot1 = 0;
        //------------------------------------------------------------------------------------------------
        int OccupiedCarSpot2 = 0;
        int OccupiedVanSpot2 = 0;
        int OccupiedBusSpot2 = 0;
        int OccupiedTruckSpot2 = 0;
        int OccupiedScooterSpot2 = 0;
        int OccupiedMotorbikeSpot2 = 0;
        int OccupiedE_bikeSpot2 = 0;
        int OccupiedE_carSpot2 = 0;
        //-------------------------------------------------------------------------------------------------
        int OccupiedCarSpot3 = 0;
        int OccupiedVanSpot3 = 0;
        int OccupiedBusSpot3 = 0;
        int OccupiedTruckSpot3 = 0;
        int OccupiedScooterSpot3 = 0;
        int OccupiedMotorbikeSpot3 = 0;
        int OccupiedE_bikeSpot3 = 0;
        int OccupiedE_carSpot3 = 0;
        //--------------------------------------------------------------------------------------------------------------
        byte Service;
        byte V_type;
        byte paymentService;
        int Total_TicketCount = 1;
        int user_ticketNo;
        byte paymentType;

        Scanner input = new Scanner(System.in);
        System.out.println("                          Welcome!");
        System.out.println("                     To the XYZ Parking");
        System.out.println();

        System.out.println();
        System.out.println("Select '1' for parking and Select '2' for unparking your vehicle and 3 for exit ");
        Service = input.nextByte();
        System.out.println();

        Ticket[] t = new Ticket[900];
        int tn=0;

        while (Service != 3) {

            t[tn] = new Ticket();

            display1(OccupiedCarSpot1,OccupiedVanSpot1, OccupiedBusSpot1, OccupiedTruckSpot1, OccupiedMotorbikeSpot1, OccupiedScooterSpot1, OccupiedE_bikeSpot1, OccupiedE_carSpot1);
            System.out.println();
            display2(OccupiedCarSpot2,OccupiedVanSpot2, OccupiedBusSpot2, OccupiedTruckSpot2, OccupiedMotorbikeSpot2, OccupiedScooterSpot2, OccupiedE_bikeSpot2, OccupiedE_carSpot2);
            System.out.println();
            display3(OccupiedCarSpot3,OccupiedVanSpot3, OccupiedBusSpot3, OccupiedTruckSpot3, OccupiedMotorbikeSpot3, OccupiedScooterSpot3, OccupiedE_bikeSpot3, OccupiedE_carSpot3);
            System.out.println();

            if (Service == 1) {

                System.out.println("Please, Select any of the option given below:");
                System.out.println("1:Car 2:MotorBike 3:Scooter 4:Van 5:Bus 6:Truck 7:E_Bike 8:E_Car");
                V_type = input.nextByte();

                if (V_type == 1) {
                    t[tn].vehicle = VehicleType.CAR;
                    if(OccupiedCarSpot1 == maxCarSpot1){
                        if (OccupiedCarSpot2 == maxCarSpot2)
                        {
                            if(OccupiedCarSpot3 == maxCarSpot3){
                                System.out.println("Sorry! Space is not available for parking");
                            }
                            else{
                                t[tn].Floor_No = 3;
                                OccupiedCarSpot3++;
                                t[tn].parkingSpot = ParkingSpotType.COMPACT;
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
                            }
                            else{
                                t[tn].Floor_No = 3;
                                OccupiedE_bikeSpot3++;
                                t[tn].parkingSpot = ParkingSpotType.ELECTRIC;
                            }
                        }
                        else{
                            t[tn].Floor_No = 2;
                            OccupiedE_bikeSpot2++;
                            t[tn].parkingSpot = ParkingSpotType.ELECTRIC;
                        }
                    }
                    else{
                        t[tn].Floor_No = 1;
                        OccupiedE_bikeSpot1++;
                        t[tn].parkingSpot = ParkingSpotType.ELECTRIC;
                    }
                }

                else if (V_type == 8) {
                    t[tn].vehicle = VehicleType.E_CAR;
                    if(OccupiedE_carSpot1 == maxE_car1){
                        if (OccupiedE_carSpot2 == maxE_car2)
                        {
                            if(OccupiedE_carSpot3 == maxE_car3){
                                System.out.println("Sorry! Space is not available for parking");
                            }
                            else{
                                t[tn].Floor_No = 3;
                                OccupiedE_carSpot3++;
                                t[tn].parkingSpot = ParkingSpotType.ELECTRIC;
                            }
                        }
                        else{
                            t[tn].Floor_No = 2;
                            OccupiedE_carSpot2++;
                            t[tn].parkingSpot = ParkingSpotType.ELECTRIC;
                        }
                    }
                    else{
                        t[tn].Floor_No = 1;
                        OccupiedE_carSpot1++;
                        t[tn].parkingSpot = ParkingSpotType.ELECTRIC;
                    }
                }

                // Here there will be some mechanism which will check
                // whether for given vehicle free spot is available or not

                // Now I am assuming that free spot is available

                /* User will decide the parking floor number------------------------------------------------------------
                System.out.println();
                System.out.println("In which floor you want to park your Vehicle :");
                System.out.println("'1'-First floor  '2'- Second floor  '3'-Third floor");
                floorNo = input.nextByte();
                t[tn].Floor_No = floorNo;*/

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
                System.out.println("Name : "+t[tn].Name);
                System.out.println("Vehicle type : "+t[tn].vehicle);
                System.out.println("ParkingSpot type : "+t[tn].parkingSpot);
                System.out.println("Vehicle No : "+t[tn].Vehicle_No);
                System.out.println("License No : "+t[tn].License_No);
                System.out.println("Floor No : "+t[tn].Floor_No);
                System.out.println("Your Ticket Number is " +t[tn].Ticket_No);

                System.out.println();
                System.out.println("Your Vehicle is successfully parked");

                tn++;
            }

            if (Service == 2) {
                System.out.println("Please, Enter you ticket number : ");
                user_ticketNo = input.nextInt();
                for (int i = 0; i < Total_TicketCount; i++) {
                     //Increasing occupied space after unparking the vehicle--------------------------------------------
                    if (t[i].Ticket_No == user_ticketNo) {
                        if(t[i].vehicle == VehicleType.CAR){
                            OccupiedCarSpot1--;
                        }
                        else if(t[i].vehicle == VehicleType.VAN)
                        {
                            OccupiedVanSpot1--;
                        }
                        else if(t[i].vehicle == VehicleType.TRUCK)
                        {
                            OccupiedTruckSpot1--;
                        }
                        else if(t[i].vehicle == VehicleType.BUS)
                        {
                            OccupiedBusSpot1--;
                        }
                        else if(t[i].vehicle == VehicleType.MOTORBIKE)
                        {
                            OccupiedMotorbikeSpot1--;
                        }
                        else if(t[i].vehicle == VehicleType.SCOOTER)
                        {
                            OccupiedScooterSpot1--;
                        }
                        else if(t[i].vehicle == VehicleType.E_BIKE)
                        {
                            OccupiedE_bikeSpot1--;
                        }
                        else if(t[i].vehicle == VehicleType.E_CAR)
                        {
                            OccupiedE_carSpot1--;
                        }
                        // ---------------------------------------------------------------------------------------------

                        System.out.println("Press '1' if u want to do payment to attendent and '2' if if u want to payment at exit panel");
                        paymentService = input.nextByte();
                        if (paymentService == 1) {
                            System.out.println("How will you pay ");
                            System.out.println("Press '1' for credit and '2' for cash");
                            paymentType = input.nextByte();
                            if (paymentType == 1) {
                                // Here first total amount will be calculated
                                // Then we will take credit card details
                                System.out.println("Your payment has been done successfully");
                            }
                            else{
                                // Here total amount will be calculated
                                // User will pay the cash
                                System.out.println("Your payment has been done successfully");
                            }
                        }
                    }
                }
            }
            System.out.println();
            System.out.println("Select '1' for parking and Select '2' for unparking your vehicle ");
            Service = input.nextByte();
        }
    }
}
