public class Apartamento {

    String endereco;
    int numQuartos;
    double area;
    double aluguel;

    // Criando construtor
    public Apartamento(String endereco, int numQuartos,double area, double aluguel) {
        this.endereco = endereco;
        this.numQuartos = numQuartos;
        this.area=area;
        this.aluguel=aluguel;
    }

    // Métodos do estudante
    void mostrarInfo(){
        System.out.println("INFOS DO APARTAMENTO");
        System.out.println("ENDEREÇO: "+this.endereco);
        System.out.println("NUMERO DE QUARTOS: "+this.numQuartos);
        System.out.println("AREA: "+this.area);
        System.out.println("ALUGUEL: "+this.aluguel);
    }


}
