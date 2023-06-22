import java.util.*;

class Main {
    public static void main (String[] args) throws Exception {
        String[] kode = new String[10];
        String[] jenis = new String[10];
        int i,j;
        double jumlah=0, total=0;
        int[] kilo = new int[10];
        int[] harga = new int[10];
        int[] jml = new int[10];
    
        Scanner input = new Scanner(System.in);
        
        System.out.println("Kode   Jenis   Harga ");
        System.out.println("---------------------");
        System.out.println("G      Gurami    Rp.25000");
        System.out.println("N      Nila    Rp.20000");
        System.out.println("L      Lele   Rp.15000");
        System.out.println("---------------------");
        
        System.out.print("Banyak Jenis Ikan : ");
        j=input.nextInt();

        for(i=0; i<j; i++) {
            System.out.println("\nJenis Ke - " + (i+1));
            System.out.print("Jenis Ikan [G/N/L] : ");
            kode[i]= input.next();
            
            if ("G".equals(kode[i]) || "g".equals(kode[i])) {
                jenis[i]="Gurami";
                harga[i]=25000;
            } else if ("N".equals(kode[i]) || "n".equals(kode[i])) {
                jenis[i]="Nila";
                harga[i]=20000;
            }
            else {
                jenis[i]="Lele";
                harga[i]=15000;
            }
            
            System.out.print("Banyak Ikan Per kilo        : ");
            kilo[i] = input.nextInt();
            jml[i]=harga[i]*kilo[i];
        }
        
        System.out.println("---------------------------------------------");
        System.out.println("No.\tJenis\tHarga\tBanyak  \tJumlah");
        System.out.println("\t\tPerkilo\tKilo           \tHarga");
        System.out.println("---------------------------------------------");
        
        for(i=0;i<j;i++) {
            System.out.println(+(i+1)+ "\t" +jenis[i]+ "\t" +harga[i]+ "\t" +kilo[i]+ "\t\t" +jml[i]);
            jumlah=jumlah+jml[i];
        }
        
        System.out.println("---------------------------------------------");

        total=jumlah;
        
        System.out.println("\tJumlah Bayar\t\t\t" +jumlah);
        System.out.println("\tTotal Bayar\t\t\t" +total);
    }    
}