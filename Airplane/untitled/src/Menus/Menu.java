package Menus;

import Factories.*;

import java.util.Scanner;
import AirplaneBuilder.*;
import HelicopterBuilder.Helicopter;

public class Menu {

    Scanner reader = new Scanner(System.in);

    public void flyingChoose() {
        byte userChoice;
        boolean validInput = false;

        System.out.println("*********** Welcome to 9/11 ***********");
        System.out.println("Choose the flying object you want to hit the twin with!");
        do {
            System.out.println("Enter 1 for a Helicopter");
            System.out.println("Enter 2 for an Airplane:");
            System.out.println(("Enter 3 to Exit the program"));
            do {
                try {
                    userChoice = reader.nextByte();
                    validInput = true;
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter a number.");
                    reader.nextLine();
                    userChoice = 0;
                }
            } while (!validInput);
            switch (userChoice) {
                case 1:
                    helicopterType();
                    break;
                case 2:
                    airplaneType();
                    break;
                case 3:
                    reader.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("\nInvalid input. Please try again.\n");

            }
        } while (userChoice != 3);
    }

    public void helicopterType() {
        byte helicopterType;
        boolean helicopterDecision = false;
        boolean validInput = false;
        Helicopter createdHelicopter;
        do {
            System.out.println("Which type of Helicopter do you want to create: ");
            System.out.println("Enter 1 for an attack Helicopter\nEnter 2 for a business Helicopter\nEnter 3 for a reconnaissance Helicopter\nEnter 4 to go back to the previous menu: ");
            do {
                try {
                    helicopterType = reader.nextByte();
                    validInput = true;
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter a number.");
                    reader.nextLine();
                    helicopterType = 0;
                }
            } while (!validInput);
            switch (helicopterType) {
                case 1:
                    createdHelicopter =  AbstractFactory.factoryMethod("Attack").makeHelicopter();
                    createdHelicopter.display();
                    helicopterMenu(createdHelicopter);
                    helicopterDecision = true;
                    break;
                case 2:
                    createdHelicopter =  AbstractFactory.factoryMethod("Business").makeHelicopter();
                    createdHelicopter.display();
                    helicopterMenu(createdHelicopter);
                    helicopterDecision = true;
                    break;
                case 3:
                    createdHelicopter = AbstractFactory.factoryMethod("Reco").makeHelicopter();
                    createdHelicopter.display();
                    helicopterMenu(createdHelicopter);
                    helicopterDecision = true;
                    break;
                case 4:
                    helicopterDecision = true;
                    break;
                default:
                    System.out.println("\nInvalid input. Please try again.\n");

            }
        } while (!helicopterDecision);
    }

    public void airplaneType() {
        byte airplaneType;
        boolean airplaneDecision = false;
        boolean validInput = false;
        Airplane createdAirplane;
        do {
            System.out.println("Which type of airplane do you want to create: ");
            System.out.println("Enter 1 for an attack airplane\nEnter 2 for a business airplane\nEnter 3 for a reconnaissance airplane\nEnter 4 to go back to the previous menu: ");
            do {
                try {
                    airplaneType = reader.nextByte();
                    validInput = true;
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter a number.");
                    reader.nextLine();
                    airplaneType = 0;
                }
            } while (!validInput);
            switch (airplaneType) {
                case 1:
                    createdAirplane = AbstractFactory.factoryMethod("Attack").makeAirplane();
                    createdAirplane.display();
                    airplaneMenu(createdAirplane);
                    airplaneDecision = true;
                    break;
                case 2:
                    createdAirplane = AbstractFactory.factoryMethod("Business").makeAirplane();
                    createdAirplane.display();
                    airplaneMenu(createdAirplane);
                    airplaneDecision = true;
                    break;
                case 3:
                    createdAirplane = AbstractFactory.factoryMethod("Reco").makeAirplane();
                    createdAirplane.display();
                    airplaneMenu(createdAirplane);
                    airplaneDecision = true;
                    break;
                case 4:
                    airplaneDecision = true;
                    break;
                case 5:
                    String exitChoice;
                    do {

                        System.out.println("\nDo you really wish to exit the game? Enter 'y/n' to Exit\n");
                        exitChoice = reader.next();
                        if (exitChoice.equals("Y") || exitChoice.equals("y")) {
                            System.out.println("\nGoodbye dear user!");
                            reader.close();
                            System.exit(0);
                        } else if (exitChoice.equals("n") || exitChoice.equals("N")) {
                            break;
                        }
                    } while (!exitChoice.equals("Y") || !exitChoice.equals("y") || !exitChoice.equals("n") || !exitChoice.equals("N"));
                    break;

                default:
                    System.out.println("\nInvalid input. Please try again.\n");

            }
        } while (!airplaneDecision);
    }

