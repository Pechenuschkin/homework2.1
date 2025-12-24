package org.skypro.skyshop.basket;

import org.skypro.skyshop.article.Searchable;
import org.skypro.skyshop.exception.BestResultNotFound;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SearchEngine {

    // Изменили массив на список.
    // Объявляем поля класса.
    private List<Searchable> searchableItems;


    //  Создаём конструктор.
    public SearchEngine() {
        this.searchableItems = new LinkedList<>();
    }

    // Добавляем новый объект в список поискового движка.
    public void add(Searchable item) {
        if (item != null) {
            searchableItems.add(item);
        }
    }

    // Изменили массив на список.
    // Поиска по массиву Searchable.
    public List<Searchable> search(String searchTerm) {
        List<Searchable> results = new LinkedList<>();
        for (Searchable item : searchableItems) {
            if (item != null && item.searchTerm().contains(searchTerm)) {
                results.add(item);
            }
        }
        return results;
    }

    // Метод поиска самого подходящего элемента.
    public Searchable searchable(String search) throws BestResultNotFound {
        Searchable searchable = null;
        int maxQuantity = 0;
        for (Searchable s : searchableItems) {
            if (s != null) {
                int quantity = 0;
                int index = 0;
                int indexStrings = s.searchTerm().indexOf(search, index);
                while (indexStrings != -1) {
                    quantity++;
                    index = indexStrings + search.length();
                    indexStrings = s.searchTerm().indexOf(search, index);
                }
                if (quantity > maxQuantity) {
                    maxQuantity = quantity;
                    searchable = s;
                }
            }
        }
        if (maxQuantity == 0) {
            throw new BestResultNotFound("Элемента не нашлось!");
        }
        return searchable;
    }

}