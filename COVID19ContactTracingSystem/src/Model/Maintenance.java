package Model;

import java.sql.Timestamp;

public class Maintenance {
    private int intMainID;
    private String strFirstName;
    private String strLastName;
    private String strIDNo;
    private String strWork;
    private int intAge;
    private double dblTemp;
    private String strPhoneNo;
    private String strEmail;
    private String strGender;
    private String strAddress;
    private Timestamp timeIn;

    public Maintenance() {
    }

    public Maintenance(int intMainID, String strFirstName, String strLastName,
                       String strIDNo, String strWork, int intAge, double dblTemp,
                       String strPhoneNo, String strEmail, String strGender, String strAddress,
                       Timestamp timeIn) {
        this.intMainID = intMainID;
        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
        this.strIDNo = strIDNo;
        this.strWork = strWork;
        this.intAge = intAge;
        this.dblTemp = dblTemp;
        this.strPhoneNo = strPhoneNo;
        this.strEmail = strEmail;
        this.strGender = strGender;
        this.strAddress = strAddress;
        this.timeIn = timeIn;
    }

    public String getStrFirstName() {
        return strFirstName;
    }

    public void setStrFirstName(String strFirstName) {
        this.strFirstName = strFirstName;
    }

    public String getStrLastName() {
        return strLastName;
    }

    public void setStrLastName(String strLastName) {
        this.strLastName = strLastName;
    }

    public String getStrIDNo() {
        return strIDNo;
    }

    public void setStrIDNo(String strIDNo) {
        this.strIDNo = strIDNo;
    }

    public String getStrWork() {
        return strWork;
    }

    public void setStrWork(String strWork) {
        this.strWork = strWork;
    }

    public int getIntAge() {
        return intAge;
    }

    public void setIntAge(int intAge) {
        this.intAge = intAge;
    }

    public double getDblTemp() {
        return dblTemp;
    }

    public void setDblTemp(double dblTemp) {
        this.dblTemp = dblTemp;
    }

    public String getStrPhoneNo() {
        return strPhoneNo;
    }

    public void setStrPhoneNo(String strPhoneNo) {
        this.strPhoneNo = strPhoneNo;
    }

    public String getStrEmail() {
        return strEmail;
    }

    public void setStrEmail(String strEmail) {
        this.strEmail = strEmail;
    }

    public String getStrGender() {
        return strGender;
    }

    public void setStrGender(String strGender) {
        this.strGender = strGender;
    }

    public String getStrAddress() {
        return strAddress;
    }

    public void setStrAddress(String strAddress) {
        this.strAddress = strAddress;
    }

    public Timestamp getTimeIn() {
        return timeIn;
    }

    public void setTimeIn(Timestamp timeIn) {
        this.timeIn = timeIn;
    }

    public int getIntMainID() {
        return intMainID;
    }

    public void setIntMainID(int intMainID) {
        this.intMainID = intMainID;
    }
}
