package com.tpe.app;

import com.tpe.domain.Course;
import com.tpe.repo.CloudRepo;
import com.tpe.repo.LocalRepo;
import com.tpe.repo.Repo;
import com.tpe.service.CourseService;
import com.tpe.service.MeetService;
import com.tpe.service.ZoomService;

public class MyApp {
    public static void main(String[] args) {

        Course course=new Course();
        course.setName("Advanced Java");

        //dersin zoom ile anlatılmasını istiyoruz.
//        ZoomService zoomService=new ZoomService();
//        zoomService.teachCourse(course);

        //dersin meet ile anlatılmasını istiyoruz.
//        MeetService meetService=new MeetService();
//        meetService.teachCourse(course);

        //daha kolay bakım ve geliştirme için:interface
//        CourseService service=new ZoomService();
//        service.teachCourse(course);
//
//        //dersi buluta kaydetmek istiyoruz//locale kaydetmek istersek
//        service.saveCourse(course);

        Repo repo=new CloudRepo();
        CourseService service=new ZoomService(repo);
        service.teachCourse(course);
        service.saveCourse(course);





    }


}
