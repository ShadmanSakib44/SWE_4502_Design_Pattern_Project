package cars.ConcreteCars;

import cars.Car;
import cars.EngineStrategy;
import cars.TurbochargerStrategy;

public class Ferrari812 extends Car {

    public Ferrari812(EngineStrategy engineStrategy, TurbochargerStrategy turbochargerStrategy) {
        super(engineStrategy, turbochargerStrategy);
    }

    @Override
    public void displayCarInfo() {
        System.out.println("Ferrari 812: A luxurious and powerful sports car.");
    }
}
