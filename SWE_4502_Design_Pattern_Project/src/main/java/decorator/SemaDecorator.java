package decorator;

import cars.Car;
import cars.EngineStrategy;
import cars.TurbochargerStrategy;

public class SemaDecorator extends CarDecorator {

    public SemaDecorator(Car decoratedCar, EngineStrategy engineStrategy, TurbochargerStrategy turbochargerStrategy) {
        super(decoratedCar, engineStrategy, turbochargerStrategy);
    }

    @Override
    public void accelerate() {
        decoratedCar.accelerate();
        applySemaNOS();
    }

    private void applySemaNOS() {
        System.out.println("Sema NOS applied, boosting acceleration.");
    }

    @Override
    public void displayCarInfo() {
        decoratedCar.displayCarInfo();
        System.out.println("Equipped with Sema NOS.");
    }
}
