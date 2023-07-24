package com.soal.penempatan.SequareApplication.controller;

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
    private SequareService sequareService;
    
    @PostMapping("/sequare")
    public SequareResponse getInput(@RequestBody SequareRequest bodyRequest){
        int input = bodyRequest.getInput();
        String output = sequareService.generateSequare(input);

        SequareResponse response = new SequareResponse(output);
        return response;

    }
}
