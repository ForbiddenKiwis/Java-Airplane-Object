package HelicopterBuilder;

public class AttackHelicopterBuilder implements IHelicopterBuilder {
    Helicopter helicopter;
    public AttackHelicopterBuilder(){
        this.helicopter = new Helicopter(0);
    }
    @Override
    public void addHelicopterName() {
        this.helicopter.setHelicopterName("Attack Helicopter");
    }

    @Override
    public Helicopter getHelicopter() {
        return this.helicopter;
    }
}
