package States;

import HelicopterBuilder.*;

public class StartStateHelicopter implements StateHelicopter{
    @Override
    public void start(Helicopter helicopter){
        System.out.println("Helicopter is already started");
    }

    @Override
    public void stop(Helicopter helicopter){
        System.out.println("Helicopter is stopping");
        helicopter.setState(new StopStateHelicopter());
    }
}



