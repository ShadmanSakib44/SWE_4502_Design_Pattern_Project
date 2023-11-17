import cars.Car;
import factory.CarFactory;
import factory.TrackFactory;
import player.Player;
import race.Race;
import race.Track;
import java.util.Scanner;

public class RacingInIut {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name:");
        String playerName = scanner.nextLine();
        Player player = Player.getInstance();
        player.setName(playerName);

        System.out.println("Choose your car: ToyotaGR86, SubaruBRZ, PorscheBoxster, Ferrari812");
        String carChoice = scanner.nextLine();
        Car car = CarFactory.getCar(carChoice);

        System.out.println("Choose a track: Blue Moon Bay Speedway, BB Raceway, Circuit de Spa-Francorchamps");
        String trackChoice = scanner.nextLine();
        Track track = TrackFactory.getTrack(trackChoice);

        Race race = new Race(car, track);

        race.race();

        scanner.close();
    }
}
