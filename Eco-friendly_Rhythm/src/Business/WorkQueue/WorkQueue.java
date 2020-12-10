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
    
    private ArrayList<ExternalWorkRequest> workRequestList;
    private ArrayList<InternalWorkRequest> requestList;
    private ArrayList<PlantationWorkRequest> poolList;
    private ArrayList<NotificationRequest> notificationList;
    private ArrayList<SocialWorkRequest> socialList;

    public ArrayList<PlantationWorkRequest> getPoolList() {
        return poolList;
    }

    public void setPoolList(ArrayList<PlantationWorkRequest> poolList) {
        this.poolList = poolList;
    }

    public WorkQueue() {
        workRequestList = new ArrayList();
        requestList = new ArrayList();
        poolList = new ArrayList();
        notificationList = new ArrayList();
        socialList = new ArrayList();
    }

    public ArrayList<SocialWorkRequest> getSocialList() {
        return socialList;
    }

    public void setSocialList(ArrayList<SocialWorkRequest> socialList) {
        this.socialList = socialList;
    }

    public ArrayList<ExternalWorkRequest> getWorkRequestList() {
        return workRequestList;
    }
    
    public ArrayList<NotificationRequest> getNotificationList() {
        return notificationList;
    }
    
     public ArrayList<InternalWorkRequest> getRequestList() {
        return requestList;
    }
}