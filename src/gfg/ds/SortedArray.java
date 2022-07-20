package gfg.ds;

public class SortedArray {

  public static void main(String[] args) {
    int[] array={5,20,80,4};
    int length=array.length;
    Boolean result=checkSorted(array,length);
    System.out.println(result);

  }
  private static Boolean checkSorted(int[] array, int length) {
    if(length==1)
      return true;
    for(int i=0;i<length-1;i++){
      if(array[i]>array[i+1])
        return false;
    }
    return true;
  }

}
