package ru.aston.hometask;


import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Matvey\\Desktop\\file.txt");
        String message1 = "Message 1";
        try {
            FileManager.writeFile(file, message1);
            FileManager.readFile(file);
            FileManager.writeFile(file, null);
        } catch (FileOperationException e) {
            System.out.println("Возникла ошибка: " + e.getMessage());
        }
    }
}