package race;

import cars.Car;

public class Race extends RaceTemplate {
    private Car car;

    public Race(Car car) {
        this.car = car;
    }

    @Override
    protected void carInfo() {
        System.out.println("Car information is displayed.");
    }

    @Override
    protected void startCar() {
        System.out.println("Starting the car.");
    }

    @Override
    protected void accelerateCar() {
        System.out.println("Car is accelerating.");
    }

    @Override
    protected void finishLine() {
        System.out.println("Car has crossed the finish line.");
    }

    @Override
    protected void stopCar() {
        System.out.println("Stopping the car.");
    }

    @Override
    protected void lapTime() {
        System.out.println("Random lap time is generated here.");
    }
}
