package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;

public class App {
    public static void main(String[] args) {

        // Создаём продукты.
        Product product1 = new Product("Карандаш", 55);
        Product product2 = new Product("Ручка", 75);
        Product product3 = new Product("Фломастер", 105);
        Product product4 = new Product("Тетрадь", 97);
        Product product5 = new Product("Блокнот", 87);
        Product product6 = new Product("Пакет", 15);

        // Добавляем продукты в корзину.
        ProductBasket.fillingArray(product1);
        ProductBasket.fillingArray(product2);
        ProductBasket.fillingArray(product3);
        ProductBasket.fillingArray(product4);
        ProductBasket.fillingArray(product5);

// Печатаем содержимое корзины.
        System.out.println("<Печатаем содержимое корзины.>");
        ProductBasket.printingContentsBasket();
        System.out.println();

        // Добавляем продукт в заполненную корзину.
        System.out.println("<Добавляем продукт в заполненную корзину.>");
        ProductBasket.fillingArray(product6);
        ProductBasket.printingContentsBasket();
        System.out.println();

        // Поиск товара, который есть в корзине.
        System.out.println("<Поиск товара, который есть в корзине.>");
        String productCart = "Фломастер";
        System.out.println(ProductBasket.checkingForAvailability(productCart));
        System.out.println();

        // Поиск товара, которого нет в корзине.
        System.out.println("<Поиск товара, которого нет в корзине.>");
        String productCart1 = "Маркер";
        System.out.println(ProductBasket.checkingForAvailability(productCart1));
        System.out.println();

        // Очистка корзины.
        System.out.println("<Очистка корзины.>");
        ProductBasket.clearingArray();
        System.out.println();

        // Печать содержимого пустой корзины.
        System.out.println("<Печать содержимого пустой корзины.>");
        ProductBasket.printingContentsBasket();
        System.out.println();

// Поиск товара в пустой корзине.
        System.out.println("<Поиск товара в пустой корзине.>");
        String productCart2 = "Фломастер";
        System.out.println(ProductBasket.checkingForAvailability(productCart2));
    }
}