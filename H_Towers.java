/* seperate file that takes in the method we can be using for later in main
following will be:

solveTowers() call
returns changeTowers(disks, 1, 3, 2)

changeTowers(int TTdisks, start, finish, temp)  method
wins the towers in less moves possible

oneDisk(start, finish) //needed for solution
moves one disk to the other side the desired place



*/


public class H_Towers{

   private int totalDisks;
   
  //constructor
  public H_Towers(int disks){
   totalDisks = disks;
   }
 
   // oneDisk is needed to the solution
  public void oneDisk(int start, int finish){
        System.out.println("Move one disk from" +start+" to "+finish);  
   }
   
   //leaf function solve that commands to take total disks
   public void solve(){
   
      changeTowers(totalDisks, 1, 3, 2);
   }
   
   
   // the solution
  public void changeTowers(int total_disks, int start, int finish, int temp){
         if (total_disks == 1)
            oneDisk(start, finish); 
         else {
           changeTowers(total_disks - 1, start, temp, finish);
           oneDisk(start, finish);
           changeTowers(total_disks -1, temp, finish, start);
            }
         }//end of changeTowers
         
}