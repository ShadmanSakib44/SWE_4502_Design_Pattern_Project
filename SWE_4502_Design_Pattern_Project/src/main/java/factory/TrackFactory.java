package factory;

import race.Track;
import tracks.BBRaceway;
import tracks.BlueMoonBaySpeedway;
import tracks.CircuitDeSpa;

public class TrackFactory {

    public static Track getTrack(String trackName) {
        switch (trackName) {
            case "Blue Moon Bay Speedway":
                return new BlueMoonBaySpeedway();
            case "BB Raceway":
                return new BBRaceway();
            case "Circuit de Spa-Francorchamps":
                return new CircuitDeSpa();
            default:
                throw new IllegalArgumentException("Unknown track name: " + trackName);
        }
    }
}
