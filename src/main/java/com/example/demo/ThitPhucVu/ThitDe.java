package com.example.demo.ThitPhucVu;

import com.example.demo.Thit;
import org.springframework.stereotype.Component;

@Component
public class ThitDe implements Thit {

    @Override
    public String loaiThit() {
        return "300g thit de";
    }
}
