public class Commission extends Hourly{
    private double total;
    private double commrate;

    public Commission (String eName, String eAddress, String ePhone,
                       String socSecNumber, double rate, double commissonrate){
        super(eName,eAddress,ePhone,socSecNumber,rate);
        commrate=commissonrate;
        total=0;
    }

    public void addSales (double totalSales){
        total=total+totalSales;
    }
}
