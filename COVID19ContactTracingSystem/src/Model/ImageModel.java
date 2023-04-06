package Model;

import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class ImageModel {
    public java.awt.Image getLogo(){
        java.awt.Image imgLogo = Toolkit.getDefaultToolkit().getImage("src/Assets/PUPLogoIcon.png");
        return imgLogo;
    }
    public ImageIcon getArrow(){
        return new ImageIcon("src/Assets/left-arrow.png");
    }
    public ImageIcon getBG(){
        return new ImageIcon("src/Assets/PUPBg.png");
    }


}
