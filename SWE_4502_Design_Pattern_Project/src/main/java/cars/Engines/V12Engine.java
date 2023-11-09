package cars.Engines;

import cars.EngineStrategy;

public class V12Engine implements EngineStrategy {

    @Override
    public void startEngine() {
        System.out.println("V12 engine started.");
    }

    @Override
    public void stopEngine() {
        System.out.println("V12 engine stopped.");
    }

    @Override
    public void accelerate() {
        System.out.println("V12 engine accelerating.");
    }
}
