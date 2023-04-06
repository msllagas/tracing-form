package Databases;

import Model.Student;
import Model.Professor;
import Model.SchoolStaff;
import Model.Maintenance;
import Model.Vendor;
import Model.Visitor;
import Model.Logistics;
import Model.FoodDelivery;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.DriverManager;

public class DBHandler extends Config {
    Connection objDBCon;

    public Connection getDBConnection() throws ClassNotFoundException, SQLException {
        String strConnectionString = "jdbc:mysql://" + strDBHost + ":" + strDBPort + "/" + strDBName + "?serverTimezone=EST";
        Class.forName("com.mysql.cj.jdbc.Driver");
        objDBCon = DriverManager.getConnection(strConnectionString, strDBUser, strDBPass);
        return objDBCon;
    }
    public void studentWrite(Student student) throws SQLException, ClassNotFoundException {
        String strQry ="INSERT INTO student (firstname,lastname,studentno,course," +
                                                "age,temperature,phonenumber,email," +
                                                "gender,address,timein)" +
                                                "VAlUES(?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement objPreparedStatement = getDBConnection().prepareStatement(strQry);
        objPreparedStatement.setString(1, student.getStrFirstName());
        objPreparedStatement.setString(2,student.getStrLastName());
        objPreparedStatement.setString(3,student.getStrStudNo());
        objPreparedStatement.setString(4,student.getStrCourse());
        objPreparedStatement.setInt(5,student.getIntAge());
        objPreparedStatement.setDouble(6,student.getDblTemp());
        objPreparedStatement.setString(7,student.getStrPhoneNo());
        objPreparedStatement.setString(8,student.getStrEmail());
        objPreparedStatement.setString(9,student.getStrGender());
        objPreparedStatement.setString(10,student.getStrAddress());
        objPreparedStatement.setTimestamp(11,student.getTimeIn());

        objPreparedStatement.executeUpdate();
        objPreparedStatement.close();

    }
    public ResultSet studentRead()throws SQLException, ClassNotFoundException {
        String strQry = "SELECT * FROM student";
        PreparedStatement objPreparedStatement = getDBConnection().prepareStatement(strQry);
        return objPreparedStatement.executeQuery();
    }
    public  void studentDelete(int intIDStudent) throws SQLException, ClassNotFoundException {
        String strQry = "DELETE from student where idstudent = ?";

        PreparedStatement objPreparedStatement = getDBConnection().prepareStatement(strQry);
        objPreparedStatement.setInt(1,intIDStudent);
        objPreparedStatement.executeUpdate();
        objPreparedStatement.close();
    }
    public void profWrite(Professor objProfessor) throws SQLException, ClassNotFoundException {
        String strQry = "INSERT INTO prof (firstname,lastname,profno,dept," +
                                            "age,temperature,phonenumber,email," +
                                            "gender,address,timein)" + "VALUES(?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement objPreparedStatement = getDBConnection().prepareStatement(strQry);
        objPreparedStatement.setString(1, objProfessor.getStrFirstName());
        objPreparedStatement.setString(2, objProfessor.getStrLastName());
        objPreparedStatement.setString(3, objProfessor.getStrProfNo());
        objPreparedStatement.setString(4, objProfessor.getStrDepartment());
        objPreparedStatement.setInt(5, objProfessor.getIntAge());
        objPreparedStatement.setDouble(6, objProfessor.getDblTemp());
        objPreparedStatement.setString(7, objProfessor.getStrPhoneNo());
        objPreparedStatement.setString(8, objProfessor.getStrEmail());
        objPreparedStatement.setString(9, objProfessor.getStrGender());
        objPreparedStatement.setString(10, objProfessor.getStrAddress());
        objPreparedStatement.setTimestamp(11, objProfessor.getTimeIn());

        objPreparedStatement.executeUpdate();
        objPreparedStatement.close();
    }
    public ResultSet profRead()throws SQLException, ClassNotFoundException {
        String strQry = "SELECT * FROM prof";
        PreparedStatement objPreparedStatement = getDBConnection().prepareStatement(strQry);
        return objPreparedStatement.executeQuery();
    }
    public  void profDelete(int intIDProf) throws SQLException, ClassNotFoundException {
        String strQry = "DELETE from prof where idprof = ?";

        PreparedStatement objPreparedStatement = getDBConnection().prepareStatement(strQry);
        objPreparedStatement.setInt(1,intIDProf);
        objPreparedStatement.executeUpdate();
        objPreparedStatement.close();
    }
    public void schoolStaffWrite(SchoolStaff objSchoolStaff) throws SQLException, ClassNotFoundException {
        String strQry ="INSERT INTO schoolstaff (firstname,lastname,workno,work," +
                "age,temperature,phonenumber,email," +
                "gender,address,timein)" +
                "VAlUES(?,?,?,?,?,?,?,?,?,?,?)";

        PreparedStatement objPreparedStatement = getDBConnection().prepareStatement(strQry);
        objPreparedStatement.setString(1, objSchoolStaff.getStrFirstName());
        objPreparedStatement.setString(2, objSchoolStaff.getStrLastName());
        objPreparedStatement.setString(3, objSchoolStaff.getStrWorkNo());
        objPreparedStatement.setString(4, objSchoolStaff.getStrWork());
        objPreparedStatement.setInt(5, objSchoolStaff.getIntAge());
        objPreparedStatement.setDouble(6, objSchoolStaff.getDblTemp());
        objPreparedStatement.setString(7, objSchoolStaff.getStrPhoneNo());
        objPreparedStatement.setString(8, objSchoolStaff.getStrEmail());
        objPreparedStatement.setString(9, objSchoolStaff.getStrGender());
        objPreparedStatement.setString(10, objSchoolStaff.getStrAddress());
        objPreparedStatement.setTimestamp(11, objSchoolStaff.getTimeIn());

        objPreparedStatement.executeUpdate();
        objPreparedStatement.close();
    }
    public ResultSet schoolStaffRead() throws SQLException, ClassNotFoundException {
        String strQry = "SELECT * FROM schoolstaff";
        PreparedStatement objPreparedStatement = getDBConnection().prepareStatement(strQry);
        return objPreparedStatement.executeQuery();
    }
    public  void schoolStaffDelete(int intIDStaff) throws SQLException, ClassNotFoundException {
        String strQry = "DELETE from schoolstaff where idschoolstaff = ?";

        PreparedStatement objPreparedStatement = getDBConnection().prepareStatement(strQry);
        objPreparedStatement.setInt(1,intIDStaff);
        objPreparedStatement.executeUpdate();
        objPreparedStatement.close();
    }
    public void maintenanceWrite(Maintenance objMaintenance) throws SQLException, ClassNotFoundException {
        String strQry ="INSERT INTO maintenance (firstname,lastname,idno,work," +
                "age,temperature,phonenumber,email," +
                "gender,address,timein)" +
                "VAlUES(?,?,?,?,?,?,?,?,?,?,?)";

        PreparedStatement objPreparedStatement = getDBConnection().prepareStatement(strQry);
        objPreparedStatement.setString(1, objMaintenance.getStrFirstName());
        objPreparedStatement.setString(2, objMaintenance.getStrLastName());
        objPreparedStatement.setString(3, objMaintenance.getStrIDNo());
        objPreparedStatement.setString(4, objMaintenance.getStrWork());
        objPreparedStatement.setInt(5, objMaintenance.getIntAge());
        objPreparedStatement.setDouble(6, objMaintenance.getDblTemp());
        objPreparedStatement.setString(7, objMaintenance.getStrPhoneNo());
        objPreparedStatement.setString(8, objMaintenance.getStrEmail());
        objPreparedStatement.setString(9, objMaintenance.getStrGender());
        objPreparedStatement.setString(10, objMaintenance.getStrAddress());
        objPreparedStatement.setTimestamp(11, objMaintenance.getTimeIn());

        objPreparedStatement.executeUpdate();
        objPreparedStatement.close();
    }
    public ResultSet maintenanceRead() throws SQLException, ClassNotFoundException {
        String strQry = "SELECT * FROM maintenance";
        PreparedStatement objPreparedStatement = getDBConnection().prepareStatement(strQry);
        return objPreparedStatement.executeQuery();
    }
    public void maintenanceDelete(int intIDMaintenance)throws SQLException, ClassNotFoundException {
        String strQry = "DELETE from maintenance where idmaintenance = ?";

        PreparedStatement objPreparedStatement = getDBConnection().prepareStatement(strQry);
        objPreparedStatement.setInt(1,intIDMaintenance );
        objPreparedStatement.executeUpdate();
        objPreparedStatement.close();
    }
    public void vendorWrite(Vendor objVendor) throws SQLException, ClassNotFoundException {
        String strQry ="INSERT INTO vendor (firstname,lastname,stallno,stallname," +
                "age,temperature,phonenumber,email," +
                "gender,address,timein)" +
                "VAlUES(?,?,?,?,?,?,?,?,?,?,?)";


        PreparedStatement objPreparedStatement = getDBConnection().prepareStatement(strQry);
        objPreparedStatement.setString(1, objVendor.getStrFirstName());
        objPreparedStatement.setString(2, objVendor.getStrLastName());
        objPreparedStatement.setString(3, objVendor.getStrStallNo());
        objPreparedStatement.setString(4, objVendor.getStrStallName());
        objPreparedStatement.setInt(5, objVendor.getIntAge());
        objPreparedStatement.setDouble(6, objVendor.getDblTemp());
        objPreparedStatement.setString(7, objVendor.getStrPhoneNo());
        objPreparedStatement.setString(8, objVendor.getStrEmail());
        objPreparedStatement.setString(9, objVendor.getStrGender());
        objPreparedStatement.setString(10, objVendor.getStrAddress());
        objPreparedStatement.setTimestamp(11, objVendor.getTimeIn());

        objPreparedStatement.executeUpdate();
        objPreparedStatement.close();
    }
    public ResultSet vendorRead() throws SQLException, ClassNotFoundException {
        String strQry = "SELECT * FROM vendor";
        PreparedStatement objPreparedStatement = getDBConnection().prepareStatement(strQry);
        return objPreparedStatement.executeQuery();
    }
    public void vendorDelete(int intIDVendor)throws SQLException, ClassNotFoundException {
        String strQry = "DELETE from vendor where idvendor = ?";

        PreparedStatement objPreparedStatement = getDBConnection().prepareStatement(strQry);
        objPreparedStatement.setInt(1,intIDVendor );
        objPreparedStatement.executeUpdate();
        objPreparedStatement.close();
    }
    public void visitorWrite(Visitor objVisitor) throws SQLException, ClassNotFoundException{
        String strQry ="INSERT INTO visitor (firstname,lastname,age,temperature," +
                            "phonenumber,email,gender,address,reason,timein)" +
                            "VAlUES(?,?,?,?,?,?,?,?,?,?)";


        PreparedStatement objPreparedStatement = getDBConnection().prepareStatement(strQry);
        objPreparedStatement.setString(1, objVisitor.getStrFirstName());
        objPreparedStatement.setString(2, objVisitor.getStrLastName());
        objPreparedStatement.setInt(3, objVisitor.getIntAge());
        objPreparedStatement.setDouble(4, objVisitor.getDblTemp());
        objPreparedStatement.setString(5, objVisitor.getStrPhoneNo());
        objPreparedStatement.setString(6, objVisitor.getStrEmail());
        objPreparedStatement.setString(7, objVisitor.getStrGender());
        objPreparedStatement.setString(8, objVisitor.getStrAddress());
        objPreparedStatement.setString(9, objVisitor.getStrReason());
        objPreparedStatement.setTimestamp(10,objVisitor.getTimeIn());

        objPreparedStatement.executeUpdate();
        objPreparedStatement.close();

    }
    public ResultSet visitorRead() throws SQLException, ClassNotFoundException {
        String strQry = "SELECT * FROM visitor";
        PreparedStatement objPreparedStatement = getDBConnection().prepareStatement(strQry);
        return objPreparedStatement.executeQuery();
    }
    public void visitorDelete(int intIDVisitor)throws SQLException, ClassNotFoundException {
        String strQry = "DELETE from visitor where idvisitor = ?";

        PreparedStatement objPreparedStatement = getDBConnection().prepareStatement(strQry);
        objPreparedStatement.setInt(1,intIDVisitor );
        objPreparedStatement.executeUpdate();
        objPreparedStatement.close();
    }
    public void logisticsWrite(Logistics objLogistics) throws SQLException, ClassNotFoundException{
        String strQry ="INSERT INTO logistics (firstname,lastname,plateno,company," +
                "age,temperature,phonenumber,email," +
                "gender,address,timein)" +
                "VAlUES(?,?,?,?,?,?,?,?,?,?,?)";

        PreparedStatement objPreparedStatement = getDBConnection().prepareStatement(strQry);
        objPreparedStatement.setString(1, objLogistics.getStrFirstName());
        objPreparedStatement.setString(2, objLogistics.getStrLastName());
        objPreparedStatement.setString(3, objLogistics.getStrPlateNo());
        objPreparedStatement.setString(4, objLogistics.getStrCompany());
        objPreparedStatement.setInt(5, objLogistics.getIntAge());
        objPreparedStatement.setDouble(6, objLogistics.getDblTemp());
        objPreparedStatement.setString(7, objLogistics.getStrPhoneNo());
        objPreparedStatement.setString(8, objLogistics.getStrEmail());
        objPreparedStatement.setString(9, objLogistics.getStrGender());
        objPreparedStatement.setString(10, objLogistics.getStrAddress());
        objPreparedStatement.setTimestamp(11, objLogistics.getTimeIn());

        objPreparedStatement.executeUpdate();
        objPreparedStatement.close();
    }
    public ResultSet logisticsRead() throws SQLException, ClassNotFoundException {
        String strQry = "SELECT * FROM logistics";
        PreparedStatement objPreparedStatement = getDBConnection().prepareStatement(strQry);
        return objPreparedStatement.executeQuery();
    }
    public void logisticsDelete(int intIDLogistics)throws SQLException, ClassNotFoundException {
        String strQry = "DELETE from logistics where idlogistics = ?";

        PreparedStatement objPreparedStatement = getDBConnection().prepareStatement(strQry);
        objPreparedStatement.setInt(1,intIDLogistics );
        objPreparedStatement.executeUpdate();
        objPreparedStatement.close();
    }
    public void foodDeliveryWrite(FoodDelivery objFoodDelivery) throws SQLException, ClassNotFoundException{
        String strQry ="INSERT INTO fooddelivery (firstname,lastname,plateno,company," +
                "age,temperature,phonenumber,email," +
                "gender,address,timein)" +
                "VAlUES(?,?,?,?,?,?,?,?,?,?,?)";

        PreparedStatement objPreparedStatement = getDBConnection().prepareStatement(strQry);
        objPreparedStatement.setString(1, objFoodDelivery.getStrFirstName());
        objPreparedStatement.setString(2, objFoodDelivery.getStrLastName());
        objPreparedStatement.setString(3, objFoodDelivery.getStrPlateNo());
        objPreparedStatement.setString(4, objFoodDelivery.getStrCompany());
        objPreparedStatement.setInt(5, objFoodDelivery.getIntAge());
        objPreparedStatement.setDouble(6, objFoodDelivery.getDblTemp());
        objPreparedStatement.setString(7, objFoodDelivery.getStrPhoneNo());
        objPreparedStatement.setString(8, objFoodDelivery.getStrEmail());
        objPreparedStatement.setString(9, objFoodDelivery.getStrGender());
        objPreparedStatement.setString(10, objFoodDelivery.getStrAddress());
        objPreparedStatement.setTimestamp(11, objFoodDelivery.getTimeIn());

        objPreparedStatement.executeUpdate();
        objPreparedStatement.close();
    }
    public ResultSet foodDeliveryRead()throws SQLException, ClassNotFoundException {
        String strQry = "SELECT * FROM fooddelivery";
        PreparedStatement objPreparedStatement = getDBConnection().prepareStatement(strQry);
        return objPreparedStatement.executeQuery();
    }
    public void foodDeliveryDelete(int intIDDelivery)throws SQLException, ClassNotFoundException {
        String strQry = "DELETE from fooddelivery where idfooddelivery = ?";

        PreparedStatement objPreparedStatement = getDBConnection().prepareStatement(strQry);
        objPreparedStatement.setInt(1,intIDDelivery );
        objPreparedStatement.executeUpdate();
        objPreparedStatement.close();
    }

}
