package com.example.football_quiz_app.Repository;

import com.example.football_quiz_app.Model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question,Integer> {

}
