package com.objects.inheritance;

public class TeamOne extends Project{

    String techstack;

    public TeamOne(String projectName, int durationMonths, String domain, String projectManager, String techstack) {
        super(projectName, durationMonths, domain, projectManager);
        this.techstack = techstack;
    }

    String [] showTechStack(){
        String tech[]={"Java","Python","SQL"};
        return tech;

    }
}
