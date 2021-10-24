package com.xucan.service.impl;

import com.xucan.domain.Evaluation;
import com.xucan.mapper.EvaluationMapper;
import com.xucan.service.EvaluationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EvaluationServiceImpl implements EvaluationService {
    @Autowired
    private EvaluationMapper evaluationMapper;
    @Override
    public List<Evaluation> findAll(Integer book_id) {
        return evaluationMapper.findAll(book_id);
    }
}
