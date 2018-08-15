package db;

import models.Lesson;
import models.Student;

public class DBStudent {

    public static void addStudentToLesson(Student student, Lesson lesson){
        student.addLessons(lesson);
        lesson.addStudent(student);
        DBHelper.update(student);
    }



}
