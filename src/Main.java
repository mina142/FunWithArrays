import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("blue");
        colors.add("green");
        colors.add("yellow");
        colors.add("red");
        colors.add("purple");
        //System.out.println(colors);
        // System.out.println(colors.get(1));

        while (true) {
            System.out.println("Please eneter a color or enter q to quit: ");
            String ask = keyboard.next();
            if (ask.equalsIgnoreCase("q")) {
                break;
            } else {
                colors.add(ask);

            }
            System.out.println(colors);
        }
    }
}
