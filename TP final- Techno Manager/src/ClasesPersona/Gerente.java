package ClasesPersona;

import java.util.Date;

public class Gerente extends Empleado{

	public Gerente() {
		super();
	}

	public Gerente(String nombre, String apellido, String dni, String genero, Date fechaNac, String estadoCivil,
			String legajo, String contraseņa) {
		super(nombre, apellido, dni, genero, fechaNac, estadoCivil, legajo, contraseņa);
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
}
