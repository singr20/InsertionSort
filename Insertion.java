import java.util.*;

public class Insertion{
    
    boolean notAPrime = false;
    
    public Insertion(){
        int count = 0;
        int[] num = new int[10];
        
        while(count < 10){
            int random = (int)(Math.random() * 200 + 1);
            
            if(isAPrime(random) == false){
               num[count] = random;
               count ++;
            }
        
        }
        
        System.out.println(Arrays.toString(num));
        
        insertionSort(num);
        
    }
    
    public void insertionSort(int[] a){
        
        for(int i = 1; i < a.length; i ++){
            
            int key = a[i];
            int j = i;
            
            while(j > 0 && a[j - 1] > key){
                a[j] = a[j-1];
                j--;
            }
            a[j] = key;
        }
        
        System.out.println(Arrays.toString(a));
    }
    
    public boolean isAPrime(int y)
    {
       notAPrime=false;
       int num=2;
       
       while(num<y){//can do y/2
           
           if(y%num==0)
              notAPrime=true;
              num++;
        }
        return notAPrime;
    }
}

