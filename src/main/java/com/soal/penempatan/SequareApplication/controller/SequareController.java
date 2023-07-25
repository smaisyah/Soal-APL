package com.soal.penempatan.SequareApplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.soal.penempatan.SequareApplication.model.SequareRequest;
import com.soal.penempatan.SequareApplication.model.SequareResponse;
import com.soal.penempatan.SequareApplication.service.SequareService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping
public class SequareController {
    @Autowired
    private SequareService sequareService;

    @PostMapping("/sequare")
    public ResponseEntity<SequareResponse> generResponse(@RequestBody SequareRequest bodyRequest) {
        int input = bodyRequest.getInput();
        return ResponseEntity.ok(sequareService.responseData(input));
    }
}
