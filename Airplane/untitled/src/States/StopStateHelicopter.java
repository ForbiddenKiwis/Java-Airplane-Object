package States;

import HelicopterBuilder.*;

public class StopStateHelicopter implements StateHelicopter{

    @Override
    public void start(Helicopter helicopter){
        System.out.println("Helicopter is starting");
        helicopter.setState(new StartStateHelicopter());
    }

    @Override
    public void stop(Helicopter helicopter){
        System.out.println("Helicopter is already stopped");
    }
}




