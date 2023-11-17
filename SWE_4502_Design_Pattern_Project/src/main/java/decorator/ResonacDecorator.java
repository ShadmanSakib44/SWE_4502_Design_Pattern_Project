package decorator;

import cars.Car;
import cars.EngineStrategy;
import cars.TurbochargerStrategy;

public class ResonacDecorator extends CarDecorator {

    public ResonacDecorator(Car decoratedCar, EngineStrategy engineStrategy, TurbochargerStrategy turbochargerStrategy) {
        super(decoratedCar, engineStrategy, turbochargerStrategy);
    }

    @Override
    public void accelerate() {
        decoratedCar.accelerate();
        applyResonacNOS();
    }

    private void applyResonacNOS() {
        System.out.println("Resonac NOS applied, boosting acceleration.");
    }

    @Override
    public void displayCarInfo() {
        decoratedCar.displayCarInfo();
        System.out.println("Equipped with Resonac NOS.");
    }
}
