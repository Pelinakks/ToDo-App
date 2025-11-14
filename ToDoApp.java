import java.util.ArrayList;
import java.util.Scanner;

public class ToDoApp{
  public static void main(String[] args){
    ArrayList<String> toDos = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    //menu for user
    while(true){
      System.out.println("1- Add task");
      System.out.println("2- List tasks");
      System.out.println("3- Exit");
      System.out.println("Your choice: ");
      
      int choice = input.nextInt();
      input.nextLine();

      //choices
      if(choice == 1){
        System.out.println("Enter the task: ");
        String task= input.nextLine();
        toDos.add(task);
        System.out.println("You added a new task!");
      }else if(choice == 2){
        System.out.println("Your Tasks");
        for(int i=0 ; i<toDos.size() ; i++){
          System.out.println((i+1) + ") " + toDos.get(i));
        } 
      }else if(choice == 3){
        System.out.println("Exiting...");
      }else{
        System.out.println("Invalid choice!");
      }
  }  
}
