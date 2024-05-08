package com.quiz.controller;

import com.quiz.entites.Quiz;
import com.quiz.services.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Quiz")
public class QuizController {

    @Autowired
    private QuizService quizService;


//    public QuizController(QuizService quizService) {
//        this.quizService = quizService;
//    }
        // CREATE

    @PostMapping
        public Quiz create(@RequestBody Quiz quiz){
        return quizService.add(quiz);
    }

    // GET_ALL
    @GetMapping
    public List<Quiz> get(){
       return quizService.get();
    }

    //  GET_BY_ID
    @GetMapping("/{id}")
    public Quiz getOne(@PathVariable Long id){
        return quizService.get(id);
    }
}
