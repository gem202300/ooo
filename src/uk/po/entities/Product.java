package uk.po.entities;

public class Product {
    private String name;
    private double price;
    private Category category;
    private Currency currency;

    public Product(String name, double price) {
        setName(name);
        setPrice(price);
    }

    public Product(String name, double price, Category category) {
        setName(name);
        setPrice(price);
        setCategory(category);
    }

    public Product(String name, double price, Category category, Currency currency) {
        setName(name);
        setPrice(price);
        setCategory(category);
        setCurrency(currency);
    }

    public void setName(String name) {  // Walidacja danych dla nazwy produktu
        this.name = name;
    }

    public void setPrice(double price) {// Walidacja danych dla ceny produktu
        this.price = price;
    }

    public void setCategory(Category category) {        // Walidacja danych dla kategorii produktu
        this.category = category;// Implementacja walidacji
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public Category getCategory() {
        return category;
    }

    public Currency getCurrency() {
        return currency;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}