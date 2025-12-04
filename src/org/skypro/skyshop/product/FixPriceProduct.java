package org.skypro.skyshop.product;

public class FixPriceProduct extends Product {

    // Создаём поле с константой.
    private static final int FIX_PRICE = 50;

    // Создаём конструктор.
    public FixPriceProduct(String stationery) {
        super(stationery);
    }

    // Создаём геттер.
    public int getCost() {
        return FIX_PRICE;
    }

    // Переопределяем метод toString.
    @Override
    public String toString() {
        return "имя продукта c фиксированной ценой-" + getStationery() + ":" + "Фиксированная цена-" + getCost();
    }

    // Переопределяем метод isSpecial.
    @Override
    public boolean isSpecial() {
        return true;
    }
}
