package org.doctorapp.service;

import org.doctorapp.exceptions.DoctorNotFoundException;
import org.doctorapp.exceptions.IdNotFoundException;
import org.doctorapp.model.Doctor;
import org.doctorapp.repository.DoctorRepositoryImpl;
import org.doctorapp.repository.IDoctorRepository;

import java.sql.SQLException;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DoctorServiceImpl implements IDoctorService{

    private IDoctorRepository doctorRepository=new DoctorRepositoryImpl();

    @Override
    public void addDoctor(Doctor doctor) {
      doctorRepository.addDoctor(doctor);
    }

    @Override
    public void updateDoctor(int doctorId, double fees) {
        doctorRepository.updateDoctor(doctorId, fees);

    }

    @Override
    public void deleteDoctor(int doctorId) {

    }

    @Override
    public Doctor getById(int doctorId) throws IdNotFoundException, SQLException {
        Doctor doctor=doctorRepository.findById(doctorId);
        if(doctor==null)
            throw new IdNotFoundException("Invalid Id");
        return doctor;
    }

    @Override
    public List<Doctor> getAll() {
        List<Doctor>doctorList=doctorRepository.findAll();
        return doctorList;
    }

    @Override
    public List<Doctor> getBySpeciality(String speciality) throws DoctorNotFoundException {
        List<Doctor>doctorList=doctorRepository.findBySpeciality(speciality);
        if (doctorList.isEmpty())
            throw new DoctorNotFoundException("Doctor with this speciality not found");
        Collections.sort(doctorList,(d1,d2)->d1.getDoctorName().compareTo(d2.getDoctorName()));
        return doctorList;
    }

    @Override
    public List<Doctor> getBySpecialityAndExp(String speciality, int experience) throws DoctorNotFoundException {
        List<Doctor>doctorList=doctorRepository.findBySpecialityAndExp(speciality,experience);
        if (doctorList.isEmpty())
            throw new DoctorNotFoundException("Doctor with this speciality and exp not found");
        Collections.sort(doctorList,(d1,d2)->((Integer)(d2.getExperience())).compareTo(d1.getExperience()));
        return doctorList;
    }

    @Override
    public List<Doctor> getBySpecialityAndLessfees(String speciality, double fees) throws DoctorNotFoundException {
        List<Doctor>doctorList=doctorRepository.findBySpecialityAndLessfees(speciality, fees);
        if (doctorList.isEmpty())
            throw new DoctorNotFoundException("Doctor with this speciality and exp not found");
        Collections.sort(doctorList,(d1,d2)->((Double)(d2.getFees())).compareTo(d1.getFees()));
        return doctorList;
    }

    @Override
    public List<Doctor> getBySpecialityAndRatings(String speciality, int ratings) throws DoctorNotFoundException {
        List<Doctor>doctorList=doctorRepository.findBySpecialityAndRatings(speciality,ratings);
        if (doctorList.isEmpty())
            throw new DoctorNotFoundException("Doctor with this speciality and exp not found");
        Collections.sort(doctorList,(d1,d2)->((Integer)(d2.getRatings())).compareTo(d1.getRatings()));
        return doctorList;
    }

    @Override
    public List<Doctor> getBySpecialityAndNameContains(String speciality, String doctorName) throws DoctorNotFoundException {
        List<Doctor>doctorList=doctorRepository.findBySpecialityAndNameContains(speciality,doctorName);
        if (doctorList.isEmpty())
            throw new DoctorNotFoundException("Doctor with this speciality and exp not found");
        Collections.sort(doctorList,(d1,d2)->((String)(d2.getDoctorName())).compareTo(d1.getDoctorName()));
        return doctorList;
    }
}
