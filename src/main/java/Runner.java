import db.DBHelper;
import models.*;

public class Runner {

    public static void main(String[] args) {

        Mentor mentorMike = new Mentor("Mike");
        DBHelper.save(mentorMike);

        Course courseSwimming = new Course("Ultimate swimming", LevelType.SWIMMING_LEVEL_ONE);
        DBHelper.save(courseSwimming);

        Student studentStoo = new Student("Stoo", 30, 2, mentorMike, courseSwimming);
        DBHelper.save(studentStoo);

        Instructor instructor1 = new Instructor("Alex");
        DBHelper.save(instructor1);

        Lesson lessonMath = new Lesson("Maths", 3, courseSwimming, instructor1);
        DBHelper.save(lessonMath);






    }
}
