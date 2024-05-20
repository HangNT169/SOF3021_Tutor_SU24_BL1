package com.poly.tutor.B1_2_CRUD_LIST_FIX_CUNG.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SanPham {

    private int id;

    private String ma;

    private String ten;

    private String loai;

    private int gia;

}
