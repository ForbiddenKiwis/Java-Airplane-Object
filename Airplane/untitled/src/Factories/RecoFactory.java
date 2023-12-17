package Factories;

import AirplaneBuilder.Airplane;
import AirplaneBuilder.AirplaneEngineer;
import AirplaneBuilder.RecoAirplane;
import HelicopterBuilder.Helicopter;
import HelicopterBuilder.HelicopterEngineer;
import HelicopterBuilder.RecoHelicopter;

public class RecoFactory extends AbstractFactory{
    public Helicopter makeHelicopter(){
        HelicopterEngineer helicopterEngineer = new HelicopterEngineer(new RecoHelicopter());
        helicopterEngineer.createHelicopter();
        return helicopterEngineer.getHelicopter();
    }
    public Airplane makeAirplane(){
        AirplaneEngineer airplaneEngineer = new AirplaneEngineer(new RecoAirplane());
        airplaneEngineer.createAirplane();
        return airplaneEngineer.getAirplane();
    }

}
