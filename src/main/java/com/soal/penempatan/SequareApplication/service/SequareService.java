package com.soal.penempatan.SequareApplication.service;

import org.springframework.stereotype.Service;

@Service
public class SequareService {
    public String generateSequare(int input) {
        if(input < 3){
            return "Nilai terlalu kecil";
        }
        else if(input > 9){
            return "Nilai terlalu besar";
        }
        else {
        String top = "=".repeat(input);
        String midle = "| " + " || ".repeat(input - 3) + " |";
        String bottom = "=".repeat(input);
        return top + midle + bottom;
        }
    }
}
