public class SinoTibetan extends Linguagem {

    public SinoTibetan(String nome, double numFalantes) {
        super(nome, numFalantes, "países das Asia", "sujeito-objeto-verbo");

        if(this.nome == "Chinês") {
            this.ordemDasPalavras = "sujeito-verbo-objeto";
        }
    }
}
