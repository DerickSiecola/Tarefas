public class Imobiliaria {

    String nome;
    String telefone;
    String cidade;

    public Imobiliaria(String nome, String telefone, String cidade) {
        this.nome = nome;
        this.telefone = telefone;
        this.cidade = cidade;
    }

    Apartamento [] apartamentos = new Apartamento[30];
    void addApartamento(Apartamento apto){
        for (int i = 0; i < apartamentos.length; i++) {
            // Verificar se a i-ésima posição está vazia
            if(apartamentos[i]==null){
                apartamentos[i]=apto;
                break;
            }
        }


    }
    void ajustaAluguel(){
        for (int i = 0; i < apartamentos.length; i++) {
            // Verificar se a i-ésima posição está cheia
            if(apartamentos[i]!=null){
                double acrescimo = (apartamentos[i].aluguel)*0.05;
                apartamentos[i].aluguel += acrescimo;
            }
        }
        System.out.printf("Aluguel aumentado!");
        System.out.println();
    }
    int mediaArea(){
        double media = 0;
        double count = 0;
        for (int i = 0; i < apartamentos.length; i++) {
            // Verificar se a i-ésima posição está cheia
            if(apartamentos[i]!=null){
                if(apartamentos[i].numQuartos <= 2){
                    media = apartamentos[i].area + media;
                    count++;
                }
            }
        }
        double mediaTotal = (media/count);
        int resultado = (int) mediaTotal;

        return resultado;
    }
    void mostrarInfo(){
        System.out.println("INFOS DA IMOBILIARIA");
        System.out.println("Nome: "+this.nome);
        System.out.println("Telefone: "+this.telefone);
        System.out.println("Cidade: "+this.cidade);
        // Percorrendo o array
        for (int i = 0; i < apartamentos.length; i++) {
            // Verificar se a i-ésima posição está cheia
            if(apartamentos[i]!=null){
                apartamentos[i].mostrarInfo();
            }
        }
    }

}
