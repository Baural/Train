package com.epam.railway.Locomotive;

import com.epam.railway.Vehicle;

public  class Locomotive extends Vehicle {
    private LocomotiveEngineType locomotiveEngineType;

    public Locomotive(LocomotiveEngineType locomotiveEngineType) {

        this.locomotiveEngineType = locomotiveEngineType;
    }
}
