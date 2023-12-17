package Factories;

import AirplaneBuilder.Airplane;
import AirplaneBuilder.AirplaneEngineer;
import AirplaneBuilder.AttackAirplane;
import HelicopterBuilder.*;
public class AttackFactory extends  AbstractFactory{
    public Helicopter makeHelicopter(){
        HelicopterEngineer helicopterEngineer = new HelicopterEngineer(new AttackHelicopterBuilder());
        helicopterEngineer.createHelicopter();
        return helicopterEngineer.getHelicopter();
    }

    public Airplane makeAirplane(){
        AirplaneEngineer airplaneEngineer = new AirplaneEngineer(new AttackAirplane());
        airplaneEngineer.createAirplane();
        return airplaneEngineer.getAirplane();
    }
}
