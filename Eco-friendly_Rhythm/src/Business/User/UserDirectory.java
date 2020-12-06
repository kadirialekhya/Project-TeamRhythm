/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.User;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Am3y
 */
public class UserDirectory {
         ArrayList<User> userDirectory;

    public UserDirectory() {
        userDirectory = new ArrayList<>();
    }

    public ArrayList<User> getUserDirectory() {
        return userDirectory;
    }

    public void setUserDirectory(ArrayList<User> userDirectory) {
        this.userDirectory = userDirectory;
    }

    public User addUser() {
       
            User user = new User();
            userDirectory.add(user);
            return user;
        
    }
    
    public void addUserDefault(String emailId,String userName,String password,String name ,char   type ,String contactNumber,Date dateOfBirth ,String gender,String emergencyContactNumber,String relation ,String address, String zip ,String state ,String city ,boolean heart,boolean liver ,boolean lungs ,boolean kidney ,boolean eyes) {
            User user = new User();
            userDirectory.add(user);
            user.setEmailId(emailId);
            user.setPassword(password);
            user.setUserName(userName);
            user.setName(name);
            user.setContactNumber(contactNumber);
            user.setZip(zip);
            user.setDateOfBirth(dateOfBirth);
            user.setGender(gender);
    }
    public boolean checkIfUsernameIsUnique(String username){
        for (User ua : userDirectory){
            if (ua.getUserName().equals(username))
                return false;
        }
        return true;
    }

    public boolean checkIfEmailidExist(String emailId) {
        for (User user : userDirectory) {
            if (user.getEmailId().equals(emailId)) {
                return true;
            }
        }
        return false;
    }

    public User authenticateUser(String username, String password) {
        for (User user : userDirectory) {
            if (user.getUserName().equals(username) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }
}
