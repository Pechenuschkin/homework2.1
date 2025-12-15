package org.skypro.skyshop;

import org.skypro.skyshop.article.Article;
import org.skypro.skyshop.article.Searchable;
import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.basket.SearchEngine;
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
        System.out.println();

        // Добавляем продукты в массив поискового движка.
        SearchEngine searchEngine = new SearchEngine(10);
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
        System.out.println("Выводим результат");
        String search1 = "Ручка";

        System.out.println(Arrays.toString(searchEngine.search(search1)));

        search1 = "Первый";
        System.out.println(Arrays.toString(searchEngine.search(search1)));
    }
}