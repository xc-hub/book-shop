package com.xucan.mapper;

import com.xucan.domain.Evaluation;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper

public interface EvaluationMapper {
    List<Evaluation> findAll(Integer book_id);
}
