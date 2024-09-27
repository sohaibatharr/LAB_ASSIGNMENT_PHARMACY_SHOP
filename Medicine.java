public class Medicine {

    String medicineID;
    String batchNumber;
    String manufactrurer;
    Date expiryDate;
    int Quantity;
    String Name;
    double Price;

    
    public Medicine(String medicineID, String batchNumber, String manufactrurer, Date expiryDate, int quantity,
            String name, double price) {
        this.medicineID = medicineID;
        this.batchNumber = batchNumber;
        this.manufactrurer = manufactrurer;
        this.expiryDate = expiryDate;
        Quantity = quantity;
        Name = name;
        Price = price;
    }

    public String getMedicineID() {
        return medicineID;
    }
    public void setMedicineID(String medicineID) {
        this.medicineID = medicineID;
    }
    public String getBatchNumber() {
        return batchNumber;
    }
    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }
    public String getManufactrurer() {
        return manufactrurer;
    }
    public void setManufactrurer(String manufactrurer) {
        this.manufactrurer = manufactrurer;
    }
    public Date getExpiryDate() {
        return expiryDate;
    }
    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }
    public int getQuantity() {
        return Quantity;
    }
    public void setQuantity(int quantity) {
        Quantity = quantity;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public double getPrice() {
        return Price;
    }
    public void setPrice(double price) {
        Price = price;
    }

    public void Display(){
        System.out.println("ID:"+medicineID);
        System.out.println("Price:"+Price);
        System.out.println("Quantity:"+Quantity);
        System.out.println("Manufacturer:"+manufactrurer);
        System.out.println("Batch Number:"+batchNumber);
        System.out.println("Expiry Date:");
        expiryDate.Display();
    }



}
