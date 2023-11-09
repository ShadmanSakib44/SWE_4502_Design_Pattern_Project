package cars.Turbochargers;

import cars.TurbochargerStrategy;

public class CumminsTurbocharger implements TurbochargerStrategy {

    @Override
    public void enableTurbo() {

        System.out.println("Cummins Turbocharger enabled.");
    }

    @Override
    public void disableTurbo() {

        System.out.println("Cummins Turbocharger disabled.");
    }
}
