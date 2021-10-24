package com.xucan.service;

import com.xucan.domain.Evaluation;

import java.util.List;

public interface EvaluationService {

    List<Evaluation> findAll(Integer book_id);
}
