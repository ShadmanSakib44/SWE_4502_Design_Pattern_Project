package race;

import cars.Car;

public abstract class RaceTemplate {
    public final void race() {
        carInfo();
        startCar();
        accelerateCar();
        finishLine();
        stopCar();
        lapTime();
    }

    protected abstract void carInfo();
    protected abstract void startCar();
    protected abstract void accelerateCar();
    protected abstract void finishLine();
    protected abstract void stopCar();
    protected abstract void lapTime();
}
