package org.skypro.skyshop.basket;

import org.skypro.skyshop.article.Searchable;
import org.skypro.skyshop.exception.BestResultNotFound;

public class SearchEngine {

    // Объявляем поля класса.
    private Searchable[] searchableItems;
    private int count = 0;

    //  Создаём конструктор.
    public SearchEngine(int size) {
        this.searchableItems = new Searchable[size];
    }

    // Добавляем новый объект в массив поискового движка.
    public void add(Searchable item) {
        if (count < searchableItems.length) {
            searchableItems[count++] = item;
        }
    }

    // Поиска по массиву Searchable.
    public Searchable[] search(String searchTerm) {
        Searchable[] results = new Searchable[5];
        int resultCount = 0;
        for (Searchable item : searchableItems) {
            if (item != null && item.searchTerm().contains(searchTerm)) {
                if (resultCount < 5) {
                    results[resultCount++] = item;
                } else {
                    break;
                }
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