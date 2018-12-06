package com.epam.railway.Train;

import com.epam.railway.Locomotive.*;
import com.epam.railway.Car.*
import com.epam.railway.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Train extends Vehicle {
    private Locomotive locomotive;
    private ArrayList<Car> cars = new ArrayList<>();
    private boolean isPassenger;

    Train(Locomotive locomotive) {
        this.locomotive = locomotive;
    }

    Locomotive getLocomotive() {
        return locomotive;
    }

    private boolean isPassenger(){
        return isPassenger;
    }

    public void setPassenger(car) {
        isPassenger = passenger;
    }



    //        private Locomotive locomotive;
//        private List<Cars> cars = new ArrayList<>();
//        Train train;
//        System.out.println("Please choose a type of train: \nPut (P) - if it is the passenger train, \nPut (C) - if it is the cargo train.");
//        Scanner sl = new Scanner(System.in);
//        String txt = sl.nextLine();
//        switch (txt) {
//            case "P":
//                Train PassengerTrain = new Train(TypeOfTrain.PASSENGER);
//                System.out.println("The Passenger Train!");
//                break;
//
//            case "C":
//                Train CargoTrain = new Train(TypeOfTrain.CARGO);
//                System.out.println("The Cargo Train!");
//                break;
//
//            default:
//                train = null;
//                System.out.println("Type of locomotive has not been selected. Please try again.");
//                break;
//
//        }
//        return;
//    }
}
