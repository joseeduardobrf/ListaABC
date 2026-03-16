public class Vetor {

    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        elementos = new String[capacidade];
        tamanho = 0;
    }

    public void adiciona(String elemento) {
        elementos[tamanho] = elemento;
        tamanho++;
    }

    public int tamanho() {
        return tamanho;
    }


    public boolean estaVazia() {
        return tamanho == 0;
    }


    public String ultimo() {
        if (estaVazia()) {
            throw new IllegalStateException("Vetor vazio");
        }
        return elementos[tamanho - 1];
    }


    public void imprimeUmPorLinha() {
        for (int i = 0; i < tamanho; i++) {
            System.out.println(elementos[i]);
        }
    }


    public boolean contem(String elemento) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].equals(elemento)) {
                return true;
            }
        }
        return false;
    }


    public void limpar() {
        tamanho = 0;
    }


    public int contarOcorrencias(String elemento) {

        int contador = 0;

        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].equals(elemento)) {
                contador++;
            }
        }

        return contador;
    }


    public boolean substituir(String antigo, String novo) {

        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].equals(antigo)) {
                elementos[i] = novo;
                return true;
            }
        }

        return false;
    }

    public String toString() {

        String resultado = "[";

        for (int i = 0; i < tamanho; i++) {

            resultado += elementos[i];

            if (i < tamanho - 1) {
                resultado += ", ";
            }

        }

        resultado += "]";
        return resultado;
    }
}