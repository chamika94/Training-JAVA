package chamika.example.demo.servicer;

import chamika.example.demo.model.Student;
import chamika.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentRepository studentRepository;

    @Override
    public Student save(Student student) {
       return studentRepository.save(student);
    }
}
