package com.example.demo.ThitPhucVu;

import com.example.demo.Thit;
import org.springframework.stereotype.Component;

@Component

public class ThitBo implements Thit {

    @Override
    public String loaiThit() {
        return "500g thit bo";
    }
}
