package com.theSilentBell.BootBuy.service;

import com.theSilentBell.BootBuy.models.Category;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.UUID;

public interface CategoryService {
    public ArrayList<Category> getCategories();
    public void createCategory(Category category);
    public void deleteCategory(UUID categoryId);
}
