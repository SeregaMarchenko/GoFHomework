package main.java.facade;

public class ControlSystem {
    private final ElectricitySystem electricitySystem;
    private final WaterSystem waterSystem;
    private final GasSystem gasSystem;

    public ControlSystem() {
        gasSystem = new GasSystem();
        waterSystem = new WaterSystem();
        electricitySystem = new ElectricitySystem();
    }
    void turnOnElectricity(){
        electricitySystem.turnOnElectricity();
    }
    void switchOffElectricity(){
        electricitySystem.switchOffElectricity();
    }
    void turnOnGas(){
        gasSystem.turnOnGas();
    }
    void switchOffGas(){
        gasSystem.switchOffGas();
    }
    void turnOnWater(){
        waterSystem.turnOnWater();
    }
    void switchOffWater(){
        waterSystem.switchOffWater();
    }
}
