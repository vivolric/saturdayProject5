package Laptop;

import java.util.ArrayList;

public class Calculation {

    /*
       Create method name is getRam

       Parameter is ArrayList<String>

       if ram is 32 gb add 300 to price
       if ram is 16 gb add 200 to price
       if ram is 8 gb add 100 to price
       if ram is 4 gb add 50 to price

       return the price.
    */
    public int getRam(ArrayList<String> laptopProfile) {

        int price = 0;
        if (laptopProfile.get(2).contains("32")) {
            price = 300;
        } else if (laptopProfile.get(2).contains("16")) {
            price = 200;
        } else if (laptopProfile.get(2).contains("8")) {
            price = 100;
        } else if (laptopProfile.get(2).contains("4")) {
            price = 50;
        }


        return price;

    }

    /*
       Create method name is getCPU

        Parameter is ArrayList<String>

        if CPU is i3 add 200 to price
        if CPU is i5 add 300 to price
        if CPU is i7 add 500 to price

        return the price.
     */
    public int getCpu(ArrayList<String> laptopProfile) {

        int price = 0;

        if (laptopProfile.get(3).equals("i3")) {
            price = 200;
        } else if (laptopProfile.get(3).equals("i5")) {
            price = 300;
        } else if (laptopProfile.get(3).equals("i7")) {
            price = 500;
        }

        return price;
    }


    /*
      Create method name is getColor

      Parameter is ArrayList<String>

      return type is int

      if Color is Red add 400 to price
      if Color is Orange add 300 to price
      if Color is Silver add 200 to price
      if Color is Black add 150 to price

      return the price.
   */

    public int getColor(ArrayList<String> laptopProfile) {

        int price = 0;
        if (laptopProfile.get(4).equals("Red")) {
            price = 400;
        } else if (laptopProfile.get(4).equals("Orange")) {
            price = 300;
        } else if (laptopProfile.get(4).equals("Silver")) {
            price = 200;
        } else if (laptopProfile.get(4).equals("Black")) {
            price = 150;
        }

        return price;
    }


    /*
      Create method name is getSize

      return type is int

      Parameter is ArrayList<String>

      if Size contains "Mini" add 100 to price
      if Size contains "Middle" add 200 to price
      if Size contains "Max" add 300 to price

      return the price.
   */

    public int getSize(ArrayList<String> laptopProfile) {

        int price = 0;

        if (laptopProfile.get(1).contains("Mini")) {
            price = 100;
        } else if (laptopProfile.get(1).contains("Middle")) {
            price = 200;
        } else if (laptopProfile.get(1).contains("Max")) {
            price = 300;
        }

        return price;
    }
}

