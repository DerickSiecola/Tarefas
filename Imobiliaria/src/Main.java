import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criando entrada de dados
        Scanner sc = new Scanner(System.in);

        Imobiliaria imobiliaria = new Imobiliaria("Pedrão Imoveis",
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
                    // Criando o estudante que será adicionado no array de estudantes
                    System.out.println("Endereço do ap: ");
                    String endereco = sc.nextLine();
                    System.out.println("Numero de quartos: ");
                    int numQuartos = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Area do ap: ");
                    double area = sc.nextDouble();
                    System.out.println("Aluguel do ap: ");
                    double aluguel = sc.nextDouble();

                    // Criando um estudante
                    Apartamento apto = new Apartamento(endereco, numQuartos, area, aluguel);

                    // Adicionando estudante criado na escola
                    imobiliaria.addApartamento(apto);
                    break;

                case 2:
                    imobiliaria.ajustaAluguel(); // Mostrando as informações da escola e dos estudantes
                    break;
                case 3:
                    imobiliaria.mediaArea();// Quantidade de aluno por ano letivo
                    break;
                case 4:
                    imobiliaria.mostrarInfo(); // Mostrando as informações da escola e dos estudantes
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