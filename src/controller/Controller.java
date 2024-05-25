package controller;
import model.Teacher;
import model.Student;
import model.StudyGroup;
import service.StudyGroupService;

import java.util.List;
import java.util.ArrayList;

public class Controller {
    private StudyGroupService studyGroupService;

    public Controller() {
        this.studyGroupService = new StudyGroupService();
    }

    // Новый метод для создания учебной группы
    public StudyGroup createStudyGroup(int teacherId, List<Integer> studentIds) {
        Teacher teacher = getTeacherID(teacherId);
        List<Student> students = getStudentsByIds(studentIds);
        return studyGroupService.createStudyGroup(teacher, students);
    }

    // Пример метода для получения преподавателя по id
    private Teacher getTeacherID(int teacherId) {
        return new Teacher("Marina", "Osina","Osipovna",3);
    }

    // Пример метода для получения списка студентов по их id
    private List<Student> getStudentsByIds(List<Integer> studentIds) {
        List<Student> students = new ArrayList<>();
        for (Integer id : studentIds) {
            students.add(new Student("Grisha", "Pupkin","Ivanovich",2));
        }
        return students;
    }


    public static void main(String[] args) {
        Controller controller = new Controller();

        int teacherId = 1;
        List<Integer> studentIds = List.of(2,1,3);

        StudyGroup studyGroup = controller.createStudyGroup(teacherId, studentIds);
        System.out.println("Созданная учебная группа: " + studyGroup);
    }
}