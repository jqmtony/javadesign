package com.wind.example.application;

/**
 * 命令请求者
 * @author wind
 */
public class Requester {

    private ICommand command;

    public Requester(ICommand command) {
        this.command = command;
    }

    public void action(){
        command.execute();
    }
}
