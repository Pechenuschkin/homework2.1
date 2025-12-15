package org.skypro.skyshop.article;

// Создаём интерфейс Searchable.
public interface Searchable {

    // Создаём метод получения термина поиска.
    String searchTerm();

    // Создаём метод получения типа контента.
    String getOfTypeContent();

    // Создаём метод получения имени объекта.
    String getOfNameObject();


    default String getStringRepresentation() {
        return "имя объекта —" + getOfNameObject() + ":" + "тип объекта -" + getOfTypeContent();
    }
}