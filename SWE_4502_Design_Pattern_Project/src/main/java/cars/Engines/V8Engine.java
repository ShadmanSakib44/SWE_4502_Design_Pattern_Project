package cars.Engines;

import cars.EngineStrategy;

public class V8Engine implements EngineStrategy {

    @Override
    public void startEngine() {
        System.out.println("V8 engine started.");
    }

    @Override
    public void stopEngine() {
        System.out.println("V8 engine stopped.");
    }

    @Override
    public void accelerate() {
        System.out.println("V8 engine accelerating.");
    }
}
