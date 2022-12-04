package com.sqstest;


import com.config.InterceptAnn;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @InterceptAnn(keys = "new")
    @GetMapping("/send")
    public String send(String message){
        System.out.println();
        return "sent";
    }

}
