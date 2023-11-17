package race;

import cars.Car;
import race.Track;


public abstract class RaceTemplate {
    protected Car car;
    protected Track track;

    public RaceTemplate(Car car, Track track) {
        this.car = car;
        this.track = track;
    }

    public final void race() {
        trackInfo();
        carInfo();
        startCar();
        startLine();
        accelerateCar();
        finishLine();
        stopCar();
        lapTime();
    }

    protected abstract void trackInfo();
    protected abstract void carInfo();
    protected abstract void startCar();
    protected abstract void startLine();
    protected abstract void accelerateCar();
    protected abstract void finishLine();
    protected abstract void stopCar();
    protected abstract void lapTime();
}
