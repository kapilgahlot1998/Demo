package org.example.start.impl.Controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.example.start.impl.Model.StudentDTO;
import org.example.start.impl.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class StudentController {

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private StudentService studentService;


    @GetMapping("/get")
    public void getStudent(){
        System.out.println("get data");
    }

    @PostMapping("/saveData")
    public void saveStudentData(@RequestBody StudentDTO studentDTO){
        try {
            System.out.println(objectMapper.writeValueAsString(studentDTO));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }


    }

}
