public class GraosDeTrigo {
    public static void main(String[] args) {
       
        int graosInt = 1;
        long graosLong = 1;
        
        int casaOverflowInt = -1;
        int casaOverflowLong = -1;

        for (int i = 1; i <= 64; i++) {
            
            if (i > 1) {
                if (graosInt > 0 && graosInt * 2 < 0 && casaOverflowInt == -1) {
                    casaOverflowInt = i;
                }
                graosInt *= 2;
            }

            
            if (i > 1) {
                if (graosLong > 0 && graosLong * 2 < 0 && casaOverflowLong == -1) {
                    casaOverflowLong = i;
                }
                graosLong *= 2;
            }

            
            System.out.println("Casa " + i + ": graosInt = " + graosInt + ", graosLong = " + graosLong);
        }

        
        System.out.println("Overflow para int na casa: " + casaOverflowInt);
        System.out.println("Overflow para long na casa: " + casaOverflowLong);
    }
}
