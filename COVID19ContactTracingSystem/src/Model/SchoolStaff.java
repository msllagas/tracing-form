package Model;

import java.sql.Timestamp;

public class SchoolStaff {
    private int intStaffID;
    private String strFirstName;
    private String strLastName;
    private String strWorkNo;
    private String strWork;
    private int intAge;
    private double dblTemp;
    private String strPhoneNo;
    private String strEmail;
    private String strGender;
    private String strAddress;
    private Timestamp timeIn;

    public SchoolStaff() {
    }

    public SchoolStaff(int intStaffID, String strFirstName, String strLastName,
                       String strWorkNo, String strWork, int intAge, double dblTemp,
                       String strPhoneNo, String strEmail, String strGender, String strAddress,
                       Timestamp timeIn) {
        this.setIntStaffID(intStaffID);
        this.setStrFirstName(strFirstName);
        this.setStrLastName(strLastName);
        this.setStrWorkNo(strWorkNo);
        this.setStrWork(strWork);
        this.setIntAge(intAge);
        this.setDblTemp(dblTemp);
        this.setStrPhoneNo(strPhoneNo);
        this.setStrEmail(strEmail);
        this.setStrGender(strGender);
        this.setStrAddress(strAddress);
        this.setTimeIn(timeIn);
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

    public String getStrWorkNo() {
        return strWorkNo;
    }

    public void setStrWorkNo(String strWorkNo) {
        this.strWorkNo = strWorkNo;
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

    public int getIntStaffID() {
        return intStaffID;
    }

    public void setIntStaffID(int intStaffID) {
        this.intStaffID = intStaffID;
    }
}
