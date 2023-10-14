public class PatternsPrint {
    public static void main(String[] args) {
        pattern(4);
    }

    private static void pattern(int number) {
        for(int i = 0; i < number;i++ ){
            for(int j= number;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
