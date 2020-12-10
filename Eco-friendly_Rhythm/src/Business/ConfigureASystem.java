package Business;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.AdminRole;
import Business.Role.CareTaker;
import Business.Role.Corporate;
import Business.Role.Government;
import Business.Role.HeadquaterManager;
import Business.Role.Informer;
import Business.Role.NGO;
import Business.Role.Role;
import Business.Role.Supplier;
import Business.Role.SystemAdmin;
import Business.User.User;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.InternalWorkRequest;
import java.util.ArrayList;
import java.util.Date;

/**
 * @author Alekhya
 * @author Apeksha
 * @author Shalini
 */
public class ConfigureASystem {

    public static EcoSystem configure() {

        EcoSystem system = EcoSystem.getInstance();

        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create admin
        Employee employee = system.getEmployeeDirectory().createEmployee("sysadmin");
        UserAccount ua = system.getUserAccountDirectory().createEmployeeAccount("sysadmin", "sysadmin", "", employee, new SystemAdmin());

        //Create a network
        Network network = new Network("BostonNetwork", "Boston", "MA", "US");
        system.getNetworkList().add(network);

        //create user
        User u = system.getUserDirectory().addUser();
        u.setName("alekhya");
        u.setUserName("alekhya");
        u.setPassword("alekhya");
        u.setNetwork(network);
        u.setCompleteProfile(true);
        UserAccount useracc = network.getUserAccountDirectory().createUserAccount("alekhya", "alekhya", "79890", u, new Informer());

        //create user account
        Employee employee2 = system.getEmployeeDirectory().createEmployee("admin");
        UserAccount ua2 = network.getUserAccountDirectory().createEmployeeAccount("admin", "apeksha", "", employee, new AdminRole());

        network.getEnterpriseDirectory().createAndAddEnterprise("BostonGovernment",
                Enterprise.EnterpriseType.Government);
        network.getEnterpriseDirectory().createAndAddEnterprise("BostonCorporate",
                Enterprise.EnterpriseType.Corporate);
        network.getEnterpriseDirectory().createAndAddEnterprise("BostonHEadquarters",
                Enterprise.EnterpriseType.Headquaters);
        network.getEnterpriseDirectory().createAndAddEnterprise("BostonNGO",
                Enterprise.EnterpriseType.NGO);

        EnterpriseDirectory ed = network.getEnterpriseDirectory();
        Organization o;

        for (Enterprise ent : ed.getEnterpriseList()) {
            if (ent.getEnterpriseType() == Enterprise.EnterpriseType.Corporate) {
                o = ent.getOrganizationDirectory().createOrganization(Organization.Type.Corporate);
                o.setName("OrgCorporate");
                Employee e = new Employee();
                e.setName("alekhya");
                e.setUserName("alekhyaCor");
                e.setEmailId("alekhya");
                e.setPassword("alekhya");
                o.getUserAccountDirectory().createEmployeeAccount("alekhya", "alekhya", "22", e, new Corporate());
            } else if (ent.getEnterpriseType() == Enterprise.EnterpriseType.Government) {
                o = ent.getOrganizationDirectory().createOrganization(Organization.Type.Government);
                o.setName("OrgGovernment");
                User gvrt = system.getUserDirectory().addUser();
                gvrt.setName("gvrt");
                gvrt.setUserName("gvrt");
                gvrt.setPassword("government");
                gvrt.setNetwork(network);
                gvrt.setCompleteProfile(true);
                o.getUserAccountDirectory().createUserAccount("gvrt", "government", "79890", gvrt, new Government());

            } else if (ent.getEnterpriseType() == Enterprise.EnterpriseType.Headquaters) {
                o = ent.getOrganizationDirectory().createOrganization(Organization.Type.Headquaters);
                o.setName("OrgHeadquarters");
                Employee m = new Employee();
                m = new Employee();
                m.setName("manager");
                m.setUserName("manager");
                m.setEmailId("manager");
                m.setPassword("manager");
                o.getUserAccountDirectory().createEmployeeAccount("manager", "manager", "22", m, new HeadquaterManager());

                o = ent.getOrganizationDirectory().createOrganization(Organization.Type.Investor);
                o.setName("OrgInvestors");
                o = ent.getOrganizationDirectory().createOrganization(Organization.Type.CareTaker);
                o.setName("OrgCareTaker");
                Employee e = new Employee();
                e.setName("shalini");
                e.setUserName("shaliniCare");
                e.setEmailId("shalini");
                e.setPassword("shalini");
                o.getUserAccountDirectory().createEmployeeAccount("shaliniCare", "shalini", "22", e, new CareTaker());
                InternalWorkRequest request = new InternalWorkRequest();
                request.setTotalBill(20.00);

                request.setRequestDate(new Date());
                request.setEmployee(e);
                request.setCoordinatorAssigned(m);
                request.setStatus("delivered");
                request.setOverallStatus("Completed");
                request.setType("Headquarter Requirements");
                o.getWorkQueue().getRequestList().add(request);
                e.addEmployeeRequest(request);
                m.addEmployeeRequest(request);
                o = ent.getOrganizationDirectory().createOrganization(Organization.Type.Supplier);
                o.setName("OrgSupplier");
                Employee s = new Employee();
                s.setName("Supplier");
                s.setUserName("supplier");
                s.setEmailId("supplier");
                s.setPassword("supplier");
                o.getUserAccountDirectory().createEmployeeAccount("supplier", "supplier", "22", s, new Supplier());
                request.setSupplierAssigned(s);
                s.addEmployeeRequest(request);
            } else {
                o = ent.getOrganizationDirectory().createOrganization(Organization.Type.NGO);
                o.setName("OrgNGO");
                User s = new User();
                s.setName("apeksha");
                s.setUserName("apeksha");
                s.setNetwork(network);
                s.setEmailId("apeksha");
                s.setPassword("apeksha");
                o.getUserAccountDirectory().createUserAccount("apeksha", "apeksha", "22", s, new NGO());
            }
        }

        return system;
    }
}
