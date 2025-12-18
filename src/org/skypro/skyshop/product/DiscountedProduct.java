package org.skypro.skyshop.product;

public class DiscountedProduct extends Product {
    // создаём поля базовой цены и скидки в процентах.
    private int baseCost;
    private int discountWholePercentages;

    // Добавили в конструктор проверку по условиям.
    // Создаём конструктор.
    public DiscountedProduct(String stationery, int baseCost, int discountWholePercentages) {
        super(stationery);
        this.baseCost = baseCost;
        this.discountWholePercentages = discountWholePercentages;
        if (discountWholePercentages <= 0 || discountWholePercentages >= 100) {
            throw new IllegalArgumentException("Некорректно задана скидка");
        }
        if (baseCost <= 0) {
            throw new IllegalArgumentException("Некорректно указана цена");
        }
    }


    // Создаём геттеры.
    public int getCost() {
        int discountAmount = (baseCost * discountWholePercentages) / 100;
        return baseCost - discountAmount;
    }

    public int getDiscountWholePercentages() {
        return discountWholePercentages;
    }

    // Переопределяем метод toString.
    @Override
    public String toString() {
        return "имя продукта со скидкой-" + getStationery() + ":" + "стоимость-" + getCost() + ":" + "скидка-" + getDiscountWholePercentages() + "%";
    }

    // Переопределяем метод isSpecial.
    @Override
    public boolean isSpecial() {
        return true;
    }
}
