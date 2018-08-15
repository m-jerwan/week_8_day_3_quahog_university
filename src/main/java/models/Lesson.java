package models;

import sun.reflect.generics.tree.IntSignature;

import javax.persistence.*;

@Entity
@Table(name = "lessons")
public class Lesson {

    private int id;
    private String title;
    private int classroomNumber;
    private Course course;
    private Instructor instructor;

    public Lesson(){}

    public Lesson(String title, int classroomNumber, Course course, Instructor instructor) {
        this.title = title;
        this.classroomNumber = classroomNumber;
        this.course = course;
        this.instructor = instructor;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    @Column(name = "classroom_number")
    public int getClassroomNumber() {
        return classroomNumber;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setClassroomNumber(int classroomNumber) {
        this.classroomNumber = classroomNumber;
    }

    @ManyToOne
    @JoinColumn(name = "course_id", nullable = false)
    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @ManyToOne
    @JoinColumn(name = "instructor_id", nullable = false)
    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }
}
