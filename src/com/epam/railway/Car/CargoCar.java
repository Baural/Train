package com.epam.railway.Car;

public class CargoCar extends Car {
    private TypeOfCargoCar typeOfCargoCar;


    public CargoCar(boolean dangerous, TypeOfCargoCar typeOfCargoCar) {
        this.typeOfCargoCar = typeOfCargoCar;
    }
}
