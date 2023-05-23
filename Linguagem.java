public class Linguagem {
    protected String nome;
    protected double numFalantes;
    protected String regioesFaladas;
    protected String ordemDasPalavras;

    public Linguagem(String nome, double numFalantes, String regioesFaladas, String ordemDasPalavras) {
        this.nome = nome;
        this.numFalantes = numFalantes;
        this.regioesFaladas = regioesFaladas;
        this.ordemDasPalavras = ordemDasPalavras;
    }

    public void getInfo() {
        System.out.println("O " + nome + " é falado por " + numFalantes + " pessoas, principalmente " + regioesFaladas);
        System.out.println("A linguagem segue a ordem das palavras: " + ordemDasPalavras);
    }

    public static void main(String[] args){
        Linguagem frances = new Linguagem("Francês", 77200000, "Europa", "sujeito + verbo + complemento");
        frances.getInfo();
        Linguagem maia = new Mayan("Maia", 800000);
        maia.getInfo();
        Linguagem kiche = new Mayan("Ki'che'", 1000000);
        kiche.getInfo();
        Linguagem mandarim = new SinoTibetan("Chinês", 918000000);
        mandarim.getInfo();
        Linguagem birmanes = new SinoTibetan("Birmanês", 32000000);
        birmanes.getInfo();
    } 
}