public class TesteVetor6 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        vetor.adiciona("Java");
        vetor.adiciona("Python");
        vetor.adiciona("C++");

        System.out.println("Antes: " + vetor);

        boolean resultado = vetor.substituir("Python", "JavaScript");

        System.out.println("Substituição realizada: " + resultado);
        System.out.println("Depois: " + vetor);
    }
}