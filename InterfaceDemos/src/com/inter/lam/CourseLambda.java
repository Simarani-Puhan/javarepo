package com.inter.lam;

public class CourseLambda {
    public static void main(String[] args) {
        ICourse webCourse = () -> {
             String[] web={"html","css","bootstrap"};
            return web;
        };
       String[] web=webCourse.showCourses();
       for(String webc:web)
           System.out.println(webc);

       ICourse cloudcourse=()-> new String[]{"azure","aws"};
      for(String cloud: cloudcourse.showCourses())
        System.out.println(cloudcourse);

        ICourse Course = () -> {
            String[] fullstack={"Java","Spring"};
            return fullstack;
        };
        String[] fullstack=webCourse.showCourses();
        for(String JavaCourse:fullstack)
            System.out.println(Course);
    }
}
