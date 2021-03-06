package ClasesPersona;




import org.json.JSONException;
import org.json.JSONObject;

/**
 * Clase gerente que extiende de empleado.
 * 
 * @author Nahuel
 *
 */
public class Gerente extends Empleado {


	private static final long serialVersionUID = 1L;

	public Gerente() {
		super();
	}
	
	public Gerente(String nombre, String apellido, String legajo, String contraseņa) {
		super(nombre, apellido, legajo, contraseņa);
	}

	public Gerente(String nombre, String apellido, String dni, int genero, String fechaNac, int estadoCivil,
			String legajo, String contraseņa) {
		super(nombre, apellido, dni, genero, fechaNac, estadoCivil, legajo, contraseņa);
	}

	@Override
	public String toString() {
		return super.toString() + "\nTipo de empleado: " + tipoEmpleado()+"\n";
	}

	@Override
	public String tipoEmpleado() {
		return "Gerente";
	}
	
	@Override
	public JSONObject toJSONObject() throws JSONException { 
		return super.toJSONObject();
	}

	/**
	 * Metodo para importar un gerente desde un objeto JSON
	 * @param jsonObject a importar
	 * @return el gerente
	 * @throws JSONException
	 */
	public static Gerente JSONObjectToGerente(JSONObject jsonObject) throws JSONException { 
		
		String nombre = jsonObject.getString("Nombre");
		String apellido = jsonObject.getString("Apellido");
		String dni = jsonObject.getString("DNI");
		Integer genero = jsonObject.getInt("Genero");
		String fechaNac = jsonObject.getString("Fecha de nac");
		Integer estadoCivil = jsonObject.getInt("Estado civil");
		String legajo = jsonObject.getString("Legajo");
		String contraseņa = jsonObject.getString("Contraseņa");
		
		Gerente gerente = new Gerente(nombre, apellido, dni, genero, fechaNac, estadoCivil, legajo, contraseņa);
			
		return gerente;
		}

}
