package utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class RandomTimeFormatter {
    private static final SimpleDateFormat TIME_FORMAT = new SimpleDateFormat("HH::mm::ss");


    public static String getRandomTime() {
        Random rand = new Random();

        long randomTimeInMillis = rand.nextInt(3600) * 1000L;
        return TIME_FORMAT.format(new Date(randomTimeInMillis));
    }
}
