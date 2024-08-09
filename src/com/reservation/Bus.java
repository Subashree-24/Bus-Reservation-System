package com.reservation;

public class Bus {
    private int busno;
    private boolean Ac;
    private int capacity;

    Bus(int busno, boolean Ac, int capacity){
        this.busno = busno;
        this.Ac = Ac;
        this.capacity = capacity;
    }

    public int getBusNo(){
        return busno;
    }

    public int getCapacity(){
        return capacity;
    }

    public boolean getAcType(){
        return Ac;
    }

    public void display(){
        System.out.print("Bus No:"+busno+" AC:"+Ac+" Capacity:"+capacity);
        System.out.println();
    }
}
