package com.theSilentBell.BootBuy.controller;

import com.theSilentBell.BootBuy.models.Category;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;

@Slf4j
@RestController
public class CategoryController {
    private ArrayList<Category> categories = new ArrayList<>();

    @GetMapping("/api/public/categories")
    public ArrayList<Category> getAllCategories(){
        return categories;
    }

    @PostMapping("/api/public/categories")
    public void createCategory(@RequestBody Category category){
        categories.add(category);
        log.info("Created category {}", category);
    }
}
