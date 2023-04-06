package Model;

import java.sql.Timestamp;

public class Vendor {
    private int intVendorID;
    private String strFirstName;
    private String strLastName;
    private String strStallNo;
    private String strStallName;
    private int intAge;
    private double dblTemp;
    private String strPhoneNo;
    private String strEmail;
    private String strGender;
    private String strAddress;
    private Timestamp timeIn;

    public Vendor() {
    }

    public Vendor(int intVendorID, String strFirstName, String strLastName,
                  String strStallNo, String strStallName, int intAge, double dblTemp,
                  String strPhoneNo, String strEmail, String strGender, String strAddress,
                  Timestamp timeIn) {
        this.setIntVendorID(intVendorID);
        this.setStrFirstName(strFirstName);
        this.setStrLastName(strLastName);
        this.setStrStallNo(strStallNo);
        this.setStrStallName(strStallName);
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

    public String getStrStallNo() {
        return strStallNo;
    }

    public void setStrStallNo(String strStallNo) {
        this.strStallNo = strStallNo;
    }

    public String getStrStallName() {
        return strStallName;
    }

    public void setStrStallName(String strStallName) {
        this.strStallName = strStallName;
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

    public int getIntVendorID() {
        return intVendorID;
    }

    public void setIntVendorID(int intVendorID) {
        this.intVendorID = intVendorID;
    }
}
