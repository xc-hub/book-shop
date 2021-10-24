package com.xucan.controller;

import com.xucan.domain.Evaluation;
import com.xucan.service.EvaluationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class EvaluationController {
    @Autowired
    private EvaluationService evaluationService;

    @RequestMapping("/evaluation/{book_id}")
    public List<Evaluation> findAll(@PathVariable ("book_id") Integer book_id){
        return evaluationService.findAll(book_id);
    }
}
