package com.doctorApp.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.doctorApp.model.Doctor;

import com.doctorApp.service.DoctorServiceImpl;
import com.doctorApp.service.IDoctorService;

/**
 * Servlet implementation class AddServlet
 */
@WebServlet("/addServlet")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
    IDoctorService doctorservice=new DoctorServiceImpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String doctorName=request.getParameter("doctorName");
		String Id=request.getParameter("doctorId");
		Integer doctorId=Integer.parseInt(Id);
		String speciality=request.getParameter("speciality");
		String fee=request.getParameter("fees");
		Double fees=Double.parseDouble(fee);
		String rating=request.getParameter("ratings");
		Integer ratings=Integer.parseInt(rating);
		String exp=request.getParameter("experience");
		Integer experience=Integer.parseInt(exp);
		
		Doctor doctor=new Doctor();
		doctor.setDoctorId(doctorId);
		doctor.setDoctorName(doctorName);
		doctor.setSpeciality(speciality);
		doctor.setFees(fees);
		doctor.setRatings(ratings);
		doctor.setExperience(experience);
		
		doctorservice.addDoctor(doctor);
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("updateDoc.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
