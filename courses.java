package com.example.attendancesystem;

public class courses {
    Integer course_id;
    String course_name;
    String teacher_name;

    public courses(Integer course_id, String course_name, String teacher_name) {
        this.course_id = course_id;
        this.course_name = course_name;
        this.teacher_name = teacher_name;
    }

    public courses() {
    }

    public Integer getCourse_id() {
        return course_id;
    }

    public void setCourse_id(Integer course_id) {
        this.course_id = course_id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getTeacher_name() {
        return teacher_name;
    }

    public void setTeacher_name(String teacher_name) {
        this.teacher_name = teacher_name;
    }
}
