package decorator;

import cars.Car;
import cars.EngineStrategy;
import cars.TurbochargerStrategy;

public abstract class CarDecorator extends Car {
    protected Car decoratedCar;

    public CarDecorator(Car decoratedCar, EngineStrategy engineStrategy, TurbochargerStrategy turbochargerStrategy) {
        super(engineStrategy, turbochargerStrategy);
        this.decoratedCar = decoratedCar;
    }

    @Override
    public void displayCarInfo() {
        decoratedCar.displayCarInfo();
    }


}
