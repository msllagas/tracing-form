package Tables;
import Databases.DBHandler;

import Form.SeeTable;
import Model.FoodDelivery;
import Model.ImageModel;

import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.JTableHeader;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.Color;
import java.awt.Font;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;

public class FoodDeliveryTable {
    private final JFrame jFrame;
    private final JTable jTable;
    private JLabel lblArrow;
    private DBHandler objDBHandler;
    private ImageModel imgLogo;
    private static JButton btnDelete;
    FoodDelivery objFoodDelivery;
    protected static DefaultTableModel model;
    public FoodDeliveryTable() throws SQLException, ClassNotFoundException {
        objDBHandler = new DBHandler();
        imgLogo = new ImageModel();
        jFrame = new JFrame("Food Delivery Table");
        lblArrow = new JLabel(imgLogo.getArrow());
        lblArrow.setBounds(15,20,50,20);
        btnDelete = new JButton("Delete");
        btnDelete.setBounds(18,133,140,50);

        jTable = new JTable(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
            @Override
            public Component prepareRenderer(TableCellRenderer renderer, int row, int column) {
                Component objComponent =  super.prepareRenderer(renderer, row, column);
                if (row % 2 == 0){
                    objComponent.setBackground(Color.WHITE);
                }
                else
                    objComponent.setBackground(new Color(224,224,224));

                if (isCellSelected(row, column))
                    objComponent.setBackground(new Color(51,153,255));
                return objComponent;
            }
        };
        Object[] arrColumn = {"ID", "First name", "Last name","Plate No.",
                "Company","Age" ,"Temperature", "Phone Number",
                "Email","Gender","Address", "Time in"};
        model = new DefaultTableModel();
        model.setColumnIdentifiers(arrColumn);

        JTableHeader objTableHeader = jTable.getTableHeader();
        objTableHeader.setFont(new Font("",Font.BOLD,15));
        objTableHeader.setBackground(new Color(212,212,212));
        jTable.setModel(model);

        Font objFont = new Font("Platino", Font.PLAIN,15);
        jTable.setFont(objFont);
        jTable.setRowHeight(25);
        jTable.getTableHeader().setReorderingAllowed(false);

        JScrollPane objPane = new JScrollPane(jTable);
        objPane.setBounds(179, 0, 821, 600);
        jFrame.add(objPane);
        Object[] objRow = new Object[12];
        ResultSet objResultset = objDBHandler.foodDeliveryRead();
        ArrayList<FoodDelivery> arrFoodDelivery = new ArrayList<>();
        while (objResultset.next()){
            objFoodDelivery =   new FoodDelivery(objResultset.getInt("idfooddelivery"), objResultset.getString("firstname"),
                    objResultset.getString("lastname"), objResultset.getString("plateno"), objResultset.getString("company"),
                    objResultset.getInt("age"),objResultset.getDouble("temperature"),objResultset.getString("phonenumber"),
                    objResultset.getString("email"),objResultset.getString("gender"), objResultset.getString("address"),
                    objResultset.getTimestamp("timein"));
            arrFoodDelivery.add(objFoodDelivery);
        }
        objResultset.close();
        for (FoodDelivery objValue : arrFoodDelivery) {
            objRow[0] = objValue.getIntDeliID();
            objRow[1] = objValue.getStrFirstName();
            objRow[2] = objValue.getStrLastName();
            objRow[3] = objValue.getStrPlateNo();
            objRow[4] = objValue.getStrCompany();
            objRow[5] = objValue.getIntAge();
            objRow[6] = objValue.getDblTemp();
            objRow[7] = objValue.getStrPhoneNo();
            objRow[8] = objValue.getStrEmail();
            objRow[9] = objValue.getStrGender();
            objRow[10] = objValue.getStrAddress();
            objRow[11] = objValue.getTimeIn();
            model.addRow(objRow);
        }
        jTable.addMouseListener(new MouseAdapter() {

            @Override
            public void mousePressed(MouseEvent e){
                btnDelete.setBackground(new Color(252, 3, 23));
                btnDelete.setForeground(Color.WHITE);
                btnDelete.addActionListener(e1 -> {
                    int i = jTable.getSelectedRow();
                    if (i>=0) {
                        try {
                            int j = (int) model.getValueAt(i, 0);
                            model.removeRow(i);
                            objDBHandler.foodDeliveryDelete(j);
                        } catch (SQLException | ClassNotFoundException throwables) {
                            JOptionPane.showMessageDialog(null,throwables, "Error",JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    btnDelete.setBackground(null);
                    btnDelete.setForeground(Color.black);
                });
            }
        });
        jFrame.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                jTable.clearSelection();
                btnDelete.setBackground(null);
                btnDelete.setForeground(Color.black);
            }
        });
        lblArrow.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new SeeTable();
                jFrame.setVisible(false);
            }
        });
        jTable.getColumnModel().getColumn(1).setPreferredWidth(125);
        jTable.getColumnModel().getColumn(2).setPreferredWidth(125);
        jTable.getColumnModel().getColumn(3).setPreferredWidth(140);
        jTable.getColumnModel().getColumn(4).setPreferredWidth(135);
        jTable.getColumnModel().getColumn(5).setPreferredWidth(100);
        jTable.getColumnModel().getColumn(6).setPreferredWidth(125);
        jTable.getColumnModel().getColumn(7).setPreferredWidth(150);
        jTable.getColumnModel().getColumn(8).setPreferredWidth(150);
        jTable.getColumnModel().getColumn(9).setPreferredWidth(125);
        jTable.getColumnModel().getColumn(10).setPreferredWidth(365);
        jTable.getColumnModel().getColumn(11).setPreferredWidth(200);
        DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer();
        cellRenderer.setHorizontalAlignment(JLabel.CENTER);
        jTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        for (int i = 0; i < objRow.length; i++) {
            jTable.getColumnModel().getColumn(i).setCellRenderer(cellRenderer);
        }
        jTable.setDefaultRenderer(String.class, cellRenderer);
        jFrame.add(lblArrow);
        jFrame.add(btnDelete);
        jFrame.setLayout(null);
        jFrame.setIconImage(imgLogo.getLogo());
        jFrame.setSize(1015,640);
        jFrame.setResizable(false);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
