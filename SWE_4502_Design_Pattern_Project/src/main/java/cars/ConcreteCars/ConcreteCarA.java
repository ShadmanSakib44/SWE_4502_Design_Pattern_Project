package cars.ConcreteCars;

import cars.Car;
import cars.EngineStrategy;
import cars.TurbochargerStrategy;

public class ConcreteCarA extends Car {

    public ConcreteCarA(EngineStrategy engineStrategy, TurbochargerStrategy turbochargerStrategy) {
        super(engineStrategy, turbochargerStrategy);
    }

    @Override
    public void displayCarInfo() {
        System.out.println("ConcreteCarA with custom engine and turbocharger settings.");

    }
}
