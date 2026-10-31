package com.example.demo.ThitPhucVu;

import com.example.demo.Thit;
import org.springframework.stereotype.Component;

@Component
public class ThitHeo implements Thit {

    @Override
    public String loaiThit() {
        return "400g thit heo";
    }
}
