package com.example.exchange.controller;

import com.example.exchange.entity.Answer;
import com.example.exchange.entity.Question;
import com.example.exchange.entity.VoteAnswer;
import com.example.exchange.entity.VoteQuestion;
import com.example.exchange.model.AnswerInputModel;
import com.example.exchange.model.LikeAnswerInputModel;
import com.example.exchange.model.LikeQuestionInputModel;
import com.example.exchange.model.QuestionInputModel;
import com.example.exchange.repository.AnswerRepository;
import com.example.exchange.service.AnswerService;
import com.example.exchange.service.VoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class AnswerController {
    @Autowired
    private AnswerService answerService;

    @Autowired
    private VoteService voteService;

    @PostMapping("/Answer")
    public ResponseEntity<?> answerQuestion(@RequestBody AnswerInputModel input){
        Answer answer = answerService.save(input);
        return ResponseEntity.ok().body(answer);
    }

    @PostMapping("/Answer/edit")
    public ResponseEntity<?> editAnswer(@RequestBody AnswerInputModel input){
        Answer answer = answerService.update(input);
        return ResponseEntity.ok().body(answer);
    }

    @PutMapping("/Answer/like")
    public ResponseEntity<?> likeQuestion(@RequestBody LikeAnswerInputModel input){
        VoteAnswer vote = voteService.saveVoteAnswer(input);
        return ResponseEntity.ok().body(vote);
    }
}
