package com.example.exchange.controller;

import com.example.exchange.entity.Question;
import com.example.exchange.model.QuestionInputModel;
import com.example.exchange.service.QuestionService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest(QuestionController.class)
class QuestionControllerTest {
    @Autowired
    private MockMvc mvc;

    @Autowired
    private ObjectMapper objectMapper;

    @MockBean
    private QuestionService service;

    @Test
    void askQuestion() throws Exception {
        QuestionInputModel input = new QuestionInputModel();
        input.setTitle("Math website for children under 10 years old");
        input.setContent("My child hates studying math. I failed to find a funny but effective website for him to learn. Help me, Thanks!");
        List<String> tags = new ArrayList<>();
        tags.add("teaching");
        input.setTagNames(tags);
        input.setUserId(5);

        mvc.perform(post("/questions/ask")
                .contentType("application/json")
                .content(objectMapper.writeValueAsString(input)))
                .andExpect(status().isOk());
    }

    @Test
    void editQuestion() {
    }
}