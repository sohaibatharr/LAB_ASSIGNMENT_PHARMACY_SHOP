public class PharmacyShop {
    Address address;
    Medicine[] medicines;
    int medicineCount;
    Person Owner;
    
    public PharmacyShop(Address address, int medicineCount, Person owner) {
        this.address = address;
        this.medicineCount = medicineCount;
        Owner = owner;
    }

    Medicine[] list=new Medicine[100];
    {

        list[0]=new Medicine("B001", "B123", "PharmaCorp", new Date(15,8,2025), 100, "Paracetamol" , 50);
        list[1]=new Medicine("B002", "B124", "HealthMed", new Date(15,8,2025), 100, "Ibuprofen" , 50);
        list[2]=new Medicine("B003", "B125", "BioPharma", new Date(15,8,2024), 100, "Nims" , 50);
        list[3]=new Medicine("B004", "B126", "MedLife", new Date(10,12,2024), 100, "Metformin" , 50);
        list[4]=new Medicine("B005", "B127", "GlucoCare", new Date(20,5,2026), 100, "Ciprofloxacin" , 150);
        list[5]=new Medicine("B006", "B128", "PainRelief", new Date(30,11,2025), 100, "Aspirin" , 40);
        list[6]=new Medicine("B007", "B129", "CardioHealth", new Date(5,3,2026), 100, "Lisinopril" , 110);
        list[7]=new Medicine("B008", "B130", "CholestrolCare", new Date(18,9,2026), 100, "Atorvastatin" , 130);
        list[8]=new Medicine("B009", "B131", "DigestWell", new Date(22,6,2024), 100, "Omeprazole" , 85);
        list[9]=new Medicine("B010", "B132", "PharmaCorp", new Date(14,2,2026), 100, "Losartan" , 95);

    }

    public void searchById(String pID) {
        for (int i = 0; i < 10; i++) {
            if (list[i] != null && list[i].medicineID.equals(pID)) {
                list[i].Display();
                return;
            }
        }
        System.out.println("Medicine with ID " + pID + " not found.");
    }
}