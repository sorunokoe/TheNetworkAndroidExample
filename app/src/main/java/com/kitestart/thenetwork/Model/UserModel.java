

package com.kitestart.thenetwork.Model;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class UserModel {

    public static ArrayList<UserModel> allUsers = new ArrayList();

    String name;
    int age;
    String status;
    String longitude;
    String latitude;

    public UserModel(String name, int age, String status, String longitude, String latitude) {
        this.name = name;
        this.age = age;
        this.status = status;
        this.longitude = longitude;
        this.latitude = latitude;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }
}
