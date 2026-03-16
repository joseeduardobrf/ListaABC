public class TesteVetor2 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        vetor.adiciona("Java");
        vetor.adiciona("Python");
        vetor.adiciona("Java");
        vetor.adiciona("C++");

        System.out.println("Contém Java? " + vetor.contem("Java"));
        System.out.println("Contém PHP? " + vetor.contem("PHP"));
    }
}