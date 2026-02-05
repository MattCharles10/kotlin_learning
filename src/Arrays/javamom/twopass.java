package Arrays.javamom;

public class twopass {

 static int Secarrr(int arr []){
     int n = arr.length , largestarr = -1 , Secondlargest = -1;


     //Finding largest element
     for(int i =0 ; i< n ; i++){
         if(arr[i] > largestarr){
             largestarr = arr[i];
         }
     }

     //Finding Secondlargest element
     for(int i =0 ; i<n ; i++){
         if(arr[i]>Secondlargest && arr[i] != largestarr){
              Secondlargest  = arr[i] ;
         }
     }
     return Secondlargest;

 }

 public static void main(String[] args){
     int arr [] = {12,34,15,56,67,18};
     System.out.println(Secarrr(arr));

 }


}
