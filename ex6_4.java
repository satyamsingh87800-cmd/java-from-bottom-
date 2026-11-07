public class ex6_4 {
    public static void main(String[] args) {
        int [][] a= {
            {5,6,4},
            {5,8,9}
            
        };
        int sum = 0; 
        for(int i =0; i<2;i++){
            for(int j=0;j<3;j++) 
            {
                sum+= a[i][j];
            }
        }
        System.out.println(sum);

    }
}
