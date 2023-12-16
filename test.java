import java.util.*;
class stringarray
{
    public static void main(String[]args)
{
    Scanner scanner = new Scanner(System.in);
    int array[]=new int[5];
    for(int i=0;i<array.length;i++){
        System.out.println("enter number of element"+(i+1));
        array[i]=scanner.nextInt();
    }
    for(int j=0;j<array.length;j++){
        System.out.println("element at"+(j+1)+":"+array[j]);
    }
scanner.close();

}
}
