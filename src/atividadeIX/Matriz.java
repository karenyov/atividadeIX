package atividadeIX;

/**
 * @author Karen 9 de mai de 2018
 */
public class Matriz {

	private boolean adjMatrix[][];
	private int nroVertice;

	public String toString() {
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < nroVertice; i++) {
			s.append(i + ": ");
			for (boolean j : adjMatrix[i]) {
				s.append((j ? 1 : 0) + " ");
			}
			s.append("\n");
		}
		return s.toString();
	}

	public void create(int nroVertice) {
		this.nroVertice = nroVertice;
		adjMatrix = new boolean[nroVertice][nroVertice];
	}

	public void addArco(int origem, int destino) {
		adjMatrix[origem][destino] = true;
		adjMatrix[destino][origem] = true;
	}

	public void removeArco(int origem, int destino) {
		adjMatrix[origem][destino] = false;
		adjMatrix[destino][origem] = false;
	}

	public int grauEntrada(int nroVertice) {
		return 0;
	}

	public int grauSaida(int nroVertice) {
		return 0;
	}

	public int grau(int nroVertice) {
		int grau = 0;
		for (int j = 0; j < adjMatrix.length; j++) {
			if (adjMatrix[nroVertice][j])
				grau++;
		}
		return grau;
	}

	public boolean isAdjacente(int nroVerticeA, int nroVerticeB) {
		return adjMatrix[nroVerticeA][nroVerticeB];
	}

	public void print() {
		this.toString();
	}

	public void printPath(int nroVerticeA, int nroVerticeB) {
		for (int i = 0; i < adjMatrix.length; i++) {
			for (int j = 0; j < adjMatrix.length; j++) {

				System.out.println(adjMatrix[i][j]);
				if (nroVerticeA == i && nroVerticeB == j)
					break;
			}
		}
	}

}
