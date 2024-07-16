import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mcdonalds 
{

    static class client
    {

        String name, cpf, typePay;
        int decision;
        double valorTotal;

        request[] pedido = new request[100]; 

    }

    static class request
    {

        int order, typeorder;
        String customization, nameOrder;
        double valorPedido;

    }


    static class products
    {
        String name;
        double valor;

        products(String name, double valor)
        {
            this.name = name;
            this.valor = valor;
        }
    }

    static class pay{

        String types;

        pay (String types)
        {
            this.types = types;
        }

    }

    public static void space()
    {

        for (int x=0; x<30; x++)
        {
            System.out.println("\n");
        }

    }

    @SuppressWarnings("resource")


    public static void main (String[] args)                                 /////// INICIAR                                                       
    {                                                                                                                                               // ESTLIZAR
                                                                                                                                                    // corrigir loops
        Scanner scanner = new Scanner(System.in);

        client[] person = new client[100];                                                                           
                                                                                                                            
        int i=0, placeEat, newOrder=0, custom=0; 
        
        

        List<products> product = new ArrayList<>();

        product.add(new products("TRIPLE X-BURGER", 31.43));
        product.add(new products("BIG MAC", 29.87));
        product.add(new products("DOUBLE CHICKEN", 33.25));
        product.add(new products("CHEESBURGER", 25.65));
        product.add(new products("SUNDAE", 7.90));
        product.add(new products("TOP SUNDAE", 11.20));
        product.add(new products("CASQUINHA", 4.00));
        product.add(new products("MILKSHAKE", 13.40));

        List<pay> typePay = new ArrayList<>();

        typePay.add(new pay("DINHEIRO"));
        typePay.add(new pay("DÉBITO OU TICKET"));
        typePay.add(new pay("CRÉDITO"));

        do
        {

            System.out.println("\n\n\n=====================================================");
            System.out.println("\n 1 - PARA LEVAR                      2 - COMER AQUI\n");
            System.out.println("-----------------------------------------------------");
            placeEat = scanner.nextInt();
            System.out.println("=====================================================");

            space();

            if (placeEat == 3)
            {
                
                // mostrando pedido ---- TESTE

                for (i=0; person[i] !=null ; i++)                                                                               
                {
                    System.out.println("\n\n\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                    System.out.println("\nNOME: " + person[i].name);                                 
                    System.out.println("CPF: " + person[i].cpf + "\n");     
                    if (person[i].decision == 1)
                    {
                        System.out.println(" ---- PARA LEVAR ----\n");
                    }
                    else if (person[i].decision == 2)
                    {
                        System.out.println("---- COMER AQUI ----\n");
                    }                          
                    
                    System.out.println("VALOR TOTAL DO PEDIDO: " + person[i].valorTotal);
                    System.out.println("MÉTODO DE PAGAMENTO: " + person[i].typePay);
                    
                    for (int j=0; person[i].pedido[j] != null; j++)                                                              
                    {                
                        System.out.println("\n-----------------------------------------------------\n");

                        System.out.println(person[i].pedido[j].nameOrder);

                        System.out.println("ALTERAÇÕES: \n\n" + person[i].pedido[j].customization);
                    }
                    System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                    System.out.println("\n===================================================================================\n");


                }

            }
            else
            {

                person[i] = new client();
                person[i].decision = placeEat;
                int j=0;
                space();

                do
                {                                                                                             
                    person[i].pedido[j] = new request();

                    System.out.println("\n\n\n=====================================================");
                    System.out.println("\n 1 - GRANDES FOMES e MCSANDUÍCHES      2 - SOBREMESAS\n");
                    System.out.println("\n-----------------------------------------------------");
                    person[i].pedido[j].typeorder = scanner.nextInt();                                                                                 
                    System.out.println("=====================================================");
                    
                    space();

                    if (person[i].pedido[j].typeorder == 1)
                    {

                        System.out.println("\n\n\n=====================================================");
                        System.out.println("\n1      " + product.get(0).name + "             R$: " + product.get(0).valor);
                        System.out.println("\n=====================================================");
                        System.out.println("\n2      " + product.get(1).name + "                    R$: " + product.get(1).valor);                        
                        System.out.println("\n=====================================================");
                        System.out.println("\n3      " + product.get(2).name + "             R$: " + product.get(2).valor);
                        System.out.println("\n=====================================================");
                        System.out.println("\n4      " + product.get(3).name + "                R$: " + product.get(3).valor);
                        System.out.println("\n-----------------------------------------------------");                                                 
                        person[i].pedido[j].order = scanner.nextInt();
                        System.out.println("=====================================================");

                    }                                                                                                               
                    else if (person[i].pedido[j].typeorder == 2)
                    {

                        System.out.println("\n\n\n=====================================================");
                        System.out.println("\n1      " + product.get(4).name + "                     R$: " + product.get(4).valor);
                        System.out.println("=====================================================");
                        System.out.println("\n2      " + product.get(5).name + "                 R$: " + product.get(5).valor);                 
                        System.out.println("=====================================================");
                        System.out.println("\n3      " + product.get(6).name + "                  R$: " + product.get(6).valor);
                        System.out.println("=====================================================");
                        System.out.println("\n4      " + product.get(7).name + "                  R$: " + product.get(7).valor);
                        System.out.println("\n-----------------------------------------------------");                                                 
                        person[i].pedido[j].order = scanner.nextInt();
                        System.out.println("=====================================================");
                        
                    }

                    if (person[i].pedido[j].typeorder == 1)
                    {
                        switch (person[i].pedido[j].order)                                                                       
                        {
                            case 1:
                                person[i].pedido[j].valorPedido = product.get(0).valor;
                                break;
                            case 2:
                                person[i].pedido[j].valorPedido = product.get(1).valor;
                                break;
                            case 3:
                                person[i].pedido[j].valorPedido = product.get(2).valor;
                                break;
                            case 4:
                                 person[i].pedido[j].valorPedido = product.get(3).valor;
                                break;
                        }
                    }
                    else if (person[i].pedido[j].typeorder == 2)
                    {
                        switch (person[i].pedido[j].order)                                                                       
                        {
                            case 1:
                                person[i].pedido[j].valorPedido = product.get(4).valor;
                                break;
                            case 2:
                                person[i].pedido[j].valorPedido = product.get(5).valor;
                                break;
                            case 3:
                                person[i].pedido[j].valorPedido = product.get(6).valor;
                                break;
                            case 4:
                                 person[i].pedido[j].valorPedido = product.get(7).valor;
                                break;
                        }
                    }

                    if (person[i].pedido[j].typeorder == 1)
                    {
                        switch (person[i].pedido[j].order)                                                                       
                        {
                            case 1:
                                person[i].pedido[j].nameOrder = product.get(0).name;
                                break;
                            case 2:
                                person[i].pedido[j].nameOrder = product.get(1).name;
                                break;
                            case 3:
                                person[i].pedido[j].nameOrder = product.get(2).name;
                                break;
                            case 4:
                                person[i].pedido[j].nameOrder = product.get(3).name;
                                break;
                        }
                    }
                    else if (person[i].pedido[j].typeorder == 2)
                    {
                        switch (person[i].pedido[j].order)                                                                       
                        {
                            case 1:
                                person[i].pedido[j].nameOrder = product.get(4).name;
                                break;
                            case 2:
                                person[i].pedido[j].nameOrder = product.get(5).name;
                                break;
                            case 3:
                                person[i].pedido[j].nameOrder = product.get(6).name;
                                break;
                            case 4:
                                person[i].pedido[j].nameOrder = product.get(7).name;
                                break;
                        }
                    }
                    
                    space();
                    
                    System.out.println("\nDESEJA PERSONALIZAR O PEDIDO?\n\n1 - SIM    2 - NÃO\n");
                    custom = scanner.nextInt();

                    space();

                    if (custom == 1)
                    { 
                        System.out.println("\n-----------------------------------------------------");  
                        System.out.println("ESCREVA SUAS ALTERAÇÕES:\n");
                        scanner = new Scanner(System.in);
                        person[i].pedido[j].customization = scanner.nextLine();
                        System.out.println("\n=====================================================\n");
                    }
                    else if (custom == 2)
                    {
                        System.out.println("\n=====================================================\n");
                        person[i].pedido[j].customization = "SEM ALTERACÃO";
                    }

                    space();

                    System.out.println("\nDESEJA REALIZAR NOVO PEDIDO?\n\n1- SIM\n2- NÃO\n");
                    newOrder = scanner.nextInt();
                    System.out.println("\n=====================================================\n\n");
                
                    space();

                    if (newOrder == 1)
                    {
                        j++;
                    }

                } while(newOrder != 2);

                    System.out.println("\nDIGITE SEU NOME:");
                    scanner = new Scanner(System.in);
                    person[i].name = scanner.nextLine();
                    System.out.println("\nDIGITE SEU CPF:");
                    scanner = new Scanner(System.in);
                    person[i].cpf = scanner.nextLine();

                    System.out.println("\n=====================================================\n");

                    for (j=0; person[i].pedido[j] != null; j++ )
                    {
                        person[i].valorTotal += person[i].pedido[j].valorPedido;
                    }     

                    space();
                    System.out.println("=====================================================\n");

                    for (j=0; person[i].pedido[j] != null; j++ )
                    {
                        System.out.println(person[i].pedido[j].nameOrder);
                    } 

                    System.out.println("\n-----------------------------------------------------\n");
                    System.out.println("VALOR TOTAL DO PEDIDO: " + person[i].valorTotal);
                    System.out.println("\n-----------------------------------------------------");

                    System.out.println("\nSELECIONE O MÉTODO DE PAGAMENTO\n\n1 - " + typePay.get(0).types + "\n2 - "+ typePay.get(1).types + "\n3 - "+ typePay.get(2).types + "\n");
                    int confirm = scanner.nextInt();

                    switch (confirm) {
                        case 1:
                            person[i].typePay = typePay.get(0).types;
                            break;
                    
                        case 2:
                            person[i].typePay = typePay.get(1).types;
                            break;
                        case 3:
                            person[i].typePay = typePay.get(2).types;
                            break;
                    }

                    System.out.println("=====================================================");
                    System.out.println("PAGAMENTO CONFIRMADO!");
                    System.out.println("=====================================================");

                    space();

                    i++;
                
            }                                                                                                              
        }

        while (placeEat != 0);                                                                                                                       // para parar testes
            
    }

}
