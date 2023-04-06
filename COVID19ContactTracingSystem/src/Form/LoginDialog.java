package Form;

import Model.Admin;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import java.awt.Color;

public class LoginDialog{
    private final JTextField txtAdminName;
    private final JPasswordField passAdminPass;
    private final JButton btnLogin;
    Admin objAdmin;

    public LoginDialog() {
        txtAdminName = new JTextField();
        txtAdminName.setBounds(125, 51, 149, 25);
        passAdminPass = new JPasswordField();
        passAdminPass.setBounds(125, 106, 149, 25);
        System.out.println(passAdminPass.getPassword());

        btnLogin = new JButton("Login");
        login();
        JLabel lblUser = new JLabel("Username");
        lblUser.setBounds(125, 34, 69, 17);
        JLabel lblPass = new JLabel("Password");
        lblPass.setBounds(125, 89, 69, 17);
        JDialog jDialog = new JDialog(Person.jFrame, "Login");


        Person.jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        btnLogin.setForeground(Color.black);
        jDialog.setLayout(null);
        btnLogin.setBounds(144, 155, 111, 43);
        jDialog.add(lblPass);
        jDialog.add(lblUser);
        jDialog.add(btnLogin);
        jDialog.add(txtAdminName);
        jDialog.add(passAdminPass);
        jDialog.setResizable(false);
        jDialog.setSize(400, 250);
        jDialog.setLocationRelativeTo(null);
        jDialog.setModal(true);
        jDialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        jDialog.setVisible(true);
    }
    private void login(){
        objAdmin = new Admin();
        btnLogin.addActionListener(e -> {
            if (txtAdminName.getText().equals(objAdmin.getUsername()) && passAdminPass.getText().equals(objAdmin.getPassword())){
                new SeeTable();
                Person.jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                Person.jFrame.setVisible(false);
            }
            else
                JOptionPane.showMessageDialog(null,"Incorrect username/password","Error",JOptionPane.ERROR_MESSAGE);
        });
    }
}