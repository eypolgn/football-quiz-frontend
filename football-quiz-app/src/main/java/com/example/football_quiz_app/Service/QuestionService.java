package com.example.football_quiz_app.Service;

import com.example.football_quiz_app.Model.Question;
import com.example.football_quiz_app.Repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    public List<Question> getAllQuestions() {
        return questionRepository.findAll();
    }

    public Question addQuestion(Question question){
        return questionRepository.save(question);
    }
}
