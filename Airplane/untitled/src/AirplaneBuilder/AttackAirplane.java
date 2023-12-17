package AirplaneBuilder;


public class AttackAirplane implements IAirplaneBuilder{

    Airplane airplane;
    public AttackAirplane(){
        this.airplane = new Airplane(0);
    }


    @Override
    public void addAirplaneName(){this.airplane.setAirplaneName("Attack Airplane");}

    @Override
    public Airplane getAirplane() {
        return this.airplane;
    }
}
