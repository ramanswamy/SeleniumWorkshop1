package com.tekparams.basics;

public class Address {
    // Data Members
    private int doorNo=376;
    private String name="Raja";
    String street;
    String city;
    int pinCode;

    void printAddress(){
        System.out.println(doorNo+" "+name+" "+street+" "+city+" "+pinCode);
    }
    void printAddress(String street){
        System.out.println(street);
    }

    void printAddress(String street,String city, int pinCode){
        System.out.println(street+" "+city+" "+pinCode);
    }


    Address(){                  // Default constructor
        //doorNo=376;
        //name="Raja";
        street="ABC street";
        city="Bangalore";
        pinCode=363324;
    }

    // Parameterized Constructor
    Address(int doorNo, String name, String street, String city, int pinCode){
        this.doorNo=doorNo;
        this.name=name;
        this.street=street;
        this.city=city;
        this.pinCode=pinCode;
    }

    public static void main(String[] args){
        Address address = new Address();
        Address address1 = new Address(100,"Suresh","xyz street","Bangalore",764733);
        address.printAddress();
        address1.printAddress();
    }
}
