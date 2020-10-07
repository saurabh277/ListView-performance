package com.example.listviewperformance;

import java.util.ArrayList;
import java.util.Random;

public class Course {
    String name;
    String teacherName;
    int lectures;

    public Course(String name, String teacherName, int lectures) {
        this.name = name;
        this.teacherName = teacherName;
        this.lectures = lectures;
    }

    public String getName() {
        return name;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public int getLectures() {
        return lectures;
    }
    public static final String[] teachers={
         "messi","ronaldo","kaka","neymar","lewandoski","beckham"
    };
    public static final String[] courseName={
         "football","cricket","golf","boxing","swimming","hockey"
    };
    public static ArrayList<Course> generateRandomCourses(int n){
    ArrayList<Course> courses = new ArrayList<>();
        Random r= new Random();
    for(int i=0; i<n; i++){
        Course course = new Course(
                teachers[r.nextInt(6)],
                courseName[r.nextInt(6)],
                10 + r.nextInt(10)
        );
        courses.add(course);

        }
    return courses;
    }
}
