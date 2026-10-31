package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@RequiredArgsConstructor
public class ToPho {

    //private final Thit thit;
    private final Map<String, Thit> danhSachThit;

    public void PhucVu(String tenLoaiThit) {
        Thit thit = danhSachThit.get(tenLoaiThit);
        if(thit != null) {
            System.out.println("Day la: " + thit.loaiThit());
        }else {
            System.out.println("Khong co loai thit nay trong menu");
        }
    }
}