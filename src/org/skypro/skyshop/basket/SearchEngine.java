package org.skypro.skyshop.basket;

import org.skypro.skyshop.article.Searchable;

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


}