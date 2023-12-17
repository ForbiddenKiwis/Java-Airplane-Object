package HelicopterBuilder;

public class RecoHelicopter implements  IHelicopterBuilder{
    Helicopter helicopter;
    public RecoHelicopter(){
        this.helicopter = new Helicopter(0);
    }

    @Override
    public void addHelicopterName() {
        this.helicopter.setHelicopterName("Reconnaissance Helicopter");
    }

    @Override
    public Helicopter getHelicopter() {
        return this.helicopter;
    }
}

