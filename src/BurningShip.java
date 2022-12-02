import java.awt.geom.Rectangle2D;

public class BurningShip extends FractalGenerator{

    private final int MAX_ITERATIONS = 2000;

    @Override
    public void getInitialRange(Rectangle2D.Double range) {
        range.x = -2;
        range.y = -2.5;
        range.width = 4;
        range.height = 4;
    }


    @Override
    public int numIterations(double x, double y) {
        int i = 0; // число итераций
        double zRe = 0; // действительная часть числа
        double zIm = 0; // мнимая часть числа

        while (i < MAX_ITERATIONS && zRe * zRe + zIm * zIm < 4){
            double newZRe = zRe * zRe - zIm * zIm + x;
            zRe = newZRe;
            zIm = Math.abs(2 * zRe * zIm) + y;
            i++;
        }

        if (i == MAX_ITERATIONS) return -1;
        return i;
    }


}
