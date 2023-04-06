package Form;

import Databases.DBHandler;
import Model.ImageModel;
import Model.Student;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Calendar;

public class StudentForm extends JFrame {
    private JLabel lblHeader,lblForm,lblArrow,lblFName, lblLName, lblStudNo,
                    lblAge, lblPhoneNo, lblEmail, lblTemp, lblGender,
                    lblAddress, lblCourse;
    private  JTextField txtFName, txtLName, txtStudNo, txtAge, txtPhoneNo,
                        txtEmail, txtTemp, txtGender, txtAddress;
    private JRadioButton rBtnMale, rBtnFemale, rBtnNone, rBtnSpecify;
    private JButton btnSubmit;
    private ImageModel imgLogo;
    private JComboBox<String> cmbCourse;
    private String strGender = "", strEmail = "";
    private String[] arrCourse;
    private DBHandler objDBHandler;
    public StudentForm() {
        objDBHandler = new DBHandler();
        imgLogo = new ImageModel();

        lblArrow = new JLabel(imgLogo.getArrow());
        lblArrow.setBounds(15,20,50,20);

        JLabel lblLogo = new JLabel(imgLogo.getBG());
        lblLogo.setSize(614,439);
        setContentPane(lblLogo);

        arrCourse = new String[]{" ---------------------------------","ABBrC", "BSENTREP",
                                 "BSA", "BSBAFM", "BS-ARCHI","BSID", "ABELS", "ABF", "ABLCS",
                                "AB-PHILO", "BPEA", "BSBA-HR", "BSBAHRM", "BSBA-MM", "BSENTREP",
                                "AB-BSOA", "BADPR", "BA Broadcasting", "BACR", "BAJ", "BSCS",
                                "BSIT", "BEED", "BLIS", "BBTLEDHE", "BBTLEDIA", "BBTLEDICT",
                                "BECED", "BSEDEN", "BSEDFL", "BSEDMT", "BSEDSC", "BSEDSS",
                                "BTVEDFSM", "BSCE", "BSCOE", "BSEE", "BS-ECE", "BSIE",
                                "BSRE", "BPE", "BSESS", "BPA", "BAIS", "BAPE",
                                "BAPS", "BAH", "BAS", "BSC", "BSE", "BSPSY",
                                "BSFT", "BSAPMATH", "BSBIO", "BSCHEM", "BSMATH", "BSND",
                                "BSPHY", "BSSTAT", "BSHM", "BSTM", "BSTRM", "DCET",
                                "DEET", "DECET", "DICT", "DMET", "DOMT", "GAS",
                                "STEM", "ABM", "HumSS", "LabHi", "Arts", "TechVoc",
                                "ICT"};

        cmbCourse = new JComboBox<>(arrCourse);
        cmbCourse.setBounds(281,167,167,23);

        components();
        rBtnListener();

        JComponent[] arrComponents = {lblHeader, lblForm, lblArrow,lblFName, cmbCourse,
                                    txtFName, lblLName, txtLName, txtStudNo, lblStudNo,
                                    lblAge, txtAge, lblPhoneNo, txtPhoneNo, lblEmail,
                                    txtEmail, lblCourse, lblTemp, txtTemp, lblGender,
                                    rBtnMale, rBtnFemale, rBtnNone, rBtnSpecify, txtGender,
                                    lblAddress, txtAddress, btnSubmit};
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

        lblForm = new JLabel("Student Form");
        lblForm.setBounds(203,57,97,25);
        lblForm.setFont(new Font("", Font.PLAIN,15));

        lblFName = new JLabel("First name");
        lblFName.setBounds(54,87,70,17);
        txtFName = new JTextField();
        txtFName.setBounds(54,104,167,25);

        lblLName = new JLabel("Last name");
        lblLName.setBounds(281,87,70,17);
        txtLName = new JTextField();
        txtLName.setBounds(281,104,167,25);

        lblStudNo = new JLabel("Student No.");
        lblStudNo.setBounds(54,150,70,17);
        txtStudNo = new JTextField();
        txtStudNo.setBounds(54,167,167,25);

        lblCourse = new JLabel("Course");
        lblCourse.setBounds(281,150,50,17);

        lblAge = new JLabel("Age");
        lblAge.setBounds(54,212,22,17);
        txtAge = new JTextField();
        txtAge.setBounds(54,229,167,25);

        lblTemp = new JLabel("Temperature");
        lblTemp.setBounds(281,212,80,17);
        txtTemp = new JTextField();
        txtTemp.setBounds(281,229,167,25);

        lblPhoneNo = new JLabel("Phone Number");
        lblPhoneNo.setBounds(54,271,100,17);
        txtPhoneNo = new JTextField();
        txtPhoneNo.setBounds(54,288,167,25);

        lblEmail = new JLabel("Email (Optional)");
        lblEmail.setBounds(281,271,100,17);
        txtEmail = new JTextField();
        txtEmail.setBounds(281,288,167,25);

        lblGender = new JLabel("Gender");
        lblGender.setBounds(54,325,50,17);
        txtGender = new JTextField();
        txtGender.setBounds(281,424,167,25);
        txtGender.setEditable(false);
        rBtnMale = new JRadioButton("Male");
        rBtnMale.setBounds(70,354,70,17);
        rBtnMale.setOpaque(false);
        rBtnFemale = new JRadioButton("Female");
        rBtnFemale.setBounds(70,378,100,17);
        rBtnFemale.setOpaque(false);
        rBtnNone = new JRadioButton("Prefer not to say");
        rBtnNone.setBounds(70,403,150,17);
        rBtnNone.setOpaque(false);
        rBtnSpecify = new JRadioButton("Others (Please specify)");
        rBtnSpecify.setBounds(70,428,200,17);
        rBtnSpecify.setOpaque(false);
        ButtonGroup btnGroupGender = new ButtonGroup();
        JRadioButton[] rBtn = {rBtnMale, rBtnFemale, rBtnNone, rBtnSpecify};
        for (JRadioButton rBtnGender : rBtn)
            btnGroupGender.add(rBtnGender);


        lblAddress = new JLabel("Address");
        lblAddress.setBounds(54,461,100,17);
        txtAddress = new JTextField();
        txtAddress.setBounds(54,478,394,25);

        btnSubmit = new JButton("Submit");
        btnSubmit.setBounds(189,530,126,44);


    }
    private void rBtnListener(){
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
                int intIndex = cmbCourse.getSelectedIndex();
                String strCourse = arrCourse[intIndex];

                Calendar calendar = Calendar.getInstance();
                Timestamp timestamp = new Timestamp(calendar.getTimeInMillis());
                Student student = new Student();
                student.setStrFirstName(txtFName.getText().trim());
                student.setStrLastName(txtLName.getText().trim());
                student.setStrStudNo(txtStudNo.getText().trim());
                student.setStrCourse(strCourse);
                student.setStrPhoneNo(txtPhoneNo.getText().trim());
                student.setStrGender(strGender);
                student.setStrAddress(txtAddress.getText().trim());
                student.setTimeIn(timestamp);

                if (!txtEmail.getText().equals(""))
                    strEmail = txtEmail.getText();
                else
                    strEmail = "Not Specified";
                student.setStrEmail(strEmail);

                try {
                    student.setIntAge(Integer.parseInt(txtAge.getText().trim()));
                    student.setDblTemp(Double.parseDouble(txtTemp.getText().trim()));
                        if (!txtFName.getText().equals("") && !txtLName.getText().equals("") && !txtStudNo.getText().equals("") &&
                                !txtAge.getText().equals("") && !txtTemp.getText().equals("") && !txtPhoneNo.getText().equals("") &&
                                 !strCourse.equals(arrCourse[0]) &&!strGender.equals("") && !txtAddress.getText().equals("")) {
                            objDBHandler.studentWrite(student);
                            JOptionPane.showMessageDialog(null,"Successfully submitted", "Success", JOptionPane.INFORMATION_MESSAGE);

                            new FrontPage();
                            setVisible(false);
                        }
                        else
                            JOptionPane.showMessageDialog(null,"Incomplete Fields!", "Error",JOptionPane.ERROR_MESSAGE);
                    } catch (SQLException | ClassNotFoundException throwables) {
                    JOptionPane.showMessageDialog(null,throwables, "Error",JOptionPane.ERROR_MESSAGE);
                }catch (NumberFormatException objNFE) {
                    JOptionPane.showMessageDialog(null, "Please input number on age/temperature", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
}
