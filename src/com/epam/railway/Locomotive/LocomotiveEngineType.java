package com.epam.railway.Locomotive;

public enum LocomotiveEngineType {
    ELECTRIC(6000),
    DIESEL(4500);

    private int powerCapacity;


    private LocomotiveEngineType(int powerCapacity){
        this.powerCapacity = powerCapacity;
    }

    public void setPowerCapacity(int powerCapacity) {
        this.powerCapacity = powerCapacity;
    }

}
