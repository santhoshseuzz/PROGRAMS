package pattern;


public class pattern1 {
    public static void main(String[] args) {
        int n = 15;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <=n; col++) {
                if(row == 1 || col == 1|| row== n||col==n){
                System.out.print("S ");
            }
                else if((row == 2 || col == 2|| row== n-1||col==n-1)) {
                System.out.print("* ");
                }
                else if((row == 3 || col == 3|| row== n-2||col==n-2)) {
                    System.out.print("  ");
                }
                else if((row == 4 || col == 4|| row== n-3||col==n-3)) {
                    System.out.print("- ");
                }
                else if((row == 5 || col == 5|| row== n-4||col==n-4)) {
                    System.out.print("+ ");
                }
                else if((row == 6 || col == 6   || row== n-5||col==n-5)) {
                    System.out.print("^ ");
                }
                else if((row == 7 || col == 7|| row== n-6||col==n-6)) {
                    System.out.print("@ ");
                }

                else{
                    System.out.print("5 ");

                }
            }


            System.out.println();
        }

        }
}

