package gfg.ds;

import java.util.Arrays;

public class ArrayReversal {

  public static void main(String[] args) {
    int[] array={5,20,80,4};
    int length=array.length;
    reverseArray(array,length);
    for(int i=0;i<length;i++)
    System.out.println(array[i]);
  }

  private static void reverseArray(int[] arr, int length) {
    int temp=0,i=0,e=length-1;
    while(i<e){
      temp=arr[i];
      arr[i]=arr[e];
      arr[e]=temp;
      e--;
      i++;
    }

  }

}
