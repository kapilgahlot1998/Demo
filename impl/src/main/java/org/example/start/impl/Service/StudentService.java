package org.example.start.impl.Service;

import org.example.start.impl.Model.StudentDTO;
import org.example.start.impl.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public void saveStudentData(StudentDTO studentDTO) {
        studentRepository.saveData(studentDTO);
    }
}
