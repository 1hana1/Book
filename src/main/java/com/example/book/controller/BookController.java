package com.example.book.controller;

import com.example.book.entity.User;
import com.example.book.tool.ReadFile;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class BookController {


    @RequestMapping("index")
    public String index(){
        return "index";
    }
    @PostMapping("login")
    @ResponseBody
    public boolean users(@RequestBody User user) {
        User trueuser = new User();
        return trueuser.username.equals(user.username) && trueuser.password.equals(user.password);
    }

    @RequestMapping("book")
    @ResponseBody
    public String book(@RequestParam String name) {
        ReadFile readFile = new ReadFile();
        String str = readFile.readFile(name);
        return str;
    }

}
