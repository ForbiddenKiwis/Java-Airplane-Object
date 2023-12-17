package States;
import AirplaneBuilder.*;

public class StopState implements State {
    @Override
    public void start(Airplane airplane){
        System.out.println("Airplane is starting");
        airplane.setState(new StartStateAirplane());
    }
    @Override
    public void stop(Airplane airplane){
        System.out.println("Airplane is already stopped");
    }
}
