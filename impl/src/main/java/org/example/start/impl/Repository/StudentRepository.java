package org.example.start.impl.Repository;


import org.example.start.impl.Entity.StudentEntity;
import org.example.start.impl.Model.StudentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {

    @Autowired
    private IStudentRepo iStudentRepo;

    public void saveData(StudentDTO studentDTO){
        iStudentRepo.save(convertStudentDTOToEntity(studentDTO));
    }

    private StudentEntity convertStudentDTOToEntity(StudentDTO studentDTO){

        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setAge(studentDTO.getAge());
        studentEntity.setName(studentDTO.getName());
        studentEntity.setStudentId(studentDTO.getStudentId());

        return studentEntity;
    }
}
