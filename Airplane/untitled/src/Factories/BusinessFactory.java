package Factories;

import AirplaneBuilder.Airplane;
import AirplaneBuilder.AirplaneEngineer;
import AirplaneBuilder.BusinessAirplane;
import HelicopterBuilder.*;

public class BusinessFactory extends AbstractFactory {
    public Helicopter makeHelicopter(){
        HelicopterEngineer helicopterEngineer = new HelicopterEngineer(new BusinessHelicopterBuilder());
        helicopterEngineer.createHelicopter();
        return helicopterEngineer.getHelicopter();
    }

    public Airplane makeAirplane(){
        AirplaneEngineer airplaneEngineer = new AirplaneEngineer(new BusinessAirplane());
        airplaneEngineer.createAirplane();
        return airplaneEngineer.getAirplane();
    }
}
