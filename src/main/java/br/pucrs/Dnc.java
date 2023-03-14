package br.pucrs;

public class DnC {
    //une dois vetores em 1 em ordem
    public static int[] merge(int[] a, int[] b){
        int[] c = new int[a.length + b.length];
        int count = 0;
        for(int i = 0; i< a.length; i++){
            c[count] = a[i];
            count ++;
        }
        for(int i = 0; i< b.length; i++){
            c[count] = a[i];
            count ++;
        }

        return c;
}
    
    //ex1
    public static int[] merSrt(int[] vec){
        if(vec.length == 1){
            return vec;
        }
        int middle = vec.length/2;
        int[] a = new int[middle];
        int[] b = new int[vec.length - middle];

        for(int i = 0; i< middle; i++){
            a[i] = vec[i];
            
        }
        
        for(int i = middle; i< (vec.length - middle); i++){
            b[i] = vec[i];
            
        }

        merSrt(a);
        merSrt(b);



        

        return vec;
    }
    //ex2
    public long maxVal1(long A[], int n) {  
        long max = A[0];
        for (int i = 1; i < n; i++) {  
            if( A[i] > max ) 
               max = A[i];
        }
        return max;
    }

}
