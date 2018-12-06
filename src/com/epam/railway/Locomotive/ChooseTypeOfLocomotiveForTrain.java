package com.epam.railway.Locomotive;
import java.util.Scanner;


class ChooseTypeOfLocomotiveForTrain {
    public static void selectLocomotive() {
        Locomotive locomotive;
        System.out.println("Could you please select a type of the locomotive: (E) - Electric, (D) - Diesel:");
        Scanner sl = new Scanner(System.in);
        String txt = sl.nextLine();
        switch (txt) {
            case "E":
                Locomotive ElectricLocomotive = new Locomotive(LocomotiveEngineType.ELECTRIC);
                System.out.println("Thank you! \nYou choose is Electric Locomotive");
                break;

            case "D":
                Locomotive DieselLocomotive = new Locomotive(LocomotiveEngineType.DIESEL);
                System.out.println("Thank you! \nYou choose is Diesel Locomotive");
                break;

            default:
                locomotive = null;
                System.out.println("Type of locomotive has not been selected. Please try again.");
                break;
        }
        return;
    }
}
