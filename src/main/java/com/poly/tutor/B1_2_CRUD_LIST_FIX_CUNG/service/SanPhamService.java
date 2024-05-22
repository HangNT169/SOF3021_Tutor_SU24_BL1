package com.poly.tutor.B1_2_CRUD_LIST_FIX_CUNG.service;

import com.poly.tutor.B1_2_CRUD_LIST_FIX_CUNG.entity.SanPham;

import java.util.ArrayList;
import java.util.List;

public class SanPhamService {

    private List<SanPham> lists = new ArrayList<>();

    public SanPhamService() {
        // add lan luot cac phan tu
        lists.add(new SanPham(1, "ms01", "laptop",20000, "van phong"));
        lists.add(new SanPham(1, "ms01", "laptop",20000, "van phong"));
        lists.add(new SanPham(1, "ms01", "laptop",20000, "van phong"));
        lists.add(new SanPham(1, "ms01", "laptop",20000, "van phong"));
        lists.add(new SanPham(1, "ms01", "laptop",20000, "van phong"));
        lists.add(new SanPham(1, "ms01", "laptop",20000, "van phong"));
    }

    public List<SanPham> getAll() {
        return lists;
    }

    public void xoaSanPham(String ma) {
        for (int i = 0; i < lists.size(); i++) {
            if (lists.get(i).getMa().equalsIgnoreCase(ma)) {
                lists.remove(i);
            }
        }
    }

    public SanPham detailSanPham(String ma) {
        for (int i = 0; i < lists.size(); i++) {
            if (lists.get(i).getMa().equalsIgnoreCase(ma)) {
                return lists.get(i);
            }
        }
        return null;
    }

    public void addSanPham(SanPham sanPham) {
        lists.add(sanPham);
    }
}
