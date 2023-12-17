package AirplaneBuilder;
import States.*;
import Menus.Menu;

import java.util.Scanner;

public class Airplane {

        boolean airplaneTakeOff = false;

        private Scanner reader = new Scanner(System.in);
        private State state;
        private int altitude = 0;
        private static int idCounter = 1;
        private int id;
        private boolean airplaneState = false;
        private String airplaneName;

        public Airplane(int altitude){
                this.state = new StopState();
                this.altitude=altitude;
                this.id=idCounter;
                idCounter++;
        }
        public void start(){
                state.start(this);
        }
        public void stop(){
                if (altitude >0){
                        System.out.println("Cannot turn off the airplane mid air(Do you really want to die like this?)");
                }
                else {
                        state.stop(this);
                }
        }
        public void takeOff(){
                if (this.checkState().equals("StopState")){
                        System.out.println("Cannot Take Off if the engine is off");
                        airplaneTakeOff = false;
                } else if (airplaneTakeOff) {
                        System.out.println("Cannot Take of because you already took off");
                } else {
                        setAltitude(1000);
                        display();
                        airplaneTakeOff= true;
                }
        }
        public String checkState(){return state.getClass().getSimpleName();}
        public void increaseAltitude(){
                int userInput;
                boolean validInput = false;
                int alt = getAltitude();
                Menu menu = new Menu();

                if (this.checkState().equals("StopState")){
                        System.out.println("Vehicle cannot increase altitude if it did not start the engin.");
                }
                else {
                        if (!airplaneTakeOff){
                                System.out.println("You cannot Increase altitude if you did not take off");
                        }
                        else {
                                do {
                                        System.out.print("\nIncrease the altitude by: ");
                                        try {
                                                userInput = reader.nextInt();
                                                if(userInput < 0) {
                                                        System.out.println("\nYou cannot input a negative number");
                                                }
                                                else {
                                                        validInput = true;
                                                }
                                        } catch (Exception e) {
                                                System.out.println("Invalid input type.\nIt must be of type int and must not be negative");
                                                reader.nextLine();
                                                userInput = 0;
                                        }
                                } while (!validInput);
                                setAltitude(userInput);
                                System.out.println("Increasing altitude by "+userInput+" m\nAltitude: "+getAltitude()+" m");

                                if(altitude >= 10000&& altitude <=12000){
                                        System.out.println("Dangerous altitude!");
                                }
                                else if (altitude >= 12000){
                                        System.out.println("The airplane has exploded!");
                                        boolean userAns = false;
                                        do {
                                                System.out.println("Do you want to repair the airplane? ");
                                                char repairAir = reader.next().charAt(0);

                                                if (repairAir == 'y'|| repairAir== 'Y'){
                                                        System.out.println("Airplane repaired!");
                                                        repair();
                                                        userAns = true;
                                                }
                                                else if (repairAir == 'n' || repairAir == 'N'){
                                                        airplaneState = true;
                                                       menu.flyingChoose();
                                                        userAns = true;
                                                }
                                                else{
                                                        System.out.println("Wrong input please try again");
                                                        userAns = false;
                                                }
                                        }while (!userAns);
                                }
                                else {
                                        System.out.println("The airplane has increase his altitude");
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

                System.out.println("Repairing the airplane\nThe engineer are repairing please wait 5 months!(5 second)");
                state.stop(this);
                setAltitude(0);
                display();


                System.out.println("The airplane has been repaired!\nThe ID is "+getId());
                airplaneState = false;
        }

        public void land(){
                System.out.println("You did not crash");
        }

        public void setState(State state){
                this.state=state;
        }
        public State getState() {return state;}

        public String getId(){
                return "A" + id;
        }
        public int getAltitude() {
                return altitude;
        }

        public void setAltitude(int altitude) {
                this.altitude += altitude;
        }

        public void display(){
                System.out.println("The Airplane name is "+ airplaneName+"\nhis altitude is: "+ altitude+"\nhis Id is "+ id);
        }

        public void setAirplaneName(String airplaneName) {
                this.airplaneName = airplaneName;
        }
        public  String getAirplaneName(){return  airplaneName;}

}
