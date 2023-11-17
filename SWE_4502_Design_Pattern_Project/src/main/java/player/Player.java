package player;

public class Player {

    private static Player instance;


    private String name;


    private Player() {

    }


    public static  Player getInstance() {
        if (instance == null) {
            instance = new Player();
        }
        return instance;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }


}
