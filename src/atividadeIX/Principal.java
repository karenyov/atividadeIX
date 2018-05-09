package atividadeIX;

/**
 * @author Karen 9 de mai de 2018
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Matriz matriz = new Matriz();
		matriz.create(4);
		matriz.addArco(0, 1);
		matriz.addArco(0, 2);
		matriz.addArco(1, 2);
		matriz.addArco(2, 0);
		matriz.addArco(2, 3);
		
		System.out.println(matriz.toString());

	}

}
