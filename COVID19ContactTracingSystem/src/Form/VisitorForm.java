package Form;

import Databases.DBHandler;
import Model.ImageModel;
import Model.Visitor;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Calendar;

public class VisitorForm extends JFrame{
    private JLabel lblHeader,lblForm,lblArrow,lblFName, lblLName,
            lblAge, lblPhoneNo, lblEmail, lblTemp, lblGender,
            lblAddress, lblReason;
    private  JTextField txtFName, txtLName, txtAge, txtPhoneNo,
            txtEmail, txtTemp, txtGender, txtAddress;
    private JTextArea txtAreaReason;
    private JRadioButton rBtnMale, rBtnFemale, rBtnNone, rBtnSpecify;
    private JButton btnSubmit;
    private ImageModel imgLogo;
    private String strGender = "", strEmail = "";
    private DBHandler objDBHandler;

    public VisitorForm() {
        objDBHandler = new DBHandler();
        imgLogo = new ImageModel();

        lblArrow = new JLabel(imgLogo.getArrow());
        lblArrow.setBounds(15,20,50,20);

        JLabel lblBG = new JLabel(imgLogo.getBG());
        lblBG.setSize(614,439);
        setContentPane(lblBG);

        components();
        rBtnListener();

        JComponent[] arrComponents = {lblHeader,lblForm,lblArrow,lblFName, lblLName,
                                    lblAge,lblTemp,txtFName, txtLName, txtAge,
                                    txtTemp, lblPhoneNo, txtPhoneNo, lblEmail,
                                    txtEmail, rBtnMale, rBtnFemale, rBtnNone,
                                    rBtnSpecify, txtAddress, lblAddress, lblGender,
                                    txtGender, lblReason, txtAreaReason, btnSubmit};
        for (JComponent objComponents : arrComponents)
            add(objComponents);

        setTitle("PUP COVID19 Contact Tracing");
        setIconImage(imgLogo.getLogo());
        setSize(514,639);
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        lblArrowEvent();
        btnSubmitEvent();
    }
    private void components(){
        lblHeader = new JLabel("PUP COVID19 CONTACT TRACING");
        lblHeader.setBounds(116,14,270,28);
        lblHeader.setFont(new Font("",Font.BOLD,15));

        lblForm = new JLabel("Visitor Form");
        lblForm.setBounds(207,57,97,25);
        lblForm.setFont(new Font("", Font.PLAIN,15));

        lblFName = new JLabel("First name");
        lblFName.setBounds(54,87,70,17);
        txtFName = new JTextField();
        txtFName.setBounds(54,104,167,25);

        lblLName = new JLabel("Last name");
        lblLName.setBounds(281,87,70,17);
        txtLName = new JTextField();
        txtLName.setBounds(281,104,167,25);

        lblAge = new JLabel("Age");
        lblAge.setBounds(54,150,70,17);
        txtAge = new JTextField();
        txtAge.setBounds(54,167,167,25);

        lblTemp = new JLabel("Temperature");
        lblTemp.setBounds(281,150,150,17);
        txtTemp = new JTextField();
        txtTemp.setBounds(281,167,167,23);

        lblPhoneNo = new JLabel("Phone Number");
        lblPhoneNo.setBounds(54,212,150,17);
        txtPhoneNo = new JTextField();
        txtPhoneNo.setBounds(54,229,167,25);

        lblEmail = new JLabel("Email (Optional)");
        lblEmail.setBounds(281,212,150,17);
        txtEmail = new JTextField();
        txtEmail.setBounds(281,229,167,25);

        lblGender = new JLabel("Gender");
        lblGender.setBounds(54,270,50,17);
        txtGender = new JTextField();
        txtGender.setBounds(281,371,167,25);
        txtGender.setEditable(false);
        rBtnMale = new JRadioButton("Male");
        rBtnMale.setBounds(70,300,70,17);
        rBtnMale.setOpaque(false);
        rBtnFemale = new JRadioButton("Female");
        rBtnFemale.setBounds(70,325,100,17);
        rBtnFemale.setOpaque(false);
        rBtnNone = new JRadioButton("Prefer not to say");
        rBtnNone.setBounds(70,350,150,17);
        rBtnNone.setOpaque(false);
        rBtnSpecify = new JRadioButton("Others (Please specify)");
        rBtnSpecify.setBounds(70,375,200,17);
        rBtnSpecify.setOpaque(false);
        ButtonGroup btnGroupGender = new ButtonGroup();
        JRadioButton[] rBtn = {rBtnMale, rBtnFemale, rBtnNone, rBtnSpecify};
        for (JRadioButton rBtnGender : rBtn)
            btnGroupGender.add(rBtnGender);


        lblAddress = new JLabel("Address");
        lblAddress.setBounds(54,405,100,17);
        txtAddress = new JTextField();
        txtAddress.setBounds(54,422,394,25);



        lblReason = new JLabel("Reason for visit");
        lblReason.setBounds(54,454,100,17);
        txtAreaReason = new JTextArea();
        txtAreaReason.setBounds(54,471,394,53);


        btnSubmit = new JButton("Submit");
        btnSubmit.setBounds(189,530,126,44);

    }
    private void rBtnListener() {
        JRadioButton[] arrBtn = {rBtnMale, rBtnFemale, rBtnNone, rBtnSpecify};
        for (JRadioButton rBtn : arrBtn) {
            rBtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    txtGender.setEditable(false);
                    txtGender.setText("");
                    if (rBtnSpecify.isSelected()) {
                        txtGender.setEditable(true);
                    }
                }
            });
        }
    }
    private void gender(){
        if (rBtnSpecify.isSelected())
            strGender = txtGender.getText();
        else if (rBtnMale.isSelected())
            strGender = "Male";
        else if (rBtnFemale.isSelected())
            strGender = "Female";
        else
            strGender = "Not Specified";
    }
    private void lblArrowEvent(){
        lblArrow.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new Person();
                setVisible(false);
            }
        });
    }
    private void btnSubmitEvent(){
        btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gender();

                Calendar calendar = Calendar.getInstance();
                Timestamp timestamp = new Timestamp(calendar.getTimeInMillis());
                Visitor objVisitor = new Visitor();
                objVisitor.setStrLastName(txtLName.getText().trim());
                objVisitor.setStrFirstName(txtFName.getText().trim());
                objVisitor.setStrPhoneNo(txtPhoneNo.getText().trim());
                objVisitor.setStrGender(strGender);
                objVisitor.setStrAddress(txtAddress.getText().trim());
                objVisitor.setStrReason((txtAreaReason.getText()));
                objVisitor.setTimeIn(timestamp);

                if (!txtEmail.getText().equals(""))
                    strEmail = txtEmail.getText();
                else
                    strEmail = "Not Specified";
                objVisitor.setStrEmail(strEmail);

                try {
                    objVisitor.setIntAge(Integer.parseInt(txtAge.getText().trim()));
                    objVisitor.setDblTemp(Double.parseDouble(txtTemp.getText().trim()));
                    if (!txtFName.getText().equals("") && !txtLName.getText().equals("") && !txtAge.getText().equals("")
                            && !txtTemp.getText().equals("") && !txtPhoneNo.getText().equals("") &&
                             !strGender.equals("") && !txtAddress.getText().equals("") && !txtAreaReason.getText().equals("")) {

                        objDBHandler.visitorWrite(objVisitor);
                        JOptionPane.showMessageDialog(null,"Successfully submitted", "Success", JOptionPane.INFORMATION_MESSAGE);
                        new FrontPage();
                        setVisible(false);
                    }
                    else
                        JOptionPane.showMessageDialog(null,"Incomplete Fields!", "Error",JOptionPane.ERROR_MESSAGE);
                } catch (SQLException | ClassNotFoundException throwables) {
                    JOptionPane.showMessageDialog(null,throwables, "Error",JOptionPane.ERROR_MESSAGE);
                }catch (NumberFormatException objNf){
                    JOptionPane.showMessageDialog(null,"Please enter number in age/temperature","Error",JOptionPane.ERROR_MESSAGE);
                }

            }
        });

    }
}
