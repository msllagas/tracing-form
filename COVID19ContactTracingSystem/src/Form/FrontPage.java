package Form;

import Model.ImageModel;

import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;
import javax.swing.BorderFactory;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrontPage extends JFrame {

    private JLabel lblLogo, lblHeader, lblTerms, lblTerms1, lblTerms2, lblBg, lblSubHeader;
    private JButton btnStart;
    private JCheckBox chkAgree;
    private ImageModel imgLogo;
    public FrontPage() {
        imgLogo = new ImageModel();
        ImageIcon imgIcon = new ImageIcon("src/Assets/PUPLogo.png");
        Font lblFont = new Font("",Font.PLAIN,12);

        lblLogo = new JLabel(imgIcon);
        lblLogo.setBounds(14,14,120,110);


        lblBg = new JLabel(imgLogo.getBG());
        lblBg.setSize(614,439);
        setContentPane(lblBg);

        lblHeader = new JLabel("PUP COVID19 CONTACT TRACER");
        lblHeader.setFont(new Font("",Font.BOLD,17));
        lblHeader.setBounds(158,50,286,27);

        lblSubHeader = new JLabel("Safety Towards a Better Community");
        lblSubHeader.setBounds(185,84,250,20);
        lblSubHeader.setFont(new Font("",Font.BOLD,13));

        btnStart = new JButton("Get Started");
        btnStart.setBounds(233,274,120,50);
        btnStart.setFont(new Font("", Font.BOLD,13));
        btnStart.setBorder(BorderFactory.createRaisedBevelBorder());

        lblTerms = new JLabel("We will not, in any circumstances, share your personal information with other");
        lblTerms.setBounds(96,154,450,17);
        lblTerms.setFont(lblFont);

        lblTerms1 = new JLabel("individuals or organizations without your permission, including public");
        lblTerms1.setBounds(97,175,400,17);
        lblTerms1.setFont(lblFont);

        lblTerms2 = new JLabel("organizations, corporations or individuals, except when applicable by law.");
        lblTerms2.setBounds(97,195,400,17);
        lblTerms2.setFont(lblFont);

        chkAgree = new JCheckBox("I agree to Terms & Conditions");
        chkAgree.setBounds(202,229,200,17);
        chkAgree.setOpaque(false);

        JComponent[] arrComponents = {lblTerms, lblTerms1, lblTerms2, btnStart,
                                    lblHeader, lblLogo, chkAgree, lblSubHeader};
        for (JComponent objComponents : arrComponents)
            add(objComponents);
        setIconImage(imgLogo.getLogo());
        setTitle("PUP COVID19 Contact Tracing");
        setSize(600,400);
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        chkAgree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (chkAgree.isSelected()){
                    btnStart.setBackground(new Color(66,183,42));
                }
                else
                    btnStart.setBackground(null);
            }
        });
        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (chkAgree.isSelected()) {
                    new Person();
                    setVisible(false);
                }
                else
                    JOptionPane.showMessageDialog(null,"Please check the agreement box above","Error", JOptionPane.ERROR_MESSAGE);
            }
        });
    }

}
