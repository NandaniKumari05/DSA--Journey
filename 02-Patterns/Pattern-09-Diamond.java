class Solution {
    public void pattern9(int n) {
//Upper Part
        for(int i = 1; i <= n; i++){
            //Space
            for(int s = 1; s <= n - i; s++){
                System.out.print(" ");
            }
            //Star
            for(int j = 1; j <= 2 * i - 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
            //Lower pattern
            for(int i = n; i >= 1; i--) {
                 for(int s = 1; s <= n - i; s++){
                 System.out.print(" ");
            }
            //Star
            for(int j = 1; j <= 2 * i - 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
