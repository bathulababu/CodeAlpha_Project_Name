

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HotelReservationSystem {
    /*
    Hotel Reservation System
     */
    //Map for storing details
    private static Map<String, Hotel> hotelMap;
    public HotelReservationSystem() {
        hotelMap = new HashMap<>();
    }
    /*
    Adding hotel details
    */
    public static boolean  addHotel(String name, int HotelRateRegularWeekdays) {
        Hotel hotelObject = new Hotel(name, HotelRateRegularWeekdays);
        hotelMap.put(name, hotelObject);
        return true;
    }

    /*
    Printing hotel details
     */
    public void printHotels() {
        for (Map.Entry<String, Hotel> entry : hotelMap.entrySet()) {
            System.out.println("Hotel Name : " + entry.getKey());
            System.out.println("Rate on weekdays for regular customers : " + entry.getValue().getHotelRateRegularWeekDay());
        }
    }
    /*
    Main starts
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Hotel Reservation System...");
        System.out.println("Enter No of customers data to be added !!");
        Scanner sc= new Scanner(System.in); 
        int noCustomers=sc.nextInt(); 
        
        HotelReservationSystem hotelReservationSystem = new HotelReservationSystem();
        for(int i=0;i<noCustomers;i++) {
        	System.out.println("Please enter name of the customer");
        	String name=sc.next();
        	System.out.println("Please enter name Rate on weekdays for regular customers");
        	int noRegDays= sc.nextInt();
        	addHotel(name,noRegDays);
        	
        }
        hotelReservationSystem.printHotels();
    }
}