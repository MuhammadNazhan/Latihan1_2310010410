package pertemuan5;
public class matematika {
    private double hasil;
    
    //method
    public void setPerjumlahan(double bil1, double bil2){
        hasil = bil1 + bil2;
    }
    
    public void setPengurangan(double bil1, double bil2){
        hasil = bil1 - bil2;
    }
       
    public void setPerkalian(double bil1, double bil2){
        hasil = bil1 * bil2;
    }
    
    public void setPembagian(double bil1, double bil2){
        hasil = bil1 / bil2;
    }

    public double getHasil(){
        return hasil;
    }
    
    public void tampilHasil(){
        System.out.println("Hasil operasi: "+hasil);
    }
}