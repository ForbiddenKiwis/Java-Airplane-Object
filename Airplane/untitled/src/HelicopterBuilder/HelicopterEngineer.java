package HelicopterBuilder;

public class HelicopterEngineer {
    IHelicopterBuilder iHelicopterBuilder;

    public HelicopterEngineer(IHelicopterBuilder iHelicopterBuilder){
        this.iHelicopterBuilder = iHelicopterBuilder;
    }

    public void createHelicopter(){
        this.iHelicopterBuilder.addHelicopterName();
    }

    public Helicopter getHelicopter(){
        return  this.iHelicopterBuilder.getHelicopter();
    }
}
