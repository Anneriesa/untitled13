package service;
import model.Student;
import model.Teacher;
import model.Type;
import model.User;
import model.StudyGroup;

import java.util.List;

public class StudyGroupService {
    public StudyGroup createStudyGroup(Teacher teacher, List<Student> students) {
        return new StudyGroup(teacher, students);
    }
}