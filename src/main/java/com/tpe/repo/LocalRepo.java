package com.tpe.repo;

import com.tpe.domain.Course;

public class LocalRepo implements Repo{

    @Override
    public void save(Course course) {
        System.out.println(course.getName()+" dersi locale kaydediliyor...");
    }
}
