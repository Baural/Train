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

//    }
}
