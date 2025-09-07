package ru.aston.hometask.module5.cor;

public class Main {
    public static void main(String[] args) {
        AntispamFilter antispamFilter = new AntispamFilter();
        ShowMessageHandler showMessageHandler = new ShowMessageHandler();

        antispamFilter.setNextHandle(showMessageHandler);

        antispamFilter.handleMessage("Принц Нигерии хочет оставить вам своё наследство!");
        antispamFilter.handleMessage("Вам пришла зарплата!");
    }
}
