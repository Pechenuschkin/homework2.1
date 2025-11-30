package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

public class ProductBasket {

    // Создаём корзину для товаров.
    private Product[] products = new Product[5];


    // Добавляем продукты в корзину.
    public void fillingArray(Product product) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                products[i] = product;
                break;
            } else if (products[products.length - 1] != null) {
                System.out.println("Невозможно добавить продукт");
                break;
            }
        }
    }

    // Расчёт стоимости корзины.
    public void basketCostCalculation() {
        int totalСost = 0;
        for (Product p : products) {
            if (p != null) {
                totalСost += p.getCost();
            }
        }
        System.out.println("Стоимость корзины" + " " + totalСost);
    }

    // Печатаем содержимое корзины.
    public void printingContentsBasket() {
        if (products[0] == null) {
            System.out.println("В корзине пусто");
        }
        for (Product p : products) {
            if (p != null) {
                System.out.println(p);
            }
        }
        basketCostCalculation();
    }

    // Проверяем наличие продукта в корзине.
    public boolean checkingForAvailability(String product) {
        for (Product p : products) {
            if (p == null) {
                break;
            } else if (p.getStationery().equals(product)) {
                return true;
            }
        }
        return false;
    }

    // Очистка корзины.
    public void clearingArray() {
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                products[i] = null;
            }
        }
    }
}
