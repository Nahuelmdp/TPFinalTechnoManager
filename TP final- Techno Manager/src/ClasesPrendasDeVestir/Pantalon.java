package ClasesPrendasDeVestir;



import java.util.HashMap;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Clase para definir objetos del tipo remera Hija de clase abstracta
 * PrendaDeVestir y de PrendaInferior
 * 
 * @author Techno Manager
 *
 */
public class Pantalon extends PrendaDeVestir {

	
	private static final long serialVersionUID = 1L;
	
	private boolean esAlCuerpo;

	public Pantalon() {
		super();
		this.esAlCuerpo = false;
	}

	public Pantalon(int marca, String modelo, String color, int tipoDeMaterial, boolean esAlCuerpo, double precio) {
		super(marca, modelo, color, tipoDeMaterial, precio);
		this.esAlCuerpo = esAlCuerpo;
	}

	public boolean isEsAlCuerpo() {
		return esAlCuerpo;
	}
	
	public void setEsAlCuerpo(boolean esAlCuerpo) {
		this.esAlCuerpo = esAlCuerpo;
	}
	
	public String getEsAlCuerpo() {
		String rta = "";
		if(esAlCuerpo) rta = "Es al cuerpo";
		if(!esAlCuerpo) rta = "No es al cuerpo";
		else rta = "No definido";
		return rta;
	}
	
	public boolean getEsAlCuerpoBoolean() {
		return esAlCuerpo;
	}

	@Override
	public String tipoDePrenda() {
		return "Pantalon";
	}

	@Override
	public JSONObject toJSONObject() throws JSONException { 
		JSONObject jsonObject = new JSONObject();
	
		jsonObject = super.toJSONObject();
		jsonObject.put("Es al cuerpo", getEsAlCuerpoBoolean());
	
	return jsonObject;
	}
	
	
	/**
	 * Metodo para importar un pantalon recibiendo un objeto de JSON
	 * @param jsonObject a importar
	 * @return el pantalon
	 * @throws JSONException
	 */
	public static Pantalon fromJSONObject(JSONObject jsonObject) throws JSONException {
		
		String codigo = jsonObject.getString("Codigo");
		int marca = jsonObject.getInt("Marca");
		String modelo = jsonObject.getString("Modelo");
		String color = jsonObject.getString("Color");
		int tipoDeMaterial = jsonObject.getInt("Tipo de material");
		boolean esAlCuerpo = jsonObject.getBoolean("Es al cuerpo");
		double precio = jsonObject.getDouble("Precio");
		HashMap<String, Integer> tallesYStock = TallesYStock.fromJSONObject(jsonObject.getJSONObject("Talles y stock"));		
	
		
		Pantalon pantalon = new Pantalon(marca, modelo, color, tipoDeMaterial, esAlCuerpo, precio);
		pantalon.setCodigo(codigo);
		pantalon.agregarVariosTallesYCantidad(tallesYStock);
		
		return pantalon;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nEs al cuerpo: " + getEsAlCuerpo()+"\n";
	}
}
