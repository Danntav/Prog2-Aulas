import java.util.Date;

public class UsedProduct extends Product{
    
    private Date manufectureDate;

    public UsedProduct(String name, double price, Date manufectureDate){

        super(name, price);
        
        setManufectureDate(manufectureDate);

    }

    public void setManufectureDate(Date manufectureDate){
        this.manufectureDate = manufectureDate;
    }

    public Date getManufectureDate(){
        return manufectureDate;
    }

    @Override
    public String priceTag(){
        return String.format("%s (Used) (Manufecture Date %s)", super.priceTag(), getManufectureDate());

    }



}

