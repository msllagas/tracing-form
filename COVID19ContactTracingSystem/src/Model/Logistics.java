package Model;

import java.sql.Timestamp;

public class Logistics {
    private int intLogisticsID;
    private String strFirstName;
    private String strLastName;
    private String strPlateNo;
    private String strCompany;
    private int intAge;
    private double dblTemp;
    private String strPhoneNo;
    private String strEmail;
    private String strGender;
    private String strAddress;
    private Timestamp timeIn;

    public Logistics() {
    }

    public Logistics(int intLogisticsID, String strFirstName, String strLastName,
                     String strPlateNo, String strCompany, int intAge, double dblTemp,
                     String strPhoneNo, String strEmail, String strGender, String strAddress,
                     Timestamp timeIn) {
        this.setIntLogisticsID(intLogisticsID);
        this.setStrFirstName(strFirstName);
        this.setStrLastName(strLastName);
        this.setStrPlateNo(strPlateNo);
        this.setStrCompany(strCompany);
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

    public String getStrPlateNo() {
        return strPlateNo;
    }

    public void setStrPlateNo(String strPlateNo) {
        this.strPlateNo = strPlateNo;
    }

    public String getStrCompany() {
        return strCompany;
    }

    public void setStrCompany(String strCompany) {
        this.strCompany = strCompany;
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

    public int getIntLogisticsID() {
        return intLogisticsID;
    }

    public void setIntLogisticsID(int intLogisticsID) {
        this.intLogisticsID = intLogisticsID;
    }
}
