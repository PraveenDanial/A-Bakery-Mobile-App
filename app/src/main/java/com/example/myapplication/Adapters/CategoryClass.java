package com.example.myapplication.Adapters;

public class CategoryClass {
    private String CategoryID;
    private String CategoryName;

    public CategoryClass(String categoryID, String categoryName) {
        CategoryID = categoryID;
        this.CategoryName = categoryName;
    }

    public String getCategoryID() {

        return CategoryID;
    }

    public void setCategoryID(String categoryID) {

        CategoryID = categoryID;
    }

    public String getCategoryName() {

        return CategoryName;
    }

    public void setCategoryName(String categoryName) {

        this.CategoryName = categoryName;
    }
}
