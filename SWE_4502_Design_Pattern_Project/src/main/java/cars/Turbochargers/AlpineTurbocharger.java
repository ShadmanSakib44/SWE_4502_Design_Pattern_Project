package cars.Turbochargers;

import cars.TurbochargerStrategy;


public class AlpineTurbocharger implements TurbochargerStrategy {

    @Override
    public void enableTurbo() {

        System.out.println("Alpine Turbocharger enabled.");
    }

    @Override
    public void disableTurbo() {

        System.out.println("Alpine Turbocharger disabled.");
    }
}