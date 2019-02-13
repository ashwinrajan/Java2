/*
    Name: Ashwin Rajan
    Program: Computer Engineering
    Course: PROG 24178 Winter 2012
*/


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bank;

/**
 *
 * @author Ashwin Rajan
 */
public class Address {
    
    private String streetNum=new String();
    private String streetName = new String();
    private String cityName = new String();
    private String provinceName = new String();
    private String postalCode = new String();
    private String country = new String();
    
    public Address(){
        
        streetNum="";
        streetName="";
        cityName="";
        provinceName="";
        postalCode="";
        country="";
        
    } 
    
    public Address(String streetNum, String streetName, String cityName, String provinceName, String postalCode, String country){
        
        this.streetNum=streetNum;
        this.streetName=streetName;
        this.cityName=cityName;
        this.provinceName=provinceName;
        this.postalCode=postalCode;
        this.country=country;
        
    }
    
    
    public String getStreetNum(){
        
        return streetNum;
    }
    
    public String getStreetName(){
        
        return streetName;
    }
    
    public String getCityName(){
        
        return cityName;
    }
    
    public String getProvinceName(){
        
        return provinceName;
    }
    
    public String getPostalCode(){
        
        return postalCode;
    }
    
    public String getCountry(){
        
        return country;
    }
    
    public void setStreetNum(String streetNum){
        
        this.streetNum=streetNum;
    }
    
    public void setStreetName(String streetName){
        
        this.streetName=streetName;
    }
    
    public void setCityName(String cityName){
        
        this.cityName=cityName;
    }
    
    public void setProvinceName(String provinceName){
        
        this.provinceName=provinceName;
    }
    
    public void setPostalCode(String postalCode){
        
        this.postalCode=postalCode;
    }
    
    public void setCountry(String country){
        
        this.country=country;
    }

}
