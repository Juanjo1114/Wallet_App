package com.juanpicon.walletapp;

import java.util.DoubleSummaryStatistics;

public class Account {

    private String name;
    private String type;
    public Double currentValue;

    public Account(String name, String type, Double currentValue) {
        this.name = name;
        this.type = type;
        this.currentValue = currentValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(Double currentValue) {
        this.currentValue = currentValue;
    }
}
