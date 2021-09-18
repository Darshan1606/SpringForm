package com.example.dash.Controller;


import com.example.dash.entity.Form;
import com.example.dash.repository.FormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FormController {

    @Autowired
    FormRepository formRepository;

    @GetMapping("/form")
    public List<Form> getAllForm(){
        return formRepository.findAll();
    }

    @PostMapping("/form")
    public Form saveForm(@RequestBody Form form){
        return formRepository.save(form);
    }

}
