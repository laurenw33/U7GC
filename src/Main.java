import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Rectangle original = new Rectangle(20, 10, 10, 15);
        ArrayList<Rectangle> listOfRect = new ArrayList<>();

        for (int i = 0; i < 1000000; i++) {
            int len = (int) (Math.random() * 50);
            int width = (int) (Math.random() * 50);
            int x = (int) (Math.random() * (50 - 10 + 1) + 10);
            int y = (int) (Math.random() * (50 - 10 + 1) + 10);

            Rectangle temp = new Rectangle(len, width, x, y);
            listOfRect.add(temp);
        }

        int count = 0;
        original.getOriginal(original);
        for (Rectangle rec : listOfRect) {
            System.out.println(original.isColliding(original, rec));
            if (original.isColliding(original, rec)){
                count++;
            }
        }

        double percent = (double) count /1000000;
        percent *= 100;
        System.out.println("Percent: " + percent);
    }


}