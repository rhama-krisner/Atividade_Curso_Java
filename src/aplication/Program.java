package aplication;

import entities.Client;
import entities.Order;
import entities.Product;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        Order order = new Order();
        Product products = new Product();


        //Recebendo dados do cliente
        System.out.println("Dados do cliente:");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Data de nascimento: ");
        String dataNascimento = sc.nextLine();

        //Dados do cliente
        System.out.println("Entre com os dados do pedido");

        //Status de pedido
        System.out.println("AGUARDANDO_PAGAMENTO,PROCESSANDO,ENVIADO,ENTREGUE");
        System.out.print("Status: ");
        String status = sc.nextLine();
        status.toUpperCase();
        order.setStatus(status);


        //Laço para a quantidade de itens que será feito o input
        System.out.print("Quantidade de itens para dar entrada: ");
        int quantidadeItens = sc.nextInt();
        String produto;
        double valor = 0;
        for (int i = 0; i < quantidadeItens; i++) {
            System.out.printf("Item de N°%d%n", i + 1);
            System.out.print("Nome do produto: ");
            produto = sc.next();
            products.setName(produto);
            System.out.print("Valor do produto: ");
            valor = sc.nextDouble();
            products.setPrice(valor);
            System.out.print("Quantidade: ");
            int quantidade = sc.nextInt();
            products.setName(produto);
            products.setPrice(valor);
        }

        //Output dos produtos
        Order orderMoment = new Order();
        System.out.println("ORDER MOMENT: " + orderMoment.toString());
        System.out.println("STATUS DE PEDIDO: " + order.getStatus());

        //Configurando data
        Date dataFormatada = sdf.parse(dataNascimento);

        Client cliente = new Client(nome, email, dataFormatada);
        System.out.println("Cliente: " + cliente);

        System.out.println("ITENS: ");
        for (Integer i : order.getListaItens()) {
            
        }
    }

}
