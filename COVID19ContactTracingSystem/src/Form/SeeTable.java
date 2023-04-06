package Form;

import Databases.DBHandler;
import Model.FontModel;
import Model.ImageModel;
import Tables.FoodDeliveryTable;
import Tables.LogisticsTable;
import Tables.MaintenanceTable;
import Tables.ProfTable;
import Tables.SchoolStaffTable;
import Tables.StudentTable;
import Tables.VendorTable;
import Tables.VisitorTable;

import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

public class SeeTable extends JFrame{
    private JButton btnStudent, btnProf, btnSchoolStaff,
            btnMaintenance, btnVendor, btnVisitor,
            btnLogistics, btnFoodDeli, btnSignOut;
    private final JLabel lblBg;
    private JLabel lblHeader;
    private final ImageModel imgLogo;
    private FontModel objFontModel;
    public SeeTable() {

        new DBHandler();
        imgLogo = new ImageModel();

        lblBg = new JLabel(imgLogo.getBG());
        lblBg.setSize(614,439);
        setContentPane(lblBg);

        objFontModel = new FontModel();

        components();


        JComponent[] arrComponents = {lblHeader, btnSignOut, btnStudent,
                                    btnProf, btnSchoolStaff,btnMaintenance,
                                    btnVendor, btnVisitor, btnLogistics,
                                    btnFoodDeli};
        for (JComponent objComponents : arrComponents)
            add(objComponents);


        setTitle("PUP COVID19 Contact Tracing");
        setIconImage(imgLogo.getLogo());
        setSize(614,439);
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        btnMouseEvent();
        btnSignOutEvent();
        btnStudentEvent();
        btnProfEvent();
        btnStaffEvent();
        btnMaintenanceEvent();
        btnVendorEvent();
        btnVisitorEvent();
        btnLogisticsEvent();
        btnFoodDeliEvent();

    }
    private void components(){
        lblHeader = new JLabel("See Table of:");
        lblHeader.setBounds(72,35,150,21);
        lblHeader.setFont(new Font("",Font.BOLD,15));

        btnSignOut = new JButton("Sign Out");
        btnSignOut.setBounds(483,14,101,35);

        btnStudent = new JButton("Student     ");
        btnStudent.setBounds(122,84,140,50);
        btnStudent.setIcon(new ImageIcon("src/Assets/student-black.png"));
        btnStudent.setFont(objFontModel.getBtnFont());

        btnProf = new JButton("Professor    ");
        btnProf.setBounds(343,84,140,50);
        btnProf.setIcon(new ImageIcon("src/Assets/prof-black.png"));
        btnProf.setFont(objFontModel.getBtnFont());

        btnSchoolStaff = new JButton("School Staff ");
        btnSchoolStaff.setBounds(122,157,140,50);
        btnSchoolStaff.setIcon(new ImageIcon("src/Assets/staff-black.png"));
        btnSchoolStaff.setFont(objFontModel.getBtnFont());

        btnMaintenance = new JButton("Maintenance  ");
        btnMaintenance.setBounds(343,157,140,50);
        btnMaintenance.setIcon(new ImageIcon("src/Assets/maintenance-black.png"));
        btnMaintenance.setFont(objFontModel.getBtnFont());

        btnVendor = new JButton("  Vendor       ");
        btnVendor.setBounds(122,232,140,50);
        btnVendor.setIcon(new ImageIcon("src/Assets/market-black.png"));
        btnVendor.setFont(objFontModel.getBtnFont());

        btnVisitor = new JButton("  Visitor      ");
        btnVisitor.setBounds(343,232,140,50);
        btnVisitor.setIcon(new ImageIcon("src/Assets/visitor-black.png"));
        btnVisitor.setFont(objFontModel.getBtnFont());

        btnLogistics = new JButton("Logistics    ");
        btnLogistics.setBounds(122,311,140,50);
        btnLogistics.setIcon(new ImageIcon("src/Assets/logistics-black.png"));
        btnLogistics.setFont(objFontModel.getBtnFont());

        btnFoodDeli = new JButton("Food Delivery");
        btnFoodDeli.setBounds(343,311,140,50);
        btnFoodDeli.setIcon(new ImageIcon("src/Assets/food-black.png"));
        btnFoodDeli.setFont(objFontModel.getBtnFont());

    }

