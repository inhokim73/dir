package com.samsung.android.myapplication;

public class MyPrint {
    private String customer;
    private String id;

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "MyPrint{" +
                "customer='" + customer + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
