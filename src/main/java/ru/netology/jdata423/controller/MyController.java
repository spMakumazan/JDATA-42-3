package ru.netology.jdata423.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.jdata423.repository.MyRepository;

@RestController
public class MyController {
    private final MyRepository myRepo;

    public MyController(MyRepository myRepo) {
        this.myRepo = myRepo;
    }

    @GetMapping("/products/fetch-product")
    public String getProductMame (@RequestParam("name") String name) {
        return myRepo.getProductName(name.toLowerCase());
    }
}
