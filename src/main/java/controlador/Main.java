package controlador;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] recordsOrThreads = {"records", "threads"};
        int gotBoth = 0; //if gotBoth is 0, the do/while will refer to records
        String numberGiven;
        int newNumberGiven, records = 0, threads = 0;
        do{
            System.out.println("Number of " + recordsOrThreads[gotBoth] + " to save: ");
            numberGiven = sc.nextLine();
            newNumberGiven = checkIfIntGreaterThan0(numberGiven);//This method checks if the number given by the user is a natural integer
            if(newNumberGiven > 0) {
                System.out.println("Number of " + recordsOrThreads[gotBoth] + " saved");
                if (gotBoth == 0)
                    records = newNumberGiven;
                else
                    threads = newNumberGiven;
                gotBoth++;
            } else if (newNumberGiven == 0){
                System.out.println("Need at least one record");
            }
        }while(gotBoth < 2);
        sc.close();
        System.out.println("records: " + records + ", threads: " + threads);
    }

    //Checks if "value" is a positive integer number, returning -1 if it isnt or 0 if its 0
    private static int checkIfIntGreaterThan0(String value) {
        try {
            int newValue = Integer.parseInt(value);
            if (newValue > 0) {
                return newValue;
            } else {
                return 0;
            }
        }
        catch (NumberFormatException e)
        {
            System.out.println(value + " is not a valid number");
            return -1;
        }
    }

    private static void introduceInBBDD(int records, int numberOfThreads) {

    }
}
