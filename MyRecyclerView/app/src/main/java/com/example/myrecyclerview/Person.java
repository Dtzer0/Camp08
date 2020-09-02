package com.example.myrecyclerview;

public class Person {

    String name;
    String mobile;

    //오른쪽 마우스 -> generate
    public Person(String name, String mobile) {
        this.name = name;
        this.mobile = mobile;
    }

    //Getter & Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

}
