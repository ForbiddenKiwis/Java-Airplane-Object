package States;
import AirplaneBuilder.*;

class StartStateAirplane implements State {
    @Override
    public void start(Airplane airplane){
        System.out.println("Airplane is already started");
    }

    @Override
    public void stop(Airplane airplane){
        System.out.println("Airplane is stopping");
        airplane.setState(new StopState());
    }
}
