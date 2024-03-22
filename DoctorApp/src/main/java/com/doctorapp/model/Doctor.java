package com.doctorapp.model;

public class Doctor {
	 
	    private  String doctorName;
	    private Integer doctorId;
	    private String speciality;
	    private int experience;
	    private double fees;
	    private int ratings;
	    
	    
	    
		public Doctor() {
			super();
		}



		public Doctor(String doctorName, Integer doctorId, String speciality, int experience, double fees,
				int ratings) {
			super();
			this.doctorName = doctorName;
			this.doctorId = doctorId;
			this.speciality = speciality;
			this.experience = experience;
			this.fees = fees;
			this.ratings = ratings;
		}



		public String getDoctorName() {
			return doctorName;
		}



		public void setDoctorName(String doctorName) {
			this.doctorName = doctorName;
		}



		public Integer getDoctorId() {
			return doctorId;
		}



		public void setDoctorId(Integer doctorId) {
			this.doctorId = doctorId;
		}



		public String getSpeciality() {
			return speciality;
		}



		public void setSpeciality(String speciality) {
			this.speciality = speciality;
		}



		public int getExperience() {
			return experience;
		}



		public void setExperience(int experience) {
			this.experience = experience;
		}



		public double getFees() {
			return fees;
		}



		public void setFees(double fees) {
			this.fees = fees;
		}



		public int getRatings() {
			return ratings;
		}



		public void setRatings(int ratings) {
			this.ratings = ratings;
		}



		@Override
		public String toString() {
			return "Doctor [doctorName=" + doctorName + ", doctorId=" + doctorId + ", speciality=" + speciality
					+ ", experience=" + experience + ", fees=" + fees + ", ratings=" + ratings + "]";
		}
	    
		

}
