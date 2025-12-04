package org.skypro.skyshop.product;

public class SimpleProduct extends Product {

    // Создаём поле цены.
    private int cost;

    // Создаём конструктор.
    public SimpleProduct(String stationery, int cost) {
        super(stationery);
        this.cost = cost;
    }

    // Создаём геттер.
    public int getCost() {
        return cost;
    }

    // Переопределяем метод toString.
    @Override
    public String toString() {
        return "имя продукта-" + getStationery() + ": " + "стоимость-" + getCost();
    }

    // Переопределяем метод isSpecial.
    @Override
    public boolean isSpecial() {
        return false;
    }
}
