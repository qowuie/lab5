import java.awt.geom.Rectangle2D;

public class Mandelbrot extends FractalGenerator{

    private final int MAX_ITERATIONS = 2000;

    @Override
    public void getInitialRange(Rectangle2D.Double range) {
        range.x = -2;
        range.y = -1.5;
        range.width = 3;
        range.height = 3;
    }


    @Override
    public int numIterations(double x, double y) {
        int i = 0; // число итераций
        double zRe = 0; // действительная часть числа
        double zIm = 0; // мнимая часть числа

        while (i < MAX_ITERATIONS && zRe * zRe + zIm * zIm < 4){
            double newZRe = zRe * zRe - zIm * zIm + x;
            double newZIm = 2 * zRe * zIm + y;
            zRe = newZRe;
            zIm = newZIm;
            i++;
        }

        if (i == MAX_ITERATIONS) return -1;
        return i;
    }


}
