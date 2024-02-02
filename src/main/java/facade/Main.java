package main.java.facade;

public class Main {
    public static void main(String[] args) {
        ControlSystem controlSystem = new ControlSystem();
        controlSystem.turnOnElectricity();
        controlSystem.turnOnGas();
        controlSystem.turnOnWater();
        controlSystem.switchOffElectricity();
        controlSystem.switchOffGas();
        controlSystem.switchOffWater();
    }
}