    private void btnMouseEvent(){
        JButton[] arrButton = {btnStudent,btnProf, btnSchoolStaff, btnMaintenance,
                btnVendor, btnVisitor, btnLogistics,
                btnFoodDeli, btnSignOut};
        for (JButton button : arrButton){
            button.setOpaque(false);
            button.setContentAreaFilled(false);
            button.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

            button.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    button.setOpaque(false);
                    button.setContentAreaFilled(false);
                    button.setFont(objFontModel.getMouseEnterFont());
                }
                @Override
                public void mouseExited(MouseEvent e) {
                    button.setOpaque(false);
                    button.setContentAreaFilled(false);
                    button.setFont(objFontModel.getBtnFont());
                }
            });
        }
        btnSignOut.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btnSignOut.setBounds(474,13,112,45);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnSignOut.setBounds(483,14,101,35);
            }
        });
        btnStudent.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btnStudent.setIcon(new ImageIcon("src/Assets/student-black26.png"));
                btnStudent.setBounds(114,76,156,66);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                btnStudent.setIcon(new ImageIcon("src/Assets/student-black.png"));
                btnStudent.setBounds(122,84,140,50);
            }
        });
        btnProf.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btnProf.setIcon(new ImageIcon("src/Assets/prof-black26.png"));
                btnProf.setBounds(335,76,156,66);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnProf.setIcon(new ImageIcon("src/Assets/prof-black.png"));
                btnProf.setBounds(343,84,140,50);
            }
        });
        btnSchoolStaff.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btnSchoolStaff.setIcon(new ImageIcon("src/Assets/staff-black26.png"));
                btnSchoolStaff.setBounds(114,157,156,66);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnSchoolStaff.setIcon(new ImageIcon("src/Assets/staff-black.png"));
                btnSchoolStaff.setBounds(122,157,140,50);
            }
        });
        btnMaintenance.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btnMaintenance.setIcon(new ImageIcon("src/Assets/maintenance-black26.png"));
                btnMaintenance.setBounds(335,157,156,66);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnMaintenance.setIcon(new ImageIcon("src/Assets/maintenance-black.png"));
                btnMaintenance.setBounds(343,157,140,50);
            }
        });
        btnVendor.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btnVendor.setIcon(new ImageIcon("src/Assets/vendor-black26.png"));
                btnVendor.setBounds(114,232,156,66);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnVendor.setIcon(new ImageIcon("src/Assets/market-black.png"));
                btnVendor.setBounds(122,232,140,50);
            }
        });
        btnVisitor.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btnVisitor.setIcon(new ImageIcon("src/Assets/visitor-black26.png"));
                btnVisitor.setBounds(335,232,156,66);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnVisitor.setIcon(new ImageIcon("src/Assets/visitor-black.png"));
                btnVisitor.setBounds(343,232,140,50);
            }
        });
        btnLogistics.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btnLogistics.setIcon(new ImageIcon("src/Assets/logistics-black26.png"));
                btnLogistics.setBounds(114,311,156,66);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnLogistics.setIcon(new ImageIcon("src/Assets/logistics-black.png"));
                btnLogistics.setBounds(122,311,140,50);
            }
        });
        btnFoodDeli.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btnFoodDeli.setIcon(new ImageIcon("src/Assets/food-black26.png"));
                btnFoodDeli.setBounds(335,311,156,66);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnFoodDeli.setIcon(new ImageIcon("src/Assets/food-black.png"));
                btnFoodDeli.setBounds(343,311,140,50);
            }
        });

    }
    private void btnSignOutEvent(){
        btnSignOut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new FrontPage();
                setVisible(false);
            }
        });
    }
    private void btnStudentEvent() {
        btnStudent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new StudentTable();
                } catch (SQLException | ClassNotFoundException throwables) {
                    JOptionPane.showMessageDialog(null,throwables, "Error",JOptionPane.ERROR_MESSAGE);
                }
                setVisible(false);
            }
        });
    }
    private void btnProfEvent(){
        btnProf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new ProfTable();
                } catch (SQLException | ClassNotFoundException throwables) {
                    JOptionPane.showMessageDialog(null,throwables, "Error",JOptionPane.ERROR_MESSAGE);

                }
                setVisible(false);
            }
        });
    }
    private void btnStaffEvent(){
        btnSchoolStaff.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new SchoolStaffTable();
                } catch (SQLException | ClassNotFoundException throwables) {
                    JOptionPane.showMessageDialog(null,throwables, "Error",JOptionPane.ERROR_MESSAGE);

                }
                setVisible(false);
            }
        });
    }
    private void btnMaintenanceEvent(){
        btnMaintenance.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new MaintenanceTable();
                } catch (SQLException | ClassNotFoundException throwables) {
                    JOptionPane.showMessageDialog(null,throwables, "Error",JOptionPane.ERROR_MESSAGE);

                }
                setVisible(false);
            }
        });
    }
    private void btnVendorEvent(){
        btnVendor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new VendorTable();
                } catch (SQLException | ClassNotFoundException throwables) {
                    JOptionPane.showMessageDialog(null,throwables, "Error",JOptionPane.ERROR_MESSAGE);

                }
                setVisible(false);

            }
        });
    }
    private void btnVisitorEvent(){
        btnVisitor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new VisitorTable();
                } catch (SQLException | ClassNotFoundException throwables) {
                    JOptionPane.showMessageDialog(null,throwables, "Error",JOptionPane.ERROR_MESSAGE);

                }
                setVisible(false);
            }
        });
    }
    private void btnLogisticsEvent(){
        btnLogistics.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new LogisticsTable();
                } catch (SQLException | ClassNotFoundException throwables) {
                    JOptionPane.showMessageDialog(null,throwables, "Error",JOptionPane.ERROR_MESSAGE);

                }
                setVisible(false);
            }
        });
    }
    private void btnFoodDeliEvent(){
        btnFoodDeli.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new FoodDeliveryTable();
                } catch (SQLException | ClassNotFoundException throwables) {
                    JOptionPane.showMessageDialog(null,throwables, "Error",JOptionPane.ERROR_MESSAGE);
                }
                setVisible(false);
            }
        });
    }

}
