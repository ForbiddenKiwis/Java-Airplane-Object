package AirplaneBuilder;

import HelicopterBuilder.RecoHelicopter;

public class RecoAirplane implements IAirplaneBuilder{

    Airplane airplane;


    public RecoAirplane(){
        this.airplane = new Airplane(0);
    }

    @Override
    public void addAirplaneName(){this.airplane.setAirplaneName("Reconnaissance Airplane");}

    @Override
    public Airplane getAirplane() {
        return this.airplane;
    }
}
