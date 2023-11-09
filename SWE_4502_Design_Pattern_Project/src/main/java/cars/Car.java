package cars;

import cars.CarStrategy;
import cars.EngineStrategy;
import cars.TurbochargerStrategy;

public abstract class Car implements CarStrategy {
    private EngineStrategy engineStrategy;
    private TurbochargerStrategy turbochargerStrategy;

    public Car(EngineStrategy engineStrategy, TurbochargerStrategy turbochargerStrategy) {
        this.engineStrategy = engineStrategy;
        this.turbochargerStrategy = turbochargerStrategy;
    }

    public void setEngineStrategy(EngineStrategy engineStrategy) {
        this.engineStrategy = engineStrategy;
    }

    public void setTurbochargerStrategy(TurbochargerStrategy turbochargerStrategy) {
        this.turbochargerStrategy = turbochargerStrategy;
    }

    public void startEngine() {
        engineStrategy.startEngine();
    }

    public void stopEngine() {
        engineStrategy.stopEngine();
    }

    public void accelerate() {
        engineStrategy.accelerate();
    }

    public void enableTurbo() {
        turbochargerStrategy.enableTurbo();
    }

    public void disableTurbo() {
        turbochargerStrategy.disableTurbo();
    }

    @Override
    public abstract void displayCarInfo();
}
