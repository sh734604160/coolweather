package com.example.administrator.coolweather.db;

/**
 * 省级数据库对照类
 * Created by Administrator on 2017/9/16.
 */

public class Province {
    private int id;
    private String provinceName;
    private String provinceCode;//HTTP返回的省级代码

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }
}
