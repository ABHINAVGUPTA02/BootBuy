package com.theSilentBell.BootBuy.service;

import com.theSilentBell.BootBuy.models.Category;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CategoryServiceImpl implements CategoryService {
    private ArrayList<Category> categories =  new ArrayList<>();

    public ArrayList<Category> getCategories() {
        return categories;
    }

    public void createCategory(Category category) {
        categories.add(category);
    }
}
