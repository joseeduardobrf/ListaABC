public class TesteVetor1 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        vetor.adiciona("Java");
        vetor.adiciona("Python");
        vetor.adiciona("C++");

        System.out.println("Tamanho: " + vetor.tamanho());
        System.out.println("Vetor: " + vetor);

        vetor.imprimeUmPorLinha();
    }
}