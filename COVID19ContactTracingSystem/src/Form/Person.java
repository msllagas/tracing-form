package Form;

import Model.FontModel;
import Model.ImageModel;

import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Person extends JFrame{
    private JButton btnStudent, btnProf, btnSchoolStaff,
                    btnMaintenance, btnVendor, btnVisitor,
                    btnLogistics, btnFoodDeli, btnAdmin;
    private JLabel lblHeader, lblBg;
    private ImageModel imgLogo;
    private FontModel btnFont;
    public static JFrame jFrame;
    public Person() {
        jFrame = new JFrame();
        imgLogo = new ImageModel();


        lblBg = new JLabel(imgLogo.getBG());
        lblBg.setSize(614,439);
        jFrame.setContentPane(lblBg);

        btnFont = new FontModel();

        lblHeader = new JLabel("Kindly choose one of the following:");
        lblHeader.setBounds(64,41,250,21);
        lblHeader.setFont(new Font("",Font.BOLD,15));

        btnStudent = new JButton("Student      ");
        btnStudent.setBounds(64,97,140,50);
        btnStudent.setIcon(new ImageIcon("src/Assets/student-black.png"));
        btnStudent.setFont(btnFont.getBtnFont());

        btnProf = new JButton("Professor    ");
        btnProf.setBounds(238,97,140,50);
        btnProf.setIcon(new ImageIcon("src/Assets/prof-black.png"));
        btnProf.setFont(btnFont.getBtnFont());

        btnSchoolStaff = new JButton("School Staff ");
        btnSchoolStaff.setBounds(405,97,140,50);
        btnSchoolStaff.setIcon(new ImageIcon("src/Assets/staff-black.png"));
        btnSchoolStaff.setFont(btnFont.getBtnFont());

        btnMaintenance = new JButton("Maintenance  ");
        btnMaintenance.setBounds(64,176,140,50);
        btnMaintenance.setIcon(new ImageIcon("src/Assets/maintenance-black.png"));
        btnMaintenance.setFont(btnFont.getBtnFont());

        btnVendor = new JButton("  Vendor      ");
        btnVendor.setBounds(238,176,140,50);
        btnVendor.setIcon(new ImageIcon("src/Assets/market-black.png"));
        btnVendor.setFont(btnFont.getBtnFont());

        btnVisitor = new JButton("  Visitor      ");
        btnVisitor.setBounds(405,176,140,50);
        btnVisitor.setIcon(new ImageIcon("src/Assets/visitor-black.png"));
        btnVisitor.setFont(btnFont.getBtnFont());

        btnLogistics = new JButton("Logistics    ");
        btnLogistics.setBounds(64,259,140,50);
        btnLogistics.setIcon(new ImageIcon("src/Assets/logistics-black.png"));
        btnLogistics.setFont(btnFont.getBtnFont());

        btnFoodDeli = new JButton("Food Delivery");
        btnFoodDeli.setBounds(238,259,140,50);
        btnFoodDeli.setIcon(new ImageIcon("src/Assets/food-black.png"));
        btnFoodDeli.setFont(btnFont.getBtnFont());

        btnAdmin = new JButton("  Admin        ");
        btnAdmin.setBounds(405,259,140,50);
        btnAdmin.setIcon(new ImageIcon("src/Assets/admin-black.png"));
        btnAdmin.setFont(btnFont.getBtnFont());

        JComponent[] component = {lblHeader, btnStudent, btnSchoolStaff,
                                    btnProf, btnMaintenance, btnVendor,
                                    btnVisitor, btnLogistics, btnFoodDeli,
                                    btnAdmin};
        for (JComponent cmp : component)
            jFrame.add(cmp);

        jFrame.setTitle("PUP COVID19 Contact Tracing");
        jFrame.setIconImage(imgLogo.getLogo());
        jFrame.setSize(614,439);
        jFrame.setLayout(null);
        jFrame.setResizable(false);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);

        studentBtnEvent();
        profBtnEvent();
        facultyBtnEvent();
        maintenanceBtnEvent();
        vendorBtnEvent();
        visitorBtnEvent();
        logisticsBtnEvent();
        foodDeliBtnEvent();
        adminBtnEvent();
        btnMouseEvent();
    }
    private void btnMouseEvent(){
        JButton[] arrButton = {btnStudent,btnProf, btnSchoolStaff, btnMaintenance,
                                btnVendor, btnVisitor, btnLogistics,
                                btnFoodDeli, btnAdmin};
        for (JButton button : arrButton){
            button.setOpaque(false);
            button.setContentAreaFilled(false);
            button.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

            button.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    button.setOpaque(false);
                    button.setContentAreaFilled(false);
                    button.setFont(btnFont.getMouseEnterFont());
                }
                @Override
                public void mouseExited(MouseEvent e) {
                    button.setOpaque(false);
                    button.setContentAreaFilled(false);
                    button.setFont(btnFont.getBtnFont());
                }
            });
        }
        btnStudent.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btnStudent.setIcon(new ImageIcon("src/Assets/student-black26.png"));
                btnStudent.setBounds(56,89,156,66);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                btnStudent.setIcon(new ImageIcon("src/Assets/student-black.png"));
                btnStudent.setBounds(64,97,140,50);
            }
        });
        btnProf.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btnProf.setIcon(new ImageIcon("src/Assets/prof-black26.png"));
                btnProf.setBounds(230,89,156,66);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnProf.setIcon(new ImageIcon("src/Assets/prof-black.png"));
                btnProf.setBounds(238,97,140,50);
            }
        });
        btnSchoolStaff.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btnSchoolStaff.setIcon(new ImageIcon("src/Assets/staff-black26.png"));
                btnSchoolStaff.setBounds(397,89,156,66);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnSchoolStaff.setIcon(new ImageIcon("src/Assets/staff-black.png"));
                btnSchoolStaff.setBounds(405,97,140,50);
            }
        });
        btnMaintenance.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btnMaintenance.setIcon(new ImageIcon("src/Assets/maintenance-black26.png"));
                btnMaintenance.setBounds(56,168,156,66);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnMaintenance.setIcon(new ImageIcon("src/Assets/maintenance-black.png"));
                btnMaintenance.setBounds(64,176,140,50);
            }
        });
        btnVendor.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
               btnVendor.setIcon(new ImageIcon("src/Assets/vendor-black26.png"));
                btnVendor.setBounds(230,168,156,66);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnVendor.setIcon(new ImageIcon("src/Assets/market-black.png"));
                btnVendor.setBounds(238,176,140,50);
            }
        });
        btnVisitor.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btnVisitor.setIcon(new ImageIcon("src/Assets/visitor-black26.png"));
                btnVisitor.setBounds(397,168,156,66);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnVisitor.setIcon(new ImageIcon("src/Assets/visitor-black.png"));
                btnVisitor.setBounds(405,176,140,50);
            }
        });
        btnLogistics.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btnLogistics.setIcon(new ImageIcon("src/Assets/logistics-black26.png"));
                btnLogistics.setBounds(56,251,156,66);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnLogistics.setIcon(new ImageIcon("src/Assets/logistics-black.png"));
                btnLogistics.setBounds(64,259,140,50);
            }
        });
        btnFoodDeli.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btnFoodDeli.setIcon(new ImageIcon("src/Assets/food-black26.png"));
                btnFoodDeli.setBounds(230,251,156,66);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnFoodDeli.setIcon(new ImageIcon("src/Assets/food-black.png"));
                btnFoodDeli.setBounds(238,259,140,50);
            }
        });
        btnAdmin.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btnAdmin.setIcon(new ImageIcon("src/Assets/admin-black26.png"));
                btnAdmin.setBounds(397,251,156,66);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnAdmin.setIcon(new ImageIcon("src/Assets/admin-black.png"));
                btnAdmin.setBounds(405,259,140,50);
            }
        });

    }
    private void studentBtnEvent(){
        btnStudent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new StudentForm();
                jFrame.setVisible(false);
            }

        });
    }
    private void profBtnEvent(){
        btnProf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ProfForm();
                jFrame.setVisible(false);
            }
        });
    }
    private void facultyBtnEvent(){
        btnSchoolStaff.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new SchoolStaffForm();
                jFrame.setVisible(false);
            }
        });
    }
    private void maintenanceBtnEvent(){
        btnMaintenance.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MaintenanceForm();
                jFrame.setVisible(false);
            }
        });
    }
    private void vendorBtnEvent(){
        btnVendor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new VendorForm();
                jFrame.setVisible(false);
            }
        });
    }
    private void visitorBtnEvent(){
        btnVisitor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new VisitorForm();
                jFrame.setVisible(false);
            }
        });
    }
    private void logisticsBtnEvent(){
        btnLogistics.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new LogisticsForm();
                jFrame.setVisible(false);
            }
        });
    }
    private void foodDeliBtnEvent(){
        btnFoodDeli.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new FoodDForm();
                jFrame.setVisible(false);
            }
        });
    }
    private void adminBtnEvent(){
        btnAdmin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new LoginDialog();
            }
        });
    }

}
