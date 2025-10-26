package com.bairen.Quiz.App.service;

import com.bairen.Quiz.App.model.question;
import com.bairen.Quiz.App.dao.QuestionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    @Autowired
    QuestionDao questionDao;
    public List<question> getAllQuestions() {
        return questionDao.findAll();
    }

    public List<question> getQuestionByCategory(String category) {
        return questionDao.findByCategory(category);
    }
}
