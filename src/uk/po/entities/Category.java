
package uk.po.entities;

public class Category {
    private String name;

    public Category(String name) {
        setName(name);
    }

    public void setName(String name) {
        if (validateName(name)) {
            this.name = name;
        } else {
            this.name = null;
        }
    }

    private boolean validateName(String name) {// Walidacja danych dla nazwy kategorii
        // Implementacja walidacji
        return true; // Zwróć true jeśli dane są poprawne, w przeciwnym razie false
    }

    public String getName() {
        return name;
    }


}