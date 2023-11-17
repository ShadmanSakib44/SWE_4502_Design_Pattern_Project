package race;

import cars.Car;
import race.Track;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Race extends RaceTemplate {

    public Race(Car car, Track track) {
        super(car, track);
    }

    @Override
    protected void trackInfo() {
        System.out.println("Track information: " + track.getTrackInfo());
    }

    @Override
    protected void carInfo() {
        car.displayCarInfo();
    }

    @Override
    protected void startCar() {
        System.out.println("Starting the car.");
        car.startEngine();
    }

    @Override
    protected void startLine() {
        System.out.println("The race starts at the line.");
    }

    @Override
    protected void accelerateCar() {
        System.out.println("Car is accelerating.");
        car.accelerate();
    }

    @Override
    protected void finishLine() {
        System.out.println("Car has crossed the finish line.");
    }

    @Override
    protected void stopCar() {
        System.out.println("Stopping the car.");
        car.stopEngine();
    }

    @Override
    protected void lapTime() {
        Random random = new Random();
        long duration = random.nextInt(600000);
        Date time = new Date(duration);
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        String formattedTime = formatter.format(time);
        System.out.println("Lap Time: " + formattedTime);
    }
}
