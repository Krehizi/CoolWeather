package com.example.krehizi.coolweather.db;

import org.litepal.crud.DataSupport;

public class County extends DataSupport {
    private int id;
    private String countName; //县名
    private String weatherId; //县所对应的天气id
    private int ciryId; //当前县所属市的id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountName() {
        return countName;
    }

    public void setCountName(String countName) {
        this.countName = countName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCiryId() {
        return ciryId;
    }

    public void setCiryId(int ciryId) {
        this.ciryId = ciryId;
    }
}
