package cars.ConcreteCars;

import cars.Car;
import cars.EngineStrategy;
import cars.TurbochargerStrategy;

public class PorscheBoxster extends Car {

    public PorscheBoxster(EngineStrategy engineStrategy, TurbochargerStrategy turbochargerStrategy) {
        super(engineStrategy, turbochargerStrategy);
    }

    @Override
    public void displayCarInfo() {
        System.out.println("Porsche Boxster: An iconic roadster with exceptional performance.");
    }
}
