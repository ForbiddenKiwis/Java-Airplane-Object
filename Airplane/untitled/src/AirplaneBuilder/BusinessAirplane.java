package AirplaneBuilder;

public class BusinessAirplane implements IAirplaneBuilder{

    Airplane airplane;




    public BusinessAirplane(){
        this.airplane = new Airplane(0);
    }

    @Override
    public void addAirplaneName(){this.airplane.setAirplaneName("Business Airplane");}

    @Override
    public Airplane getAirplane() {
        return this.airplane;
    }
}
