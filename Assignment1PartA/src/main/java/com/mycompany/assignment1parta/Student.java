
package com.mycompany.assignment1parta;

public class Student {
   
    private String name;
    private int age;
    private String dob;
    private String id;
    private String username;

    public Student(String name, int age, String dob, String id) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.username = name + age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }
    
    public void setUsername() {
        this.username = name + age;
    }

    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {   
        this.age = age;
    }

    public String getDOB() {
        return dob;
    }

    public void setDOB(String dob) {
        this.dob = dob;
    }

    public String getID() {
        return id;
    }
    
    public void setID(String id)    {
        this.id = id;
    }
}
