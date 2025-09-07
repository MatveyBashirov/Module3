package ru.aston.hometask.module5.cor;

public class AntispamFilter implements MessageHandler {

    private MessageHandler nextHandler;

    @Override
    public void setNextHandle(MessageHandler nextHandle) {
        this.nextHandler = nextHandle;
    }

    @Override
    public void handleMessage(String message) {
        if (message.contains("Принц Нигерии") || message.contains("наследство")) {
            System.out.println("Сообщение отправлено в спам");
        } else {
            nextHandler.handleMessage(message);
        }
    }
}
