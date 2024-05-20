package com.poly.tutor.controller;

import com.poly.tutor.entity.SanPham;
import com.poly.tutor.service.SanPhamService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class SanPhamController {

    private SanPhamService service = new SanPhamService();

    @GetMapping("/san-pham/view-all")
    public String hienThi(Model model) {
        model.addAttribute("lists", service.getAll());
        return "buoi1/buoi1";
    }

    @GetMapping("/san-pham/remove/{ma1}")
    public String xoaSanPham(@PathVariable String ma1) {
        service.xoaSanPham(ma1);
        return "redirect:/san-pham/view-all"; // CHUYEN VE TRANG CHU
    }

    @GetMapping("/san-pham/detail/{ma1}")
    public String detailSanPham(@PathVariable String ma1, Model model) {
        SanPham sp = service.detailSanPham(ma1);
        model.addAttribute("sp1", sp);
        model.addAttribute("lists", service.getAll());
        return "buoi1/buoi1";
    }
}
