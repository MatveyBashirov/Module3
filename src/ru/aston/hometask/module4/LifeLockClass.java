package ru.aston.hometask.module4;

public class LifeLockClass {
    public static class Car{
        private final String name;
        private boolean carStoped;

        public Car(String name){
            this.name = name;
            carStoped = true;
        }

        public String getName() {
            return name;
        }

        public void driving(Car oncomingCar){
            while (carStoped){
                if(!oncomingCar.carStoped){
                    System.out.println(name + " проезжает по дороге дальше...");
                    carStoped = false;
                }
                else{
                    System.out.println(name + " сигналит: \"Бип-Бип! Уступи дорогу!\"");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }
    public static void LifeLockSituation(){
        final Car bmw = new Car("BMW");
        final Car cherry = new Car("Cherry");

        Thread threadBMW = new Thread(() -> {
            bmw.driving(cherry);
        });

        Thread threadCherry = new Thread(() -> {
            cherry.driving(bmw);
        });

        threadBMW.start();
        threadCherry.start();
    }
}
