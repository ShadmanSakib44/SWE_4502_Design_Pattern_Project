package cars.ConcreteCars;

import cars.Car;
import cars.EngineStrategy;
import cars.TurbochargerStrategy;

public class ConcreteCarB extends Car {

    public ConcreteCarB(EngineStrategy engineStrategy, TurbochargerStrategy turbochargerStrategy) {
        super(engineStrategy, turbochargerStrategy);
    }

    @Override
    public void displayCarInfo() {
        System.out.println("ConcreteCarB with custom engine and turbocharger settings.");
        
    }
}
