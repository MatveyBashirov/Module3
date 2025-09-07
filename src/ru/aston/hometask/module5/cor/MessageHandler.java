package ru.aston.hometask.module5.cor;

public interface MessageHandler {
    void setNextHandle (MessageHandler nextHandle);
    void handleMessage(String message);
}
