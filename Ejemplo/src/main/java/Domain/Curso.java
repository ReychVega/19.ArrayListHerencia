/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import java.util.ArrayList;

public class Curso {

	private ArrayList<Profesor>  profesores;
	private ArrayList<Estudiante> estudiantes;
	private int idCurso;
	private String nombreCurso;
	
	
	public Curso() {
		this.profesores=new ArrayList<>();
		this.estudiantes=new ArrayList<>();
		this.idCurso=0;
	} // constructor default
	
	public Curso(ArrayList<Profesor> profesores, int idCurso, String nombreCurso) {
		this.profesores=profesores;
		this.estudiantes=new ArrayList<>();
		this.idCurso=idCurso;
		this.nombreCurso=nombreCurso;
	} // constructor sobrecargado

	public ArrayList<Profesor> getProfesores() {
		return profesores;
	}

	public void setProfesores(ArrayList<Profesor> profesores) {
		this.profesores = profesores;
	}

	public ArrayList<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}
	
	public void addEstudiante(Estudiante estudiante) {
		this.estudiantes.add(estudiante);
	}
	
	public void addProfesor(Profesor profesor) {
		this.profesores.add(profesor);
	}

	public int getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}

	public String getNombreCurso() {
		return nombreCurso;
	}

	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}

	@Override
	public String toString() {
		return "Curso "+ nombreCurso +" [Profesores=" + profesores + ",\nEstudiantes=" + estudiantes + "]";
	}


} // fin curso
