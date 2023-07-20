package Main;

import java.util.ArrayList;

import Domain.Curso;
import Domain.Estudiante;
import Domain.Persona;
import Domain.Profesor;

public class Main {

	public static void main(String[] args) {
		
		Persona persona=new Persona("Pedro", "Mora");
		//System.out.println(persona);
		
		Estudiante estudiante=new Estudiante("C1234", "Maria", "Solano");
		//System.out.println(estudiante);
		
		Profesor profesor=new Profesor("Adjunto", "Felipe", "Mora");
		//System.out.println(profesor);
		
		Persona p1=new Estudiante("C4321", "Jose", "Solano");
		//System.out.println(p1);
		
		Persona p2=new Profesor("Adjunto", "Miguel", "Mora");
		//System.out.println(p2.toString());
		
		ArrayList<Profesor> profesores=new ArrayList<>();
		profesores.add(profesor);
		profesores.add(new Profesor("Invitado", "Nelson", "Mendez"));
		
		Curso curso=new Curso(profesores, 1, "Programacion II");
		curso.addEstudiante(estudiante);
		curso.addEstudiante(new Estudiante());
		System.out.println(curso.toString());
		

	} // main

} // fin clase
