/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package bitmap.transformer;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.FileSystems;

public class App {
    public static void main (String[] args) throws IOException{
        byte[] bitmap = findImage("src/assets/rainbow.bmp");
        byte[] whiteToBlack = whiteToBlack(bitmap);

        InputStream in = new ByteArrayInputStream(whiteToBlack);
        BufferedImage outputImage = ImageIO.read(in);

        File outputfile = new File("blackImage.jpg");
        ImageIO.write(outputImage, "jpg", outputfile);
    }

        public static byte[] findImage(String path) throws IOException {
        File input = new File(path);

        BufferedImage neoMatrix = ImageIO.read(input);
        byte[] pixels = (byte[]) neoMatrix.getRaster().getDataElements(0, 0, neoMatrix.getWidth(), neoMatrix.getHeight(), null);
        return pixels;
        }


        public static byte[] whiteToBlack (byte[] input) {
            for (int i = 0; i < input.length; i = i + 3) {
            if (input[i] == 0) {
                input[i] = 7;
            }
            if (input[i+1] == 0){
                input[i+1] = 7;
            }
            if (input[i+2] == 0){
                input[i+2] = 7;
            }
            }
            return input;
        }

    }

