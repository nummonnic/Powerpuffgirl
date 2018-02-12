public class Hw2{
  public static void main(String[] args){
    String[][] arr = new String[][] {
      {"X","L","O","V","E"},
      {"O","X","Y","O","U"},
      {"O","O","X","A","L"},
      {"O","O","O","X","L"},
      {"O","O","O","O","X"}};
    for(int j = 0 ; j < arr.length ; j++){
      for(int i = 0 ; i < arr[j].length ; i++){
        if(i < j){
          System.out.print(" ");
        }  
        else{
        System.out.print(arr[j][i]);
      }
      }
      
      for(int a = (arr.length-1) ; a >= 0 ; a--){
        if(a < j){
          System.out.print(" ");
        }
        else{
          System.out.print(arr[j][a]);
        }
      }
      System.out.println();
    }
  }
}

