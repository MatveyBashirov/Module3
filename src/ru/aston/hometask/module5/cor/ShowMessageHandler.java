package ru.aston.hometask.module5.cor;

public class ShowMessageHandler implements MessageHandler{
    private MessageHandler nextHandler;

    @Override
    public void setNextHandle(MessageHandler nextHandle) {
        this.nextHandler = nextHandle;
    }

    @Override
    public void handleMessage(String message) {
        System.out.println("Входящее сообщение: " + message);
    }
}
