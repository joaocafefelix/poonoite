public class Apolice {
    private String nomeSegurado;
    private int idade;
    private float valorPremio;

    public void setNomeSegurado(String nomeSegurado){
        this.nomeSegurado = nomeSegurado;
    }

    public String getNomeSegurado(){
        return nomeSegurado;
    }
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getValorPremio() {
        return valorPremio;
    }

    public void setValorPremio(float valorPremio) {
        this.valorPremio = valorPremio;
    }

    public void imprimir(){
        System.out.println("Nome do Segurado = " + nomeSegurado);
        System.out.println("Idade = " + idade);
        System.out.println("Valor do Premio = " + valorPremio);
    }
}
