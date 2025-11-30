package org.skypro.skyshop.product;

import java.util.Objects;

// Создаём класс товара Product
public class Product {

    // Объявляем переменные.
    private String stationery;
    private int cost;

    // Создаём конструктор.
    public Product(String stationery, int cost) {
        this.stationery = stationery;
        this.cost = cost;
    }

    // Создаём геттеры.
    public String getStationery() {
        return stationery;
    }

    public int getCost() {
        return cost;
    }

    // Переопределяем метод toString.
    public String toString() {
        return "имя продукта-" + getStationery() + ": " + "стоимость-" + getCost();
    }

    // Переопределение equals.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Product stationery = (Product) o;
        return Objects.equals(stationery, stationery.stationery);
    }
}
