package org.skypro.skyshop.product;

import org.skypro.skyshop.article.Searchable;

import java.util.Objects;

// Создаём класс товара Product
public abstract class Product implements Searchable {

    // Объявляем переменные.
    private String stationery;

    // Добавили в конструктор проверку по условиям.
    // Создаём конструктор.
    public Product(String stationery) {
        this.stationery = stationery;
        if (stationery == null || stationery.isBlank()) {
            throw new IllegalArgumentException("Неправильное название продукта");
        }
    }

    // Создаём геттеры.
    public String getStationery() {
        return stationery;
    }

    public abstract int getCost();


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

    // Добавляем метод isSpecial.
    public abstract boolean isSpecial();

    // Переопределяем метод searchTerm
    @Override
    public String searchTerm() {
        return stationery;
    }

    // Переопределяем метод getOfTypeContent
    @Override
    public String getOfTypeContent() {
        return "PRODUCT";
    }

    // Переопределяем метод getOfNameObject
    @Override
    public String getOfNameObject() {
        return stationery;
    }


    public static void check(String stationery) {

    }
}
