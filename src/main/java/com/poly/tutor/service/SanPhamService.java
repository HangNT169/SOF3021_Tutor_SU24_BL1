package com.poly.tutor.service;

import com.poly.tutor.entity.SanPham;

import java.util.ArrayList;
import java.util.List;

public class SanPhamService {

    private List<SanPham> lists = new ArrayList<>();

    public SanPhamService() {
        // add lan luot cac phan tu
        lists.add(new SanPham(1, "ms01", "laptop", "van phong", 20000));
        lists.add(new SanPham(2, "gdsf", "laptop", "van phong 1", 543254));
        lists.add(new SanPham(3, "ms0gs1", "laptop", "van phong 2", 20000));
        lists.add(new SanPham(4, "gdf", "laptop", "van phong 3", 532));
        lists.add(new SanPham(5, "ms01", "laptop", "van phong 4", 20000));
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
}
