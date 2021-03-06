package com.wind.example.base;

/**
 * 命令接口
 * @author wind
 */
public interface Command {
    /**
     * 命令执行方法
     * @param message
     */
    void execute(String message);
}
