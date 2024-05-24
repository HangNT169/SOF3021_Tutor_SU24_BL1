package com.poly.tutor.B4_CRUD_JPA.controller;

import com.poly.tutor.B4_CRUD_JPA.entity.Category1;
import com.poly.tutor.B4_CRUD_JPA.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CategoryController {

    @Autowired
    private CategoryRepository repo;

    @GetMapping("/hien-thi")
    public String hienThiCate(Model model){
        model.addAttribute("lists",repo.findAll());
        return "buoi4/cate";
    }

    @GetMapping("/view-add")
    public String viewAdd() {
        return "buoi4/add";
    }

    @PostMapping("/add")
    public String add(Category1 category1) {
        repo.save(category1);
//        repo.delete(doi tuong);
//        repo.deleteById(Khoa chinh);
//        Category1 category11 = repo.findById(khoa chinh).get();
        return "redirect:/hien-thi";
    }
}
