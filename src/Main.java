import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    static ArrayList<Student> studentList;
    static ArrayList<Subject> subjectList;
    static ArrayList<Teacher> teacherList;
    static ArrayList<StudentClass> studentclassList;
    static Scanner scanner;
    static boolean run;

    public static void main(String[] args) {
        studentList = new ArrayList<>();
        subjectList = new ArrayList<>();
        teacherList = new ArrayList<>();
        studentclassList = new ArrayList<>();
        scanner = new Scanner(System.in);
        run = true;
        while (run == true) {
            doOperation();
            System.out.println("");
        }
    }

    static void doOperation() {
        System.out.println("Select operation:");

        System.out.println("1:exit");

        System.out.println("2:student");

        System.out.println("5:add-subject");
        System.out.println("6:remove-subject");
        System.out.println("7:rename-subject");

        System.out.println("8:add-degree");
        System.out.println("9:change-degree");
        System.out.println("10:remove-degree");

        System.out.println("11:add-teacher");
        System.out.println("12:remove-teacher");
        System.out.println("13:rename-teacher");

        System.out.println("14:add-studentclass");
        System.out.println("15:remove-studentclass");
        System.out.println("16:rename-studentclass");
        System.out.println("17:add-teacher-to-class");
        System.out.println("18:remove-teacher-from-class");
        System.out.println("19:add-student-to-class");
        System.out.println("20:remove-student-from-class");

        System.out.println("21:print-all");
        String ans = scanner.next();
        if (ans.equals("1")) {
            run = false;
        }
        if (ans.equals("2")) {
            studentOperation();
        }
        if (ans.equals("5")) {
            addSubject();
        }
        if (ans.equals("6")) {
            removeSubject();
        }
        if (ans.equals("7")) {
            renameSubject();
        }
        if (ans.equals("8")) {
            addDegree();
        }
        if (ans.equals("9")) {
            changeDegree();
        }
        if (ans.equals("10")) {
            removeDegree();
        }
        if (ans.equals("11")) {
            addTeacher();
        }
        if (ans.equals("12")) {
            removeTeacher();
        }
        if (ans.equals("13")) {
            renameTeacher();
        }
        if (ans.equals("14")) {
            addStudentClass();
        }
        if (ans.equals("15")) {
            removeStudentClass();
        }
        if (ans.equals("16")) {
            renameStudentClass();
        }
        if (ans.equals("17")) {
            addTeacherToClass();
        }
        if (ans.equals("18")) {
            removeTeacherFromClass();
        }
        if (ans.equals("19")) {
            addStudentToClass();
        }
        if (ans.equals("20")) {
            removeStudentFromClass();
        }
        if (ans.equals("21")) {
            print();
        }
    }

    static void studentOperation() {
        System.out.println("Select operation:");
        System.out.println("1:add");
        System.out.println("2:remove");
        System.out.println("3:rename");
        System.out.println("4:print");
        String ans = scanner.next();
        if (ans.equals("1")) {
            addStudent();
        }
        if (ans.equals("2")) {
            removeStudent();
        }
        if (ans.equals("3")) {
            renameStudent();
        }
        if (ans.equals("4")) {
            printStudents();
        }
    }

    static void addStudentToClass () {
        StudentClass studentClass = getStudentClass();
        if (studentClass == null) {
            return;
        }

        Student student = getStudent();
        if (student == null) {
            return;
        }

        studentClass.students.add(student);
    }

    static void removeStudentFromClass() {
        StudentClass studentClass = getStudentClass();
        if (studentClass == null) {
            return;
        }

        Student student = getStudent();
        if (student == null) {
            return;
        }

        studentClass.students.remove(student);
    }

    static void addTeacherToClass() {
        StudentClass studentClass = getStudentClass();
        if (studentClass == null) {
            return;
        }

        Teacher teacher = getTeacher();
        if (teacher == null) {
            return;
        }

        studentClass.teacher = teacher;
    }

    static void removeTeacherFromClass() {
        StudentClass studentClass = getStudentClass();
        if (studentClass == null) {
            return;
        }

        studentClass.teacher = null;
    }

    static StudentClass getStudentClass() {
        System.out.println("Enter studentclass ID:");
        Integer id = scanner.nextInt();
        for (int i = 0; i < studentclassList.size(); i++) {
            StudentClass studentclass = studentclassList.get(i);
            if (studentclass.id.equals(id)) {
                return studentclass;
            }
        }
        System.out.println("Studentclass not found");
        return null;
    }

    static Teacher getTeacher() {
        System.out.println("Enter teacher ID:");
        Integer id = scanner.nextInt();
        for (int i = 0; i < teacherList.size(); i++) {
            Teacher teacher = teacherList.get(i);
            if (teacher.id.equals(id)) {
                return teacher;
            }
        }
        System.out.println("Teacher not found");
        return null;
    }

    static void addStudentClass() {
        StudentClass studentclass = new StudentClass();
        studentclass.assignNewId();
        studentclass.fillName();
        studentclassList.add(studentclass);
    }
    static void removeStudentClass() {
        System.out.println("Enter studentclass ID:");
        Integer id = scanner.nextInt();
        for (int i = 0; i < studentclassList.size(); i++) {
            StudentClass studentclass = studentclassList.get(i);
            if (studentclass.id.equals(id)) {
                System.out.println("Studentclass removed");
                studentclassList.remove(i);
                return;
            }
        }
        System.out.println("Studentclass not found");
    }
    static void renameStudentClass() {
        System.out.println("Enter studentclass ID:");
        Integer id = scanner.nextInt();
        for (int i = 0; i < studentclassList.size(); i++) {
            StudentClass studentclass = studentclassList.get(i);
            if (studentclass.id.equals(id)) {
                studentclass.fillName();
                System.out.println("Studentclass renamed");
                return;
            }
        }
        System.out.println("Studentclass not found");
    }

    static void addTeacher() {
        Teacher teacher = new Teacher();
        teacher.assignNewId();
        teacher.fillName();
        teacherList.add(teacher);
    }

    static void removeTeacher() {
        System.out.println("Enter teacher ID:");
        Integer id = scanner.nextInt();
        for (int i = 0; i < teacherList.size(); i++) {
            Teacher teacher = teacherList.get(i);
            if (teacher.id.equals(id)) {
                System.out.println("Teacher removed");
                teacherList.remove(i);
                return;
            }
        }
        System.out.println("Teacher not found");
    }

    static void renameTeacher() {
        System.out.println("Enter teacher ID:");
        Integer id = scanner.nextInt();
        for (int i = 0; i < teacherList.size(); i++) {
            Teacher teacher = teacherList.get(i);
            if (teacher.id.equals(id)) {
                teacher.fillName();
                System.out.println("Teacher renamed");
                return;
            }
        }
        System.out.println("Teacher not found");
    }

    static void addSubject() {
        Subject subject = new Subject();
        subject.assignNewId();
        subject.fillName();
        subjectList.add(subject);
    }

    static void removeSubject() {
        System.out.println("Enter subject ID:");
        Integer id = scanner.nextInt();
        for (int i = 0; i < subjectList.size(); i++) {
            Subject subject = subjectList.get(i);
            if (subject.id.equals(id)) {
                System.out.println("Subject removed");
                subjectList.remove(i);
                return;
            }
        }
        System.out.println("Subject not found");
    }

    static void renameSubject() {
        System.out.println("Enter subject ID:");
        Integer id = scanner.nextInt();
        for (int i = 0; i < subjectList.size(); i++) {
            Subject subject = subjectList.get(i);
            if (subject.id.equals(id)) {
                subject.fillName();
                System.out.println("Subject renamed");
                return;
            }
        }
        System.out.println("Subject not found");
    }

    static void addStudent() {
        Student student = new Student();
        student.assignNewId();
        student.fillName();
        studentList.add(student);
    }

    static void removeStudent() {
        printStudents();
        Student student = getStudent();
        if (student == null) {
            return;
        }
        studentList.remove(student);
    }

    static void renameStudent() {
        printStudents();
        Student student = getStudent();
        if (student == null) {
            return;
        }
        student.fillName();
    }

    static void addDegree() {
        Degree degree = new Degree();
        degree.assignNewId();

        Student student = getStudent();
        if (student == null) {
            return;
        }

        Subject subject = getSubject();
        if (subject == null) {
            return;
        }

        degree.student = student;
        student.degreeList.add(degree);

        degree.subject = subject;

        degree.fillScore();
    }

    static void changeDegree() {
        Student student = getStudent();
        student.printScores();
        Degree degree = student.getDegree();
        degree.fillScore();
    }

    static void removeDegree() {
        Student student = getStudent();
        student.printScores();
        Degree degree = student.getDegree();
        student.degreeList.remove(degree);
    }


    static Student getStudent() {
        System.out.println("Enter student ID:");
        Integer studentId = scanner.nextInt();
        for (int i = 0; i < studentList.size(); i++) {
            Student student = studentList.get(i);
            if (student.id.equals(studentId)) {
                return student;
            }
        }
        return null;
    }

    static Subject getSubject() {
        System.out.println("Enter subject ID:");
        Integer subjectId = scanner.nextInt();
        for (int i = 0; i < subjectList.size(); i++) {
            Subject subject = subjectList.get(i);
            if (subject.id.equals(subjectId)) {
                return subject;
            }
        }
        return null;
    }


    static void print() {
        printStudents();
        printSubjects();
        printTeachers();
        printStudentClasses();

    }

    static void printStudents() {
        System.out.println("Students:");
        for (int i = 0; i < studentList.size(); i++) {
            Student student = studentList.get(i);
            student.print();
            student.printScores();
        }
    }

    static void printSubjects() {
        System.out.println("Subjects:");
        for (int i = 0; i < subjectList.size(); i++) {
            Subject subject = subjectList.get(i);
            subject.print();
        }
    }

    static void printTeachers() {
        System.out.println("Teachers:");
        for (int i = 0; i < teacherList.size(); i++) {
            Teacher teacher = teacherList.get(i);
            teacher.print();
        }
    }

    static void printStudentClasses() {
        System.out.println("Studentclasses :");
        for (int i = 0; i < studentclassList.size(); i++) {
            StudentClass studentclass = studentclassList.get(i);
            studentclass.print();
        }
    }
}









