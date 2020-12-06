package Business;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.AdminRole;
import Business.Role.CareTaker;
import Business.Role.Corporate;
import Business.Role.HeadquaterManager;
import Business.Role.Informer;
import Business.Role.Role;
import Business.Role.Supplier;
import Business.Role.SystemAdmin;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.CordinatorWorkRequest;
import java.util.ArrayList;
import java.util.Date;

/**
 * @author Alekhya
 * @author Apeksha
 * @author Shalini
 */

public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        
        //create an enterprise
        //initialize some organizations
        //have some employees 
        
        //create admin
        Employee employee = system.getEmployeeDirectory().createEmployee("sysadmin");
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", "",employee, new SystemAdmin());
        
        //Create a network
        Network network = new Network("BostonNetwork", "Boston","MA","US", new UserAccountDirectory(), new EnterpriseDirectory());
        system.getNetworkList().add(network);
        
        //create user
        
//        network.getUserAccountDirectory().createUserAccount("alekhya", "alekhya", "2323", u, new Informer());
        //create user account
        Employee employee2 = system.getEmployeeDirectory().createEmployee("admin");
        UserAccount ua2 = network.getUserAccountDirectory().createUserAccount("admin", "apeksha", "",employee, new AdminRole());
        
        network.getEnterpriseDirectory().createAndAddEnterprise("BostonGovernment", 
                Enterprise.EnterpriseType.Government);
        network.getEnterpriseDirectory().createAndAddEnterprise("BostonCorporate", 
                Enterprise.EnterpriseType.Corporate);
        network.getEnterpriseDirectory().createAndAddEnterprise("BostonHEadquarters", 
                Enterprise.EnterpriseType.Headquaters);
        network.getEnterpriseDirectory().createAndAddEnterprise("BostonNGO", 
                Enterprise.EnterpriseType.NGO);
        
        EnterpriseDirectory ed=network.getEnterpriseDirectory();
        Organization o;
        
        for(Enterprise ent: ed.getEnterpriseList()){
            if(ent.getEnterpriseType()==Enterprise.EnterpriseType.Corporate){
                o = ent.getOrganizationDirectory().createOrganization(Organization.Type.Corporate);
                o.setName("OrgCorporate");
                Employee e = new Employee();
                e.setName("alekhya");
                e.setUserName("alekhyaCor");
                e.setEmailId("alekhya");
                e.setPassword("alekhya");
                o.getUserAccountDirectory().createUserAccount("alekhya", "alekhya", "22", e, new Corporate());
            }else if(ent.getEnterpriseType()==Enterprise.EnterpriseType.Government){
                o = ent.getOrganizationDirectory().createOrganization(Organization.Type.Government);
                o.setName("OrgGovernment");
            }else if(ent.getEnterpriseType()==Enterprise.EnterpriseType.Headquaters){
                o = ent.getOrganizationDirectory().createOrganization(Organization.Type.Headquaters);
                o.setName("OrgHeadquarters");
                Employee m = new Employee();
                m = new Employee();
                m.setName("manager");
                m.setUserName("manager");
                m.setEmailId("manager");
                m.setPassword("manager");
                o.getUserAccountDirectory().createUserAccount("manager", "manager", "22", m, new HeadquaterManager());
                
                o = ent.getOrganizationDirectory().createOrganization(Organization.Type.Investor);
                o.setName("OrgInvestors");
                o = ent.getOrganizationDirectory().createOrganization(Organization.Type.CareTaker);
                o.setName("OrgCareTaker");
                Employee e = new Employee();
                e.setName("shalini");
                e.setUserName("shaliniCare");
                e.setEmailId("shalini");
                e.setPassword("shalini");
                o.getUserAccountDirectory().createUserAccount("shaliniCare", "shalini", "22", e, new CareTaker());
                CordinatorWorkRequest request = new CordinatorWorkRequest();
            request.setTotalBill(20.00);
           
            request.setRequestDate(new Date());
            request.setEmployee(e);
            request.setCoordinatorAssigned(m);
            request.setStatus("delivered");
            request.setType("Headquarter Requirements");
            o.getWorkQueue().getRequestList().add(request);
                e.addUserRequest(request);
                m.addUserRequest(request);
                o = ent.getOrganizationDirectory().createOrganization(Organization.Type.Supplier);
                o.setName("OrgSupplier");
                Employee s = new Employee();
                s.setName("Supplier");
                s.setUserName("supplier");
                s.setEmailId("supplier");
                s.setPassword("supplier");
                o.getUserAccountDirectory().createUserAccount("supplier", "supplier", "22", s, new Supplier());
            request.setSupplierAssigned(s);
                s.addUserRequest(request);
            }else{
                o = ent.getOrganizationDirectory().createOrganization(Organization.Type.NGO);
                o.setName("OrgNGO");
            }
        }
        
        
        
        return system;
    }   
}
