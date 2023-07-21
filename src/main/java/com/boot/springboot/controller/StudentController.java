package com.boot.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StudentController {

        @RequestMapping(value = "/student" ,method = RequestMethod.GET)
        public String Student() {
            return "student";
        }

    }

