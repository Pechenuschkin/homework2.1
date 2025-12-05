package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.SimpleProduct;

public class App {
    public static void main(String[] args) {

        // Создаём продукты.
        Product pencil = new SimpleProduct("Карандаш", 55);
        Product aPen = new DiscountedProduct("Ручка", 75, 10);
        Product feltTipPen = new SimpleProduct("Фломастер", 105);
        Product copybook = new FixPriceProduct("Тетрадь");
        Product notepad = new SimpleProduct("Блокнот", 87);
        Product bag = new SimpleProduct("Сумка", 15);


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