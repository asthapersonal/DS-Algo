/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linear.search;

/**
 *
 * @author Aastha's PC
 */
public class LinearSearch {
    public static int search(int a[], int x)
    {
        int i;
        for(i=0;i<a.length;i++)
        {
            if(a[i]==x)
                return i;
            }
              
                        return -1;
        }        
           
                
      public static void main(String[] args) {
        int a[]={10,20,25,32,56};
        int x = 25;
        int result = search(a,x);
        if(result == -1 )
            System.out.println("Element is not found");
        {
            System.out.println("Element is present at index "+ result);        }
            
    
      
      }
      
    
}
