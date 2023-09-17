package org.example;

public class Singleton {
    private String url = "jdbc:localhost:8888/bd";
    private static Singleton instance = new Singleton();
    private Singleton() {};
    public static Singleton getInstance() {
        return instance;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public static void setInstance(Singleton instance) {
        Singleton.instance = instance;
    }
}

