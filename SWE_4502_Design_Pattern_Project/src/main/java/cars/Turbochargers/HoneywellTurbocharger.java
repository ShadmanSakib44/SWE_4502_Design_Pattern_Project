package cars.Turbochargers;

import cars.TurbochargerStrategy;

public class HoneywellTurbocharger implements TurbochargerStrategy {

    @Override
    public void enableTurbo() {

        System.out.println("Honeywell Turbocharger enabled.");
    }

    @Override
    public void disableTurbo() {

        System.out.println("Honeywell Turbocharger disabled.");
    }
}
