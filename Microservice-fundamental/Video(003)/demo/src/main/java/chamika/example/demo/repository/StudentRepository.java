package chamika.example.demo.repository;

import chamika.example.demo.model.Student;
import org.springframework.data.repository.Repository;

public interface StudentRepository extends Repository<Student, Integer> {
  Student save(Student student);
}
