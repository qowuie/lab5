import java.awt.*;
import java.awt.image.BufferedImage;

public class JImageDisplay extends javax.swing.JComponent {
    public BufferedImage image;

    public JImageDisplay(int height, int width){
        image = new BufferedImage(height, width, BufferedImage.TYPE_INT_RGB);
        Dimension preferredSize = new Dimension(height, width);
        super.setPreferredSize(preferredSize);
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(image, 0, 0, image.getWidth(), image.getHeight(), null);
    }

    public void clearImage(){
        for (int x = 0; x < image.getWidth(); x++){
            for (int y = 0; y < image.getHeight(); y++){
                image.setRGB(x, y, 0);
            }
        }
    }

    public void drawPixel(int x, int y, int rgbColor){
        image.setRGB(x, y, rgbColor);
    }

}
