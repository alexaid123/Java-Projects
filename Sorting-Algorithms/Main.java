public class Main {
  public static void main(String[] args) {
    int[] nums = new int[10];
    for(int i = 0; i < 10;i++)
    {
      int random = (int)(Math.random() * 100 + 1);
      nums[i] = random;
      System.out.print(nums[i] + "first  ");
    }
     int ind = 0;
    int min = nums[ind];
    int temp = 0;
    for(int i = 0; i < 10; i++)
    {
      for(int j = 1; i < 10; i++)
      {
      if(nums[i] < min)
      {
       min = nums[i];
      }
      }
      nums[ind] = min;
      ind++;
      min = nums[ind];
    }
    for(int i = 0; i < 10;i++)
    {
      System.out.print(nums[i] + "  ");
    }
  }
}