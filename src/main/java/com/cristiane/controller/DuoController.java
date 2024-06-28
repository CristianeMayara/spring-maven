package com.cristiane.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;


@RestController
@RequestMapping("/duo")
public class DuoController {

    @GetMapping("/category/{id}")
    public ResponseEntity<Object> getCategory(@PathVariable Long id) {
        var category = new Category("Sport");

        if(id < 1) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error getting category");
        }
        return ResponseEntity.status(HttpStatus.OK).body(category);
    }

    @GetMapping("/search")
    public String getList(@RequestParam String name) {
        return "Get list method with param " + name;
    }

    @GetMapping("/products")
    public String getProducts(@RequestParam Map<String, String> allParams) {
        return "Get products method with param " + allParams.entrySet();
    }

    @PostMapping("/category")
    public ResponseEntity<Object> createCategory(@RequestBody Category category) {
        return ResponseEntity.status(HttpStatus.CREATED).body("Created category with name " + category.name);
    }

    @PostMapping("/admin")
    public String createCategory(@RequestHeader("cisession") String cisession) {
        return "Access with token " + cisession;
    }

    @PostMapping("/admin-plus")
    public String createCategory(@RequestHeader Map<String, String> allParams) {
        return "Access with multiple token " + allParams.entrySet();
    }

    @GetMapping("/category")
    public ResponseEntity<Object> getCategories() {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error getting list");
    }

    record Category(String name){}
}
