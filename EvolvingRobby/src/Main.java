public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

public enum SitePosition {
    //All Directions for the bot to move
    NORTH, SOUTH, EAST, WEST, CURRENT;

    private int direction;
    private String description;

    public int getDirection(){
        return direction;
    }
}