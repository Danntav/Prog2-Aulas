import java.util.Scanner;

public class Product{
    
    private String name;
    private double price;


    public Product(String name, double price){
        this.name=name;
        setPrice(price);
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public void setPrice(double price) {
        this.price = (price < 0.0) ? 0.0 : price;
    }

    public double getPrice() {
        return price;
    }


    //Função que terá @Override nos demais
    public String priceTag(){
        return String.format("%s $%s", getName(), getPrice());
    }





    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int number_of_products = input.nextInt();

        // Declara um array de produtos    
        Product[] products = new Product[number_of_products];


        //Cadastro de cada um dos produtos de acordo com sua característica
        for (int cont=0; cont < number_of_products; cont++ ){

            System.out.printf("Product #%s data\n", cont+1);

            
            System.out.print("Commom, used or imported (c|u|i)? ");
            char option = input.next().charAt(0);

            System.out.print("Name: ");
            String input_Name = input.next();

            System.out.print("Price: ");
            Double input_Price = input.nextDouble();

            
            if (option == 'u' || option =='U'){

                System.out.print("Manufacture Date (DD/MM/YYYY): ");

                //Formatação de string para data
                String input_Date = input.next(); 
                products[cont] = new UsedProduct(input_Name, input_Price, input_Date);    
            }

            
            else if (option == 'i' || option == 'I') {
                System.out.print("Customs Fee: ");
                double input_Fee = input.nextDouble();
                products[cont] = new ImportedProduct(input_Name, input_Price, input_Fee);
                
            }

            else{//c or common
                products[cont] = new Product(input_Name, input_Price);
            }

        }

        System.out.println();
        System.out.println("PRICE TAGS:");

        for (int cont=0; cont < number_of_products; cont++ ){

            System.out.println(products[cont].priceTag());
        }
        
        
    }


}