package com.example.administrator.coolweather.db;

/**
 * 市级数据库对照类
 * Created by Administrator on 2017/9/16.
 */

public class City {
    private int id;
    private String cityName;
    private String cityCode;
    private int provincedId;

    public int getProvincedId() {
        return provincedId;
    }

    public void setProvincedId(int provincedId) {
        this.provincedId = provincedId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }
}
