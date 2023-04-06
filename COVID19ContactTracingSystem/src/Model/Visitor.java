package Model;

import java.sql.Timestamp;

public class Visitor {
    private int intVisitorID;
    private String strFirstName;
    private String strLastName;
    private int intAge;
    private double dblTemp;
    private String strPhoneNo;
    private String strEmail;
    private String strGender;
    private String strAddress;
    private String strReason;
    private Timestamp timeIn;

    public Visitor() {
    }

    public Visitor(int intVisitorID, String strFirstName, String strLastName,
                   int intAge, double dblTemp, String strPhoneNo, String strEmail,
                   String strGender, String strAddress, String strReason, Timestamp timeIn) {
        this.intVisitorID = intVisitorID;
        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
        this.intAge = intAge;
        this.dblTemp = dblTemp;
        this.strPhoneNo = strPhoneNo;
        this.strEmail = strEmail;
        this.strGender = strGender;
        this.strAddress = strAddress;
        this.strReason = strReason;
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

    public String getStrReason() {
        return strReason;
    }

    public void setStrReason(String strReason) {
        this.strReason = strReason;
    }

    public Timestamp getTimeIn() {
        return timeIn;
    }

    public void setTimeIn(Timestamp timeIn) {
        this.timeIn = timeIn;
    }

    public int getIntVisitorID() {
        return intVisitorID;
    }

    public void setIntVisitorID(int intVisitorID) {
        this.intVisitorID = intVisitorID;
    }
}
