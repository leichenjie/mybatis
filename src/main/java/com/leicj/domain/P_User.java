package com.leicj.domain;

public class P_User {
    private int id;
    private String name;
    private String sex;

    public int getId() {
        return id;
    }

    public P_User setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public P_User setName(String name) {
        this.name = name;
        return this;
    }

    public String getSex() {
        return sex;
    }

    public P_User setSex(String sex) {
        this.sex = sex;
        return this;
    }

    @Override
    public String toString() {
        return "P_User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
