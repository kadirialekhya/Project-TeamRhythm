/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Enterprise.EnterpriseDirectory;
import Business.UserAccount.UserAccountDirectory;

/**
 * @author Alekhya
 * @author Apeksha
 * @author Shalini
 */

public class Network {
    private String name;
    private String city;
    private String state;
    private String country;
    private UserAccountDirectory userAccountDirectory;
    private EnterpriseDirectory enterpriseDirectory;

    public String getCity() {
        return city;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public void setEnterpriseDirectory(EnterpriseDirectory enterpriseDirectory) {
        this.enterpriseDirectory = enterpriseDirectory;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
     public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    
    public Network(){
        userAccountDirectory=new UserAccountDirectory();
        enterpriseDirectory = new EnterpriseDirectory();
    }

    public Network(String name, String city, String state, String country, UserAccountDirectory uad, EnterpriseDirectory ed) {
        this.name = name;
        this.city = city;
        this.state = state;
        this.country = country;
        this.userAccountDirectory=uad;
        this.enterpriseDirectory = ed;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }
    
    @Override
    public String toString(){
        return name;
    }
    
}
