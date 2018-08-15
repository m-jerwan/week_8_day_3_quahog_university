import db.DBHelper;
import db.DBStudent;
import models.*;

public class Runner {

    public static void main(String[] args) {

        Mentor mentor1 = new Mentor("Mike");
        DBHelper.save(mentor1);

        Course course1 = new Course("Ultimate swimming", LevelType.SWIMMING_LEVEL_ONE);
        DBHelper.save(course1);

        Course course2 = new Course("Banking", LevelType.BA);
        DBHelper.save(course2);

        Student student1 = new Student("Stoo", 30, 2, mentor1, course1);
        DBHelper.save(student1);

        Student student2 = new Student("Digi", 25, 44, mentor1, course2);
        DBHelper.save(student2);

        Instructor instructor1 = new Instructor("Alex");
        DBHelper.save(instructor1);

        Lesson lesson1 = new Lesson("Maths", 3, course1, instructor1);
        DBHelper.save(lesson1);

        Lesson lesson2 = new Lesson("Economics", 2, course2, instructor1);
        DBHelper.save(lesson2);

        DBStudent.addStudentToLesson(student1, lesson2);





    }
}
