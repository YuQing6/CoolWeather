package com.example.administrator.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/12/21.
 */

public class Province extends DataSupport{
    private int id;
    private String privinceName;
    private int prvinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrivinceName() {
        return privinceName;
    }

    public void setPrivinceName(String privinceName) {
        this.privinceName = privinceName;
    }

    public int getPrvinceCode() {
        return prvinceCode;
    }

    public void setPrvinceCode(int prvinceCode) {
        this.prvinceCode = prvinceCode;
    }
}