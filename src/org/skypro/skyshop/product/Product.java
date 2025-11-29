package org.skypro.skyshop.product;

import java.util.Objects;

// Создаём класс товара Produkt
public class Product {

    // Объявляем переменные.
    private String produkt;
    private int cost;

    // Создаём конструктор.
    public Product(String produkt, int cost) {
        this.produkt = produkt;
        this.cost = cost;
    }

    // Создаём геттеры.
    public String getProdukt() {
        return produkt;
    }

    public int getCost() {
        return cost;
    }

    // Переопределяем метод toString.
    public String toString() {
        return "имя продукта-" + getProdukt() + ": " + "стоимость-" + getCost();
    }

    // Переопределение equals.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Product product = (Product) o;
        return Objects.equals(produkt, product.produkt);
    }
}
