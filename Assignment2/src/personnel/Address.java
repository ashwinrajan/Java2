/*
 Name: Ashwin Rajan
 Program: Computer Engineering
 Course: PROG 24178 Winter 2012
 File: Address.java
 Main class: CollegeList.java
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package personnel;

/**
 *
 * @author Ashwin Rajan
 */
public class Address {

    private String streetNum = new String();
    private String streetName = new String();
    private String cityName = new String();
    private String provinceName = new String();
    private String postalCode = new String();
    private final String COUNTRY = "Canada";

    public Address() {

        streetNum = "";
        streetName = "";
        cityName = "";
        provinceName = "";
        postalCode = "";


    }

    public Address(String streetNum, String streetName, String cityName, String provinceName, String postalCode) {

        this.streetNum = streetNum;
        this.streetName = streetName;
        this.cityName = cityName;
        this.provinceName = provinceName;
        this.postalCode = postalCode;


    }

    public String getStreetNum() {

        return streetNum;
    }

    public String getStreetName() {

        return streetName;
    }

    public String getCityName() {

        return cityName;
    }

    public String getProvinceName() {

        return provinceName;
    }

    public String getPostalCode() {

        return postalCode;
    }

    public String getCountry() {

        return COUNTRY;
    }

    public void setStreetNum(String streetNum) {

        this.streetNum = streetNum;
    }

    public void setStreetName(String streetName) {

        this.streetName = streetName;
    }

    public void setCityName(String cityName) {

        this.cityName = cityName;
    }

    public void setProvinceName(String provinceName) {

        this.provinceName = provinceName;
    }

    public void setPostalCode(String postalCode) {

        this.postalCode = postalCode;
    }
}
