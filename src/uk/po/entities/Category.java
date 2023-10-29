
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

    private boolean validateName(String name) {         // Walidacja danych dla nazwy kategorii
        return true;                    // Implementacja walidacji
    }

    public String getName() {
        return name;
    }


}