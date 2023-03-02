import java.util.Scanner;

public class Pagamento {
    private float saldo;
    private float moeda5= 0.05F;
    private float moeda10= 0.10F;
    private float moeda20= 0.20F;
    private float moeda50 = 0.50F;

    Scanner ler = new Scanner(System.in);

    public void addsaldo(Bebidas produtoselect){
        int i;
        float troco;
        do {
            System.out.println("Introduza saldo!");
            System.out.println("1-Moeda 0.50€");
            System.out.println("2-Moeda 0.20€");
            System.out.println("3-Moeda 0.10€");
            System.out.println("4-Moeda 0.05€");
            System.out.println("0-Cancelar Compra");
            i = ler.nextInt();
            switch(i){
                case 1: saldo+=0.5;
                break;
                case 2: saldo+=0.2;
                    break;
                case 3: saldo+=0.1;
                    break;
                case 4: saldo+=0.05;
                    break;

            }
        }while(saldo<= produtoselect.getValor() || i==0);

        if(i!=0){
            System.out.println("Bebida a sair");
            troco = (float) (saldo- produtoselect.getValor());
            System.out.println("Troco:" + troco);
            produtoselect.setQuantidade(produtoselect.getQuantidade()-1);
            System.out.println(+produtoselect.getQuantidade());

        }
        saldo=0;


    }
    public void addquantidade(Bebidas produtoselect){
        int i;
        System.out.println("Adicionar quantidade de bebidas");
        System.out.println("1-Coca Cola");
        System.out.println("2-Pepsi");
        System.out.println("3-Ice Tea");
        System.out.println("0-Cancelar quantidade");
        i = ler.nextInt();

    }
}