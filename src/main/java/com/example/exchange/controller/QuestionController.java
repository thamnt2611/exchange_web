package com.example.exchange.controller;

import com.example.exchange.entity.Question;
import com.example.exchange.entity.VoteQuestion;
import com.example.exchange.model.*;
import com.example.exchange.service.QuestionService;
import com.example.exchange.service.VoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class QuestionController {
    @Autowired
    private QuestionService service;

    @Autowired
    private VoteService voteService;

    @GetMapping("/Question")
    public ResponseEntity<?> getAllQuestions(){
        List<Question> questions = service.findAllQuestions();
        List<QuestionOutputModel> outputQuestions = new ArrayList<>();
        for (Question question : questions){
            QuestionOutputModel q = new QuestionOutputModel(question);
            outputQuestions.add(q);
        }
        return ResponseEntity.ok().body(outputQuestions);
    }

    @GetMapping("/Question/{questionId}/{userId}")
    public ResponseEntity<?> getQuestionById(@PathVariable Integer questionId, @PathVariable Integer userId){
        Question question = service.findQuestionById(questionId);
        if (question == null){
            return ResponseEntity.badRequest().body(new ResultMessageModel(false, "Bug"));
        }
        QuestionOutputModel outputQuestion = new QuestionOutputModel(question, userId);
        return ResponseEntity.ok().body(outputQuestion);
    }

//    @GetMapping("/Question/{keyword}")
//    public ResponseEntity<?> getQuestionById(@PathVariable String keyWord){
//        Question question = service.findQuestionByKeyWord(keyWord);
//        if (question == null){
//            return ResponseEntity.badRequest().body(new ResultMessageModel(false, "Bug"));
//        }
//        QuestionOutputModel outputQuestion = new QuestionOutputModel(question, userId);
//        return ResponseEntity.ok().body(outputQuestion);
//    }

    @PostMapping("/Question")
    public ResponseEntity<?> askQuestion(@RequestBody QuestionInputModel input){
        Question question = service.save(input);
        return ResponseEntity.ok().body(question);
    }

    @PutMapping("/Question/like")
    public ResponseEntity<?> likeQuestion(@RequestBody LikeQuestionInputModel input){
        VoteQuestion vote = voteService.saveVoteQuestion(input);
        return ResponseEntity.ok().body(vote);
    }

    @PutMapping("/users/{userId}/questions/{questionId}")
    public ResponseEntity<?> editQuestion(@PathVariable String userId, @PathVariable String questionId, @RequestBody QuestionInputModel input){
        Question question = service.update(Integer.parseInt(questionId), input);
        return ResponseEntity.ok().body(question);
    }


    @GetMapping("/questions/inactive")
    public ResponseEntity<?> getInactiveQuestions(Pageable page){
        return null;
    }

    @GetMapping("/questions/tagged/{tagName}")
    public ResponseEntity<?> getQuestionByTag(@PathVariable String tagName){
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
