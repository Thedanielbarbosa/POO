import java.text.NumberFormat;

public class Format {
    public static void main(String[] args) {
        System.out.println("Formatação utilizando getCurrencyInstance ");
        System.out.println(NumberFormat.getCurrencyInstance().format(123546845.90));
        double n[] = {234.45, 124.89, 367.78};
        NumberFormat nf = NumberFormat.getCurrencyInstance();

        for(int a = 0; a<n.length; a++){
            if(a != 0)
                System.out.print(" - ");

            System.out.printf(nf.format(n[a]));
        }

    }
}
