package com.example.exchange.repository;

import com.example.exchange.entity.Question;
import com.example.exchange.entity.Tag;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface QuestionRepository extends CrudRepository<Question, Integer> {
    List<Question> findByTagsIn(List<Tag> tags);
    List<Question> findByUser_UserId(String userId);
    List<Question> findAll();
    Question findByQuestionId(Integer id);

//    @Query(value = "UPDATE question q SET q.title = ?  WHERE q.question_id = 94;")
//    Question updateQuestion(Question question);
}
