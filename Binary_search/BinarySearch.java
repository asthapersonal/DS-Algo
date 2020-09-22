/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binary.search;

/**
 *
 * @author Aastha's PC
 */
public class BinarySearch {
     int Binarysearch( int a[],int x){
         int l=0 ;
         int r=a.length-1 ;
         while(l<=r)
         {
             int m = l+(r-l)/2;
             
        if(a[m]==x)
                return m;
                
                if(a[m]< x)
                    l=m+1;
                    else
                r=m-1;
                    
                
             }
             return -1;}
     
             
         
   public static void main(String[] args) {
        BinarySearch ob = new BinarySearch();
        int a[]={25,30,35,40,45};
        int x=35;
        int result  = ob. Binarysearch(a ,x);
        if (result == -1)
            System.out.println("Element not found");
        else
        System.out.println("Element has index "+ result);
        
        
        
        
        
        
    }
    
}
