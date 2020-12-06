/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 * @author Alekhya
 * @author Apeksha
 * @author Shalini
 */

public class WorkQueue {
    
    private ArrayList<WorkRequest> workRequestList;
    private ArrayList<CordinatorWorkRequest> requestList;

    public WorkQueue() {
        workRequestList = new ArrayList();
        requestList = new ArrayList();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }
    
     public ArrayList<CordinatorWorkRequest> getRequestList() {
        return requestList;
    }
}