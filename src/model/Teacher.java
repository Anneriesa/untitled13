package model;

public class Teacher extends User {
    private int teacherID;

    public Teacher(String firstName, String lastName, String middleName, int teacherID) {
        super(firstName, lastName, middleName);
        this.teacherID = teacherID;
    }

    public int getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(int teacherID) {
        this.teacherID = teacherID;
    }
}
