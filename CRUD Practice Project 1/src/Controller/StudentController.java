/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Dto.StudentDto;
import Model.StudentModel;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class StudentController {
    
    private StudentModel studentModel;
    
    public StudentController()throws Exception{
    
        this.studentModel=new StudentModel();
    }
    
    public String saveStudent(StudentDto studentDto) throws Exception{
    
        String resp=studentModel.saveStudent(studentDto);
        return  resp;
    }
    
    public ArrayList<StudentDto> getAllStudent() throws Exception{
    
        ArrayList<StudentDto> studentDtos= studentModel.getAllStudent();
        return studentDtos;
    }
}
