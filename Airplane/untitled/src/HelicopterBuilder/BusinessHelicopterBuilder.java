package HelicopterBuilder;

public class BusinessHelicopterBuilder implements  IHelicopterBuilder{

    Helicopter helicopter;
    public BusinessHelicopterBuilder(){
        this.helicopter = new Helicopter(0);
    }

    @Override
    public void addHelicopterName() {
        this.helicopter.setHelicopterName("Business Helicopter");
    }

    @Override
    public Helicopter getHelicopter() {
        return this.helicopter;
    }
}
