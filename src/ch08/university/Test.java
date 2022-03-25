package ch08.university;


public class Test {

	public static void main(String[] args) {
        Classroom zeminKat = new Classroom();
            zeminKat.setFloor(0);
            zeminKat.setNo(2);

        Department departman2 = new Department();
        departman2.name = "Philosopy";

        Professor p2 = new Professor();
        p2.name = "Aynur Gulturk";

        Professor p3 = new Professor();
        p3.name = "Dogan Gulturk";

        Course course2 = new Course();
        course2.name = "Ethics";

        Course course3 = new Course();
        course3.name = "Ethics";


        Student student2 = new Student();
        student2.name = "Dogukan Gulturk";

        Student student3 = new Student();
        student3.name = "Aleyna Gulturk";

        Student student4 = new Student();
        student4.name = "Mehmet Gulturk";

        departman2.head = p2;
        p2.department = departman2;

        course2.department = departman2;
        course3.department = departman2;
        departman2.courses = new Course[100];
        departman2.courses[0] = course2;
        departman2.courses[1] = course3;

        course2.teacher = p2;
        p2.coursesGiven = new Course[5];
        p2.coursesGiven[0] = course2;

        course3.teacher = p3;
        p3.coursesGiven = new Course[5];
        p3.coursesGiven[0] = course3;

        p2.advisee = new Student[10];
        p2.advisee[0] = student2;
        student2.advisor = p2;

        p3.advisee = new Student[10];
        p3.advisee[0] = student3;
        student3.advisor = p3;

        p3.advisee = new Student[10];
        p3.advisee[0] = student4;
        student4.advisor = p3;

        student2.coursesTaken = new Course[5];
        student2.coursesTaken[0] = course2;

        student3.coursesTaken = new Course[5];
        student3.coursesTaken[0] = course3;

        student4.coursesTaken = new Course[5];
        student4.coursesTaken[0] = course3;
        student4.coursesTaken[1] = course2;

        course2.students = new Student[100];
        course2.students[0] = student2;

        course3.students = new Student[100];
        course3.students[0] = student3;

        System.out.println("Ogrencinin ilk dersinin bulundugu departmanın basındaki zat : " + student2.coursesTaken[0].teacher.department.head.name);
        System.out.println("Cokk uzun yazmaya usendim." + p3.advisee[0].coursesTaken[1].teacher.department.head.name);


		Department department1 = new Department();
		department1.name = "Software Engineering";

        Professor professor1 = new Professor();
        professor1.name = "Ahmet Arslan";

        Course course1 = new Course();
        course1.name = "Int. to Software Engineering";

        Student student1 = new Student();
        student1.name = "Akin Kaldiroglu";

        // Head of Software Engineering department is Ahmet Arslan and consequently his department is Software Engineering.
        department1.head = professor1;
        professor1.department = department1;

        // Department of Int. to Software Engineering course is Software Engineering and consequently the course
        // Int. to Software Engineering belongs to Software Engineering department.
        course1.department = department1;
        department1.courses = new Course[100];
        department1.courses[0] = course1;

        course1.teacher = professor1;
        professor1.coursesGiven = new Course[5];
        professor1.coursesGiven[0] = course1;

        professor1.advisee = new Student[10];
        professor1.advisee[0] = student1;
        student1.advisor = professor1;

        student1.coursesTaken = new Course[7];
        student1.coursesTaken[0] = course1;

        course1.students = new Student[100];
        course1.students[0] = student1;

        System.out.println("Name of student student1's first course is " + student1.coursesTaken[0].name);
        System.out.println("Name of student student1's first course's professor is " + student1.coursesTaken[0].teacher.name);
        System.out.println("Name of student student1's first course's professor's department is " + student1.coursesTaken[0].teacher.department.name);
	}
}
