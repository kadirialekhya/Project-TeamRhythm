/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Enterprise.Enterprise.EnterpriseType;
import Business.Role.Role;
import java.util.ArrayList;

/**
 * @author Alekhya
 * @author Apeksha
 * @author Shalini
 */

public class HeadquatersEnterprise extends Enterprise{

    public HeadquatersEnterprise(String name) {
        super(name, EnterpriseType.Headquaters);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
