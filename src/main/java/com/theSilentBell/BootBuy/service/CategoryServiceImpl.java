package com.theSilentBell.BootBuy.service;

import com.theSilentBell.BootBuy.models.Category;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

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

    public String deleteCategory(UUID categoryId) {
        Category category = categories.stream()
                            .filter(c -> c.getCategoryId().equals(categoryId))
                            .findFirst()
                            .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Category not found"));

        categories.remove(category);
        return "Category with id: " + categoryId + " deleted successfully";
    }
}
