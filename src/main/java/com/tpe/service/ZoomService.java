package com.tpe.service;

import com.tpe.domain.Course;
import com.tpe.repo.CloudRepo;
import com.tpe.repo.LocalRepo;
import com.tpe.repo.Repo;

public class ZoomService implements CourseService{


    private Repo repo;

    public ZoomService(Repo repo){
        this.repo = repo;
    }

    @Override
    public void teachCourse(Course course) {
        System.out.println(course.getName()+" dersi Zoom ile anlatılıyor...");
    }

    //save için repo objesine ihtiyacım var
    @Override
    public void saveCourse(Course course) {

        repo.save(course);

    }
}
