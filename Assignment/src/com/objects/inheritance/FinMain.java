package com.objects.inheritance;

public class FinMain {
    public static void main(String[] args) {
        TeamOne teamOne=new TeamOne("Policy Bazar",12,"Financial","AB","Java fullstack");
        String[]tools = teamOne.showTechStack();
        for(String tech:tools){
            System.out.println(tech);
        }
        TeamTwo teamTwo=new TeamTwo("Policy Bazar",12,"Financial","AB",new String[]{"Java","Python","SQL"});

    }
}
