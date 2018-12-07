package com.epam.railway;

public class Main {
    public static void main(String[] args) {
        TrainFormation trainFormation = new TrainFormation();
        trainFormation.generatePassengerTrain();
        System.out.println();
        trainFormation.generateCargoTrain();

    }
}
