package com.codekul.EmailDemo.controller;


import com.codekul.EmailDemo.model.Stud;
import com.codekul.EmailDemo.repository.StudRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by pooja on 29/11/17.
 */

@RestController
public class StudController {

    @Autowired
    StudRepo studRepo;


    @PostMapping("/saveStud")
    public String saveStudent(@RequestBody Stud stud){
        studRepo.save(stud);
        return "Data Inserted";
    }

    @GetMapping("/getByEmail/{email:.+}")
    public Stud getByEmail(@PathVariable String email){
        Stud stud=studRepo.findByEmail(email);
        return stud;
    }
}
