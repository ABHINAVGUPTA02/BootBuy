package com.theSilentBell.BootBuy.service;

import com.theSilentBell.BootBuy.models.Category;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.UUID;

@Service
public class CategoryServiceImpl implements CategoryService {
    private ArrayList<Category> categories =  new ArrayList<>();

    public ArrayList<Category> getCategories() {
        return categories;
    }

    public void createCategory(Category category) {
        UUID uuid = UUID.randomUUID();
        category.setCategoryId(uuid);
        categories.add(category);
    }

    public void deleteCategory(UUID categoryId) {
        Category category = categories.stream()
                            .filter(c -> c.getCategoryId().equals(categoryId))
                            .findFirst()
                            .get();
        categories.remove(category);
    }
}
