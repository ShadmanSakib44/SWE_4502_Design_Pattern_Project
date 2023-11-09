package cars.Engines;

import cars.EngineStrategy;

public class V6Engine implements EngineStrategy {

    @Override
    public void startEngine() {
        System.out.println("V6 engine started.");
    }

    @Override
    public void stopEngine() {
        System.out.println("V6 engine stopped.");
    }

    @Override
    public void accelerate() {
        System.out.println("V6 engine accelerating.");
    }
}
