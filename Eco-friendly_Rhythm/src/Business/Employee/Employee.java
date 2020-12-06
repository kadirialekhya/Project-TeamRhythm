/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.Role.Role;
import Business.WorkQueue.CordinatorWorkRequest;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;

/**
 * @author Alekhya
 * @author Apeksha
 * @author Shalini
 */

public class Employee {
    
    private String name;
    private int id;
    private static int count = 1;
    private String emailId;
    private String password;
    private String userName;
    private String contactNumber;
    private Date dateOfBirth ;
    private String gender ;
    private String zip ;
    private Role role;
    private File profilePicture;
    private ArrayList<CordinatorWorkRequest> userRequestList ;
    private boolean completeProfile = false;

    public Role getRole() {
        return role;
    }
    
    public void setRole(Role role) {
        this.role = role;
    }
    

    public Employee() {
        id = count;
        count++;
        userRequestList = new ArrayList();
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    public boolean isCompleteProfile() {
        return completeProfile;
    }

    public void setCompleteProfile(boolean completeProfile) {
        this.completeProfile = completeProfile;
    }

    public File getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(File profilePicture) {
        this.profilePicture = profilePicture;
    }

    public ArrayList<CordinatorWorkRequest> getUserRequestList() {
        return userRequestList;
    }

    public void setUserRequestList(ArrayList<CordinatorWorkRequest> userRequestList) {
        this.userRequestList = userRequestList;
    }
    
    @Override
    public String toString() {
        return name ;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }   

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public  void addUserRequest (CordinatorWorkRequest  userRequest) {
    
    userRequestList.add(userRequest);
    }
     
}
