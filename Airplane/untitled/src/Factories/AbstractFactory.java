package Factories;

import AirplaneBuilder.Airplane;
import HelicopterBuilder.Helicopter;
public abstract class AbstractFactory {
    public static AbstractFactory factoryMethod(String type){
        AbstractFactory factory=null;
        switch (type){
            case "Attack":
                factory = new AttackFactory();
                break;
            case "Business":
                factory = new BusinessFactory();
                break;
            case "Reco":
                factory = new RecoFactory();
                break;
        }

        return factory;
    }
    public abstract  Helicopter makeHelicopter();
    public abstract  Airplane makeAirplane();
}
