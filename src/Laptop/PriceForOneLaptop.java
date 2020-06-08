package Laptop;

import java.util.ArrayList;
import java.util.TreeMap;

public class PriceForOneLaptop {

    /*
        Given one method name is getPrice

        Parameter is int

        Return type is int

        This method is calling the AllData method from Data class. Laptop ID is a parameter laptopID

        This method need to call all other methods in Calculation class and get the price and return that total Amount.
     */

    public int getPrice(int laptopID) {

        Data price1 = new Data();
        //price1.AllData(laptopID);

        ArrayList<String> allList = price1.AllData(laptopID);

        Calculation totalPrice = new Calculation();

        int totalAmount = totalPrice.getRam(allList) + totalPrice.getCpu(allList) + totalPrice.getColor(allList) + totalPrice.getSize(allList);

        return totalAmount;
    }

    /*
        Given getDiscount

        Parameter is two int (amount , discount)

        Return type is int

        Make the discount from the amount

        And Return the discounted price

        Example

        Amount 100
        discount 20

        After a 20% discount

        Result should be 80
     */


    public int getDiscount(int num, int discount) {

        num = num - num * discount / 100;

        return num;
    }


}


//
//    public static void main(String[] args) {
//        int laptopID = 0;
//        int answer = getPrice(laptopID);
//        System.out.println(answer);
//    }