package org.doctorapp.client;

import org.doctorapp.exceptions.DoctorNotFoundException;
import org.doctorapp.model.Doctor;
import org.doctorapp.model.Specialization;
import org.doctorapp.service.DoctorServiceImpl;
import org.doctorapp.service.IDoctorService;

public class User {
    public static void main(String[] args) throws DoctorNotFoundException {
        IDoctorService doctorService=new DoctorServiceImpl();
        Specialization specialization=Specialization.GYNAEC;
        String speciality= specialization.getSpeciality();

        String special=Specialization.GYNAEC.getSpeciality();
        Doctor doctor=new Doctor("Raj", speciality,1000,4,10);
        Doctor doctor3=new Doctor("John", speciality,700,3,2);
        Doctor doctor4=new Doctor("Sheetal", speciality,900,2,6);
        Doctor doctor5=new Doctor("Shalini", speciality,500,5,7);
        Doctor doctor6=new Doctor("Sri", speciality,600,1,1);

        doctorService.addDoctor(doctor);

        Doctor doctor1=new Doctor("Ram", speciality,2000,5,5);
        Doctor doctor2=new Doctor("Rita", speciality,1500,3,9);
        doctorService.updateDoctor(1,3000);
        doctorService.updateDoctor(2,1500);

        System.out.println(doctorService.getAll());
       System.out.println(doctorService.getBySpecialityAndLessfees("Gynaecologist",1000));
    }
}
