import java.util.*;
class magicsquare {
    
    public static void main(String[] args) {
        
        int[][] square = {{7,12,1,14},{2,13,8,11},{16,3,10,5},{9,6,15,4}};
        
        System.out.println("Square is magic? " + isMagic(square) + "!");
        
    }
    
    public static boolean isMagic(int[][] a) {
        boolean magic = true;
        int magicSum = sumRow(a,0);
        int sum = 0;
        
        for (int i=0; i<a.length-1; i++) {
            
            if (magicSum != sumRow(a,i)) {
                magic = false;
            }
            else if (magicSum != sumCol(a,i)) {
                magic = false;
            }
            else if (magicSum != sumDiagUp(a)) {
                magic = false;
            }
            else if (magicSum != sumDiagDown(a)) {
                magic = false;
            }
        }
        return magic;
    }
    
    public static int sumRow(int[][] a, int b) {        
        int sum = 0;        
        for (int i=0; i<a.length; i++) {
            sum += a[b][i];
        }        
        return sum;
    }
    
    public static int sumCol(int[][] a, int b) {        
        int sum = 0;        
        for (int i=0; i<a.length; i++) {
            sum += a[i][b];
        }        
        return sum;
    }
    
    public static int sumDiagUp(int[][] a) {
        int sum = 0;
        int j=0;
        for (int i=0; i<a.length; i++) {            
            sum += a[i][j];
            j++;
        }
        return sum;
    }
    
        public static int sumDiagDown(int[][] a) {
        int sum = 0;
        int j=a.length-1;
        for (int i=0; i<a.length; i++) {            
            sum += a[i][j];
            j--;
        }
        return sum;
    }
}