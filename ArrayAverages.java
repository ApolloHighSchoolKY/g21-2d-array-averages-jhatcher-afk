import java.util.Arrays;

public class ArrayAverages{
  
  int[][] ray;

  public ArrayAverages(int[][] rayray){
    ray = rayray;
  }

  public void rowAverages(){
    
    double average = 0;
     for(int row = 0; row< ray.length;row++)
    {
      int sum = 0;
      
        for(int col = 0; col<ray[row].length;col++)
        {
          //Concatation of row and col with average
          average += ray[row][col];
        }
        //average divided by the length of row 0
        average/=ray[0].length;
        System.out.println("Row " + row + " Average:" + average );
        //reset average
        average = 0;
       
    }
  }

  public void columnAverages(){
    //Column major order
    //   Take each column and go through all of the rows
    //   Top down and Left to Right
    double average = 0;
    for(int col = 0; col<ray[0].length;col++)
    {
      int sum2 = 0;
        
        for(int row = 0; row< ray.length;row++)
        {
          //Concatation of row and col with average
          average += ray[row][col];
        }
        //average divided by the length of row 0
        average/=ray.length;

        System.out.println("Column " + col + " Average:" + average);
        //reset average
        average = 0;
       
    }
  }

  public void arrayAverage(){
    
    double average2 = 0;
    for(int row = 0; row< ray.length;row++)
    {
        for(int col = 0; col<ray[row].length;col++)
        {
          average2 += ray[row][col];
        //This spot here represents the complention of one row
        }
         
    }
    average2/=ray[0].length*ray.length;
    System.out.println("Array Average :" + average2);

  }

  public String toString(){
    for(int row=0; row<ray.length; row++)
    {
      System.out.println(Arrays.toString(ray[row]));
    }
    return "";
  }
}
