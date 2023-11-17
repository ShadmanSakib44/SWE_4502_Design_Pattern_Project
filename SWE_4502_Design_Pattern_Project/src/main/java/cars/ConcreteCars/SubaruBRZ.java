package cars.ConcreteCars;

import cars.Car;
import cars.EngineStrategy;
import cars.TurbochargerStrategy;

public class SubaruBRZ extends Car {

    public SubaruBRZ(EngineStrategy engineStrategy, TurbochargerStrategy turbochargerStrategy) {
        super(engineStrategy, turbochargerStrategy);
    }

    @Override
    public void displayCarInfo() {
        System.out.println("Subaru BRZ: A sporty coupe known for its agility.");
    }
}
