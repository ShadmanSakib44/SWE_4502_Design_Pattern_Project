package factory;

import cars.Car;
import cars.Engines.*;
import cars.Turbochargers.*;
import cars.ConcreteCars.*;

public class CarFactory {

    public static Car getCar(String carType) {
        switch (carType) {
            case "ToyotaGR86":
                return new ToyotaGR86(new V6Engine(), new AlpineTurbocharger());
            case "SubaruBRZ":
                return new SubaruBRZ(new V6Engine(), new CumminsTurbocharger());
            case "PorscheBoxster":
                return new PorscheBoxster(new V8Engine(), new HoneywellTurbocharger());
            case "Ferrari812":
                return new Ferrari812(new V12Engine(), new AlpineTurbocharger());
            default:
                throw new IllegalArgumentException("Unknown car type: " + carType);
        }
    }
}
