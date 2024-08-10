package com.example.football_quiz_app.Controller;

import com.example.football_quiz_app.Model.Question;
import com.example.football_quiz_app.Service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/questions")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @GetMapping
    public List<Question> getAllQuestions(){
        return questionService.getAllQuestions();
    }

    @PostMapping
    public Question createQuestion(@RequestBody Question question){
        return questionService.addQuestion(question);
    }
}
