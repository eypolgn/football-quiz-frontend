package com.example.football_quiz_app.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "questions")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
   
    @Column(nullable = false)
    private String questiontext;

    @ElementCollection
    private String[] option;

    @Column(nullable = false)
    private String correctAnswer;

    @Column(nullable = false)
    private String difficulty;
}
