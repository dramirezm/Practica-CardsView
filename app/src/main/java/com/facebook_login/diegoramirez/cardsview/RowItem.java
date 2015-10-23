package com.facebook_login.diegoramirez.cardsview;
/**
 * Created by Diego Ramirez on 31/07/2015.
 */
public class RowItem {
    private int imageId;
    private String title;
    private String description;

    public RowItem(Integer image, String title, String desc) {
        this.imageId = image;
        this.title = title;
        this.description = desc;
    }
    public int getImageId() {
        return imageId;
    }
    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
    public String getDesc() {
        return description;
    }
    public void setDesc(String desc) {
        this.description = desc;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    @Override
    public String toString() {
        return title + "\n" + description;
    }
}