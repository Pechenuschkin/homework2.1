package org.skypro.skyshop.article;

public class Article implements Searchable {

    // Создаём поля класса.
    private final String articleTitle;
    private final String textArticle;

    // Создаём конструктор.
    public Article(String articleTitle, String textArticle) {
        this.articleTitle = articleTitle;
        this.textArticle = textArticle;
    }

    // Создаём геттеры.
    public String getArticleTitle() {
        return articleTitle;
    }

    public String getTextArticle() {
        return textArticle;
    }

    // Переопределяем метод toString.
    @Override
    public String toString() {
        return getArticleTitle() + ":" + "\n" + getTextArticle();
    }

    // Переопределяем метод searchTerm
    @Override
    public String searchTerm() {
        return toString();
    }

    // Переопределяем метод getOfTypeContent
    @Override
    public String getOfTypeContent() {
        return "ARTICLE";
    }

    // Переопределяем метод getOfNameObject
    @Override
    public String getOfNameObject() {
        return articleTitle;
    }
}
