public class TesteVetor3 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        try {
            System.out.println(vetor.ultimo());
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        vetor.adiciona("Java");
        vetor.adiciona("Python");

        System.out.println("Último elemento: " + vetor.ultimo());
    }
}