package com.bairen.Quiz.App.dao;

import com.bairen.Quiz.App.model.question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionDao extends JpaRepository<question, Integer> {
    List<question>findByCategory(String category);
}
