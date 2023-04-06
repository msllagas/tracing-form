package Model;

import java.sql.Timestamp;

public class Professor {
    private int intProfId;
    private String strFirstName;
    private String strLastName;
    private String strProfNo;
    private String strDepartment;
    private int intAge;
    private double dblTemp;
    private String strPhoneNo;
    private String strEmail;
    private String strGender;
    private String strAddress;
    private Timestamp timeIn;

    public Professor() {
    }

    public Professor(int intProfId, String strFirstName, String strLastName, String strProfNo,
                     String strDepartment, int intAge, double dblTemp,
                     String strPhoneNo, String strEmail, String strGender,
                     String strAddress, Timestamp timeIn) {
        this.setIntProfId(intProfId);
        this.setStrFirstName(strFirstName);
        this.setStrLastName(strLastName);
        this.setStrProfNo(strProfNo);
        this.setStrDepartment(strDepartment);
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

    public String getStrProfNo() {
        return strProfNo;
    }

    public void setStrProfNo(String strProfNo) {
        this.strProfNo = strProfNo;
    }

    public String getStrDepartment() {
        return strDepartment;
    }

    public void setStrDepartment(String strDepartment) {
        this.strDepartment = strDepartment;
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

    public int getIntProfId() {
        return intProfId;
    }

    public void setIntProfId(int intProfId) {
        this.intProfId = intProfId;
    }
}
