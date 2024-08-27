package com.example.hp.myapplication.Model;

public class Food {
    private String name;



    private  String image;

    private  String description;
    private  String price;
    private  String menuId;

    public Food(String name, String image, String description, String price, String menuId) {
        this.name = name;
        this.image = image;
        this.description = description;
        this.price = price;
        this.menuId = menuId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public String getPrice() {
        return price;
    }

    public String getMenuId() {
        return menuId;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }
}
