// todo: add question and comment
import java.util.Scanner;
class SmallestNumbers {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter number: ");
    int min_one = input.nextInt();
    System.out.print("Enter number: ");
    int min_two = input.nextInt();
    int num;

    for(int i=0; i<3; i++){
      System.out.print("Enter number: ");
      num = input.nextInt();
      if(min_one < min_two){
        if(num < min_two){
          min_two = num;
        }
      }else{
        if(num < min_one){
          min_one = num;
        }
      }
    }
    System.out.printf("%d and %d are the smallest numbers", min_one, min_two);
  }
}