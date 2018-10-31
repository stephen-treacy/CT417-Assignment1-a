
package com.mycompany.assignment1parta;

import java.util.ArrayList;

public class Module {
    public String name;
    private String id;
    private ArrayList<Student> students = new ArrayList<Student>();
    private ArrayList<Course> courses = new ArrayList<Course>();

    public Module(String name, String id, Student students, Course courses)
    {
        this.name = name;
        this.id = id;
        this.students.add(students);
        this.courses.add(courses);
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public Student[] getStudents() {
        Student[] x = new Student[students.size()];
        for(int i = 0; i < students.size(); i++){
            x[i] = students.get(i);
        }
        return x;
    }
    
     public void setStudents(Student[] stu) {
        for(int i = 0; i < stu.length; i++) {
            this.students.add(stu[i]);
        }
    }
     
     public Course[] getCourses() {
         Course[] x = new Course[courses.size()];
        for(int i = 0; i < courses.size(); i++){
            x[i] = courses.get(i);
        }
        return x;
    }

    public void setCourses(Course[] cou) {
        for(int i = 0; i < cou.length; i++){
            this.courses.add(cou[i]);
        }
    }

    

}