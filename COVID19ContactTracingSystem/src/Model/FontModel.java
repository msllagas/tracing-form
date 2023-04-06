package Model;

import java.awt.Font;

public class FontModel {
    public FontModel() {
    }

    public Font getBtnFont(){
        return new Font("",Font.BOLD,13);
    }
    public Font getMouseEnterFont(){
        return new Font("",Font.BOLD,16);
    }
}
