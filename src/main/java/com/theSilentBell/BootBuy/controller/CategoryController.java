package com.theSilentBell.BootBuy.controller;

import com.theSilentBell.BootBuy.models.Category;
import com.theSilentBell.BootBuy.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;

@Slf4j
@RestController
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/api/public/categories")
    public ArrayList<Category> getAllCategories(){
        return categoryService.getCategories();
    }

    @PostMapping("/api/public/categories")
    public void createCategory(@RequestBody Category category){
        categoryService.createCategory(category);
    }
}
