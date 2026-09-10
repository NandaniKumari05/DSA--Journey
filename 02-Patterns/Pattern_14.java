class Solution {
    public void pattern14(int n) {
            for(int i = 0; i < n; i++) {
            for(char ch = 'A'; ch <= 'A' + i; ch++){
                System.out.print(ch);
            }
            System.out.println();
        }

    }
}
