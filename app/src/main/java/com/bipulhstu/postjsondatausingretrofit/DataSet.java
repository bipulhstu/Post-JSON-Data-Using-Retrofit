package com.bipulhstu.postjsondatausingretrofit;

public class DataSet {
    //you can change this name DataSet Because there is another type of DataSet here in
    //android studio so when you call this class anywhere checkout the package name
    //carefully and then call it .
    private json json;

    public com.bipulhstu.postjsondatausingretrofit.json getJson() {
        return json;
    }

    public void setJson(com.bipulhstu.postjsondatausingretrofit.json json) {
        this.json = json;
    }

    public String name;
    public String hobby;

    public String getName() {
        return name;
    }

    public String getHobby() {
        return hobby;
    }


    public DataSet(String name, String hobby) {
        this.name = name;
        this.hobby = hobby;
    }
}
