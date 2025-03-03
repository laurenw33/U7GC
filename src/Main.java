import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Rectangle original = new Rectangle(20, 10, 10, 15);
        ArrayList<Rectangle> listOfRect = new ArrayList<>();

        for (int i = 0; i < 1000000; i++) {
            int len = (int) (Math.random() * (50 - 10 + 1) + 10);
            int width = (int) (Math.random() * (6) + 5);
            int x = (int) (Math.random() * (50) + 1);
            int y = (int) (Math.random() * (50) + 1);

            Rectangle temp = new Rectangle(len, width, x, y);
            listOfRect.add(temp);
        }

        int count = 0;
        original.getOriginal(original);
        for (Rectangle rec : listOfRect) {
            if (original.isColliding(original, rec)){
                count++;
            }
        }

        double percent = (double) count /1000000;
        percent *= 100;
        System.out.println("Percent: " + percent);
    }


}