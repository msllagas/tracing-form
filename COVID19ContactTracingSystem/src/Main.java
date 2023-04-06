import Form.FrontPage;

/*
    Llagas,Mandy S.
 */

import javax.swing.SwingUtilities;
public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FrontPage();
            }
        });
    }
}