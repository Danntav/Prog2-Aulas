
public class UsedProduct extends Product{
    
    private String manufectureDate;

    public UsedProduct(String name, double price, String manufectureDate){

        super(name, price);
        
        setManufectureDate(manufectureDate);

    }

    public void setManufectureDate(String manufectureDate){
        this.manufectureDate = manufectureDate;
    }

    public String getManufectureDate(){
        return manufectureDate;
    }

    @Override
    public String priceTag(){
        return String.format("%s (Used) $%s (Manufecture Date %s)", super.getName(), super.getPrice(), getManufectureDate());

    }



}

