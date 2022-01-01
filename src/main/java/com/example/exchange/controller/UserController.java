package com.example.exchange.controller;

import com.example.exchange.entity.User;
import com.example.exchange.model.*;
import com.example.exchange.service.UserService;
import com.example.exchange.validator.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class UserController {
    @Autowired
    private UserService userService;

//    @Autowired
//    private SecurityService securityService;

    @Autowired
    private UserValidator userValidator;

    @GetMapping("/User")
    public ResponseEntity<?> getAllUsers(Pageable page){
        List<User> users = userService.findAllUsers();

        return ResponseEntity.ok().body(users);
    }

    @PostMapping("/User/SignUp")
    public ResponseEntity<ResultMessageModel> signUp(@RequestBody UserSignUpInputModel input, BindingResult bindingResult) {
        User user = new User();
        user.setUserName(input.getUsername());
        user.setPassword(input.getPassword());
        user.setEmail(input.getEmail());

        ResultMessageModel resultMessageModel = new ResultMessageModel();
        userValidator.validate(user, bindingResult);
        if(bindingResult.hasErrors()){
            resultMessageModel.setValid(false);
            return ResponseEntity.badRequest().body(resultMessageModel);
        }
        userService.save(user);
        resultMessageModel.setValid(true);
        return ResponseEntity.ok().body(resultMessageModel);
    }

    // TODO: Sua phan frontend
    @PostMapping("/User/SignIn")
    public ResponseEntity<?> signIn(@RequestBody UserSignInInputModel input, BindingResult bindingResult) {
        User user = userService.authenticateUser(input.getUserName(), input.getPassWord());
        if(user == null){
            return ResponseEntity.badRequest().body(new ResultMessageModel(false, "Username or Password is wrong"));
        }
        UserOutputModel output = new UserOutputModel(user);
        return ResponseEntity.ok().body(output);
    }

    @PutMapping("/User") // TODO: test khi co frontend
    public ResponseEntity<?> editProfile(@RequestBody UserEditProfileInputModel input){
        User user = userService.update(input);
        return ResponseEntity.ok().body(user);
    }

    @GetMapping("/User/{id}")
    public ResponseEntity<?> viewProfile(@PathVariable Integer id){
        User user = userService.findByUserId(id);
        if(user == null){
            return ResponseEntity.badRequest().body(new ResultMessageModel(false, "Bug"));
        }
        UserOutputModel output = new UserOutputModel(user);
        return ResponseEntity.ok().body(output);
    }

    @GetMapping("/users/{id}/questions")
    public ResponseEntity<?> getUserQuestions(@PathVariable String id, Pageable page){
        return null;
    }

    @PostMapping("users/login")
    public ResponseEntity<?> login(){
        return null;
    }

    @PostMapping("/users/signup")
    public ResponseEntity<?> signup(){
        return null;
    }
}
