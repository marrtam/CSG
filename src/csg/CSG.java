/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csg;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author kiper
 */
public class CSG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        File bmpFile = new File("bmpImage.bmp");
        BufferedImage image = ImageIO.read(bmpFile);
        
        
//        BufferedImage image = null;
        File f = null;
        int width = 963;    //width of the image
        int height = 640;   //height of the image
    
        //read image
        try{
          f = new File("D:\\Image\\Taj.jpg"); //image file path
          image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
          image = ImageIO.read(f);
          System.out.println("Reading complete.");
        } catch(IOException e){
          System.out.println("Error: "+e);
        }
    }
    
}
