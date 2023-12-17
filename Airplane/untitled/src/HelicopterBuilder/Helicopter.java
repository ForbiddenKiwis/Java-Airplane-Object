package HelicopterBuilder;
import Menus.Menu;
import States.*;
import java.util.Scanner;



public class Helicopter {
    private String helicopterName;


    // The setters!
    public void setHelicopterName(String helicopterName) {
        this.helicopterName = helicopterName;
    }

    private Scanner reader = new Scanner(System.in);
    private StateHelicopter state;
    private int altitude = 0;
    private static int idCounter = 1;
    private int id;
    private boolean helicopterOff = false;
    private boolean helicopterState = false;

    public Helicopter(int altitude){
        this.state = new StopStateHelicopter();
        this.altitude=altitude;
        this.id=idCounter;
        idCounter++;
    }
    public void start(){
        state.start(this);
    }
    public void stop(){
        if (altitude >0){
            System.out.println("Cannot turn off the helicopter mid air(Do you really want to die like this?)");
        }
        else {
            state.stop(this);
        }
    }
    public void takeOff(){
        if (this.checkState().equals("StopStateHelicopter")){
            System.out.println("Cannot take off if the engine is not turn on");
            helicopterOff = false;
        } else if (helicopterOff) {
            System.out.println("The helicopter has already taken off");
        } else {


                System.out.println("The helicopter is taking off please fasten your seatbelts ");
                setAltitude(1000);
                helicopterOff = true;

        }

    }
    public String checkState(){return state.getClass().getSimpleName();}
    public void increaseAltitude(){
        int userInput;
        boolean validInput = false;
        int alt = getAltitude();
        Menu menu= new Menu();



        if (this.checkState().equals("StopStateHelicopter")){
            System.out.println("Vehicle cannot increase altitude if it did not start the engine.");
        }
        else {
            if(!helicopterOff){
            System.out.println("The aircraft cannot increase the altitude if the aircraft didn't take off");
            }else {
                do {
                    System.out.print("\nIncrease the altitude by: ");
                    try {
                        userInput = reader.nextInt();
                        if (userInput < 0) {
                            System.out.println("\nYou cannot input a negative number");
                        } else {
                            validInput = true;
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input type.\nIt must be of type int and must not be negative");
                        reader.nextLine();
                        userInput = 0;
                    }
                } while (!validInput);
                setAltitude(userInput);
                System.out.println("Increasing altitude by " + userInput + " m\nAltitude: " + getAltitude() + " m");


                if (altitude >= 10000&& altitude <=12000) {
                    System.out.println("Dangerous altitude!");
                } else if (altitude >= 12000) {
                    System.out.println("The helicopter has exploded!");
                    boolean userAns = false;
                    do {
                        System.out.println("Do you want to repair the helicopter?(Y/N) ");
                        char repairAir = reader.next().charAt(0);

                        if (repairAir == 'y' || repairAir == 'Y') {
                            System.out.println("helicopter repaired!");
                            repair();
                            userAns = true;
                        } else if (repairAir == 'n' || repairAir == 'N') {
                            helicopterState = true;
                            menu.flyingChoose();
                            userAns = true;
                        } else {
                            System.out.println("Wrong input please try again");
                            userAns = false;
                        }
                    } while (!userAns);


                } else {
                    System.out.println("The helicopter has increase his altitude");
                }
            }
        }
    }
    public void decreaseAltitude(){
        int userInput;
        boolean validInput = false;

        if (getAltitude() == 0){
            System.out.println("Altitude: "+getAltitude()+" m"+"\nYou are not able to decrease");
        }
        else {
            do {
                System.out.print("Decrease the altitude by: ");
                try {
                    userInput = reader.nextInt();
                    if (userInput > 0){
                        System.out.println("\nYou cannot input a positive number.");
                    } else if (getAltitude() + userInput < 0) {
                        System.out.println("\nThe altitude is "+getAltitude()+" m. You can decrease the altitude by 0 - "+getAltitude()+" but not more");
                    } else {
                        validInput = true;
                    }
                } catch (Exception e) {
                    System.out.println("Invalid input type.\nIt must be of type int");
                    reader.nextLine();
                    userInput = 0;
                }
            } while (!validInput);
            setAltitude(userInput);
            System.out.println("Decreasing altitude by "+userInput+" m\nAltitude: "+userInput+" m");
            if (altitude == 0){
                System.out.println("\n");
                state.stop(this);
                land();
            }
        }

    }

    public void repair() {

        System.out.println("Repairing the helicopter\nThe engineer are repairing please wait 5 months!(5 second)");
        this.altitude = 0;
        state.stop(this);
        display();
        helicopterState = false;
    }

    public void land(){

        System.out.println("You did not crash");
    }

    public void setState(StateHelicopter state){
        this.state=state;
    }
    public StateHelicopter getState() {return state;}

    public String getId(){
        return "H" + id;
    }
    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude += altitude;
    }

    public void setHelicopterState(String helicopterNameName) {
        this.helicopterName = helicopterNameName;
    }
    public void display(){
        System.out.println("The helicopter name is "+ helicopterName+"\nThis altitude is:" + getAltitude()+"\nhis Id is "+ getId());
    }
}
