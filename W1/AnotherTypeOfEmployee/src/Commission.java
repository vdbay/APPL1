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
    public double pay(){
        double payment = super.pay() + (commrate*total);
        total = 0;
        return payment;
    }
    public String toString(){
        String  result = super.toString();
        result += "\nTotalSales: " + total;
        return result;
    }
}