package com.example.homeworkout;

public class ChoiseClass {

    int image,desc;
    String name,time;

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getDesc() {
        return desc;
    }

    public void setDesc(int desc) {
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public ChoiseClass(int image, String name, String time, int desc)
    {
        this.image = image;
        this.name = name;
        this.time = time;
        this.desc = desc;
    }
}
