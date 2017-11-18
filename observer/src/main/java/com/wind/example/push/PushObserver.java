package com.wind.example.push;

/**
 * 推具体观察者
 * @author wind
 */
public class PushObserver implements IPushObserver {

    private String name;
    private int age;

    public PushObserver(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void receive(String message) {
        System.out.println("name=" + name + ",age=" + age + ",message=" + message);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
