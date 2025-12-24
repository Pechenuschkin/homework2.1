package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

import java.util.*;

public class ProductBasket {

    // Изменили массив на список.
    // Создаём корзину для товаров.
    public List<Product> products = new LinkedList<>();

    // Добавляем продукты в корзину.
    public void addProduct(Product product) {
        if (product != null) {
            products.add(product);
        } else {
            System.out.println("Нельзя добавить null");
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
        for (Product p : products) {
            if (p != null) {
                System.out.println(p);
            }
        }
        basketCostCalculation();
        int count = 0;
        for (Product p : products) {
            if (p == null) {
                break;
            } else if (p.isSpecial()) {
                count++;
            }
        }
        System.out.println("Специальных товаров:" + count);
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

    //  Очистка корзины.
    public void clearingArray() {
        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            Product element = iterator.next();
            if (element != null) {
                iterator.remove();
            }
        }
    }

    //Удаление продукта по имени из корзины
    public void deletedByName(String name) {
        List<Product> deletedProduct = new LinkedList<>();
        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            Product element = iterator.next();
            if (element.getStationery().equals(name)) {
                deletedProduct.add(element);
                iterator.remove();
            }
        }
        if (deletedProduct.isEmpty()) {
            System.out.println("Список пуст");
        } else {
            System.out.println(deletedProduct);
        }

    }

}

