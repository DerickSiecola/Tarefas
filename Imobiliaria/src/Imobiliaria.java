public class Imobiliaria {

    String nome;
    String telefone;
    String cidade;

    double mediaTotal;

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
                double acrescimo = apartamentos[i].aluguel;
                double ajuste = acrescimo + acrescimo*0.05;
                apartamentos[i].aluguel = ajuste;
            }
        }
    }
    double mediaArea(){
        for (int i = 0; i < apartamentos.length; i++) {
            // Verificar se a i-ésima posição está cheia
            if(apartamentos[i]!=null){
                if(apartamentos[i].numQuartos <= 2){
                    double media = 0;
                    int count = 0;
                    media = apartamentos[i].area + media;
                    count++;
                    mediaTotal = media/count;
                }
            }
        }

        return mediaTotal;
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