    public void airplaneMenu(Airplane airplane) {

        byte userChoice;
        boolean validInput = false;


        // user selection and we go to a switch for the menu
        do {
            System.out.println("\nEnter 1 to start");
            System.out.println("Enter 2 to stop");
            System.out.println("Enter 3 to Take Off");
            System.out.println("Enter 4 to Increase altitude");
            System.out.println("Enter 5 to Decrease altitude");
            System.out.println("Enter 6 to Exit \n");
            do {
                try {
                    userChoice = reader.nextByte();
                    validInput = true;
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter a number.");
                    reader.nextLine();
                    userChoice = 0;
                }
            } while (!validInput);

            switch (userChoice) {
                case 1:
                    airplane.start();
                    break;
                case 2:
                    airplane.stop();
                    break;
                case 3:
                    airplane.takeOff();
                    break;
                case 4:
                    airplane.increaseAltitude();
                    break;
                case 5:
                    airplane.decreaseAltitude();
                    break;
                case 6:
                    String exitChoice;
                    do {

                        System.out.println("\nDo you really wish to exit the game? Enter 'y/n' to Exit\n");
                        exitChoice = reader.next();
                        if (exitChoice.equals("Y") || exitChoice.equals("y")) {
                            System.out.println("\nGoodbye dear user!");
                            reader.close();
                            System.exit(0);
                        } else if (exitChoice.equals("n") || exitChoice.equals("N")) {
                            userChoice = 0;
                            break;
                        }
                    } while (!exitChoice.equals("Y") || !exitChoice.equals("y") || !exitChoice.equals("n") || !exitChoice.equals("N"));
                    break;
                case 7:
                    airplane.display();
                default:
                    System.out.println("\nInvalid input. Please try again.\n");

            }
        } while (userChoice != 6);

        reader.close();
    }
    public void helicopterMenu(Helicopter helicopter) {

        byte userChoice;
        boolean validInput = false;


        // user selection and we go to a switch for the menu
        do {
            System.out.println("\nEnter 1 to start");
            System.out.println("Enter 2 to stop");
            System.out.println("Enter 3 to Take Off");
            System.out.println("Enter 4 to Increase altitude");
            System.out.println("Enter 5 to Decrease altitude");
            System.out.println("Enter 6 to exit \n");
            do {
                try {
                    userChoice = reader.nextByte();
                    validInput = true;
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter a number.");
                    reader.nextLine();
                    userChoice = 0;
                }
            } while (!validInput);

            switch (userChoice) {
                case 1:
                    helicopter.start();
                    break;
                case 2:
                    helicopter.stop();
                    break;
                case 3:
                    helicopter.takeOff();
                    break;
                case 4:
                    helicopter.increaseAltitude();
                    break;
                case 5:
                    helicopter.decreaseAltitude();
                    break;
                case 6:
                    String exitChoice;
                    do {

                        System.out.println("\nDo you really wish to exit the game? Enter 'y/n' to Exit\n");
                        exitChoice = reader.next();
                        if (exitChoice.equals("Y") || exitChoice.equals("y")) {
                            System.out.println("\nGoodbye dear user!");
                            reader.close();
                            System.exit(0);
                        } else if (exitChoice.equals("n") || exitChoice.equals("N")) {
                            userChoice = 0;
                            break;
                        }
                    } while (!exitChoice.equals("Y") || !exitChoice.equals("y") || !exitChoice.equals("n") || !exitChoice.equals("N"));
                    break;
                case 7:
                    helicopter.display();
                default:
                    System.out.println("\nInvalid input. Please try again.\n");

            }
        } while (userChoice != 6);

        reader.close();
    }

}