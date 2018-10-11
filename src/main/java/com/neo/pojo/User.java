package com.neo.pojo;

public class User {
    private String userId;
    private String name;
    private String age;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString(){
        return "userId: "+this.userId + " name: " + this.name + " age:"+this.age;
    }
}
