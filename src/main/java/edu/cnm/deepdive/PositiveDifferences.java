package edu.cnm.deepdive;

public class PositiveDifferences {


  private static final int[] data = {
  };

  public static int countPositiveDifferences(int[] data) {
    int positiveDifferences = 0;

    for (int i = 0; i < data.length - 1; i++) {
      if ((data[i + 1] - data[i]) > 0) {
        positiveDifferences++;
      }
    }
    return positiveDifferences;

  }

  public static void main(String[] args) {
    int positiveDifference = countPositiveDifferences(data);
    System.out.println(positiveDifference);
  }


}
