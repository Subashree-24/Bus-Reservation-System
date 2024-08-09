package com.reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class Booking {
    private String name;
    private Date date;
    private int busno;

    Scanner sc = new Scanner(System.in);

    Booking() {
        System.out.println("Enter the Passenger Name");
        name = sc.nextLine();
        System.out.println("Enter the Bus Number");
        busno = sc.nextInt();
        System.out.println("Enter the Date in the format of YYYY-MM-DD");
        String date1 = sc.next();
        SimpleDateFormat date2 = new SimpleDateFormat("YYYY-MM-DD");
        try {
            date = date2.parse(date1);

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public boolean isAvailable(ArrayList<Bus> buses, ArrayList<Booking> bookings){
        int cap=10,booked=0;

        for(Bus b: buses){
            if(b.getBusNo() == busno)
                cap = b.getCapacity();
        }

        for(Booking b: bookings){
            if(b.busno == busno){
                b.date.equals(date);
                booked++;
            }
        }
        return booked<=cap ? true:false;
    }

    
}
