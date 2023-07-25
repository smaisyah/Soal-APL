package com.soal.penempatan.SequareApplication.service;

import org.springframework.stereotype.Service;

import com.soal.penempatan.SequareApplication.model.SequareResponse;

@Service
public class SequareService {
    public SequareResponse responseData(int N) {
        if (N < 3) {
            return new SequareResponse("Nilai N terlalu kecil");
        } else if (N > 9) {
            return new SequareResponse("Nilai N terlalu besar");
        } else {
            String top = "=".repeat(N);
            String midle = "| " + " || ".repeat(N - 3) + " |";
            String bottom = "=".repeat(N);
            return new SequareResponse(top + midle + bottom);
        }
    }
}
