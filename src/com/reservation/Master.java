package com.reservation;

import java.util.ArrayList;
import java.util.Scanner;

class Master{
    public static void main(String ar[]){
        ArrayList<Bus> buses = new ArrayList<Bus>();
        ArrayList<Booking> bookings = new ArrayList<Booking>();

        System.out.println("Bus Availability Details\n");
        buses.add(new Bus(1, false, 21));
        buses.add(new Bus(2,false,20));
        buses.add(new Bus(3,true,40));

        Scanner sc = new Scanner(System.in);

        for(Bus b: buses){
            b.display();
        }

        int ch;
        while (true) { 
            System.out.println("\nEnter 1 for Booking \nEnter 2 to Exit");
            ch = sc.nextInt();
            if(ch==1){
                Booking book = new Booking();

                if(book.isAvailable(buses, bookings)){
                    bookings.add(book);
                    System.out.println("\nYour Booking is Confirmed!! HAPPY JOURNEY!!");
                }
                else{
                    System.out.println("\nSorry!!.. Try Again Later");
                }
            }
            else
                System.exit(0);
        }
    }
}