public class TesteVetor5 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        vetor.adiciona("Java");
        vetor.adiciona("Python");
        vetor.adiciona("Java");
        vetor.adiciona("Java");

        System.out.println("Ocorrências de Java: " + vetor.contarOcorrencias("Java"));
    }
}