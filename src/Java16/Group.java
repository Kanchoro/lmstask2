package Java16;

import java.util.Arrays;

public class Group {
    private Long id;
    private String groupName;
    private Student[] students;
    private  int countStudent;

    public Group() {
        this.students = new Student[10];
        this.countStudent=0;
    }

    public Group(Long id, String groupName, Student[] students, int countStudent) {
        this.id = id;
        this.groupName = groupName;
        this.students = students;
        this.countStudent = countStudent;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getCountStudent() {
        return countStudent;
    }

    public void setCountStudent(int countStudent) {
        this.countStudent = countStudent;
    }

    public void  addStudent(Student student){
        if (countStudent < students.length) {
            students[countStudent++] = student;
            System.out.println("Student added: " + student);
        } else {
            System.out.println("No space available to add more students.");
        }

    }
    public void  getAllStudent(){
        if (countStudent == 0) {
            System.out.println("No students in the group.");
            return;
        }
        System.out.println("Students in the group:");
        for (int i = 0; i < countStudent; i++) {
            System.out.println(students[i]);
        }
    }
    public Student getStudentById(Long studentId ){
        for (int i = 0; i < countStudent; i++) {
            if (students[i].getId().equals(studentId)) {
                return students[i];
            }
        }
        System.out.println("Student not found with ID: " + studentId);
        return null;
    }
    public void deleteStudent(Long studentId ){
        for (int i = 0; i < countStudent; i++) {
            if (students[i].getId().equals(studentId)) {
                // Сдвигаем оставшиеся элементы влево
                for (int j = i; j < countStudent - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[--countStudent] = null;  // Уменьшаем количество студентов и удаляем последний элемент
                System.out.println("Student deleted with ID: " + studentId);
                return;
            }
        }
        System.out.println("Student not found with ID: " + studentId);
    }
    public void updateStudent(Long studentId , Student newStudent){
        for (int i = 0; i < countStudent; i++) {
            if (students[i].getId().equals(studentId)) {
                students[i] = newStudent;
                System.out.println("Student updated: " + Arrays.toString(new Student[]{newStudent}));
                return;
            }
        }
        System.out.println("Student not found with ID: " + Arrays.toString(new Long[]{studentId}));
    }


}
