package uk.po.entities;

public class Main {
    public static void main(String[] args) {

        Category category = new Category("Electronics");


        Category invalidCategory = new Category("InvalidCategory");
        System.out.println("Valid Category Name: " + category.getName());
        System.out.println("Invalid Category Name: " + invalidCategory.getName());


        category.setName("Gadgets");
        System.out.println("Updated Category Name: " + category.getName());


        Currency currency = Currency.PLN;
        System.out.println("Currency Type: " + currency.name());


        Category electronicCategory = new Category("Electronics");


        Product product1 = new Product("Laptop", 1000.0, electronicCategory);
        Product product2 = new Product("Tablet", 500.0);
        Product product3 = new Product("Invalid Product", -200.0, null);

        System.out.println("Product 1: " + product1.getName() + ", Price: " + product1.getPrice() + ", Category: " + product1.getCategory().getName());

        System.out.println("Product 2: " + product2.getName() + ", Price: " + product2.getPrice() + ", Category: " + product2.getCategory());

        System.out.println("Product 3: " + product3.getName() + ", Price: " + product3.getPrice() + ", Category: " + product3.getCategory());

        product1.setName("Updated Laptop");
        product1.setPrice(1200.0);
        product1.setCategory(new Category("Gadgets"));

        System.out.println("Updated Product 1: " + product1.getName() + ", Price: " + product1.getPrice() + ", Category: " + product1.getCategory().getName());

    }//test
}
