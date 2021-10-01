package com.example.evechat.Models;

import java.util.ArrayList;

public class UserStatus {
    private String name, profileImage;
    private long lastUpload;
    private ArrayList<Status> statuses;

    public UserStatus() {
    }

    public UserStatus(String name, String profileImage, long lastUpload, ArrayList<Status> statuses) {
        this.name = name;
        this.profileImage = profileImage;
        this.lastUpload = lastUpload;
        this.statuses = statuses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public long getLastUpload() {
        return lastUpload;
    }

    public void setLastUpload(long lastUpload) {
        this.lastUpload = lastUpload;
    }

    public ArrayList<Status> getStatuses() {
        return statuses;
    }

    public void setStatuses(ArrayList<Status> statuses) {
        this.statuses = statuses;
    }
}
