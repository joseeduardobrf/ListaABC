public class TesteVetor4 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        vetor.adiciona("Java");
        vetor.adiciona("Python");
        vetor.adiciona("C++");

        System.out.println("Antes de limpar: " + vetor);

        vetor.limpar();

        System.out.println("Depois de limpar: " + vetor);
    }
}