public class ImportedProduct extends Product{

    private double customsFee;

    public ImportedProduct(String name, double price, double customsFee){

        super(name, price);
        setCustomsFee(customsFee);
    }


    public void setCustomsFee(double customsFee){
        this.customsFee = (customsFee < 0.0) ? 0.0 : customsFee;
    }

    public double getCustomsFee(){
        return customsFee;
    }

    public double totalPrice(){
        return super.getPrice() + getCustomsFee();
    }

    @Override
    public String priceTag(){
        return String.format("%s (Customs Fee: $ %s)", super.priceTag(), totalPrice());
    }



}