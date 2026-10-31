package com.example.demo.ThitPhucVu;

import com.example.demo.Thit;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ThitGa implements Thit {

    @Override
    public String loaiThit() {
        return "500g thit ga";
    }

}
