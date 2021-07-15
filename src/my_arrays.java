import java.util.Scanner;
public class my_arrays {
    public static void main(String [] arg){
        Scanner input_of = new Scanner(System.in);
        int rr = input_of.nextInt();
        int azz = input_of.nextInt();
        System.out.println("main function or method: ");
        int []a = {10,20,30,40,50};
        System.out.println(a.length);
        for(int aa = 0; aa<a.length; aa++){
            System.out.println(a[aa]);
        }
        System.out.println("function_for_arrays: ");
        function_for_arrays();
        System.out.println("fun_for_multidimensional_arrays: ");
        fun_for_multidimensional_arrays(rr,azz);
    }
    public static void function_for_arrays(){
        Scanner input_of = new Scanner(System.in);
        int []a = {1,2,22,3,4,5};
        for (int i = 0; 5>i; i++){
            a[i] = input_of.nextInt();
            System.out.println(a[i]+a[i+1]);
        }

    }
    public static void fun_for_multidimensional_arrays(int az,int ar){
        int arr[][] = new int[az][ar];
        for (int azr = 0; azr<arr.length; azr++){
            for(int aze = 0; aze<arr[azr].length;aze++){
                arr[azr][aze] = ar*10*aze;
                System.out.print(arr[azr][aze]+" ");
            }
            System.out.println();
        }
    }
}
