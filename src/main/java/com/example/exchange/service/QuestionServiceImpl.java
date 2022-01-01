package com.example.exchange.service;

import com.example.exchange.entity.*;
import com.example.exchange.model.QuestionInputModel;
import com.example.exchange.model.TagModel;
import com.example.exchange.repository.QuestionRepository;
import com.example.exchange.repository.TagRepository;
import com.example.exchange.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService{
    private QuestionRepository questionRepository;
    private TagRepository tagRepository;
    private UserRepository userRepository;

    @Autowired
    public QuestionServiceImpl(QuestionRepository questionRepository, TagRepository tagRepository, UserRepository userRepository) {
        this.questionRepository = questionRepository;
        this.tagRepository = tagRepository;
        this.userRepository = userRepository;
    }

    @Override
    public List<Question> findAllQuestions() {
        return this.questionRepository.findAll();
    }

    @Override
    public Question save(QuestionInputModel input){
        Question question = new Question();
        question.setTitle(input.getTitle());
        question.setContent(input.getContent());
        question.setScore(0);
        question.setCreatedTime(new Date());

        List<Tag> tagList = new ArrayList<Tag>();
        for(TagModel inTag : input.getTags()){
            //TODO: Phai thay bang tim bang id
            Tag tag = tagRepository.findByName(inTag.getName());
            tagList.add(tag);
        }
        question.setTags(tagList);

        User user = userRepository.findByUserId(input.getUserId());
        question.setUser(user);
        question.setAnswers(new ArrayList<Answer>());
        question.setVotes(new ArrayList<VoteQuestion>());

        questionRepository.save(question);
        return question;
    }

    @Override
    public Question update(Integer questionId, QuestionInputModel input){
        Question question = questionRepository.findByQuestionId(questionId);
        question.setTitle(input.getTitle());
        question.setContent(input.getContent());

        List<Tag> tagList = new ArrayList<Tag>();
        for(TagModel inTag : input.getTags()){
            //TODO: Phai thay bang tim bang id
            Tag tag = tagRepository.findByName(inTag.getName());
            tagList.add(tag);
        }
        question.setTags(tagList);
        questionRepository.save(question);
        return question;
    }

    @Override
    public Question findQuestionById(Integer questionId) {
        Question question = questionRepository.findByQuestionId(questionId);
        return question;
    }

    @Override
    public Question findQuestionByKeyWord(String keyWord) {
        return null;
    }
}
