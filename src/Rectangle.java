import java.util.ArrayList;

public class Rectangle {

    private int length = 0;
    private int width = 0;
    private int x = 0;
    private int y = 0;
    private int x1 = 0;
    private int y1 = 0;
    private int x2 = 0;
    private int y2 = 0;
    private int x3 = 0;
    private int y3 = 0;
    private int x4 = 0;
    private int y4 = 0;

    public Rectangle(int length, int width, int x, int y) {
        this.length = length;
        this.width = width;
        this.x = x;
        this.y = y;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isColliding(Rectangle original, Rectangle compare) {
        int compareLen = compare.getLength();
        int compareWid = compare.getWidth();
        int compareX = compare.getX();
        int compareY = compare.getY();

        if (compareX < x2 && compareX > x1) {
            if (compareY < y4 && compareY > y1) {
                return true;
            }
            else if (compareY + compareWid < y4 && compareY + compareWid > y1) {
                return true;
            }
        }
        else if (compareX + compareLen < x2 && compareX + compareLen > x1) {
            if (compareY < y4 && compareY > y1) {
                return true;
            }
            else if (compareY + compareWid < y4 && compareY + compareWid > y1) {
                return true;
            }
        }
        else if (compareY < y4 && compareY > 1) {
            if (compareX + compareLen < x2 && compareX + compareLen > x1){
                return true;
            }
            else if (compareX < x2 && compareX > x1){
                return true;
            }
        }
        else if (compareY + compareWid < y4 && compareY + compareWid > y1){
            if (compareX + compareLen < x2 && compareX + compareLen > x1){
                return true;
            }
            else if (compareX < x2 && compareX > x1){
                return true;
            }
        }
        return false;

    }

    public void getOriginal(Rectangle original) {
        int originalLen = original.getLength();
        int originalWid = original.getWidth();
        int originalX = original.getX();
        int originalY = original.getY();

        x1 = originalX;
        y1 = originalY;

        x2 = originalX + originalLen;
        y2 = originalY;

        x3 = originalX + originalLen;
        y3 = originalY + originalWid;

        x4 = originalX;
        y4 = originalY + originalWid;
    }
}
