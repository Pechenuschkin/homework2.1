package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;

public class App {
    public static void main(String[] args) {

        // Создаём продукты.
        Product pencil = new Product("Карандаш", 55);
        Product aPen = new Product("Ручка", 75);
        Product feltTipPen = new Product("Фломастер", 105);
        Product copybook = new Product("Тетрадь", 97);
        Product notepad = new Product("Блокнот", 87);
        Product bag = new Product("Сумка", 15);

        // Создаём экземпляр класса для вызова не статичного метода.
        ProductBasket productBasket1 = new ProductBasket();

        // Добавляем продукты в корзину.
        productBasket1.fillingArray(pencil);
        productBasket1.fillingArray(aPen);
        productBasket1.fillingArray(feltTipPen);
        productBasket1.fillingArray(copybook);
        productBasket1.fillingArray(notepad);

// Печатаем содержимое корзины.
        System.out.println("<Печатаем содержимое корзины.>");
        productBasket1.printingContentsBasket();
        System.out.println();

        // Добавляем продукт в заполненную корзину.
        System.out.println("<Добавляем продукт в заполненную корзину.>");
        productBasket1.fillingArray(bag);
        productBasket1.printingContentsBasket();
        System.out.println();

        // Поиск товара, который есть в корзине.
        System.out.println("<Поиск товара, который есть в корзине.>");
        String productCart = "Фломастер";
        System.out.println(productBasket1.checkingForAvailability(productCart));
        System.out.println();

        // Поиск товара, которого нет в корзине.
        System.out.println("<Поиск товара, которого нет в корзине.>");
        String productCart1 = "Маркер";
        System.out.println(productBasket1.checkingForAvailability(productCart1));
        System.out.println();

        // Очистка корзины.
        System.out.println("<Очистка корзины.>");
        productBasket1.clearingArray();
        System.out.println();

        // Печать содержимого пустой корзины.
        System.out.println("<Печать содержимого пустой корзины.>");
        productBasket1.printingContentsBasket();
        System.out.println();

// Поиск товара в пустой корзине.
        System.out.println("<Поиск товара в пустой корзине.>");
        String productCart2 = "Фломастер";
        System.out.println(productBasket1.checkingForAvailability(productCart2));
    }
}