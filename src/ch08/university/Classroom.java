package ch08.university;

public class Classroom {
    private int floor;
    private int no;
    private Course[] courses;

    void setFloor(int floor) {
        this.floor = floor;
    }

    void setNo(int no) {
        this.no = no;
    }

    void setCourses(Course[] courses) {
        this.courses = courses;
    }
}
