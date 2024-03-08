package com.objects.inheritance;

public class Project {

         String projectName;
         int durationMonths;
         String domain;
         String projectManager;

    public Project(String projectName, int durationMonths, String domain, String projectManager) {
        this.projectName = projectName;
        this.durationMonths = durationMonths;
        this.domain = domain;
        this.projectManager = projectManager;
    }

    void showProjectDetails(){
             System.out.println("ApnaKart"+projectName);
             System.out.println(12+durationMonths);
             System.out.println("Finance"+domain);
             System.out.println("Ram"+projectManager);


         }
}
