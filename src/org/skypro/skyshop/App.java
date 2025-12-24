package org.skypro.skyshop;

import org.skypro.skyshop.article.Article;
import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.basket.SearchEngine;
import org.skypro.skyshop.exception.BestResultNotFound;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.SimpleProduct;

import java.util.Arrays;

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
        productBasket1.addProduct(pencil);
        productBasket1.addProduct(aPen);
        productBasket1.addProduct(feltTipPen);
        productBasket1.addProduct(aPen);
        productBasket1.addProduct(copybook);
        productBasket1.addProduct(notepad);
        productBasket1.addProduct(aPen);

// Печатаем содержимое корзины.
        System.out.println("<Печатаем содержимое корзины.>");
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
        System.out.println();

        // Добавляем продукты в корзину после очистки корзины.
        productBasket1.addProduct(pencil);
        productBasket1.addProduct(aPen);
        productBasket1.addProduct(feltTipPen);
        productBasket1.addProduct(aPen);
        productBasket1.addProduct(copybook);
        productBasket1.addProduct(notepad);
        productBasket1.addProduct(aPen);

        // Добавляем продукты в массив поискового движка.
        SearchEngine searchEngine = new SearchEngine();
        searchEngine.add(pencil);
        searchEngine.add(aPen);
        searchEngine.add(feltTipPen);
        searchEngine.add(copybook);

        // Создаём объекты типа Article.
        Article article1 = new Article("Шариковоя ручка", "В обычной шариковой ручке достаточно чернил, чтобы провести линию в несколько километров длиной.");
        Article article2 = new Article("Первые ножницы", "Ножницы были изобретены 3-4 тыс. лет назад");
        Article article3 = new Article("Первый степлер", "Самый первый степлер был ручной работы и изготовлен в XVIII веке");

        // Добавляем статьи в массив поискового движка.
        searchEngine.add(article1);
        searchEngine.add(article2);
        searchEngine.add(article3);

        // Выводим результат.
        System.out.println("<Выводим результат>");
        String search1 = "Ручка";
        System.out.println(searchEngine.search(search1));

        search1 = "Первый";
        System.out.println(searchEngine.search(search1));
        System.out.println();

// Демонстрация проверки данных.
        System.out.println("<Демонстрация проверки данных>");
        try {
            Product aPen1 = new DiscountedProduct(null, 45, 10);
        } catch (IllegalArgumentException i) {
            System.out.println(i.getMessage());
        }
        try {
            Product pencil1 = new SimpleProduct("Кисточка", 0);
        } catch (IllegalArgumentException i) {
            System.out.println(i.getMessage());
        }
        System.out.println();

        // Поиск самого подходящего элемента.
        System.out.println("<Поиск самого подходящего элемента.>");
        search1 = "е";
        try {
            System.out.println(searchEngine.searchable(search1));
        } catch (BestResultNotFound e) {
            System.out.println(e.getMessage());
        }
        search1 = "Кисточка";
        try {
            System.out.println(searchEngine.searchable(search1));
        } catch (BestResultNotFound e) {
            System.out.println(e.getMessage());
        }
        System.out.println();

        // Печатаем содержимое корзины.
        System.out.println("<Печатаем содержимое корзины.>");
        productBasket1.printingContentsBasket();
        System.out.println();

        //Удаление продукта по имени из корзины
        System.out.println("<Удаление продукта по имени из корзины>");
        search1 = "Ручка";
        productBasket1.deletedByName(search1);
        System.out.println();

        // Печатаем содержимое корзины.
        System.out.println("<Печатаем содержимое корзины.>");
        productBasket1.printingContentsBasket();
        System.out.println();

        //Удаление несуществующего продукта по имени из корзины
        System.out.println("<Удаление несуществующего продукта по имени из корзины>");
        search1 = "Глобус";
        productBasket1.deletedByName(search1);
        System.out.println();

        // Печатаем содержимое корзины.
        System.out.println("<Печатаем содержимое корзины.>");
        productBasket1.printingContentsBasket();
    }
}