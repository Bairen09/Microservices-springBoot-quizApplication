package com.bairen.Quiz.App.controller;

import com.bairen.Quiz.App.model.question;
import com.bairen.Quiz.App.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {
    @Autowired
    QuestionService questionService;
    @GetMapping("/allquestions")
    public List<question> getAllQuestion(){
        return questionService.getAllQuestions();
    }
    @GetMapping("category/{category}")
    public List<question>getQuestionByCategory(@PathVariable String category){
        return questionService.getQuestionByCategory(category);
    }
}
