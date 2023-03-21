import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criando entrada de dados
        Scanner sc = new Scanner(System.in);

        Imobiliaria imobiliaria = new Imobiliaria("Imobiliaria 01",
                "3471-0000", "Santa Rita do Sapucaí"); // Instanciando imobiliaria

        boolean flag = true; // Flag de controle do while

        while (flag) {
            System.out.println("--- BEM VINDO " + imobiliaria.nome + " ---");
            System.out.println("1 - Cadastrar apartamento");
            System.out.println("2 - Ajustar valor do aluguel em +5%");
            System.out.println("3 - Mostrar a media das áreas de ap's com 2 quartos ou menos");
            System.out.println("4 - Infos da imobiliaria e dos apartamentos");
            System.out.println("5 - Sair do sistema");

            int opcao = sc.nextInt(); // Atribuindo a entrada de dados a variável opção
            sc.nextLine();

            switch (opcao) {
                case 1:
                    // Criando o apartamento no array
                    System.out.println("Endereço do ap: ");
                    String endereco = sc.nextLine();
                    System.out.println("Numero de quartos: ");
                    int numQuartos = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Area do ap: ");
                    double area = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Aluguel do ap: ");
                    double aluguel = sc.nextDouble();
                    sc.nextLine();

                    // Criando um apartamento
                    Apartamento apto = new Apartamento(endereco, numQuartos, area, aluguel);

                    // Adicionando apartamentos
                    imobiliaria.addApartamento(apto);
                    break;

                case 2:
                    imobiliaria.ajustaAluguel(); // Fazendo o ajuste do aluguel em 5%
                    break;
                case 3:
                    System.out.println("Media de área dos apartamentos que possuem 2 quartos ou menos: " +imobiliaria.mediaArea() +" Metros quadrados"); // Medindo media das areas
                    break;
                case 4:
                    imobiliaria.mostrarInfo(); // Mostrando as informações dos apartamentos
                    break;
                case 5:
                    flag = false;
                    break;
                default:
                    System.out.println("Opção inválida !!");
                    break;
            }

        }
        sc.close();// Fechando entrade de dados
    }
}