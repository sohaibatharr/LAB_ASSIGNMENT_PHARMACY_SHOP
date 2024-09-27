public class Address {
    String street;
    String city;
    String postalcode;

    

    public Address(String street, String city, String postalcode) {
        this.street = street;
        this.city = city;
        this.postalcode = postalcode;
    }
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getPostalcode() {
        return postalcode;
    }
    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    public void displayAddress(){
        System.out.println("Street No."+street+","+city+"Postal Code:"+postalcode);
    }
    
}
