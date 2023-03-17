public class BilanganGanjil {
    public static void main(String[] args) {
        int i = 1;
        System.out.print(i);
        for (int j = i+2; j <= 10; j = j+2){
            System.out.print("_"+j);
        }
        System.out.println(" ");
        System.out.print("_");
        for (int k = i+2; k <= 8; k = k+2){
            System.out.print(k+"_");
        }
        System.out.println(" ");
        for (int l = i+2; l <= 6; l = l+2){
            System.out.print(l+"_");
        }
        int m = i+6;
        System.out.print(m);
        System.out.println(" ");
        System.out.print("_");
        int n = i+4;
        System.out.print(n+"_");
        System.out.println(" ");
        System.out.println(n);
    }
}

