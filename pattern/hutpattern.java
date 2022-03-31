package pattern;


public class hutpattern<row1> {
    public static void main(String[] args) {
        String s = "\\ ";
        int n = 15;
        int k = 0 ,i =2 ,j = 4 ,i1 =2, j1 = 6, r= 2;
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= n + 15; col++) {
                if (col >= 5 - (row - 1) && col <= 5 + (row - 1)) {
                    if (col == 5 && row == 1) {
                        System.out.print("^ ");
                    }
                        else if ((row == i && col == j)){
                            System.out.print("/ ");
                            i++;
                            j--;
                    }

                    else {
                        if( row == i1 && col == j1){
                            System.out.print(s);
                            i1++;
                            j1++;
                        }

                        else{
                        System.out.print("- ");
                        }

                    }



                }

                else {
                    if((row == 1 && col < 5 )||(row == 2 && col < 4)||(row == 3 && col <3)||(row ==4 && col <2)){
                        System.out.print("  ");
                    }
                    else{
                        for(int t= col ; t < 5 ;t++) {
                                System.out.print("   "+s);
                        }
                    }
                }


                }

            System.out.println();
        }
        int row1, col1;
        for (row1 = 1; row1 <= 5; row1++) {
            for (col1 = 1; col1 <= 30; col1++) {

                if((row1>3 && col1 >3 && col1<7) || col1==9|| col1 ==1) {
                    if(col1 ==9 ||col1==1){
                        System.out.print("| ");
                    }
                    else{
                    System.out.print("  ");}
                }
                else{
                    System.out.print("* ");
            }

            }
            System.out.println();
        }
    }
}
/*  =if(row == 1 || col == 1|| row== n||col==n){
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
                else if((row == 6 || col == 6|| row== n-5||col==n-5)) {
                    System.out.print("^ ");
                }
                else if((row == 7 || col == 7|| row== n-6||col==n-6)) {
                    System.out.print("@ ");
                }

                else{
                    System.out.print("5 ");

                }*/