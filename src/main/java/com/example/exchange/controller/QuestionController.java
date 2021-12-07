package com.example.exchange.controller;

import com.example.exchange.model.AnswerInputModel;
import com.example.exchange.model.QuestionInputModel;
import com.example.exchange.model.VoteInputModel;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class QuestionController {
    @GetMapping("/questions")
    public ResponseEntity<?> getAllQuestions(Pageable page){
        return null;
    }

    @GetMapping("/questions/inactive")
    public ResponseEntity<?> getInactiveQuestions(Pageable page){
        return null;
    }

    @GetMapping("/questions/{id}")
    public ResponseEntity<?> getQuestionById(@PathVariable String id){
        return null;
    }

    @GetMapping("/questions/tagged/{tagName}")
    public ResponseEntity<?> getQuestionByTag(@PathVariable String tagName){
        return null;
    }

    @PostMapping("/questions/ask")
    public ResponseEntity<?> askQuestion(@RequestBody QuestionInputModel input){
        return null;
    }

    @PostMapping("/questions/{id}")
    public ResponseEntity<?> answerQuestion(@RequestBody AnswerInputModel input){
        return null;
    }

    @PutMapping("/questions/{id}")
    public ResponseEntity<?> editAnswer(@RequestBody AnswerInputModel input){
        return null;
    }

    @PutMapping("/users/{userId}/questions/{questionId}")
    public ResponseEntity<?> editQuestion(@PathVariable String userId, @PathVariable String questionId, @RequestBody QuestionInputModel input){
        return null;
    }

    @DeleteMapping("/questions/{questionId}")
    public ResponseEntity<?> deleteQuestion(@PathVariable String questionId){
        return null;
    }

    // khi nao thi xoa, khi nao thi them vote
    @RequestMapping("questions/{id}/vote")
    public ResponseEntity<?> voteQuestion(@PathVariable String id, @RequestBody VoteInputModel input){
        return null;
    }
}
