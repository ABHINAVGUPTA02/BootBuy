package com.theSilentBell.BootBuy.service;

import com.theSilentBell.BootBuy.models.Category;

import java.util.List;
import java.util.UUID;

public interface CategoryService {
    public List<Category> getCategories();
    public String createCategory(Category category);
    public String deleteCategory(UUID categoryId);
    public Category updateCategory(UUID categoryId, Category category);
}

