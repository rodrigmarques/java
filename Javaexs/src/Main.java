import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<Bebidas>listabebidas = new LinkedList<Bebidas>();
        Scanner ler = new Scanner(System.in);
        int op = 0;
        Pagamento pagar = new Pagamento();
        Bebidas bebidas1 = new Bebidas("Coca-cola",0.7F,10);
        Bebidas bebidas2 = new Bebidas("Pepsi",0.65F,10);
        Bebidas bebidas3 = new Bebidas("Ice Tea",0.6F,10);
        listabebidas.add(bebidas1);
        listabebidas.add(bebidas2);
        listabebidas.add(bebidas3);



        do{
            System.out.print("  ##--Drink Machine--##\n");
        System.out.print("|----------------------------------------------|\n");
        System.out.print("| Opção 1 - Coca Cola (0,70€                   |\n");
        System.out.print("| Opção 2 - Pepsi (0,65€)                      |\n");
        System.out.print("| Opção 3 - Ice Tea (0,60€)                    |\n");
        System.out.print("| Opção 4 - AdicionarStock                     |\n");
        System.out.print("| Opção 0 - Sair                               |\n");
        System.out.print("|----------------------------------------------|\n");
        System.out.print("Digite uma opção: ");

         op = ler.nextInt();

         if(op==1 || op==2 || op==3){
             Bebidas produtoselect;
             produtoselect = listabebidas.get(op-1);
                pagar.addsaldo(produtoselect);
        }
        }while(op!=0);

    }
}