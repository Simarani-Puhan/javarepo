package com.doctor.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.doctorapp.model.Doctor;


/**
 * Servlet implementation class DoctorServlet
 */
@WebServlet("/doctorServlet")
public class DoctorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoctorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String doctorName=request.getParameter("doctorName");
		String Id=request.getParameter("doctorId");
		Integer doctorId=Integer.parseInt(Id);
		String speciality=request.getParameter("speciality");
		String exp=request.getParameter("experience");
		Integer experience=Integer.parseInt(exp);
		String fee=request.getParameter("fees");
		double fees=Double.parseDouble(fee);
		String rating=request.getParameter("ratings");
		Integer ratings=Integer.parseInt(rating);
	
		
		Doctor doctor=new Doctor();
		doctor.setDoctorName(doctorName);
		doctor.setDoctorId(doctorId);
		doctor.setSpeciality(speciality);
		doctor.setExperience(experience);
		doctor.setFees(fees);
		doctor.setRatings(ratings);
		
		request.setAttribute("doctor",doctor);
		request.setAttribute("doctorName", doctorName);
		request.setAttribute("doctorId", doctorId);
		request.setAttribute("speciality", speciality);
		request.setAttribute("experience", experience);
		request.setAttribute("fees", fees);
		request.setAttribute("ratings", ratings);
		RequestDispatcher dispatcher=request.getRequestDispatcher("docsuccess.jsp");
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
