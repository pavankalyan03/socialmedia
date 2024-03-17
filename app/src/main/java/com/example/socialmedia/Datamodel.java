package com.example.socialmedia;

import java.util.List;

public class Datamodel {

    private String details, itemText;
    int image;
    private boolean isExpandable;


    public Datamodel(String details,int image, String itemText) {
        this.details = details;
        this.image = image;
        this.itemText = itemText;
        isExpandable = false;
    }

    public String getDetails() {
        return details;
    }

    public int getImage() {
        return image;
    }

    public String getItemText() {
        return itemText;
    }

    public boolean isExpandable() {
        return isExpandable;
    }

    public void setExpandable(boolean expandable) {
        isExpandable = expandable;
    }


}
