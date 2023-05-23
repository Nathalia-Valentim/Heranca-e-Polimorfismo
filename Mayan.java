public class Mayan extends Linguagem {

    public Mayan(String nome, double numFalantes) {
        super(nome, numFalantes, "países das América Central", "verbo-objeto-sujeito");
    }
    
    @Override 
    public void getInfo() {
        System.out.println("O " + nome + " é falado por " + numFalantes + " pessoas, principalmente " + regioesFaladas);
        System.out.println("A linguagem segue a ordem das palavras: " + ordemDasPalavras);
        System.out.println("Fato interessante: " + nome + " é uma língua ergativa.");
    }
}
