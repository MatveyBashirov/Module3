package ru.aston.hometask;

import java.io.*;

public class FileManager {
    public static void writeFile(File file, String message) throws FileOperationException {
        try(FileOutputStream fileOutputStream = new FileOutputStream(file)) {
            fileOutputStream.write(message.getBytes());
            System.out.println("Строка \"" + message + "\" записана");
        } catch (NullPointerException e) {
            throw new FileOperationException("Нельзя записать пустую строку!");
        } catch (FileNotFoundException e) {
            throw new FileOperationException("Файл не найден!");
        } catch (IOException e) {
            throw new FileOperationException("Ошибка при работе с файлом!");
        }
    }

    public static void readFile(File file) throws FileOperationException {
        try(FileInputStream fileInputStream = new FileInputStream(file)) {
            int bytes;
            System.out.print("Строка из файла: ");
            while ((bytes = fileInputStream.read())!= -1){
                System.out.print((char) bytes);
            }
            System.out.print("\n");
        } catch (FileNotFoundException e) {
            throw new FileOperationException("Файл не найден!");
        } catch (IOException e) {
            throw new FileOperationException("Ошибка при работе с файлом!");
        }
    }
}
