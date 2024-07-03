package com.dto;

public class ObjetoDTO {
	
	
	private int matricula; 
	private String alumno;
	private String carrera;
	
	public ObjetoDTO() {}

	public ObjetoDTO(int matricula, String alumno, String carrera) {
		super();
		this.matricula = matricula;
		this.alumno = alumno;
		this.carrera = carrera;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getAlumno() {
		return alumno;
	}

	public void setAlumno(String alumno) {
		this.alumno = alumno;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	@Override
	public String toString() {
		return "ObjetoDTO [matricula=" + matricula + ", alumno=" + alumno + ", carrera=" + carrera + "]";
	}
	
	

}
