package Java16;

public class main {
    public static void main(String[] args) {
        Group group = new Group(1L, "Math Group", new Student[10], 0);

        // Добавление студентов
        group.addStudent(new Student(1L, "Alice", "Math"));
        group.addStudent(new Student(2L, "Bob", "Math"));

        // Вывод всех студентов
        group.getAllStudent();

        // Получение студента по ID
        Student student = group.getStudentById(1L);
        if (student != null) {
            System.out.println("Found student: " + student);
        }

        // Обновление студента
        group.updateStudent(1L, new Student(1L, "Alice Johnson", "Advanced Math"));

        // Удаление студента
        group.deleteStudent(2L);

        // Список всех студентов после изменений
        group.getAllStudent();
    }
}
