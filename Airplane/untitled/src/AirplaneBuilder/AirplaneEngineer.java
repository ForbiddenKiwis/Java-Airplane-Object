package AirplaneBuilder;

import HelicopterBuilder.Helicopter;
import HelicopterBuilder.IHelicopterBuilder;

public class AirplaneEngineer {

    IAirplaneBuilder iAirplaneBuilder;

    public AirplaneEngineer(IAirplaneBuilder iAirplaneBuilder){
        this.iAirplaneBuilder = iAirplaneBuilder;
    }

    public void createAirplane(){
        this.iAirplaneBuilder.addAirplaneName();
    }

    public Airplane getAirplane(){
        return  this.iAirplaneBuilder.getAirplane();
    }

}
