package Objects;

/**
 * Created by Sebastian on 05.05.14.
 */
public class Customer {

    private int iCustomerID;
    private String sName;
    private String sLastname;
    private String sEmail;
    private String sPhone;
    private int iAdressID;
    private String sStreet;
    private int iNumber;
    private int iZipCode;
    private String sPlace;


    public void Customer(){

    }

    public int getiCustomerID() {
        return iCustomerID;
    }

    public void setiCustomerID(int iCustomerID) {
        this.iCustomerID = iCustomerID;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsLastname() {
        return sLastname;
    }

    public void setsLastname(String sLastname) {
        this.sLastname = sLastname;
    }

    public String getsEmail() {
        return sEmail;
    }

    public void setsEmail(String sEmail) {
        this.sEmail = sEmail;
    }

    public String getsPhone() {
        return sPhone;
    }

    public void setsPhone(String sPhone) {
        this.sPhone = sPhone;
    }

    public int getiAdressID() {
        return iAdressID;
    }

    public void setiAdressID(int iAdressID) {
        this.iAdressID = iAdressID;
    }

    public String getsStreet() {
        return sStreet;
    }

    public void setsStreet(String sStreet) {
        this.sStreet = sStreet;
    }

    public int getiNumber() {
        return iNumber;
    }

    public void setiNumber(int iNumber) {
        this.iNumber = iNumber;
    }

    public int getiZipCode() {
        return iZipCode;
    }

    public void setiZipCode(int iZipCode) {
        this.iZipCode = iZipCode;
    }

    public String getsPlace() {
        return sPlace;
    }

    public void setsPlace(String sPlace) {
        this.sPlace = sPlace;
    }
}
