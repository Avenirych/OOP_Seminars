package org.example;
//Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
//Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать перегруженный метод getProduct(int name, int volume, int temperature)
//выдающий продукт соответствующий имени, объему и температуре
//В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику заложенную в программе
//Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре
public class Main {
    public static void main(String[] args) {
        HotDrinksMachine machine = new HotDrinksMachine();
        machine.addProduct(new HotDrink("Coffee Americano", 150, 75));
        machine.addProduct(new HotDrink("Black tea", 250, 95));
        machine.addProduct(new HotDrink("Latte", 200, 80));
        machine.addProduct(new HotDrink("Cocao", 300, 85));

        for (HotDrink product: machine.products) {
            System.out.println(product);
        }

        System.out.println(machine.getProduct("Ice tea", 250, 15));
        System.out.println(machine.getProduct("Latte"));

    }
}