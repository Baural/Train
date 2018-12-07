package com.epam.railway.Train;

import com.epam.railway.Train.*

public class FormationOfTrain {
    public void generatePassengerTrain() {
        Train myPassengerTrain = new Train();
        TrainFormation trainFormation = new TrainFormation();
        trainFormation.generatePassengerTrain();
        System.out.println();
        trainFormation.generateCargoTrain();


        System.out.println("Please choose a type of train: \nPut (P) - if it is the passenger train, \nPut (C) - if it is the cargo train.");
        Scanner sl = new Scanner(System.in);
        String txt = sl.nextLine();
        switch (txt) {
            case "P":
                Train PassengerTrain = new Train(TypeOfTrain.PASSENGER);
                System.out.println("The Passenger Train.");
                break;

            case "C":
                Train CargoTrain = new Train(TypeOfTrain.CARGO);
                System.out.println("The Cargo Train.");
                break;

            default:
                train = null;
                System.out.println("Type of locomotive has not been selected. Please try again.");
                break;

        }
        return;



        private void generatePassengerTrain() {
            System.out.println("Process of formation passenger train!");
            Train myPassengerTrain = new Train();
            boolean isPassenger = true;
            myPassengerTrain.setLocomotive(new Locomotive( 2.76f, 401f, isPassenger));
            myPassengerTrain.getLocomotive().setTypeOfLocomotive(TypeOfLocomotive.ELECTRIC_LOCOMOTIVE);
            Scanner scanner = new Scanner(System.in);
            System.out.println("How many passenger carriages do you want to add?");
            int countOfPassCarriages = scanner.nextInt();
            for (int i = 0; i < countOfPassCarriages; i++) {
                myPassengerTrain.addCarriage(new PassengerCarriage(6f));
            }
            System.out.println("How many mail carriages do you want to add?");
            int countOfMailCarriages = scanner.nextInt();
            for (int i = 0; i < countOfMailCarriages; i++) {
                myPassengerTrain.addCarriage(new PassengerCarriage(TypeOfPassengerCarriage.MAIL_CARRIAGE, 12f));
            }

            // Tries to add not passenger carriage
            System.out.println("Process of adding cargo carriage to passenger train:");
            myPassengerTrain.addCarriage(new CargoCarriage(TypeOfCargoCarriage.OPEN_CARRIAGE,24f));

            System.out.println("Count of carriage in passenger train: " + myPassengerTrain.countCarriages());
        }

        public static Boilean valueOf(boolean passanger) {
            return (passanger ? Boolean.TRUE : Boolean.FALSE)
        }

    }
}
